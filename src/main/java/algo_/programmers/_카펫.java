//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//
//class Solution {
//    public int[] solution(int brown, int yellow) {
//        int[] answer = new int[2];
//        int pl = brown + yellow;
//        int width = 0;
//        int height = 0;
//
//
//        for (int i = 3; i < pl; i++) {
//            width = i;
//            height = pl / width;
//
//            if (height < 3) {
//                continue;
//            }
//            if ((width - 2) * (height - 2) == yellow) {
//                answer[0] = width;
//                answer[1] = height;
//            }
//
//        }
//
//        System.out.println(answer[0]);
//        System.out.println(answer[1]);
//        return answer;
//    }
//}
////65321110
//public class Main {
//    public static void main(String[] args) {
//
//        int brown = 50;
//        int yellow = 22;
//        Solution sol = new Solution();
//        sol.solution(brown, yellow);
////            1 2 3 4 5 6  7
//    }
//}
//
//
//
//
//
////        int ad = brown + yellow;
////
////        ArrayList<Integer> box = new ArrayList<>();
////        for (int i = 2; i < ad-1; i++) {
////            if (ad % i == 0) {
////                box.add(i);
////            }
////        }
////        int a = 0;
////        int b = -1;
////        int result = 0;
////              1 2 3 4 5 6
////        if (box.size() > 3) {
////
////            int first = ((box.get(box.size() / 2+a)) - 2);
////            int first_an = ((box.get(box.size() / 2+a)));
////            int sec = (box.get(box.size() / 2 + b) - 2);
////            int sec_an = (box.get(box.size() / 2 + b));
////            result = first * sec;
////            if (result == yellow) {
////                answer[0] = first_an;
////                answer[1] = sec_an;
////            } else {
////                for (int i = 0; i < box.size() / 2; i++) {
////                }
////            }
////
////        } else if (box.size() == 3) {
////            answer[0] = box.get(1);
////            answer[1] = box.get(1);
////        }
////        else if (box.size() < 3) {
////            answer[0] = box.get(0);
////            answer[1] = box.get(0);
////        }
//////        System.out.println(first+"    "+sec);
////        System.out.println("resutl : "+result);
////        System.out.println(box);
////        System.out.println(answer[0]+"  "+answer[1]);