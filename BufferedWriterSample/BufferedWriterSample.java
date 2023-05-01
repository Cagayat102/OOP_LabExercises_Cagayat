import java.nio.file.*; 
import java.io.*;
import static java.nio.file.StandardOpenOption.*; 
import java.util.*;
import java.text.*;

public class BufferedWriterSample { 
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        Path file =
            Paths.get("C:\\Users\\Arvina\\OneDrive\\Documents\\NetBeansProjects\\BufferedWriterSample\\src\\grades.txt");
        String s= "";
        String delimiter = ",";
        long id; 
        String name; 
        double grade; 
        final long 
        QUIT = 0; 
    try{
        OutputStream output = new
        BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new
        BufferedWriter (new OutputStreamWriter(output)); 
            System.out.print("Enter student ID number: "); 
            id = input.nextLong () ;

    while (id != QUIT) {
        System.out.print("Enter name for student no. "
                + id + ": "); 
        input.nextLine(); 
        name = input.nextLine () ;
        System.out.print("Enter the subject grade: "); 
        grade = input.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00"); 
        s = id + delimiter + name + delimiter + df.format(grade);
        writer.write(s, 0, s.length ()) ; 
        writer.newLine();
        System.out.print("Enter next ID number or " + 
                QUIT + " to quit: ") ;
        id = input.nextLong();
    }
    writer.close();
    }    
    catch (Exception e)
        {
        System.out.println("Message: " + e);
        }
    }
    
}
