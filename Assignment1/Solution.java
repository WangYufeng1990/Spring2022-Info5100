import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {

        Solution test = new Solution();
        String s = "abc";
        String s1 = "aabcc";

        //1.test case

        System.out.println(test.isPalindrome(s));

        //2.test case
        System.out.println(test.isUnique(s));

        //3.test
        System.out.println(test.hasDuplicates(s));

        //4.test
        System.out.println(test.isAnagram(s, s1));

        //5.test
        System.out.println(test.isLeapYear(1900));

        //6.tesst
        System.out.println(test.bill(201));

        //7.test
        System.out.println(test.isConstructed(s, s1));

        //8.test
        test.prompts('E');

        //10.test
        Box box = new Box(3,4,5);
        System.out.println(box.volume(box));

    }

    //1.Write a program find if String is Palindrome?
    public boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        int left = 0, right = s.length()-1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //2.Write a program to check if a string has all unique characters.
    public boolean isUnique(String s) {
        int len = s.length();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            if (!set.contains(s.charAt(i))) set.add(s.charAt(i));
            else return false;
        }
        return true;
    }

    //3.Write a program to check if string contains duplicates
    public boolean hasDuplicates(String s) {
        int len = s.length();
        Set<Character> set = new HashSet<>();
        int index = 0;
        while (index < len) {
            if (!set.contains(s.charAt(index))) {
                set.add(s.charAt(index));
                index++;
            }
            else return true;
        }
        return false;
    }

    //4.Write a program to check if two strings are anagrams. Anagrams are strings which can be made by rearranging characters in string.
    public boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int len = s1.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
        }

        for (int i = 0; i < len; i++) {
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0)-1);
            if (map.get(s2.charAt(i)) < 0) return false;
        }
        return true;
    }

    //5.Write a program to determine whether the year is a leap year or not.
    public boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) return true;
            else return false;
        }
        else if (year % 4  == 0) return true;
        return false;

    }

    //6.Write a program to calculate the monthly telephone bills as per the following rule: Minimum $ 200 for up to 100 calls.
    public double bill(int calls) {
        String callNumber = "";
        double res = 0.00;
        if (calls <= 100) callNumber = "calls <= 100";
        else if (calls <= 150) callNumber = "calls <= 150";
        else if (calls <= 200) callNumber = "calls <= 200";
        else callNumber = "calls > 200";
        switch(callNumber) {
            case "calls <= 100":
                res = 200.00;
                break;
            case "calls <= 150":
                res = 200 + 0.6 * (calls - 100);
                break;
            case "calls <= 200":
                res = 230 + 0.5 * (calls - 150);
                break;
            case "calls > 200":
                res = 255 + 0.4 * (calls - 200);
                break;
        }
        return res;
    }

    //7.Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
    //
    //Each letter in magazine can only be used once in ransomNote.
    public boolean isConstructed(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0)+1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map.get(ransomNote.charAt(i)) <= 0) return false;
            map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))-1);
        }
        return true;
    }

    //8.Write a program that prompts the user’s grade. Your program should display the corresponding meaning of grade as per the following table
    public void prompts(Character grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good!");
                break;
            case 'C':
                System.out.println("Average!");
                break;
            case 'D':
                System.out.println("Deficient!");
                break;
            case 'F':
                System.out.println("Failing!");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}


