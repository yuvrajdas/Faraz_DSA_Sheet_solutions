
import java.util.*;
public class __1TwoSum {

    public static int[] towSum(int arr[], int target){
        int res[] = {-1,-1};
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(target-arr[i])){
                res[0] = i;
                res[1] = map.get(target-arr[i]);
            }

            map.put(arr[i], i);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        int res[] = towSum(arr, target);
        System.out.println(Arrays.toString(res));
    }
}
