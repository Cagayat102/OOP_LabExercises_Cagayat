
package animal;

public class Turtle extends Animal {
    
    public Turtle(int EnergyLvl) {
        super(EnergyLvl);
    }
    public void swim(){
        System.out.println("The Turtle swam across the lake");
        EnergyLvl -=14;
    }
    public void sleep(){
        System.out.println("The Turtle slept");
        EnergyLvl +=7;
    }
        public void crawl(){
        System.out.println("The Turtle crawl");
        EnergyLvl -=5;
    }

}