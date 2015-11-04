package a1hello.hello;

public class primeNumber {
	public boolean calprime(int num)
	{
	  int calprim = num;
		for(int i=2; i<num+1;)
				{
			if (num % i == 0) {
				return  false;
			} else 
				return  true;
			
			}
		return false;
		}


	public static void main(String[] args) {
         primeNumber e1 = new primeNumber();
		primeNumber e2 = new primeNumber();
		e2.calprime(6);
			//int val = num.calprime(6);
		//primeNumber obj;
		//obj.calprime(6);
		
		
		if (calprime(num)) 
		
		{
					System.out.println(calprime + " is a prime number");
			       } 
		else 
	       {
	           System.out.println(calprime + " is not a prime number");
	       }
		

	}


	
	
	

}
