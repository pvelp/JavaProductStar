package hw;

import java.util.*;

public class ResultsBoard {
    private final TreeMap<String, Float> map;

    public ResultsBoard(){
        map = new TreeMap<>();
    };

    public void addStudent(String name, Float score){
        map.put(name, score);
    };

    public List<String> top3(){
        TreeMap<String, Float> sortedMap = new TreeMap<>(Comparator.comparing(map::get));
        sortedMap.putAll(map);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            result.add(sortedMap.firstEntry().getKey());
            sortedMap.remove(sortedMap.firstKey());
        }
        return result;
    };
}


