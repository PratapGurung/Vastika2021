package org.example.enums;

public enum CustomerOptions {
    SAVE(1),
    UPDATE(2),
    DELETE(3),
    GET(4),
    LIST(5);
    private final int value;

    private CustomerOptions(final int newValue){value = newValue;}
    public int getValue(){
        return value;
    }
}
