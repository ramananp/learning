package io.ramanan.learning.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroup = new HashMap<>();
        for (String str : strs) {
            String key = buildKey(str);
            if (!anagramGroup.containsKey(key)) {
                anagramGroup.put(key, new ArrayList<String>());
            }
            anagramGroup.get(key).add(str);
        }
        return anagramGroup.values().stream().collect(Collectors.toList());
    }
    
    private static String buildKey(String s) {
        char[] count = new char[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        return new String(count);
    }

    public static void main(String[] args) {
        String[] group = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(group));
    }    

}