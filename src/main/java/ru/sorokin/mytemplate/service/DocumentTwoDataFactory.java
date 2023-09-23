package ru.sorokin.mytemplate.service;

import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Component;
import ru.sorokin.mytemplate.factory.ListIntegerFactory;
import ru.sorokin.mytemplate.models.DocumentTwoData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DocumentTwoDataFactory implements ListIntegerFactory<DocumentTwoData> {

    @Override
    public List<Integer> getData(DocumentTwoData objectData) {
        List<Integer> result = createListIntegerFromDouble(objectData.getADouble());
        result.addAll(createListIntegerFromString(objectData.getAString()));
        return result;
    }

    private List<Integer> createListIntegerFromDouble(Double inputDouble) {
        List<Integer> list = new ArrayList<>();
        list.add(inputDouble.intValue());
        return list;
    }

    private List<Integer> createListIntegerFromString(String inputString) {
        String[] strings = inputString.split(";");
        return Arrays.stream(strings)
                .filter(NumberUtils::isDigits)
                .map(s -> Integer.parseInt(s.trim()))
                .sorted()
                .collect(Collectors.toList());
    }
}
