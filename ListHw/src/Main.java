import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(arr);
        List<Double> result = getRollingAverage(arr, 2);
        System.out.println(result);
    }

    public static Double getAvr(ArrayList<Integer> arr){
        double sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum / arr.size();
    }

    public static List<Double> getRollingAverage(ArrayList<Integer> arr, int k){
        ArrayList<Integer> subList = new ArrayList<>();
        ArrayList<Double> res = new ArrayList<>();
        for (int i = 0; i < k; i++){
            subList.add(arr.get(i));
        }
        System.out.println(subList);
        res.add(getAvr(subList));

        for (int i = k; i < arr.size(); i++){
            subList.add(arr.get(i));
            subList.remove(0);
            res.add(getAvr(subList));
            System.out.println(subList);
        }
        return res;
    }

}