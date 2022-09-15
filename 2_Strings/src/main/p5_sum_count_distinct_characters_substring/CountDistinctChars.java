package p5_sum_count_distinct_characters_substring;

import java.util.*;

/**
 * [Amazon]
 * Given a string, return the sum of count of distinct characters
 * in all the substrings of that string.
 * For example:
 * - Input String: "test"
 * Possible substrings with distinct character count
 * "t" -> 1
 * "e" -> 1
 * "s" -> 1
 * "t" -> 1
 * "te" -> 2
 * "es" -> 2
 * "st" -> 2
 * "tes" -> 3
 * "est" -> 3
 * "test" -> 3
 * Number of distinct chars -> 1+1+1+1+2+2+2+3+3+3 = 19
 * - Output: 19
 */
public class CountDistinctChars {
    public int countDistinctChars(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0, sum = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            // char at i contributes to all substrings S that end at i minus number of substrings of S which already counted char at i
            int tcount = i + 1 - map.getOrDefault(c, 0);
            count += sum + tcount;
            // sum of counts of previous chars
            sum += tcount;
            map.put(c, i + 1);
        }
        return count;
    }

    public static void main(String[] args) {

        List<Integer> parcels = new ArrayList<>();
        parcels.add(4);
        parcels.add(4);
        parcels.add(2);
        parcels.add(3);
        parcels.add(4);

        Set<Integer> uniqueParcels = new HashSet<>(parcels);
        uniqueParcels.remove(0);
        int days = uniqueParcels.size();

    }
}
