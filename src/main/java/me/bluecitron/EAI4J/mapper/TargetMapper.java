package me.bluecitron.EAI4J.mapper;

import me.bluecitron.EAI4J.model.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TargetMapper {
    int InsertEmployeesRecv(Employee employee);
    int UpdateEmployeesRecv(Employee employee);
}
