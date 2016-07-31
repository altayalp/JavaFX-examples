/*
 * The sofware is provided under Mit License.
 * For the full copyright and license information, please view the LICENSE file.
 */
package com_.javafxexamples.ComboBox;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Simple javafx ComboBox example
 * 
 * @author altayalp
 */
public class SimpleComboBox extends Application {
    
    public static final ObservableList<String> country = FXCollections.observableArrayList();
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Simple ComboBox Example");
        
        final ComboBox<String> select = new ComboBox<>(country);
        select.setPromptText("Select country");
        
        country.addAll(
             "Türkiye", "Azerbaijan", "Turkestan", "Utopia",
              "Liechtenstein", "Russian", "Italy", "Belgium",
              "Germany", "Kuştepe"
        );          
        select.setItems(country);
               
        StackPane root = new StackPane();
        root.getChildren().add(select);
        primaryStage.setScene(new Scene(root, 280, 235));
        primaryStage.show();
        
    }
    
}
