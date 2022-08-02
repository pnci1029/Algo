//import java.util.ArrayList;
//import java.util.Arrays;
//
//class Solution {
//    public int solution(int[] people, int limit) {
//        int answer = 0;
//        int min = 0;
//
//        Arrays.sort(people);
//
//        ArrayList<Integer> box = new ArrayList<>();
//        for (int i = people.length - 1; min<=i; i--) {
//
//            if (people[i] + people[min] <= limit) {
//                min++;
//            }
//            answer++;
//        }
//
//        System.out.println(answer);
//
//
//        return answer;
//    }
//}
//// 50 50 70 80
//public class Main {
//    public static void main(String[] args) {
//
//        int limit = 100;
//        int[] people = {70, 50, 80, 50};
//        Solution sol = new Solution();
//        sol.solution(people,  limit);
////            1 2 3 4 5 6  7
//    }
//}
//
//// 두개가같을땐 하나
//
////