import hw.ResultsBoard;

public class Main {
    public static void main(String[] args) {
        ResultsBoard resultsBoard = new ResultsBoard();
        resultsBoard.addStudent("A", 12f);
        resultsBoard.addStudent("B", 10f);
        resultsBoard.addStudent("C", 11f);
        resultsBoard.addStudent("D", 15f);
        resultsBoard.addStudent("E", 17f);
        resultsBoard.addStudent("F", 3f);
        resultsBoard.addStudent("G", 49f);
        resultsBoard.addStudent("H", 1f);
        System.out.println(resultsBoard.top3());
    }
}