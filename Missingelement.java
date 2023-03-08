package pavi.week1;

import java.util.Arrays;

public class Missingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] n= {1,2,7,3,9,5,6,8};
Arrays.sort(n);
for(int i=0;i<n.length;i++)
{
	if(n[i]!=i+1)
	{
System.out.println(i+1);
	break;
	}

}
	}}
