package homework;


import java.util.*;
public class CollectionHomeWork {

    public static void main(String[] args){
        // TASK 1
        HashMap<Integer, String> Mapa = new HashMap<>();
        Mapa.put(1, "FFFF");
        Mapa.put(2, "AAAA");
        Mapa.put(3, "WWWW");
        HashMap<String, Integer> NewMap = swap(Mapa);
        System.out.println(NewMap);

        //TASK2
        CompareListTimeGet();

        //TASK3
        ArrayList<String> Test = new ArrayList<>();
        Test.add("aaa");
        Test.add("bbb");
        Test.add("aaa");
        Test.add("ccc");
        Test.add("aaa");
        Test.add("ddd");
        Test.add("aaa");
        Test.add("bbb");
        DeleteDuplicate(Test);
        System.out.println(Test);
    }

    public static HashMap<String, Integer> swap(HashMap<Integer, String> Map){
        HashMap<String, Integer> MyMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : Map.entrySet()){
            MyMap.put(entry.getValue(), entry.getKey());
        }
        return MyMap;
    }


    public static void CompareListTimeGet(){
        final Random random = new Random();
        long Start, Finish, Result;
        int Tmp;
        ArrayList<Integer> Arr = new ArrayList<>();
        LinkedList<Integer> List = new LinkedList<>();
        for (int i = 0; i < 1000000; i++){
            Arr.add(random.nextInt());
            List.add(random.nextInt());
        }

        Start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            Tmp = Arr.get(random.nextInt(1000));
        }
        Finish = System.currentTimeMillis();
        Result = Finish - Start;
        System.out.printf("ArrayList time = %d\n", Result);

        Start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            Tmp = List.get(random.nextInt(1000));
        }
        Finish = System.currentTimeMillis();
        Result = Finish - Start;
        System.out.printf("LinkedList time = %d\n", Result);
    }

    public static void DeleteDuplicate(ArrayList<String> Arr){
        LinkedHashSet<String> Uniq = new LinkedHashSet<>(Arr);
        Arr.clear();
        Arr.addAll(Uniq);
    }

}
