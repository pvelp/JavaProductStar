package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ResultProcessorMain {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ResultProcessorConfig.class);

        AthleteReader athleteReader = applicationContext.getBean(AthleteReader.class);
        Path filePath = Paths.get("results.csv");
        List<Athlete> res = athleteReader.readFromFile(filePath);
        ResultCounter resultCounter = new InMemoryResultCounter(res);
        List<Athlete> fastest = resultCounter.getFastest(4, Gender.MALE, Distance.TEN_KM);
        System.out.println(fastest);
    }
}
