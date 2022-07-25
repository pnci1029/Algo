//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
//
//class Solution {
//    public int solution(int[] scoville, int K) {
//        int answer =0;
////      우선순위 큐(디폴트가 낮은순으로)
//        PriorityQueue<Integer> box = new PriorityQueue<>();
//        Arrays.sort(scoville);
//
//        for (int i = 0; i < scoville.length; i++) {
//            box.add(scoville[i]);
//        }
//
////        ,poll -> 반환하고 제거
////        System.out.println(box.poll());
//
//        while (box.peek() < K) {
//            if (box.size() < 2) {
//                return  -1;
//            }
//            int fir = box.poll();
//            int sec = box.poll();
//            box.add( fir + sec * 2);
//
//            answer++;
//        }
//
//
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int[] scoville = {7,9,3,1,5,4,3,11,34,95,2};
//        int K = 15;
//        Solution sol = new Solution();
//        sol.solution(scoville,K);
//
//    }
//}
////        ArrayList<Integer> box = new ArrayList<>();
////
////        Arrays.sort(scoville);
////
////        box.add(scoville[0]);
////
////        for (int i = 1; i < scoville.length; i++) {
////            box.add(box.get(i-1) + (scoville[i] * 2));
////            if (box.get(i-1)>= K  && scoville[i]>=K) {
////                break;
////            }
////            System.out.println(box.get(i));
////            System.out.println(scoville[i+1]);
////            scoville[i - 1] = box.get(i);
////            answer++;
////        }
//////        System.out.println(box.get(2));
//////        System.out.println(box.get(3));
////        System.out.println(answer);