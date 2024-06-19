package org.example.enums;

public enum Gender {
    M("Мужчина"), W("Женщина"), OTHER("Другое");
    private final String translation;

    Gender(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
