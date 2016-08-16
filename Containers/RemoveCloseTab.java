/*
 * The sofware is provided under Mit License.
 * For the full copyright and license information, please view the LICENSE file.
 */
package com_.javafxexamples.Containers;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.stage.Stage;

/**
 * Remove close button to JavaFX TabPane
 *
 * @author altayalp
 */
public class RemoveCloseTab extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Remove close button Example");
        
        TabPane tabPane = new TabPane();
        // remove tabs close button
        tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        
        Tab tab1 = new Tab("Tab 1");
        Tab tab2 = new Tab("Tab 2");
        Tab tab3 = new Tab("Tab 3");
        
        
        tabPane.getTabs().add(tab1);
        tabPane.getTabs().add(tab2);
        tabPane.getTabs().add(tab3);
        
        tabPane.setPadding(new Insets(5, 10, 10, 5));
        primaryStage.setScene(new Scene(tabPane, 280, 235));
        primaryStage.show();
        
    }
    
}
