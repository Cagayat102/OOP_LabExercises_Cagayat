import java.util.Scanner;
public class FoodMenu {
    private String a = "";
    private int b;
    public FoodMenu (String a, int b){
        this.a = a;
        this.b = b;
    }
    private static int c = 0;
    public static Scanner scan = new Scanner(System.in);
    public static FoodMenu[] proc = new FoodMenu[10];
    public static void main(String args[]){
        while (true){
            System.out.println("MENU");
            System.out.println("1. Insert");
            System.out.println("2. Edit");
            System.out.println("3. View");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scan.nextInt();
            if(choice == 1){
                if (c >= 10){
                    System.out.println("Max Menu Size");
                    break;
                } else {
                    System.out.print("Enter Food Name: ");
                    String name = scan.next();
                    int aq = 0;
                    for(int x = 0; x < c; x++){
                        if(proc[x].a.equalsIgnoreCase(name)){
                        System.out.println("Food Already Available");
                        aq++;
                        break;
                        }
                    }
                    if(aq != 1){
                        System.out.print("Enter Price: ");
                        int aa = scan.nextInt();
                        System.out.println("Successfully Added!");
                        proc[c] = new FoodMenu(name, aa);
                        c++;
                    }
                }
            }
            else if(choice == 2){
                    System.out.print("Enter Food Name to be Edited. (Enter n to stop): ");
                    String ad = scan.next();
                    if (ad.equalsIgnoreCase("n")){
                        System.out.println("You have stop editing!");
                    } else {
                        int cx = 0;
                        for(int b = 0; b < c; b++){
                            if(proc[b].a.equalsIgnoreCase(ad)){
                                System.out.print("Enter New Price For " + proc[b].a + " : ");
                                int qw = scan.nextInt();
                                proc[b].b = qw;
                                cx++;
                                System.out.println("Success Edit!");
                                break;
                            }
                        }
                        if (cx == 0){
                            System.out.println("FOOD NOT FOUND!");
                        }
                    }            
            }
            else if(choice == 3){
                if (proc[0].a == null) {
                    System.out.println("No Food Entered");
                } else {
                    System.out.println("----MENU----");
                    for(int l = 0; l < c; l++){
                        System.out.println(proc[l].a + "  " + proc[l].b);
                    }
                }   
            }
            else if(choice == 4){
                System.out.print("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid Number Entered!");
            }

        }
    }
}
