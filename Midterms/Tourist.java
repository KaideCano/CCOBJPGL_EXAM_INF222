interface Tourist {

    int budget = 0;

    void visit();
    
    void visit(Palawan palawan);
    
    void visit(Baguio baguio);
    
    void visit(Coron coron);
    
    void visit(Bohol bohol);
    
    void visit(Cebu cebu);

    void visit(Boracay boracay);

    default void visit(Location locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
    
}