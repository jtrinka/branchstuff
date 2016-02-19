import javax.swing.JOptionPane;

public class superobject3 extends superobject{
	
	
	
	private static String mothersmaidenname;
	
	
	public static String MaidennameMethod(){
		
		
		return mothersmaidenname=JOptionPane.showInputDialog("Enter the maiden name of the person");
		
		
		
		
		
		
	}
	@Override
	public String getMaiden() {
			
			return(mothersmaidenname);
			
		}
	
	
	
	
	
	

}
