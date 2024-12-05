import java.util.ArrayList;
import java.util.List;

public class kidCandies{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int candy : candies){
            max = Math.max(max ,candy);
        }
        for(int i = 0 ; i < candies.length ; i++){
            int extra =  candies[i] + extraCandies;
            if(extra >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        kidCandies obj = new kidCandies();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = obj.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
}