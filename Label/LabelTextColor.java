/*
 * The sofware is provided under Mit License.
 * For the full copyright and license information, please view the LICENSE file.
 */
package com_.javafxexamples.Label;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * JavaFx Label text color example
 * 
 * @author altayalp
 */
public class LabelTextColor extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Label Text Color Example");
        
        Label label = new Label("Label Text");

        // Set label text
        label.setTextFill(Color.web("#F3170F"));
        
        StackPane root = new StackPane();
        root.getChildren().add(label);
        primaryStage.setScene(new Scene(root, 280, 235));
        primaryStage.show();
        
    }
    
}
