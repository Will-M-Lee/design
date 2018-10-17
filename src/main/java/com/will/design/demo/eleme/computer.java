package com.will.design.demo.eleme;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * @author will
 */
@Slf4j
@RestController
public class computer {

    /**
     * 饿了么计算价格
     *
     * @return 实际价格集
     */
    @RequestMapping(value = "/computer")
    public List<BigDecimal> computer(@RequestParam(value = "amount", required = false) Double amount,
                                     @RequestParam(value = "actualAmount", required = false) Double actualAmount,
                                     @RequestParam(value = "preferential", required = false) Integer preferential,
                                     @RequestParam(value = "coupon") Double coupon,
                                     @RequestParam List<Double> prices) throws Exception {

        Double _actualAmount;
        if (amount != null) {
            if (preferential == null) {
                _actualAmount = amount - coupon;
            }
            else {
                _actualAmount = amount - preferential - coupon;

            }
        }
        else if (actualAmount != null) {
            _actualAmount = actualAmount;
        }
        else {
            throw new Exception("amount and actualAmount are null");
        }

        Double           _prices       = prices.stream().mapToDouble(Double::doubleValue).sum();
        List<BigDecimal> actualPrices  = Lists.newArrayList();
        BigDecimal       bActualAmount = new BigDecimal(_actualAmount.toString());
        for (Double price : prices) {
            BigDecimal bprice  = new BigDecimal(price.toString());
            BigDecimal bPrices = new BigDecimal(_prices.toString());

            actualPrices.add(bprice.divide(bPrices, 10, RoundingMode.HALF_UP).multiply(bActualAmount).setScale(2, RoundingMode.HALF_UP));
        }

        // 计算价格总额是否溢出或缺失
        if (actualPrices.size() > 1) {
            BigDecimal computerAmount = new BigDecimal("0");
            for (BigDecimal actualPrice : actualPrices) {
                computerAmount = computerAmount.add(actualPrice);
            }
            BigDecimal spreadPrice = computerAmount.subtract(bActualAmount);
            if (spreadPrice.doubleValue() != 0) {
                BigDecimal lastonePrice  = actualPrices.get(actualPrices.size() - 1);
                BigDecimal _lastonePrice = lastonePrice.subtract(spreadPrice);
                actualPrices.set(actualPrices.size() - 1, _lastonePrice);
            }
        }
        return actualPrices;
    }
}
