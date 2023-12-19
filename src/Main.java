import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] time = {30,20,150,100,40};
        System.out.println(numPairsDivisibleBy60(time));
    }


    private static int numPairsDivisibleBy60(int[] time) {
        int current = 0;
        int count = 0;
        Arrays.sort(time);

        int index = time.length - 1;

        while (index >= current) {
            if (index == current) {
                current++;
                index = time.length - 1;
            } else {

                if ((time[current] + time[index]) % 60 == 0) {
                    count++;
                    index--;
                } else {
                    index--;
                }
            }
        }
        return count;
    }
}
