package org.example.enums;

public enum Gender {
    MAN("Мужчина"), WOMAN("Женщина");
    private final String translation;

    Gender(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
