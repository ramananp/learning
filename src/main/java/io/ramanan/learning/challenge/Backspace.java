package io.ramanan.learning.challenge;

public class Backspace {

    public static boolean backspace(String s, String t) {
        int cntS = 0;
        int cntT=  0;
        int indexS = s.length() - 1;
        int indexT = t.length() - 1;
        while(indexS >= 0 || indexT >= 0){
            //System.out.println(indexS + " " + indexT);
            while(indexS >= 0 && (s.charAt(indexS) == '#' || cntS > 0)){
                if(s.charAt(indexS) == '#')
                    cntS ++;
                else
                    cntS--;
                indexS--;
            }
            while(indexT >= 0 && (t.charAt(indexT) == '#' || cntT > 0)){
                if(t.charAt(indexT) == '#')
                    cntT ++;
                else
                    cntT--;
                indexT--;
            }
            if(indexS == -1 && indexT == -1)
                return true;
            if(indexS == -1 || indexT == -1)
                return false;
            if(s.charAt(indexS) != t.charAt(indexT))
                return false;
            indexS--;
            indexT--;

        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(backspace("a##c", "#a#c"));
    }

}