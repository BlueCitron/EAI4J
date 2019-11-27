package me.bluecitron.EAI4J.domain.target;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.bluecitron.EAI4J.mapper.SourceMapper;
import me.bluecitron.EAI4J.mapper.TargetMapper;
import me.bluecitron.EAI4J.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class SimpleInsertUpdateStrategy implements TargetStrategy{

    private final SourceMapper sourceMapper;
    private final TargetMapper targetMapper;

    @Transactional
    @Override
    public void doProcess(Employee employee) {
        try {
            int result = targetMapper.UpdateEmployeesRecv(employee);
            if (result == 0) {
                targetMapper.InsertEmployeesRecv(employee);
            }
            sourceMapper.UpdateEmployeesY(employee);
        } catch (Exception e) {
            log.info("ERROR : {}", employee.toString());
        }
    }
}
