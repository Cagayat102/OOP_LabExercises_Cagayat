/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Arvina
 */
public class Main {
    public static void main(String[] args) {
        Capybara capybara = new Capybara(100);
        Turtle turtle = new Turtle(100);
        Tiger tiger = new Tiger(100);
        
        capybara.ride();
        capybara.displayEnergy();    
        capybara.ride();
        capybara.eatSomething();
        capybara.Sleep();         
        capybara.displayEnergy();
    System.out.println();
        turtle.swim(); 
        turtle.displayEnergy(); 
        turtle.swim();
        turtle.sleep();
        turtle.crawl();  
        turtle.swim(); 
        turtle.sleep();        
        turtle.displayEnergy();
        turtle.sleep();        
        turtle.displayEnergy();       
    System.out.println();
        tiger.attack(); 
        tiger.displayEnergy(); 
        tiger.drink();
        tiger.attack();
        tiger.hunt();  
        tiger.drink();        
        tiger.displayEnergy();

    }
}
