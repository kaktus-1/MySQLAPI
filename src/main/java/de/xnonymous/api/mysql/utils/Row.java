package de.xnonymous.api.mysql.utils;

import lombok.Getter;

import java.util.HashMap;

@Getter
public class Row {


    private final HashMap<String, Object> values = new HashMap<>();

    public void addValue(String name, Object cont) {
        values.put(name, cont);
    }

    public Object get(String name) {
        return values.get(name);
    }

}
