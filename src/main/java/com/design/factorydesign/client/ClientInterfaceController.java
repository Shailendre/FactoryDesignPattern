package com.design.factorydesign.client;


import com.design.factorydesign.core.Garment;
import com.design.factorydesign.core.GarmentFactory;
import com.design.factorydesign.core.GarmentType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by shailendra.singh on 1/22/17.
 */
@Component
public class ClientInterfaceController implements Initializable {

    @FXML
    private ChoiceBox garmentSelectionChoiceBox;

    @FXML
    private TextField displaySelectionTextField;

    @Autowired
    private GarmentFactory garmentFactory;

    public void initialize(URL location, ResourceBundle resources) {

    }

    /**
     * call the garment factory to produce garment of specific type
     */
    @FXML
    public void OnClickGetBtn(){

        String garmentCode  = (String)garmentSelectionChoiceBox.getSelectionModel().getSelectedItem();

        Garment garment = garmentFactory.getGarment(garmentCode);

        displaySelectionTextField.setText(garment.toString());

    }
}
