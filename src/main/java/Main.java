class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        return answer;
    }
}
//65321110
public class Main {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k =2;

        Solution sol = new Solution();
        sol.solution(id_list, report, k);
//            1 2 3 4 5 6  7
    }
}





