/*
 * The sofware is provided under Mit License.
 * For the full copyright and license information, please view the LICENSE file.
 */
package com_.javafxexamples.Label;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Simple javafx Label example
 * 
 * @author altayalp
 */
public class SimpleLabel extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Simple Label Example");
        
        Label label = new Label("Label Text");
        
        StackPane root = new StackPane();
        root.getChildren().add(label);
        primaryStage.setScene(new Scene(root, 280, 235));
        primaryStage.show();
        
    }
    
}
