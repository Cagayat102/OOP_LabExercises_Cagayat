import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LabExer6A {
    public static void main(String[] args) {
        try {
            ArrayList<String> words = new ArrayList<String>();
            try {
                BufferedReader wordfile = new BufferedReader(new FileReader("C:\\Users\\Arvina\\OneDrive\\Documents\\NetBeansProjects\\LabExer6A\\src\\wordstoguess.txt"));
                Scanner scan = new Scanner(wordfile);
                while (scan.hasNextLine()) {
                    String parts = scan.nextLine();
                    String word = parts;
                    words.add(word);
                }
                scan.close();
            } catch (Exception e) {
                System.out.println("Message: " + e);
            }

            Random r = new Random();
            int i = r.nextInt(words.size());
            String guess = words.get(i);

            char[] letters = new char[guess.length()];
            for (int g = 0; g < letters.length; g++) {
                letters[g] = '*';
            }

            boolean correct = false;
            int tryguess = 10;
            int score = 10;
            Scanner scan = new Scanner(System.in);
            while (!correct && tryguess > 0) {
                try {
                System.out.println(letters);
                System.out.print("GUESS A LETTER:");
                char hula = scan.nextLine().charAt(0);
                String hulaa = hula + "";
                if(!hulaa.matches("[a-zA-Z]")){
                    throw new LetterOnlyException();
                }
                boolean right = false;
                for (int k = 0; k < guess.length(); k++) {
                    if (guess.charAt(k) == hula) {
                        letters[k] = hula;
                        right = true;
                    }
                }
                if (right) {
                    System.out.println("GOOD JOB! YOU GUESSED THE RIGHT LETTER!!");
                } else {
                    System.out.println("YOU GUESSED THE WRONG LETTER!!");
                    tryguess--;
                    score--;
                }

                if (String.valueOf(letters).equals(guess)) {
                    correct = true;
                }
            } catch (LetterOnlyException e){
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            }

            if (correct) {
                System.out.println("CONGRATULATIONS! YOU GUESSED THE RIGHT WORD WHICH IS: " + guess);
                System.out.println("YOUR TOTAL SCORE IS: " + score);
            } else {
                System.out.println("GAME OVER!! THE WORD WAS: " + guess);
                System.out.println("YOU GOT A TOTAL SCORE OF: " + score);
            }
            scan.close();
        } catch (Exception e) {
            System.out.println("ERROR!");
            System.out.print(e.getMessage());
        }
    }
}

class LetterOnlyException extends Exception{
    LetterOnlyException(){
        super("YOU CAN ONLY ENTER LETTER!!");
    }
}