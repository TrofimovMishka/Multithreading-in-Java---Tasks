package mytests.learn_googling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class HowSortListByDescendingOrder {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Bob", "Armin", "Groog", "Wesley", "Mike", "Arbuz");

        Collections.sort(words, Collections.reverseOrder());

        for (String word : words) {
            System.out.print(word+ " ");
        }
    }
}
