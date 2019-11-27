package me.bluecitron.EAI4J.domain.target;

import me.bluecitron.EAI4J.model.Employee;

import java.util.List;

public interface TargetStrategy {
    public void doProcess(Employee employee);
}
