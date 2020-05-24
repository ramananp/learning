package io.ramanan.learning.challenge;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            char lc = s.charAt(l);
            char rc = s.charAt(r);
            
            if (!(Character.isAlphabetic(lc) || (lc >= '0' && lc <= '9'))) {
                l ++;
            } else if (!(Character.isAlphabetic(rc) || (rc >= '0' && rc <= '9'))) {
                r --;
            } else {
                lc = Character.toLowerCase(lc);
                rc = Character.toLowerCase(rc);
                
                if (lc != rc) return false;
                else {
                    l ++;
                    r --;
                }
            }
        }
        return true;
    }

    public static boolean isPalindrome1(String s) {
        if("".equals(s.trim())) return true;
        int left = 0, right = s.length()-1;
        while(left < right) {
            char lc = s.charAt(left);
            char rc = s.charAt(right);
            if(!Character.isAlphabetic(lc) && !(lc >= '0' && lc <= '9')) {
                left++;
            }else if(!Character.isAlphabetic(rc) && !(rc >= '0' && rc <= '9')) {
                right--;
            } else {
                if(Character.toLowerCase(lc) != Character.toLowerCase(rc)) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
        System.out.println(isPalindrome1("0P"));
    }
}