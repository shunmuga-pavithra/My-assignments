package pavi.week1;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {2,5,7,7,5,9,2,3};
		int A=nums.length;
		for(int i=0;i<A;i++)
		
		{
			for(int j=i+1;j<A;j++)
			{
				if(nums[i]==nums[j])
					System.out.println(nums[i]);
			}
		}
	}

}
