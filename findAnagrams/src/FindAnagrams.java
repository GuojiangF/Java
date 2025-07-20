import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length()) {
            return list;
        }

        int[] sLen = new int[26];
        int[] pLen = new int[26];
        for (int i = 0; i < p.length(); i++) {
            sLen[s.charAt(i) - 'a']++;
            pLen[p.charAt(i) - 'a']++;
        }

        if (Arrays.equals(sLen, pLen)) {
            list.add(0);
        }

        for (int i = 0; i < s.length() - p.length(); i++) {
            sLen[s.charAt(i) - 'a']--;
            sLen[s.charAt(i+p.length()) - 'a']++;
            if (Arrays.equals(sLen, pLen)) {
                list.add(i+1);
            }
        }
        return list;
    }
}
