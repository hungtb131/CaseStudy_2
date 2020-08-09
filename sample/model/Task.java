package sample.model;

import java.io.Serializable;

public class Task implements Serializable {
    private String dayCreated;
    private String deadline;
    private String taskContent;
    private String status;

    public Task() {
    }

    public Task(String dayCreated, String deadline, String taskContent, String status) {
        this.dayCreated = dayCreated;
        this.deadline = deadline;
        this.taskContent = taskContent;
        this.status = status;
    }

    public String getDayCreated() {
        return this.dayCreated;
    }

    public void setDayCreated(String dayCreated) {
        this.dayCreated = dayCreated;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getTaskContent() {
        return this.taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "dayCreated=" + dayCreated +
                ", deadline='" + deadline + '\'' +
                ", taskContent='" + taskContent + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
