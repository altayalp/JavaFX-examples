/*
 * The sofware is provided under Mit License.
 * For the full copyright and license information, please view the LICENSE file.
 */
package com_.javafxexamples.Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Styling JavaFX Button with Css
 * 
 * @author altayalp
 */
public class ButtonCss extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Styling JavaFX Button with Css");
        
        Button button = new Button("Button Text");
        button.setStyle("-fx-font: 15px arial; -fx-base: #000000;");
        
        StackPane root = new StackPane();
        root.getChildren().add(button);
        primaryStage.setScene(new Scene(root, 280, 235));
        primaryStage.show();
        
    }
    
}
