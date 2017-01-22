package com.design.factorydesign.core;

import org.springframework.stereotype.Component;

/**
 * Created by shailendra.singh on 1/22/17.
 */
@Component
public class Shirts extends Garment {

    @Override
    public String toString() {
        return "OBJECT: SHIRTS";
    }

}
