package ucf.assignments.application;

import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class TodoList {
    private SimpleStringProperty taskName;
    private LocalDate DueDate;

    public TodoList(String taskName, LocalDate DueDate) {
        this.taskName = new SimpleStringProperty(taskName);
        this.DueDate = DueDate;
    }

    public String getTaskName() {
        return taskName.get();
    }
    public void setTaskName(SimpleStringProperty taskName) {
        this.taskName = taskName;
    }

    public LocalDate getDueDate() {
        return DueDate;
    }
    public void setDueDate() {
        this.DueDate = DueDate;
    }

}
