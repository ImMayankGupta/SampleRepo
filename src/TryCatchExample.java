
public class TryCatchExample {

	public static void main(String[] args) {
		try {
			int data = 50/5;
		}
		catch(ArithmeticException e)  
		{  
          System.out.println(e);  
		}  
		catch(Exception e)  
		{  
          System.out.println(e);  
		}  
		finally {
			System.out.println("In finally block");  
		}
		
		
		
		
		// TODO Auto-generated method stub
//		try  
//        {  
//        int data=50/0; //may throw exception   
//        }  
//            //handling the exception  
//        catch(ArithmeticException e)  
//        {  
//            System.out.println(e);  
//        }  
//		finally
//		{
//			System.out.println("In finally block");  
//		}
       System.out.println("rest of the code");  
    }  
	}


