package exo2;

public class factory {

	
	public static Object create(int n) {
		if(n==1)
		{
			radio r=new radio();
			return r;
			
		}
		else if(n==2){
			
		
			cafetiere c = new cafetiere();
			return c;
			}
		return null;  
		
	} 
}
