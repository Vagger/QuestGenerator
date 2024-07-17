package main.utils;

public class StringComparator {

    public static int compareDifferenceCount(String str1, String str2) {
        int charDifferenceCount = 0;
        for (int i = 0; i < str1.length(); i++) {
            charDifferenceCount += differentChars(str1.charAt(i), str2.charAt(i));
        }

        return charDifferenceCount;
    }

    private static int differentChars(char c1, char c2) {
        return c1 == c2 ? 0 : 1;
    }
}
