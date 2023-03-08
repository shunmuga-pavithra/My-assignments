package pavi.week1;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 ={1,2,3,4,5};
		int[] num2 ={7,8,3,9,0};
	int total1=num1.length;
int total2=num2.length;
for(int i=0;i<total1;i++)
{
	for(int j=0;j<total2;j++)
	{
		if (num1[i]==num2[j])
			System.out.println(num2[j]);
	}
}



}
}
