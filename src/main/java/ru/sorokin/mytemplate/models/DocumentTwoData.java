package ru.sorokin.mytemplate.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.sorokin.mytemplate.factory.ObjectData;

@Getter
@Setter
@RequiredArgsConstructor
public class DocumentTwoData implements ObjectData {

    private final Double aDouble;
    private final String aString;
}
