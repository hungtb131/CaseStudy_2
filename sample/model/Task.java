package sample.model;

public class Task {
    private long dayCreated;
    private String description;
    private String taskContent;

    public Task() {
    }

    public Task(final long dayCreated, final String description, final String taskContent) {
        this.dayCreated = dayCreated;
        this.description = description;
        this.taskContent = taskContent;
    }

    public long getDayCreated() {
        return this.dayCreated;
    }

    public void setDayCreated(final long dayCreated) {
        this.dayCreated = dayCreated;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getTaskContent() {
        return this.taskContent;
    }

    public void setTaskContent(final String taskContent) {
        this.taskContent = taskContent;
    }
}
