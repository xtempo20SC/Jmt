package module1.practice.Collections;

import java.util.ArrayList;
import java.util.List;

//Unordered
class SolutionS {
    public List<List<Integer>> subsets(int[] arr) {
        List<Integer> curr = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<>();
		rec(arr, 0, curr, ans);
        return ans;
    }
    
    public void rec(int[] arr, int i, List<Integer> curr, List<List<Integer>> ans) {
		if (i == arr.length) {
			ans.add(new ArrayList<Integer>(curr));
			return;
		}
		curr.add(arr[i]);
		rec(arr, i + 1, curr, ans);
		curr.remove(curr.size() - 1);
		rec(arr, i + 1, curr, ans);
        
	}
}


public class All_SubSet_of_an_Array {

	public static void main(String[] args) {
		
		SolutionS s = new SolutionS();
		int [] arr = new int[] {1,2,3};
		System.out.println(s.subsets(arr));
	}
}
