import java.util.*;
public class LabExer5B {
    
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int score = 0;
    boolean prompt = true;
    String [][] Questions = {
        {"Which of the following is NOT a logical operator?","A.&&","B.!=","C.||","B"},
        {"What material whose size range in nanoscale?","A.materials","B.engineered nanomaterials","C.polymers","B"},
        {"Which one is not a polymer?","A.proteins","B.nucleic acids","C.carboxyxlic acids", "C"},
        {"It is a memory location whose values can be changed during program execution.","A.variable","B.constant","C.data Type","A"},
        {"What is the capital of hungary","A.Budapest","B.Bucharest","C.Bratislava","A"},
        {"She was the first woman member of the Katipunan.","A.Gabriela Silang","B.Gregoria de Jesus","C.Marina Dizon","B"},
        {"He led the invention of the first high-level programming language.","A.Douglas Carl Engelbart","B.Stephen Gary Wozniak","C.John Warner Backus","C"},
        {"What is the oldest city in the Philippines founded in 1565?","A.Cavite","B.Cebu","C.Intramuros","B"},
        {"Which statement evaluates to true?","A.boolean b = 23 < 3 ^ 4 != 2;","B.boolean b = !(23 < 3) & & 4 == 2;","C.boolean b = 23 < 3 ^ 4 != 2;","A"},
        {"Who invented the machine that broke the German ciphers in WWII?","A.George Boole","B.Alan Mathison Turing","C.Gary Arlen Kildal","B"}
    };

        for (int i = 0; i < Questions.length && prompt; i++) {
                    System.out.println((i + 1) + ". " + Questions[i][0]);
                    System.out.println(Questions[i][1]);
                    System.out.println(Questions[i][2]);
                    System.out.println(Questions[i][3]);

                    String ans = "";
                    boolean a = true;
                    String YesOrNo = "";

            do {   
                try {
                    System.out.print("ENTER YOUR ANSWER(Please enter only the letters indicated above): ");
                    ans = s.nextLine().toUpperCase();
                    char c = ans.charAt(0);
                    if ((c >= 32 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 && c <= 127)) {
                        throw new IllegalArgumentException("Your answer is not acceptable, please don't enter numbers or symbols. Enter the A,B and C letters only. Thankyou!");
                    }
                    if (!ans.equals("A") && !ans.equals("B") && !ans.equals("C")) {
                        throw new IllegalArgumentException("Invalid letters, please enter the A,B and C letters only. Thankyou!");
                    }
                    a = false;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.print("Still want to continue the quiz? Please type 'Y' if yes and 'N' if no.: ");
                    YesOrNo = s.nextLine().toUpperCase();
                    if (YesOrNo.equals("Y")){}
                    else if (YesOrNo.equals("N")){
                        prompt = false; 
                    }
                          
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("Please provide an answer.");
                    System.out.print("Still want to continue the quiz? Please type 'Y' if yes and 'N' if no.: ");
                    YesOrNo = s.nextLine().toUpperCase();
                    if (YesOrNo.equals("Y")){}
                    else if (YesOrNo.equals("N")){
                        prompt = false;
                    }
                
                }
            }while (a && prompt);
            
            if (YesOrNo.equals("N")) {
                prompt = false;
            } else if (ans.equals(Questions[i][4])) {
                System.out.println("YOUR ANSWER IS CORRECT!");
                score++;
            } else {
                System.out.println("YOUR ANSWER IS WRONG!");
            }

        }
        System.out.println("CONGRATULATIONS! You got " + score + " out of 10. Thank you for participating in Quiz Bee!");
    }
            }

