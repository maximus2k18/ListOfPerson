package org.example.enums;

public enum Marriage {
    MARRIADE("Состоит в браке"), SINGLE("Не состоит в браке");
    private final String marriage;

    Marriage(String marriage) {
        this.marriage = marriage;
    }

    public String getMarriage() {
        return marriage;
    }
}

