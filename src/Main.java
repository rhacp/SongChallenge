import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> songs = Arrays.asList(30, 30, 50, 10, 70, 50, 20, 40, 50, 10);
//        List<Integer> songs = Arrays.asList(30, 30, 50, 10, 70);

        int current = 0;
        int count = 0;

        List<Integer> songsHelp = new ArrayList(songs);
        Collections.sort(songsHelp);
        System.out.println("Sorted list: " + songsHelp + "\n");

        int index = songsHelp.size() - 1;

        while (index >= 0) {
            if (songsHelp.size() == 1 || songsHelp.isEmpty()) {
                break;
            }

            if (index > (songsHelp.size() - 1)) {
                index--;
            } else {
                if ((songsHelp.get(current) + songsHelp.get(index)) % 60 == 0) {
                    count++;
                    songsHelp.remove(index);
                    songsHelp.remove(current);
                    current = 0;
                    index = songsHelp.size() - 1;
                } else {
                    index--;
                }

                if (index == current + 1) {
                    current++;
                }
            }
        }

        System.out.println("Initial list: " + songs);
        System.out.println("Pair count: " + count);
    }
}