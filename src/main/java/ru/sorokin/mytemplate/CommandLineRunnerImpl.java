package ru.sorokin.mytemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.sorokin.mytemplate.service.PrintResult;

@Component
@RequiredArgsConstructor
public class CommandLineRunnerImpl implements CommandLineRunner {

    private final PrintResult printResult;

    @Override
    public void run(String... args) throws Exception {
        printResult.printResultList();
    }
}
