/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int count = 1;
        String champion = "";
        while (!StdIn.isEmpty()) {
            String nextString = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / count)) {
                champion = nextString;
            }
            count++;
        }
        System.out.println(champion);
    }
}
