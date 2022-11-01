package ExamStudy;

import java.util.Random;

public class PracticeExam2 {


    public static boolean areFactors(int n, int [] aoi){
        for (int i = 0; i < aoi.length; i++)
            if (n % aoi[i] != 0)
                return false;
        return true;
    }
/*
    public static String jumble(String answer){
        Random rng = new Random;
        String jumbled = "";
        for (int i = 0; i < answer.length(); i++);
        int temp = rng.nextInt(0, answer.length() - 1);
        jumbled += answer[temp];
        answer -= [temp];
    }

*/

    public static void main(String[] args) {
        int [] nums = {1, 3, 5, 15};
        System.out.println(areFactors(15, nums));
    }
}
