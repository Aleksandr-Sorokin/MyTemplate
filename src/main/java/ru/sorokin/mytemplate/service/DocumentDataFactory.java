package ru.sorokin.mytemplate.service;

import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Component;
import ru.sorokin.mytemplate.factory.ListIntegerFactory;
import ru.sorokin.mytemplate.models.DocumentData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class DocumentDataFactory implements ListIntegerFactory<DocumentData> {

    @Override
    public List<Integer> getData(DocumentData objectData) {
        List<Integer> result = createListIntegerFromList(objectData.getStringList());
        result.addAll(createListIntegerFromMap(objectData.getStringMap()));
        return result;
    }

    private List<Integer> createListIntegerFromList(List<String> inputList) {
        return inputList.stream()
                .filter(NumberUtils::isDigits)
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
    }

    private List<Integer> createListIntegerFromMap(Map<Integer, String> inputMap) {
        return inputMap.values().stream()
                .filter(NumberUtils::isDigits)
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
    }
}
