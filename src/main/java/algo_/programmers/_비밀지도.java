//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] answer = new String[n];
//
//        String[] answerbox_01 = new String[n];
//        String[] answerbox_02 = new String[n];
//
//        int[] intbox = new int[n];
//        String[] stringBox = new String[n];
//
//        for (int i = 0; i < arr1.length; i++) {
//            answerbox_01[i] = Integer.toBinaryString(arr1[i]);
//            answerbox_02[i] = Integer.toBinaryString(arr2[i]);
//
//            intbox[i] = Integer.parseInt(answerbox_01[i])+Integer.parseInt(answerbox_02[i]);
//            stringBox[i] = String.valueOf(intbox[i]);
//            System.out.println(intbox[i]);
//        }
//
//        for (int i = 0; i < intbox.length; i++) {
//            char[] c = stringBox[i].toCharArray();
//
//            while(stringBox[i].length() <n){
//                stringBox[i] = " " + stringBox[i];
//            }
////            if (stringBox[i].length() < n) {
////                stringBox[i] = " " + stringBox[i];
////            }
//            stringBox[i] = stringBox[i].replace("0", " ");
//            stringBox[i] = stringBox[i].replace("1", "#");
//            stringBox[i] = stringBox[i].replace("2", "#");
//
//
//            System.out.println(stringBox[i]);
//            answer[i] = stringBox[i];
//        }
//
//        return answer;
//    }
//}
////65321110
//public class Main {
//    public static void main(String[] args) {
//        int[] arr1 = {46,33,33,22,31,50};
//        int[] arr2 = {27,56,19,14,14,10};
//        int n =6;
//
//        Solution sol = new Solution();
//        sol.solution(n, arr1, arr2);
////            1 2 3 4 5 6  7
//    }
//}
//
//
//
//
//
//
////        String[] box_01 = new String[n];
////        String[] box_02 = new String[n];
////
////        int[] box_sum = new int[n];
////        String box1 = "";
////        String[][] result_box = new String[n][n];
////        int idx = 0;
////
////
////        for (int i = 0; i < arr1.length; i++) {
////            box_01[i] = Integer.toBinaryString(arr1[i]);
////            box_02[i] = Integer.toBinaryString(arr2[i]);
////
////            box_sum[i]=Integer.parseInt(box_01[i])+Integer.parseInt(box_02[i]);
////
//////            System.out.println(box_sum[i]);
////            box1 = String.valueOf(box_sum[i]);
////            char []c = box1.toCharArray();
////            System.out.println(box1);
////            for (int j = 0; j < arr1.length; j++) {
////                result_box[j][i] = String.valueOf(c[j]);
////            }
////
//////            System.out.println(c[1]);
////        }
////        System.out.println(result_box[0][1]);