package me.bluecitron.EAI4J.mapper;

import me.bluecitron.EAI4J.model.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SourceMapper {
    List<Employee> SelectEmployees();
    int UpdateEmployeesY(Employee employee);
}
