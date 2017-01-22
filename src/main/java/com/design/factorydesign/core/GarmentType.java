package com.design.factorydesign.core;

import org.springframework.stereotype.Component;

/**
 * Created by shailendra.singh on 1/22/17.
 */
@Component
public interface GarmentType {

    Garment getGarment(String garmentCode);

}
