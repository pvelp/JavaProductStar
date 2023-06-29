package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.time.Duration;

@Service
public class AthleteParser {
    private static final String SEPARATOR = ",";

    public Athlete parseResult(String line) {
        var resultParts = line.split(SEPARATOR);

        String  name = resultParts[0];
        Gender gender = Gender.of(resultParts[1]);
        Distance distance = Distance.of(resultParts[2]);
        Duration time = parseTime(resultParts[3]);

        return new Athlete(name, gender, distance, time);
    }

    private Duration parseTime(String time){
        String[] timeParts = time.split(":");
        int totalSecond = Integer.parseInt(timeParts[0])*60 + Integer.parseInt(timeParts[1]);
        return Duration.ofSeconds(totalSecond);
    }
}
