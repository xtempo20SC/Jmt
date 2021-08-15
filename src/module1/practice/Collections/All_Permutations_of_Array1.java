package module1.practice.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



class SolutionP {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
         boolean[] visited = new boolean[nums.length];
         backtrack(res ,nums,new ArrayList<>(),visited);
         return res;
    }
    
     void backtrack(List<List<Integer>> res,int[] nums,List<Integer> curr, boolean[] visited){
                if(curr.size()==nums.length){
                 res.add(new ArrayList<>(curr));
                    return;
                }

                for(int i=0;i<nums.length;i++){
                    if(visited[i]==true)continue;
                    curr.add(nums[i]);
                    visited[i] = true;
                    backtrack(res,nums, curr,visited);
                    curr.remove(curr.size()-1);
                    visited[i] = false;
                } 
    }
}
public class All_Permutations_of_Array1 {

 //for exam
	
//	List<String> forcall(String input)
//	{
	//   * write your code*
//		SolutionP s = new SolutionP();
//	    int [] arr = new int[] {1,2,3};
//	    System.out.println(s.permute(arr));
//	}
	
	public static void main(String[] args) {
		
		SolutionP s = new SolutionP();
		int [] arr = new int[] {1,2,3};
		System.out.println(s.permute(arr));
		// [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
	}
	
}
