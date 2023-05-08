public class Me implements Tourist {
	
	
   public static int budget = 1000;
    
    public void visit() {
        System.out.println("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
    	
    	System.out.println("Sunsets here in Boracay are marvelous");
    	
    }
    public void visit(Palawan palawan) {

    	System.out.println("Super refreshing");
    }
    
    public void visit(Coron coron) {

    	System.out.println("Where am I?");
    }
    
    public void visit(Cebu cebu) {

    	System.out.println("It's just like manila");
    }
    
    public void visit(Bohol bohol) {

    	System.out.println("Where is the chocolates?");
    }
    
    public void visit(Baguio baguio) {

    	System.out.println("Very cold");
    }
    public void checkBudget() {
    	
    	if(budget<=99) {
    		System.out.println("Your budget is insuffecient");
    	}
    	else {
    		
    		 try {
				System.out.println("my current budget is " + (budget-Boracay.airFare));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	}

}