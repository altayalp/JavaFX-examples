/*
 * The sofware is provided under Mit License.
 * For the full copyright and license information, please view the LICENSE file.
 */
package com_.javafxexamples.Menu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Simple JavaFx Menu example
 *
 * @author altayalp
 */
public class SimpleMenu extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Simple Menu Example");
        
        MenuBar menuBar = new MenuBar();
        
        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem openMenuItem = new MenuItem("Open");
        MenuItem saveMenuItem = new MenuItem("Save");
        fileMenu.getItems().addAll(newMenuItem, openMenuItem, saveMenuItem);
        
        Menu editMenu = new Menu("Edit");
        MenuItem cutMenuItem = new MenuItem("Cut");
        MenuItem copyMenuItem = new MenuItem("Copy");
        MenuItem pasteMenuItem = new MenuItem("Paste");
        editMenu.getItems().addAll(cutMenuItem, copyMenuItem, pasteMenuItem);
        
        Menu viewMenu = new Menu("View");
        MenuItem barMenuItem = new MenuItem("Status Bar");
        viewMenu.getItems().addAll(barMenuItem);
        
        menuBar.getMenus().addAll(fileMenu, editMenu, viewMenu);
        
        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        primaryStage.setScene(new Scene(root, 500, 230));
        primaryStage.show();
        
    }
    
}
