import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] time = {70,311,74,427,232,211,126,83,357,118,97,428};
        System.out.println(numPairsDivisibleBy60(time));
    }


    private static int numPairsDivisibleBy60(int[] time) {
        //List<Integer> songs = Arrays.asList(30, 30, 50, 10, 70, 50, 20, 40, 50, 10, 50, 10);
        //List<Integer> songs = Arrays.asList(time);
        // List<Integer> songs = Arrays.stream(time).boxed().toList();

        int current = 0;
        int count = 0;
        Arrays.sort(time);

        // List<Integer> songsHelp = new ArrayList(songs);
        // Collections.sort(songsHelp);
        // System.out.println("Sorted list: " + songsHelp + "\n");

        int index = time.length - 1;

        while (index >= current) {
            // if (songsHelp.size() == 1 || songsHelp.isEmpty()) {
            //     break;
            // }

            // if (index > (songsHelp.size() - 1)) {
            //     index--;
            // } else {
            if ((time[current] + time[index]) % 60 == 0) {
                count++;
                // songsHelp.remove(index);
                // songsHelp.remove(current);
                // current += 1;
                index--;
            } else {
                index--;
            }

            if (index == current + 1) {
                current++;
                index = time.length - 1;
            }
        }
        // }

        return count;
    }
}
