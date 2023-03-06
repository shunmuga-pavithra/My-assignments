package pavi.week1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first=0;
		int second=1;
		int sum=0;
		System.out.println(first);
		System.out.println(second);
		for(int i=1;i<10;i++)
			{
			sum=first+second;
			
		System.out.println(sum);
		first=second;
		second=sum;}		
	
	}

}
