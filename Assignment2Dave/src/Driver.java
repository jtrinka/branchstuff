
public class Driver {

	public static void main(String[] args) {
		superobject mytestid = new superobject();
		superobject1 mytestidnumber= new superobject1();
		superobject2 mytestfullname= new superobject2();
		superobject3 mytestmaidname= new superobject3();
		String Maid = mytestmaidname.MaidennameMethod();
		int Idnumber = mytestidnumber.IDNumbermethod();
		String nameofperson = superobject2.nameMethod();
		String presetMaid = mytestid.getMaiden();
		int presetID = mytestid.getID();
		String presetfull = mytestid.getFullName();
		
		
		
		
	String[] maidennameandfullname = new String[2];
	
	
	maidennameandfullname[0] = Maid;
	maidennameandfullname[1] = nameofperson;
	
	int[] idnumberarray = new int[1];
			
			idnumberarray[0] = Idnumber;
			
			
			
			
			String[] presetmaidandfull = new String[2];
			
			
			presetmaidandfull[0] = presetMaid;
			presetmaidandfull[1] = presetfull;
			
			int[] presetid = new int[1];
					
					presetid[0] = presetID;
			
			
			
			
			
			
			System.out.println("The initials of the person are " + maidennameandfullname[1] + " the maiden name of the person is " + maidennameandfullname[0] + " the id number of the person is "+ idnumberarray[0]);
			
		
			System.out.println("The preset name is " + presetmaidandfull[1] + " the preset maiden name is " + presetmaidandfull[0] + " the preset id number is "+ presetid[0]);
			

	//I like cats cool

			int num1, num2;
		     try { 
		        // Try block to handle code that may cause exception
		        num1 = 0;
		        num2 = 62 / num1;
		        System.out.println("Try block message");
		     } catch (ArithmeticException e) { 
		            // This block is to catch divide-by-zero error
		            System.out.println("Error: Don't divide a number by zero");
		       }
			
			
			
	}

}
