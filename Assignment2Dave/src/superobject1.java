import javax.swing.JOptionPane;

public class superobject1 extends superobject {
	
	private int IdNumber;
	
	
	public int IDNumbermethod(){
		
		
		return IdNumber=Integer.parseInt(JOptionPane.showInputDialog("Enter an Id number"));
		
		
		
	}
	@Override
	public int getID() {
			
			return(IdNumber);
			
		}
	
	
	

}
