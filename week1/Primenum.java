package pavi.week1;

public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=13; boolean prime=true;
for(int i=2;i<input;i++)
{
	if(input%i==0)
	{
		System.out.println(" not prime numbers");
		prime=false;
	    break;
	    
	}
	//else {
	//	System.out.println("prime numbers");}
	
}
if(prime==true)
{
	System.out.println("prime nos");
}
	}

}
