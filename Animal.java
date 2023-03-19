
package animal;

public class Animal {
        protected int EnergyLvl = 100;
        
    public int displayEnergy() {
        System.out.println("Energy Level: " + EnergyLvl);
        return EnergyLvl;
    }
    public Animal (int EnergyLvl){
        this.EnergyLvl = EnergyLvl;
    
    }
    
}
