
package animal;

public class Tiger extends Animal {
    
    public Tiger(int EnergyLvl) {
        super(EnergyLvl);
    }
    public void hunt(){
        System.out.println("The Tiger hunt his food");
        EnergyLvl -=14;
    }
    public void drink(){
        System.out.println("The Tiger drink water");
        EnergyLvl +=7;
    }
        public void attack(){
        System.out.println("The Tiger attack the kangaroo");
        EnergyLvl -=8;
    }

}