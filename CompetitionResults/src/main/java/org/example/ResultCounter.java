package org.example;

import java.util.List;

public interface ResultCounter {

    List<Athlete> getFastest(int count, Gender gender, Distance distance);
}
