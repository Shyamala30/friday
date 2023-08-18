//Check the given no is prime number or not by using method with parameter and with return type
class Demo10
{
   public String prime(int no)
   {
       boolean flag=true;
	   for(int i=2;i<no;i++)
	   {
	        if(no%i==0)
			{
			    flag=false;
				break;
			}
	   }
	   if(flag==true)
	   {
	        return "It  is a prime number";
		}
		else
		{
		   return "It is not a prime number";
	    }
	}
}
class SampleDemo
{
   public static void main(String[] args)
   {
        Demo10 d1=new Demo10();
		String x=d1.prime(7);
		System.out.println(x);
	}
}