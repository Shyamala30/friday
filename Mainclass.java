

class Derived
    {
		public void getDetails()
		{
			
            System.out.println("Derived class");
		}
	}
	public class Test extends Derived
	{
		protected void getdetails()
		{
			System.out.println("Test class");
		}
		
    public static void main(String[] args) {
      Derived obj=new Test();
	  obj.getDetails();
        
    }
}