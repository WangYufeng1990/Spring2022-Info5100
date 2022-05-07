package FinalTerm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution test = new Solution();
        String s = "}";
        System.out.println(test.isValid(s));

        String[] array = new String[]{"","aaa","aabcccccaaa", "ab", "abcdefZZZHHHj", "aaabbbcccDefi"};
        String[] q3 = new String[]{"bbbbb","pwwkew", "aaa","aabcccccaaa", "ab", "abcdefZZZHHHj", "aaabbbcccDefi"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(test.compressString(array[i]));

        }
        for (int i = 0; i < q3.length; i++) {
            System.out.println(test.lengthOfLongestSubstring(q3[i]));

        }

        int[] res = test.sumZero(3);
        for (int i =0; i < res.length; i++) {
            System.out.println(res[i]);
        }

        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(test.findKthLargest(nums,4));

    }

    //Question1
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') stack.push(s.charAt(i));
            if(s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            }
            if(s.charAt(i) == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
            if(s.charAt(i) == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }

    //Question2
    public String compressString(String str) {
        if (str == null || str.length() == 0) return str;
        StringBuilder sb = new StringBuilder();
        char[] array = str.toCharArray();
        sb.append(array[0]);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (array[i] == array[i-1]) {
                count++;
            }
            else {
                sb.append(count);
                sb.append(array[i]);
                count = 1;
            }
        }
        sb.append(count);
        String res = sb.toString();
        if (str.length() <= res.length()) {
            return str;
        }
        else return res;
    }

    //Question3
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i))+1);
            }
            res = Math.max(res, i - left + 1);
            map.put(s.charAt(i), i);
        }
        return res;
    }

    //Question4
    public int[] sumZero(int n) {
        if (n <= 0) return new int[]{};
        int[] res = new int[n];
        int max = n/2;
        for (int i = 0; i < n; i++) {
            res[i] = i - max;
        }
        if (n % 2 == 0) res[max] = max;
        return res;
    }

    //Question5
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (pq.peek() < nums[i]) {
                pq.poll();
                pq.offer(nums[i]);
            }
        }
        return pq.peek();
    }
}
