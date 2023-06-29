package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AthleteReader {
    private final AthleteParser athleteParser;

    @Autowired
    public AthleteReader(AthleteParser athleteParser) {
        this.athleteParser = athleteParser;
    }

    public List<Athlete> readFromFile(Path filePath){
        try {
            return Files.lines(filePath)
                    .map(athleteParser::parseResult)
                    .collect(Collectors.toList());
        } catch (IOException e){
                throw new UncheckedIOException(e);
        }
    }
}
