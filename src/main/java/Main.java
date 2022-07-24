import java.util.*;
class Solution {

    public String solution(int[] numbers) {
        String answer = "";
        String result = "";
        Arrays.sort(numbers);
        String[] box = new String[10];
//        System.out.println(box[9]);

        for (int i = 0; i < numbers.length; i++) {
            result += String.valueOf(numbers[i]);
        }

        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            System.out.println(c);
            if (c == '0') {
                box[0] += c;
            }
        }
        System.out.println(box[1]);


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        Solution sol = new Solution();
        sol.solution(numbers);
//            1 2 3 4 5 6  7
    }
}
