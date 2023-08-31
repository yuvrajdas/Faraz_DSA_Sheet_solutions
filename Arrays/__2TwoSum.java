
import java.util.*;

// if Array is sorted
public class __2TwoSum {
    
    private static ArrayList<ArrayList<Integer>> findPairs(int arr[], int target){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list;

        int si = 0;
        int ei = arr.length-1;
        while(si<ei){
            if(si!=0 && arr[si]==arr[si-1]){
                si++;
                continue;
            }

            if(arr[si]+arr[ei] == target){
                list = new ArrayList<>();
                list.add(arr[si]);
                list.add(arr[ei]);
                res.add(list);
                si++;
                ei--;
            }else if(arr[si]+arr[ei]<target){
                si++;
            }else{
                ei--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,4,6,7,8,9,9,9};
        ArrayList<ArrayList<Integer>> res = findPairs(arr, 10);
        System.out.println(res);
    }
}
