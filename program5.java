
class check
{
	
	 boolean prime(int n)
	{
		boolean flag=true;
		
		for(int i=2;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
			System.out.println(n+" is prime");
		else 
			System.out.println(n+" is not prime");
		return flag;
	}
	 
	 
	 boolean cprime(int num)
		{
			int count=0,temp=num;
			while(temp>0)
			{
				count++;
				temp=temp/10;
			}
			
			
			int N=num;
			while(prime(N)==true)
			{
				int remainder=N%10;
				int quotient=N/10;
				N = (int)((Math.pow(10, count - 1)) * remainder)+quotient;
				System.out.println("the number is rotated to "+N);
				if(N==num)
					return true;
			}
			return false;
		}
}


public class program5 {
	static int number_check;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		check ob=new check();
		
		if(args.length==1)
		{
			try{
                number_check= Integer.parseInt(args[0]);
         } 
         catch(NumberFormatException nfe) {
        	 	System.out.println("--------------------------------------------------------------------------------");
                System.out.println("--------------Argument must be an integer and within integer range--------------");
                System.out.println("--------------------------------------------------------------------------------");
                System.exit(1);
         }
			if(number_check>1)
			{
			
			boolean check=ob.cprime(number_check);
			if(check==true)
			{	
				System.out.println("----------------------------------------------------------");
				System.out.println("\n--------------the number is circular prime--------------");
				System.out.println("----------------------------------------------------------");
			}//end of if
			else
			{
				System.out.println("--------------------------------------------------------------");
				System.out.println("\n--------------the number is not circular prime--------------");
				System.out.println("--------------------------------------------------------------");
				
			} //end of else
			
			
			}//end of if statement
			else
			{
				System.out.println("---------------------------------------------------------");
				System.out.println("--------------enter argument greater than 1--------------");
				System.out.println("---------------------------------------------------------");
			}
		}
		
		else
		{
			System.out.println("------------------------------------------------------");
			System.out.println("--------------enter only single argument--------------");
			System.out.println("------------------------------------------------------");
		}
	}

}
