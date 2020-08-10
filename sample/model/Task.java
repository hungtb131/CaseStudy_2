package sample.model;

import java.io.Serializable;

public class Task implements Serializable {
    private int numbOder;
    private String dayCreated;
    private String taskContent;
    private String timing;
    private String status;

    public Task() {
    }

    public Task(int numbOder,String dayCreated, String taskContent, String timing, String status) {
        this.numbOder = numbOder;
        this.dayCreated = dayCreated;
        this.taskContent = taskContent;
        this.timing = timing;
        this.status = status;
    }

    public int getNumbOder() {
        return this.numbOder;
    }

    public void setNumbOder(final int numbOder) {
        this.numbOder = numbOder;
    }

    public String getDayCreated() {
        return this.dayCreated;
    }

    public void setDayCreated(final String dayCreated) {
        this.dayCreated = dayCreated;
    }

    public String getTaskContent() {
        return this.taskContent;
    }

    public void setTaskContent(final String taskContent) {
        this.taskContent = taskContent;
    }

    public String getTiming() {
        return this.timing;
    }

    public void setTiming(final String timing) {
        this.timing = timing;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "numbOder=" + numbOder +
                ", dayCreated='" + dayCreated + '\'' +
                ", timing='" + timing + '\'' +
                ", taskContent='" + taskContent + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}