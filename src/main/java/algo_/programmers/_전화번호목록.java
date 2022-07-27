//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//
//class Solution {
//    public boolean solution(String[] phone_book) {
//        boolean answer = true;
//
//        Arrays.sort(phone_book);
////.substring(0, phone_book[i - 1].length())
//        for (int i = 1; i < phone_book.length; i++) {
//            String a = phone_book[i];
//            String b = phone_book[i-1];
//            if (a.length() > b.length()) {
//                if (a.substring(0, b.length()).equals(b)) {
//                    answer = false;
//                    break;
//                } else {
//                    answer = true;
//                }
//            } else {
//                if (b.substring(0, b.length()).equals(a)) {
//                    answer = false;
//                    break;
//                } else {
//                    answer = true;
//                }
//            }
//
//
//
//        }
////        String a = phone_book[2].substring(0,phone_book[0].length());
////        System.out.println(a);
//        System.out.println(answer);
//        return answer;
//
//    }
//}
////65321110
//public class Main {
//    public static void main(String[] args) {
//        String[] phone_book = {"44","1235","567","88","55"};
//
//        Solution sol = new Solution();
//        sol.solution(phone_book);
////            1 2 3 4 5 6  7
//    }
//}
//
//
//
//
//
//
//
//
//
////        HashMap<String, ArrayList<Integer>> lengthList = new HashMap<>();
////
////        for (String phone_list : phone_book) {
////            ArrayList<Integer> arr = new ArrayList<>();
////            int length = phone_list.length();
////            arr.add(length);
////
////            lengthList.put()
////
////        }