package one.strategy;

public class DefensiveBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Se defendendo...");        
    }
    
}