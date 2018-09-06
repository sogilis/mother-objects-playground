package com.sogilis.kata.mothers.people;

import java.time.Instant;

public interface Student {
    Instant studiesStart();
    Instant theoreticalStudiesEnd();
    int cursusDuration();
    int timeLeftBeforeDegree();
    Degree expectedDegree();

    enum Degree{ DOCTOR, MASTER, BACHELOR }
}
