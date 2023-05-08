

public class App {
    

	public static void main(String[] args) {
    	
		Boracay boracay  = new Boracay();
        Me kaide = new Me();
        
        
        boracay.accept(kaide);
        System.out.println("");
        kaide.visit();
        System.out.println("");
        kaide.checkBudget();
		
        
 
        

    }
}