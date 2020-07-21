package org.launchcode.techjobs_oo;

import java.util.Objects;

public class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField(int id, String value) {
        this.id = id;
        this.value = value;
    }


}
