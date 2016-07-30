/*
 * The sofware is provided under Mit License.
 * For the full copyright and license information, please view the LICENSE file.
 */
package com_.javafxexamples.ListView;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Simple javafx listView example
 * 
 * @author altayalp
 */
public class SimpleListView extends Application {
    
    public static final ObservableList<String> country = FXCollections.observableArrayList();
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Simple ListView Example");        
        
        final ListView<String> listView = new ListView<>(country);
        listView.setPrefSize(200, 250);
        
        country.addAll(
             "Türkiye", "Azerbaijan", "Turkestan", "Utopia",
              "Liechtenstein", "Russian", "Italy", "Belgium",
              "Germany", "Kuştepe"
        );
          
        listView.setItems(country);              
               
        StackPane root = new StackPane();
        root.getChildren().add(listView);
        primaryStage.setScene(new Scene(root, 270, 235));
        primaryStage.show();
        
    }
    
}
