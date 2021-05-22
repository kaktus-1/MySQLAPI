package de.xnonymous.api.mysql.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NonNull
public class Delete {

    @NonNull
    private Object value;
    @NonNull
    private Object column;

    public static Delete of(Object value, Object column) {
        return new Delete(value, column);
    }

}
