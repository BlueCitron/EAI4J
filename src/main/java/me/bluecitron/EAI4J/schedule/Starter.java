package me.bluecitron.EAI4J.schedule;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.bluecitron.EAI4J.domain.source.SourceStrategy;
import me.bluecitron.EAI4J.domain.target.TargetStrategy;
import me.bluecitron.EAI4J.model.Employee;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class Starter {

    private final SourceStrategy sourceStrategy;
    private final TargetStrategy targetStrategy;

    @Scheduled(cron = "0 * * * * ?")
    public void run() {
        log.info("Start.");
        List<Employee> employees = sourceStrategy.doProcess();
        employees
                .parallelStream()
                .forEach(employee -> {
                    log.info("EMP_NO: [{}]", employee.getEmpNo());
                    targetStrategy.doProcess(employee);
                 });
        log.info("Finish.");
    }
}
