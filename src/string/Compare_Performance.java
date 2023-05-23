package string;

public class Compare_Performance {
	

  		    public static void main(String[] args){  
		    	
		    	// Example of substring() Method...
		    	String s="Vishal Gohil";
		    	System.out.println(s.substring(1,5));
		    	System.out.println(s.substring(7));
		    	
		        long startTime = System.currentTimeMillis(); 
		        concatWithString();  
		        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
		        
		        startTime = System.currentTimeMillis();  
		        concatWithStringBuffer();  
		        System.out.println("Time taken by Concating with StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");
		        
		        startTime = System.currentTimeMillis();  
		        concatWithStringBuilder();  
		        System.out.println("Time taken by Concating with StringBuilder: "+(System.currentTimeMillis()-startTime)+"ms");
		        
		    }  
  		    
  			
  			// -------------------------------------- Comparison of Performance between String and StringBuffer and StringBuilder -----------------------------------
  				 public static String concatWithString()    {  
  				        String st="Vishal";  
  				        for (int i=0; i<1000; i++){  
  				            st=st+"Gohil";  
  				        }  
  				        return st;  
  				    }  
  				 
  				    public static StringBuffer concatWithStringBuffer(){  
  				        StringBuffer sb = new StringBuffer("Vishal");  
  				        for (int i=0; i<1000; i++){  
  				            sb.append("Gohil");  
  				        }  
  				        return sb;  
  				    }  
  				    
  				    public static StringBuilder concatWithStringBuilder() {
  				    	StringBuilder sb1=new StringBuilder("Vishal");
  				    	for(int i=0;i<1000;i++) {
  				    		sb1.append("Gohil");
  				    	}
  				    	return sb1;
  				    }
	}