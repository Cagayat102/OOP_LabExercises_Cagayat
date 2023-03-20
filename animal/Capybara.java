
package animal;

public class Capybara extends Animal {
    
    public Capybara(int EnergyLvl) {
        super(EnergyLvl);
    }
    public void ride(){
        System.out.println("The Capybara ride in a crocodile's back");
        EnergyLvl -=14;
    }
    public void eatSomething(){
        System.out.println("The Capybara just ate something");
        EnergyLvl +=7;
    }
        public void Sleep(){
        System.out.println("The Capybara slept");
        EnergyLvl +=5;
    }

}
