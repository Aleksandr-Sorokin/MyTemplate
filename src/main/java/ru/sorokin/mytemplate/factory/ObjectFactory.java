package ru.sorokin.mytemplate.factory;

public interface ObjectFactory<T, D extends ObjectData> {
    T getData(D objectData);
}
