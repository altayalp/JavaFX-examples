/*
 * The sofware is provided under Mit License.
 * For the full copyright and license information, please view the LICENSE file.
 */
package com_.javafxexamples.Button;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Simple JavaFx CheckBox example
 * 
 * @author altayalp
 */
public class SimpleCheckBox extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Simple Checkbox Example");
        
        CheckBox checBox1 = new CheckBox("CheckBox 1");
        checBox1.setSelected(true);
        CheckBox checBox2 = new CheckBox("CheckBox 2");
        CheckBox checBox3 = new CheckBox("CheckBox 3");
        
        VBox vbox = new VBox();
        vbox.getChildren().add(checBox1);
        vbox.getChildren().add(checBox2);
        vbox.getChildren().add(checBox3);
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(5, 10, 10, 5));
        
        primaryStage.setScene(new Scene(vbox, 280, 235));
        primaryStage.show();
        
    }
    
}
