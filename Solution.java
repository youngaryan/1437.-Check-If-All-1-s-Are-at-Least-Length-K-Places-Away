import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int index = 0;
        List<Integer> temps = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp;
            if (nums[i] == 1){
                temp = i - (index);
                index = i;
                temps.add(temp);
            }
        }
        if (temps.size() == 1)return true;
        if (temps.size() == 0)return true;
        temps.remove(0);


        Collections.sort(temps);
        //throw new RuntimeException(String.valueOf(temps));

        return k<= temps.get(0)-1;
    }
}
