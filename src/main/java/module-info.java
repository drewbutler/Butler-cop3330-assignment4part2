module ucf.assignments.application {
    requires javafx.controls;
    requires javafx.fxml;


    opens ucf.assignments.application to javafx.fxml;
    exports ucf.assignments.application;
}