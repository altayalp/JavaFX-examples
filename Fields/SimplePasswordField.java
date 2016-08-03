/*
 * The sofware is provided under Mit License.
 * For the full copyright and license information, please view the LICENSE file.
 */
package com_.javafxexamples.Fields;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Simple JavaFx PasswordField example
 *
 * @author altayalp
 */
public class SimplePasswordField extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Simple PasswordField Example");
        
        PasswordField passInput = new PasswordField();
        passInput.setPromptText("Enter your password");
        // remove default focus
        passInput.setFocusTraversable(false);
        
        StackPane root = new StackPane();
        root.setPadding(new Insets(5, 10, 10, 5));
        root.getChildren().add(passInput);
        primaryStage.setScene(new Scene(root, 280, 235));
        primaryStage.show();
        
    }
    
}
