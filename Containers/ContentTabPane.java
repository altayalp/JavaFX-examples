/*
 * The sofware is provided under Mit License.
 * For the full copyright and license information, please view the LICENSE file.
 */
package com_.javafxexamples.Containers;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Simple JavaFX TabPane Content Example
 *
 * @author altayalp
 */
public class ContentTabPane extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Simple TabPane Content Example");
        
        TabPane tabPane = new TabPane();
        // Remove tabs close button
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        
        Tab tab1 = new Tab("Name");
        Tab tab2 = new Tab("Password");
        
        TextField textField = new TextField();
        textField.setPromptText("Enter your name");
        // remove default focus
        textField.setFocusTraversable(false);
        
        PasswordField passInput = new PasswordField();
        passInput.setPromptText("Enter your password");
        passInput.setFocusTraversable(false);
        
        HBox hbox1 = new HBox();
        hbox1.getChildren().add(textField);
        hbox1.setPadding(new Insets(5, 10, 10, 5));
        
        HBox hbox2 = new HBox();
        hbox2.getChildren().add(passInput);
        hbox2.setPadding(new Insets(5, 10, 10, 5));
        
        tab1.setContent(hbox1);
        tab2.setContent(hbox2);
        
        tabPane.getTabs().add(tab1);
        tabPane.getTabs().add(tab2);
        
        primaryStage.setScene(new Scene(tabPane, 280, 235));
        primaryStage.show();
        
    }
    
}
