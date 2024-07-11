package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TableView<?> studentTable;
    @FXML
    private TableColumn<?, ?> idColumn;
    @FXML
    private TableColumn<?, ?> nameColumn;
    @FXML
    private TableColumn<?, ?> emailColumn;
    @FXML
    private TableColumn<?, ?> majorColumn;
    @FXML
    private TextField idField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField majorField;

    @FXML
    private void handleAdd() {
        System.out.println("Add button clicked");

        // Add button action logic
        String id = idField.getText();
        String name = nameField.getText();
        String email = emailField.getText();
        String major = majorField.getText();

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Major: " + major);

        // You need to create a Student class and add the student to the table.
        // Example:
        // Student student = new Student(id, name, email, major);
        // studentTable.getItems().add(student);

        // Clear the input fields after adding the student
        idField.clear();
        nameField.clear();
        emailField.clear();
        majorField.clear();
    }

    @FXML
    private void handleUpdate() {
        // Update button action logic
    }

    @FXML
    private void handleDelete() {
        // Delete button action logic
    }
}
