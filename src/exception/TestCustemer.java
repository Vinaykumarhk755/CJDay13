package exception;



	       
class TestCustomer{  
	  
	 public static void main(String args[])  throws InvalidInputException{  
		 Custemer str=new  Custemer("custemer","custemer","Gold");
		 
		 
		   if ((str.CharAt()!= 'C'||str.CharAt()!= 'c') && str.<4 && (str.category=="Platinum"||str.category=="Gold"||str.category=="Silver")) 
		 
		 throw new InvalidInputException("not valid");  
	     else  
	      System.out.println("valid");  
	   }  
}