package algo_.programmers;
import java.util.Arrays;
import java.util.HashMap;


public class _완주하지못한마라토너 {
    public String Solution(String []partition, String [] competition){
        String answer = "";
        Arrays.sort(partition);
        Arrays.sort(competition);

        for(int i =0; i< partition.length; i++){
            if(!partition[i].equals(competition[i])){
                answer = partition[i];
                break;
            }
        }

//        HashMap<String, Integer> map = new HashMap<>();
//        // 전체 마라토너에게 키값 +1씩
//        for(String player: partition){
//            map.put(player, map.getOrDefault(player, 0) + 1);
//        }
//        // 전체마라토너값에서 완주한 마라토너값 -1씩  -> 완주못한 마라토너는 값이 0이 아닙
//        System.out.println(map);
//        for(String player: competition){
//            map.put(player, map.get(player)-1);
//        }
//        System.out.println(map);
//
//        for(String key: map.keySet()){
//            if (map.get(key) != 0)
//                answer = key;
//                break;
//        }
        return answer;
    }


    public static void main(String[] args) {
        String [] part = {"leo", "kiki","eden","dona"};
        String [] comp = {"leo", "eden","kiki"};
        _완주하지못한마라토너 solu = new _완주하지못한마라토너();

        System.out.println(solu.Solution(part,comp));
    }
}
