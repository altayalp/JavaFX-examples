/*
 * The sofware is provided under Mit License.
 * For the full copyright and license information, please view the LICENSE file.
 */
package com_.javafxexamples.TableView;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Simple JavaFx TableView example
 * 
 * @author altayalp
 */
public class SimpleTableView extends Application {
    
    public static final ObservableList<Person> data = FXCollections.observableArrayList(
            new Person("Shinzō", "Abe", "Shinzo.Abe@example.com"),
            new Person("Li", "Keqiang", "li.Keqiang@example.com"),
            new Person("Justin", "Trudeau", "Justin.Trudeau@example.com"),
            new Person("Kerim", "Mesimov", "Kerim.Mesimov@example.com"),
            new Person("Adrian", "Hasler", "Adrian.Hasler@example.com"),
            new Person("Vladimir", "Putin", "Vladimir.Putin@example.com"),
            new Person("Charles", "Michel", "Charles.Michel@example.com"),
            new Person("Barack", "Obama", "Barack.Obama@example.com")
    );
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Simple TableView Example");
        
        TableView table = new TableView();
        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");
        
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<>("firstName")
        );
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<>("lastName")
        );
        emailCol.setCellValueFactory(
                new PropertyValueFactory<>("email")
        );
        
        table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
        
        StackPane root = new StackPane();
        root.getChildren().add(table);
        primaryStage.setScene(new Scene(root, 335, 220));
        primaryStage.show();
        
    }
    
    public static class Person {

        private final SimpleStringProperty firstName;
        private final SimpleStringProperty lastName;
        private final SimpleStringProperty email;

        private Person(String fName, String lName, String email) {
            this.firstName = new SimpleStringProperty(fName);
            this.lastName = new SimpleStringProperty(lName);
            this.email = new SimpleStringProperty(email);
        }

        public String getFirstName() {
            return firstName.get();
        }

        public void setFirstName(String fName) {
            firstName.set(fName);
        }

        public String getLastName() {
            return lastName.get();
        }

        public void setLastName(String fName) {
            lastName.set(fName);
        }

        public String getEmail() {
            return email.get();
        }

        public void setEmail(String fName) {
            email.set(fName);
        }
    }
    
}
