package de.xnonymous.api.mysql.utils;

import lombok.Getter;

import java.util.ArrayList;


@Getter
public class Data {

    private final ArrayList<Row> objects = new ArrayList<>();

    public void addRow(Row row) {
        objects.add(row);
    }

}
