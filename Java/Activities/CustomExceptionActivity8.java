package hello;
public class CustomExceptionActivity8  extends Exception
{
	
	private String message;

	CustomExceptionActivity8(String msg)
	{
		this.message=msg;
	}
	public String getMessage() {
	    return message;
	}
	
	public static void exceptionTest(String message) throws Exception
	{
		if(message==null)
		{
			System.out.println("Access Denied Got Null");
		
		throw new CustomException("Access denied for null pointer");
		}
		else
		{
			System.out.println(message);
		}
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CustomException o1=new CustomException("Will print to console");
		//CustomException o2=new CustomException(null);
		try {
			CustomExceptionActivity8.exceptionTest("Will print to console");
			CustomExceptionActivity8.exceptionTest(null);
			//CustomException.exceptionTest("\"Won't execute\")");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	
			//System.out.println(e.getMessage());
		}
	}

