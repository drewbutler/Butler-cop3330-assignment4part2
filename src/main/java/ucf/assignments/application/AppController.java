/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Drew Butler
 */
package ucf.assignments.application;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;


public class AppController {

    @FXML
    public void savePressed(ActionEvent actionEvent) {
        //Saves the entire list
    }

    @FXML
    public void LoadPressed(ActionEvent actionEvent) {
        //Load a new list
    }

    @FXML
    public void NewlistPressed(ActionEvent actionEvent) {
        //Creates a new list
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
    }

}
