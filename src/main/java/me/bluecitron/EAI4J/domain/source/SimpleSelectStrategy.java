package me.bluecitron.EAI4J.domain.source;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.bluecitron.EAI4J.mapper.SourceMapper;
import me.bluecitron.EAI4J.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class SimpleSelectStrategy implements SourceStrategy {

    private final SourceMapper sourceMapper;

    @Override
    public List<Employee> doProcess() {
        return sourceMapper.SelectEmployees();
    }
}
