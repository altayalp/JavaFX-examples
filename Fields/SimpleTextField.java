/*
 * The sofware is provided under Mit License.
 * For the full copyright and license information, please view the LICENSE file.
 */
package com_.javafxexamples.TextField;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Simple JavaFx TextField example
 *
 * @author altayalp
 */
public class SimpleTextField extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Simple TextField Example");
        
        // You can set default text: new TextField("Button Text");
        TextField textInput = new TextField();
        textInput.setPromptText("Enter your name");
        // remove default focus
        textInput.setFocusTraversable(false);
        
        StackPane root = new StackPane();
        root.setPadding(new Insets(5, 10, 10, 5));
        root.getChildren().add(textInput);
        primaryStage.setScene(new Scene(root, 280, 235));
        primaryStage.show();
        
    }
    
}
