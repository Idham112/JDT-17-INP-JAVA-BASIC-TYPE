package com.indivaragroup.activity.dto;

public class TaskDTO {

    // Enums for validation
    public enum Status { OPEN, IN_PROGRESS, READY_REVIEW, DONE, CANCELLED }
    public enum Priority { LOW, MEDIUM, HIGH, CRITICAL }

    // All fields from your requirements
    private String taskId;
    private String project;
    private String title;
    private String description;
    private String assignee;
    private Priority priority;
    private Status status;
    private String startDate; // Using String as requested
    private String dueDate;   // Using String as requested
    private double estimatedHour;
    private double actualHour;
    private double weight;
    private double progress;
    private String reviewer;
    private String createdBy;

    // Constructor
    public TaskDTO(String taskId, String project, String title, String assignee,
                   Priority priority, String startDate, String dueDate,
                   double estimatedHour, double weight, String reviewer, String createdBy) {
        this.taskId = taskId;
        this.project = project;
        this.title = title;
        this.assignee = assignee;
        this.priority = priority;
        this.status = Status.OPEN; // Default
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.estimatedHour = estimatedHour;
        this.weight = weight;
        this.reviewer = reviewer;
        this.createdBy = createdBy;
        this.progress = 0.0;
    }

    // --- Core Logic ---

    // Automatically update progress when status changes (Rule 4.1)
    public void setStatus(Status status) {
        this.status = status;
        switch (status) {
            case OPEN -> this.progress = 0.0;
            case IN_PROGRESS -> this.progress = 50.0;
            case READY_REVIEW -> this.progress = 80.0;
            case DONE -> this.progress = 100.0;
            case CANCELLED -> this.progress = 0.0;
        }
    }

    // Calculate Variance (Rule 4.5)
    public double getVariance() {
        return this.actualHour - this.estimatedHour;
    }

    // Calculate Productivity (Rule 4.6)
    public double getProductivity() {
        if (actualHour == 0) return 0.0;
        return (estimatedHour / actualHour) * 100;
    }

    // Getters
    public String getTaskId() { return taskId; }
    public String getAssignee() { return assignee; }
    public Status getStatus() { return status; }
    public double getEstimatedHour() { return estimatedHour; }
    public double getWeight() { return weight; }
    public double getProgress() { return progress; }
}
