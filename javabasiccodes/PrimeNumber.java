package javabasiccodes;


public class PrimeNumber{
	
	public static void main(String[] args) {
		
		/*
		 * Prime number--> divisible by the number itself and by 1 the number has only 2
		 * factors
		 * 
		 * 5---1 and 5-->2 factors-->prime number 6 --2 3 6--> 3 factors-->not a prime
		 * number5--->1,5
		 */
		
		  int input = 100; 
		  int count=0;
		  1,2,3,4,5,6,....50		  
		  for (int i=1;i<=input/2;i++)
		  { if (input % i==0)
			  count= count+1;
		  }
		  
		  if(count==2) {
			  System.out.println(input+ "is a prime number"); 
			  }else
		  System.out.println(input+ "is not a prime number");
		  
		 100%1 == 0  count = 1
                 100%2 == 0  count = 2
                 100%3 != 0  count = 2
 		 100%4 = 0    count = 3
 		100%5 = 0   count = 4
 		100%6 != 0  count = 4

but, for prime number : number %1 = 0, number%number =0 , --> count 2

count = 


		  
		 	
		
		
		
	           
	          
		
		
		}

}
  