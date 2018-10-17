package com.will.design.demo.construction.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author will
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Composite {

    public String name;

    public List<Composite> composites;

    public Composite(String name) {
        this.name = name;
    }

    private void add(Composite composite) {
        this.composites.add(composite);
    }

}
