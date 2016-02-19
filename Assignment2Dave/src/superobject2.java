import java.util.InputMismatchException;

import javax.swing.JOptionPane;


	public class superobject2 extends superobject {
		
		private static String name;
		
		
		
		public static String nameMethod(){
			
			
			name=JOptionPane.showInputDialog("Enter the initials of the person");
			try{
			    if (name.length() <= 2) {
			        return name;
			    } else {
			    	
			        throw new Exception("'" + name + "' is longer than 20");
			        
			    }
			} catch(Exception e){
				superobject2.nameMethod();
			    
			}
			return name;
			}

	
	

			
		
		
			
		
			
					
							
			
			
				
				
			 
			
			
				
			
	
		@Override
		public String getFullName() {
				
				return(name);
				
			}
		
		
		

	}


