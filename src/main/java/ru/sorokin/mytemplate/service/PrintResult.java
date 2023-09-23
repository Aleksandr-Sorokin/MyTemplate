package ru.sorokin.mytemplate.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.sorokin.mytemplate.factory.ListIntegerFactory;
import ru.sorokin.mytemplate.models.DocumentData;
import ru.sorokin.mytemplate.models.DocumentTwoData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class PrintResult {

    private final ListIntegerFactory<DocumentData> documentDataFactory;
    private final ListIntegerFactory<DocumentTwoData> documentTwoDataFactory;

    public void printResultList() {
        List<Integer> listDocumentData = documentDataFactory.getData(createDocumentData());
        List<Integer> listDocumentTwoData = documentTwoDataFactory.getData(createDocumentTwoData());
        listDocumentData.forEach(System.out::println);
        listDocumentTwoData.forEach(System.out::println);
    }

    private DocumentData createDocumentData() {
        List<String> list = new ArrayList<>();
        list.add("11");
        list.add("2");
        list.add("5");
        list.add("8");
        list.add("o");
        list.add("d");
        list.add("23");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "43");
        map.put(2, "435");
        map.put(3, "g");
        map.put(4, "45.8");
        map.put(5, "48,9");
        map.put(7, "f");
        map.put(9, "6");

        return new DocumentData(list, map);
    }

    private DocumentTwoData createDocumentTwoData() {
        String string = "15;59;ui;56.5 ; 55,5 ;44;123 ";
        return new DocumentTwoData(100.63, string);
    }
}
