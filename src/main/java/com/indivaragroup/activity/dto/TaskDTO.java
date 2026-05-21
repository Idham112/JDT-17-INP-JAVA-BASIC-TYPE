package com.indivaragroup.activity.dto;

public class TaskDTO {

    public static final String STATUS_OPEN = "OPEN";
    public static final String STATUS_IN_PROGRESS = "IN_PROGRESS";
    public static final String STATUS_READY_REVIEW = "READY_REVIEW";
    public static final String STATUS_DONE = "DONE";
    public static final String STATUS_CANCELLED = "CANCELLED";

    public static final String PRIORITY_LOW = "LOW";
    public static final String PRIORITY_MEDIUM = "MEDIUM";
    public static final String PRIORITY_HIGH = "HIGH";
    public static final String PRIORITY_CRITICAL = "CRITICAL";

    // All fields from your requirements
    private String taskId;
    private String project;
    private String title;
    private String description;
    private String assignee;
    private String priority;
    private String status;
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
                   String priority, String startDate, String dueDate,
                   double estimatedHour, double weight, String reviewer, String createdBy) {
        this.taskId = taskId;
        this.project = project;
        this.title = title;
        this.assignee = assignee;
        this.priority = priority;
        this.status = STATUS_OPEN; // Default
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.estimatedHour = estimatedHour;
        this.weight = weight;
        this.reviewer = reviewer;
        this.createdBy = createdBy;
        this.progress = 0.0;

        setStatus(STATUS_OPEN);
    }

    // --- Core Logic ---

    // Automatically update progress when status changes (Rule 4.1)
    public void setStatus(String status) {
        this.status = status;
        switch (status) {
            case STATUS_OPEN -> this.progress = 0.0;
            case STATUS_IN_PROGRESS -> this.progress = 50.0;
            case STATUS_READY_REVIEW -> this.progress = 80.0;
            case STATUS_DONE -> this.progress = 100.0;
            case STATUS_CANCELLED -> this.progress = 0.0;
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
    public String getTaskId() {
        return taskId;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getStatus() {
        return status;
    }

    public double getEstimatedHour() {
        return estimatedHour;
    }

    public double getWeight() {
        return weight;
    }

    public double getProgress() {
        return progress;
    }
}
