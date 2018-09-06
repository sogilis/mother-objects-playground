package com.sogilis.kata.mothers;

public enum Speciality {
    SURGERY(5),
    ORTHOPAEDICS(3),
    PAEDIATRICS(5),
    CARDIOLOGY(7),
    NEUROLOGY(8);

    private final int cursusDuration;

    Speciality(final int cursusDuration){
        this.cursusDuration = cursusDuration;
    }

    public int getCursusDuration() {
        return cursusDuration;
    }
}
