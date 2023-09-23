package ru.sorokin.mytemplate.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.sorokin.mytemplate.factory.ObjectData;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@RequiredArgsConstructor
public class DocumentData implements ObjectData {

    private final List<String> stringList;
    private final Map<Integer, String> stringMap;
}
