package com.indivaragroup.activity.logic;

import com.indivaragroup.activity.dto.TaskDTO;
import java.util.ArrayList;
import java.util.List;

public class TaskLogic {

    public void runApplication() {
        ArrayList<TaskDTO> todoList = new ArrayList<>();

        // Add dummy data for testing
        todoList.add(new TaskDTO("T01", "Project A", "Design", "Budi",
                TaskDTO.Priority.HIGH, "2026-05-20", "2026-05-25",
                8.0, 50.0, "Reviewer1", "Admin"));

        // Add more logic here (e.g., calculations, printing)
        System.out.println("System initialized with " + todoList.size() + " tasks.");
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
                    (task.getStatus() != TaskDTO.Status.DONE && task.getStatus() != TaskDTO.Status.CANCELLED)) {
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
