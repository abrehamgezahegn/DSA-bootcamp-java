package com.basics;

public class PatternMatch {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 1, 1, 3, 3, 5};
        int[] patt = {1, 2, 1, 3};
        System.out.println("Match: " + matchPattern(arr, arr.length, patt, patt.length));
    }

    static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
// len is the number of elements in the array a, patternLen is the number of elements in the pattern.
        int i = 0; // index into a
        int k = 0; // index into pattern
        int matches = 0; // how many times current pattern character has been matched so far
        for (i = 0; i < len; i++) {

            if (a[i] == pattern[k]) {
                System.out.println("a[i] " + i);
                System.out.println("pattern[k] " + k);
                matches++; // current pattern character was matched
            } else if (matches == 0 || k == patternLen - 1) {
                System.out.println("matches: " + matches);
                return 0; // if pattern[k] was never matched (matches==0) or at end of pattern (k==patternLen-1)

            } else {
                System.out.println("in else");
                if (a[i] != pattern[k + 1]) {
                    return 0;
                } else {
                    k++;
                }

            }

        }
        System.out.println("i: " + i);
// return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1)
        if (i == len && k == patternLen - 1) {
            return 1;
        } else return 0;
    }
}
