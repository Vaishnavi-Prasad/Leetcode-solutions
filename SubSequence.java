package com.ds.challenges;

public class SubSequence {
        public boolean isSubsequence(String s, String t) {

            if(s.length() == 0) return true;
            if(t.length() == 0) return false;
            if(s.charAt(s.length()-1) == t.charAt(t.length() -1)) {
                return isSubsequence(s.substring(0,s.length()-1), t.substring(0,t.length()-1));
            }
            return isSubsequence(s, t.substring(0,t.length()-1));
        }

}
