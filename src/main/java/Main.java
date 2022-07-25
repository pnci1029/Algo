import java.util.ArrayList;
import java.util.List;

class Solution {

    public String solution(int[] numbers) {
        String answer = "";
        String result = "";
        int a =0;
        int bigOne = 0;
        List<Integer> arr_01 = new ArrayList<>();

        for (int n : numbers) {
            if (n < 10) {
                if (n > bigOne) {
                    bigOne = n;
                }
            }
        }
        return answer;
    }
}
//65321110
public class Main {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2,13,51,97};
        Solution sol = new Solution();
        sol.solution(numbers);
//            1 2 3 4 5 6  7
    }
}






//        for (int i = 0; i < numbers.length; i++) {
//        result += numbers[i];
//        }
//
//        String [] box = result.split("");
//        String[] resultBox = {"", "", "", "", "", "", "", "", "", ""};
//
////        숫자 삽입
//        for (int i = 0; i < box.length; i++) {
//        int  boxInt = Integer.parseInt(box[i]);
//        if (boxInt == 0) {
//        resultBox[0]+=0;
//        }else if(boxInt == 1) {
//        resultBox[1] +=1;
//        }else if(boxInt == 2) {
//        resultBox[2] +=2;
//        }else if(boxInt == 3) {
//        resultBox[3]+=3;
//        }else if(boxInt == 4) {
//        resultBox[4]+=4;
//        }else if(boxInt == 5) {
//        resultBox[5]+=5;
//        }else if(boxInt == 6) {
//        resultBox[6]+=6;
//        }else if(boxInt == 7) {
//        resultBox[7]+=7;
//        }else if(boxInt == 8) {
//        resultBox[8]+=8;
//        }else if(boxInt == 9) {
//        resultBox[9]+=9;
//        }
//
//        }
//
//        for (int i = resultBox.length - 1; i >= 0; i--) {
//        if (resultBox[i] != null) {
//        answer += resultBox[i];
//        }
//        }
//        System.out.println(answer);
