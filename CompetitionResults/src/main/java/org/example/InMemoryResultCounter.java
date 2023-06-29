package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InMemoryResultCounter implements ResultCounter{
    private List<Athlete> athleteList;

    @Autowired
    public InMemoryResultCounter(List<Athlete> athleteList) {
        this.athleteList = athleteList;
    }

    @Override
    public List<Athlete> getFastest(int count, Gender gender, Distance distance){
        return athleteList.stream()
                .filter(athlete -> athlete.hasDistance(distance) && athlete.hasGender(gender))
                .sorted(Comparator.comparing(Athlete::getTime))
                .limit(count)
                .collect(Collectors.toList());
    }
}
