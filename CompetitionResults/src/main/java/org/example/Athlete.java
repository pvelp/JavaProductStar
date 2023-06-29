package org.example;

import java.time.Duration;

public class Athlete {
    private final String name;
    private final Gender gender;
    private final Distance distance;
    private final Duration time;

    public Athlete(String name, Gender gender, Distance distance, Duration time) {
        this.name = name;
        this.gender = gender;
        this.distance = distance;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Distance getDistance() {
        return distance;
    }

    public Duration getTime() {
        return time;
    }


    public boolean hasDistance(Distance distance){
        return this.distance.equals(distance);
    }

    public boolean hasGender(Gender gender){
        return this.gender.equals(gender);
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", distance=" + distance +
                ", time='" + time.getSeconds() + " sec" + '\'' +
                '}';
    }
}
