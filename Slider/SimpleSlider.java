/*
 * The sofware is provided under Mit License.
 * For the full copyright and license information, please view the LICENSE file.
 */
package com_.javafxexamples.Slider;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Simple JavaFx Slider example
 *
 * @author altayalp
 */
public class SimpleSlider extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Simple Slider Example");
        
        Slider slider = new Slider();
        
        StackPane root = new StackPane();
        root.setPadding(new Insets(5, 10, 10, 5));
        root.getChildren().add(slider);
        primaryStage.setScene(new Scene(root, 280, 235));
        primaryStage.show();
        
    }
    
}
