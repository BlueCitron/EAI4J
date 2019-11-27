package me.bluecitron.EAI4J.domain.source;

import me.bluecitron.EAI4J.model.Employee;

import java.util.List;

public interface SourceStrategy {
    public List<Employee> doProcess();
}
