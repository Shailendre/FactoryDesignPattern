package com.design.factorydesign;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by shailendra.singh on 1/22/17.
 */
public class GarmentFactoryApplicationLauncher extends Application{

    private static ApplicationContext context;

    @Override
    public void start(Stage stage) throws Exception {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/clientInterface.fxml"));

        loader.setControllerFactory(context::getBean);

        Parent root = loader.load();

        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.initStyle(StageStyle.UTILITY);
        stage.setTitle("GarmentFactory Factory");
        stage.show();

    }

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("/config/applicationContext.xml");
        launch(args);
    }
}
