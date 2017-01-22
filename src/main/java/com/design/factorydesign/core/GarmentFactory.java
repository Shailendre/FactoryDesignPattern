package com.design.factorydesign.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by shailendra.singh on 1/22/17.
 */
@Component
public class GarmentFactory implements GarmentType {

    @Autowired
    private Trousers trousers;

    @Autowired
    private Shirts shirts;

    @Autowired
    private TShirts tShirts;

    public Garment getGarment(String garmentCode) {

        if(garmentCode.equals("TROUSERS")){
            return trousers;
        }

        else if(garmentCode.equals("SHIRTS")){
            return shirts;
        }

        else if (garmentCode.equals("T-SHIRTS")){
            return tShirts;
        }

        return null;

    }
}
