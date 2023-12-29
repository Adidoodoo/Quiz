package com.mycompany.quiz;
import java.util.*;

public class Quiz {
    static Scanner sc = new Scanner(System.in);
    static String question1 = "1. What is 1+1?";
    static String question2 = "2. Who is John Lennon?";
    static String question3 = "3. Who killed Lennon?";
    static String question4 = "4. What is Java?";
    static String question5 = "5. What is Uno?";
    static int score = 0;
    static int outof = 5;
    static String[][] choices1 = {
        {"A. 2"},
        {"B. 3"},
        {"C. Lemons"}
    };
    static String[][] choices2 = {
        {"A. A member of Black Sabbath"},
        {"B. A member of Queen"},
        {"C. A man who got shot on the evening of December 8, 1980 by a man using a .38 revolver"}
    };
    static String[][] choices3 = {
        {"A. John Wilkes Booth"},
        {"B. David Bowie"},
        {"C. Not me"}
    };
    static String[][] choices4 = {
        {"A. A programming language"},
        {"B. An Indonesian island"},
        {"C. Rice"}
    };
    static String[][] choices5 = {
        {"A. A card game"},
        {"B. A Spanish word for one"},
        {"C. A dialect of C#"}
    };
    static String answer(){
        String x = "";
        boolean x2 = true;
        while(x2){
            x = sc.nextLine().toLowerCase();
            switch (x) {
                case "a":
                    x2 = false;
                    break;
                case "b":
                    x2 = false;
                    break;
                case "c":
                    x2 = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        return x;
    }
    static String yesno(){
        String y = "";
        boolean y2 = true;
        while(y2){
            y = sc.nextLine();
            if(y.equalsIgnoreCase("yes")){
                y2 = false;
                question1();
            }else if(y.equalsIgnoreCase("no")){
                System.out.println("Very well, shutting down");
                y2 = false;
                shutdown();
            }else{
                System.out.println("Invalid choice");
            }
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the bullshit quiz!");
        question1();
    }
    
public static void question1() {
    score = 0;
    System.out.println(question1);
    for (int row = 0; row < choices1.length; row++) {
        for (int col = 0; col < choices1[row].length; col++) {
            System.out.print(choices1[row][col]);
        }
        System.out.println();
    }
    String select = answer();
    if (select.equalsIgnoreCase("c")) {
        score++;
        question2();
    } else if (select.equalsIgnoreCase("a") || select.equalsIgnoreCase("b")) {
        question2();
    }
}

public static void question2() {
    System.out.println(question2);
    for (int row = 0; row < choices2.length; row++) {
        for (int col = 0; col < choices2[row].length; col++) {
            System.out.print(choices2[row][col]);
        }
        System.out.println();
    }
    String select = answer();
    if (select.equalsIgnoreCase("c")) {
        score++;
        question3();
    } else if (select.equalsIgnoreCase("a") || select.equalsIgnoreCase("b")) {
        question3();
    }
}

public static void question3() {
    System.out.println(question3);
    for (int row = 0; row < choices3.length; row++) {
        for (int col = 0; col < choices3[row].length; col++) {
            System.out.print(choices3[row][col]);
        }
        System.out.println();
    }
    String select = answer();
    if (select.equalsIgnoreCase("c")) {
        score++;
        question4();
    } else if (select.equalsIgnoreCase("a") || select.equalsIgnoreCase("b")) {
        question4();
    }
}

public static void question4() {
    System.out.println(question4);
    for (int row = 0; row < choices4.length; row++) {
        for (int col = 0; col < choices4[row].length; col++) {
            System.out.print(choices4[row][col]);
        }
        System.out.println();
    }
    String select = answer();
    if (select.equalsIgnoreCase("b")) {
        score++;
        question5();
    } else if (select.equalsIgnoreCase("a") || select.equalsIgnoreCase("c")) {
        question5();
    }
}

public static void question5() {
    System.out.println(question5);
    for (int row = 0; row < choices5.length; row++) {
        for (int col = 0; col < choices5[row].length; col++) {
            System.out.print(choices5[row][col]);
        }
        System.out.println();
    }
    String select = answer();
    if (select.equalsIgnoreCase("a")) {
        score++;
        scoreboard();
    } else if (select.equalsIgnoreCase("b") || select.equalsIgnoreCase("c")) {
        scoreboard();
    }
}
    public static void scoreboard(){
        boolean y = true;
        while(y){
        System.out.println("Your score is "+ score + "/" + outof);
        if(score == 0 || score == 1 || score == 2){
            System.out.println("You fucking suck dude, try again!");
            question1();
            break;
        }else if(score == 3){
            System.out.println("Nice try, but you could do better. Try again?");
            String yesno = yesno();
            if(yesno.equalsIgnoreCase("yes")){
                question1();
                break;
            }else if(yesno.equalsIgnoreCase("no")){
                shutdown();
                break;
            }
        }else if(score == 4){
            System.out.println("You almost got all of it right! Try again to perfect the quiz?");
            String yesno = yesno();
            if(yesno.equalsIgnoreCase("yes")){
                question1();
                break;
            }else if(yesno.equalsIgnoreCase("no")){
                break;               
            }
        }else if(score == 5){
            System.out.println("Congratulations! You perfected the quiz! As a reward, you can go fuck yourself. Goodbye.");
            shutdown();
            break;
        }
    }
    }
    
        public static void shutdown() {
        boolean shit = true;
        while(shit){
            break;
        }
    }
}
