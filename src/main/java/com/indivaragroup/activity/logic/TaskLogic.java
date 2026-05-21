package com.indivaragroup.activity.logic;

import com.indivaragroup.activity.dto.TaskDTO;

import java.util.ArrayList;
import java.util.List;

public class TaskLogic {

    public void runApplication() {
        ArrayList<TaskDTO> todoList = new ArrayList<>();

        // Add dummy data for testing
        todoList.add(new TaskDTO("T01", "Project A", "Design", "Budi",
                TaskDTO.PRIORITY_HIGH, "2026-05-20", "2026-05-25",
                8.0, 50.0, "Reviewer1", "Admin"));
        todoList.add(new TaskDTO("T02", "Project A", "Frontend", "Andi",
                TaskDTO.PRIORITY_MEDIUM, "2026-05-21", "2026-05-26",
                12.0, 30.0, "Reviewer1", "Admin"));

        todoList.add(new TaskDTO("T03", "Project B", "Testing", "Citra",
                TaskDTO.PRIORITY_CRITICAL, "2026-05-22", "2026-05-27",
                5.0, 20.0, "Reviewer2", "Admin"));

        // Add more logic here (e.g., calculations, printing)
        System.out.println("System initialized with " + todoList.size() + " tasks.");
        System.out.println("----------------------------------------------");

        for (TaskDTO task : todoList) {
            System.out.println("ID: " + task.getTaskId() +
                    " | Assignee: " + task.getAssignee() +
                    " | Status: " + task.getStatus() +
                    " | Progress: " + task.getProgress() + "%");
        }
    }

    private List<TaskDTO> tasks = new ArrayList<>();

    // 1. Add a task
    public void addTask(TaskDTO task) {
        tasks.add(task);
    }

    // 2. Calculate total workload for a specific assignee (Rule 4.4)
    public double calculateWorkload(String assignee) {
        double totalWorkload = 0;
        for (TaskDTO task : tasks) {
            if (task.getAssignee().equals(assignee) &&
                    (task.getStatus() != TaskDTO.STATUS_DONE && task.getStatus() != TaskDTO.STATUS_CANCELLED)) {
                totalWorkload += task.getEstimatedHour();
            }
        }
        return totalWorkload;
    }

    // 3. Calculate Project Progress (Rule 4.3)
    public double calculateProjectProgress() {
        double totalWeight = 0;
        double weightedProgress = 0;

        for (TaskDTO task : tasks) {
            totalWeight += task.getWeight();
            weightedProgress += (task.getWeight() * (task.getProgress() / 100));
        }

        if (totalWeight == 0) return 0;
        return (weightedProgress / totalWeight) * 100;
    }
}
