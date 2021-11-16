/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Drew Butler
 */
package ucf.assignments.application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;


public class AppController implements Initializable {

    @FXML private TableView<TodoList> tableView;
    @FXML private TableColumn<TodoList, String> taskNameCol;
    @FXML private TableColumn<TodoList, LocalDate> DueDateCol;

    @FXML
    private DatePicker myDatePicker;

    @FXML
    public void savePressed(ActionEvent actionEvent) {
        //Saves the entire list

    }

    @FXML
    public void LoadPressed(ActionEvent actionEvent) {

    }

    @FXML
    public void NewlistPressed(ActionEvent actionEvent) {

    }
    @FXML
    public void listSaved(ActionEvent actionEvent) {
        //Saves List
    }
    @FXML
    public void listDeleted(ActionEvent actionEvent) {
        //Deletes list
    }
    @FXML
    public void ItemDeleted(ActionEvent actionEvent) {
        //deletes chosen item
    }
    @FXML
    public void completedItem(ActionEvent actionEvent){
        //Marks Item as complete
    }
    @FXML
    public void NewTaskPressed(ActionEvent actionEvent) {
        //Adds a new task to the list
        System.out.println("text");

    }
    public void getDate(ActionEvent event) {
        LocalDate myDate = myDatePicker.getValue();
        System.out.println(myDate.toString());
    }


    public void initialize(URL url, ResourceBundle rb) {

        taskNameCol.setCellValueFactory(new PropertyValueFactory<TodoList, String>("taskNameCol"));
        DueDateCol.setCellValueFactory(new PropertyValueFactory<TodoList, LocalDate>("DueDate"));

        tableView.setItems(getItems());
    }

    public ObservableList<TodoList> getItems() {
        ObservableList<TodoList> items = FXCollections.observableArrayList();
        items.add(new TodoList("Wash Dishes", LocalDate.of(2021, Month.NOVEMBER, 16)));

        return items;
    }
}
