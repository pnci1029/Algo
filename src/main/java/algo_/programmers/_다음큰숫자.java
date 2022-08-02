//import java.util.ArrayList;
//import java.util.HashMap;
//
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        String a = "";
//        int comp_count = 0;
//        int count = 0;
//        a = Integer.toBinaryString(n);
////      1  0 1 1 1
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == '1') {
//                count++;
//            }
//        }
//        String idx = "";
//
//        for (int i = n + 1; i <= 1000000; i++) {
//            idx = Integer.toBinaryString(i);
//            comp_count = 0;
//            for (int j = 0; j < idx.length(); j++) {
//                if (idx.charAt(j) == '1') {
//                    comp_count++;
//                }
//
//            }
//            if (comp_count == count) {
//                answer = i;
//                break;
//            }
//        }
//        System.out.println(answer);
//
//
//        return answer;
//    }
//}
////65321110
//public class Main {
//    public static void main(String[] args) {
//
//        int n = 15;
//        Solution sol = new Solution();
//        sol.solution(n);
////            1 2 3 4 5 6  7
//    }
//}
//
//// 두개가같을땐 하나
//
////