package com.example.gui_canvas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override

    public void init(){

        System.out.println("hello the app will run at any moment!");

    }


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));


        // trying out various shapes and setting them as children nodes


        CubicCurve main_cubic_curve=new CubicCurve();

        main_cubic_curve.setStartX(10.0);
        main_cubic_curve.setStartY(20);
        main_cubic_curve.setControlX1(10);
        main_cubic_curve.setControlX2(20);
        main_cubic_curve.setControlY1(10);
        main_cubic_curve.setControlY2(20);
        main_cubic_curve.setControlX1(20);
        main_cubic_curve.setControlY2(30);
        main_cubic_curve.setControlX2(40);
        main_cubic_curve.setEndX(70);
        main_cubic_curve.setEndY(70);





        ArcTo main_arc=new ArcTo();




        main_arc.setX(30);
        main_arc.setY(50);

        main_arc.setRadiusX(40);
        main_arc.setRadiusY(50);

        Path main_path=new Path(

                new MoveTo(0,0),
                new HLineTo(50),
                main_arc,
                new HLineTo(100)



        );

        HBox root_box=new HBox(50,main_path,main_cubic_curve);
        root_box.setPadding(new Insets(20));



        stage.setScene(new Scene(root_box,400,500));

        stage.show();

        //showing a triangle

        //showning a square

        // showing a circle



    }

    public static void main(String[] args) {
        launch();
    }
}