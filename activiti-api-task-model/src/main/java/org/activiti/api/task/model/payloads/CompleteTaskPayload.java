package org.activiti.api.task.model.payloads;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import org.activiti.api.model.shared.Payload;

public class CompleteTaskPayload implements Payload {

    private String id;
    private String taskId;
    private Map<String, Object> variables = new LinkedHashMap<>();
    private Map<String, Object> taskVariables = new LinkedHashMap<>();

    public CompleteTaskPayload() {
        this.id = UUID.randomUUID().toString();
    }

    public CompleteTaskPayload(String taskId,
                               Map<String, Object> variables,
                               Map<String, Object> taskVariables) {
        this();
        this.taskId = taskId;
        this.variables = variables;
        this.taskVariables = taskVariables;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

    
    public Map<String, Object> getTaskVariables() {
        return taskVariables;
    }

    
    public void setTaskVariables(Map<String, Object> taskVariables) {
        this.taskVariables = taskVariables;
    }
}
