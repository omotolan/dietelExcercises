package Assignment;

import java.util.Scanner;

public class Myers_Briggs_Questionnaire {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       int extrovertCounter = 0;
       int introvertCounter = 0;
       int sensitiveCounter = 0;
       int intuitiveCounter = 0;
       int thinkerCounter = 0;
       int feelerCounter = 0;
       int judgingCounter = 0;
       int perceivingCounter = 0;

        String answer;
        System.out.println("Enter A or B: ");
        for (int i =1; i<=20; i++)
            switch (i) {
                case 1 -> {
                    System.out.println("""
                            1.
                            A. Expend energy, enjoy groups
                            B. Conserve, enjoy one-on-one
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) extrovertCounter++;
                    else introvertCounter++;
                }
                case 2 -> {
                    System.out.println("""
                            2.
                            A. interpret literally
                            B. look for meaning and possibilities
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) sensitiveCounter++;
                    else intuitiveCounter++;
                }
                case 3 -> {
                    System.out.println("""
                            3.
                            A. logical, thinking, questioning
                            B. empathetic, feeling, accommodating
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) thinkerCounter++;
                    else feelerCounter++;
                }
                case 4 -> {
                    System.out.println("""
                            4.
                            A. organised, orderly
                            B. flexible, adaptable
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) judgingCounter++;
                    else perceivingCounter++;
                }
                case 5 -> {
                    System.out.println("""
                            5.
                            A. more outgoing, think out loud
                            B. more reserved, think to yourself
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) extrovertCounter++;
                    else introvertCounter++;
                }
                case 6 -> {
                    System.out.println("""
                            6.
                            A. practical, realistic, experimental
                            B. imaginative, innovative, theoretical
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) sensitiveCounter++;
                    else intuitiveCounter++;
                }
                case 7 -> {
                    System.out.println("""
                            7.
                            A. candid, straight forward, frank
                            B. tactful, kind, encouraging
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) thinkerCounter++;
                    else feelerCounter++;
                }
                case 8 -> {
                    System.out.println("""
                            8.
                            A. plan, schedule
                            B. unplanned, spontaneous
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) judgingCounter++;
                    else perceivingCounter++;
                }
                case 9 -> {
                    System.out.println("""
                            9
                            A. seek many tasks, public activities, interaction with others
                            B. seek private, solitary activities with quiet to concentrate
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) extrovertCounter++;
                    else introvertCounter++;
                }
                case 10 -> {
                    System.out.println("""
                            10.
                            A. standard, usual, conventional
                            B. different, novel, unique
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) sensitiveCounter++;
                    else intuitiveCounter++;
                }
                case 11 -> {
                    System.out.println("""
                            11.
                            A. firm, tend to criticize, hold the line
                            B. gentle, tend to appreciate, conciliate
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) thinkerCounter++;
                    else feelerCounter++;
                }
                case 12 -> {
                    System.out.println("""
                            12.
                            A. regulated, structured
                            B. easygoing, "live" and "let live"
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) judgingCounter++;
                    else perceivingCounter++;
                }
                case 13 -> {
                    System.out.println("""
                            13.
                            A. external, communicative, express yourself
                            B. internal, reticent, keep to yourself
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) extrovertCounter++;
                    else introvertCounter++;
                }
                case 14 -> {
                    System.out.println("""
                            14.
                            A. focus on here-and-now
                            B. look to the future, global perspective, "big picture"
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) sensitiveCounter++;
                    else intuitiveCounter++;
                }
                case 15 -> {
                    System.out.println("""
                            15.
                            A. tough-minded, just
                            B. tender-hearted, merciful
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) thinkerCounter++;
                    else feelerCounter++;
                }
                case 16 -> {
                    System.out.println("""
                            16.
                            A. preparation, plan ahead
                            B. go with the flow, adapt as you go
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) judgingCounter++;
                    else perceivingCounter++;
                }
                case 17 -> {
                    System.out.println("""
                            17.
                            A. active, initiate
                            B. reflective, deliberate
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) extrovertCounter++;
                    else introvertCounter++;
                }
                case 18 -> {
                    System.out.println("""
                            18.
                            A. facts, things, "what is"
                            B. ideas, dreams, "what could be," philosophical
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) sensitiveCounter++;
                    else intuitiveCounter++;
                }
                case 19 -> {
                    System.out.println("""
                            19.
                            A. matter of fact, issue-oriented
                            B. sensitive, people-oriented, compassionate
                            """);
                    System.out.println(" ");
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) thinkerCounter++;
                    else feelerCounter++;
                }
                case 20 -> {
                    System.out.println("""
                            20.
                            A. control, govern
                            B. latitude, freedom
                            """);
                    answer = keyboard.next();
                    if (answer.equalsIgnoreCase("A")) judgingCounter++;
                    else perceivingCounter++;
                }
            }
        System.out.println("Extrovert count is" +extrovertCounter);
        System.out.println("Introvert count is" + introvertCounter);
        System.out.println("Sensitive count is" + sensitiveCounter);
        System.out.println("Intuitive count is" + intuitiveCounter);
        System.out.println("Thinker count is" +thinkerCounter);
        System.out.println("Feeler count is" + feelerCounter);
        System.out.println("Judging count is" +judgingCounter);
        System.out.println("Perceptive count is" +perceivingCounter);
        System.out.println();

        if(extrovertCounter>introvertCounter){
            System.out.println("Extrovert");}
            else{
                System.out.println("Introvert");}
            if(sensitiveCounter>intuitiveCounter){
                System.out.println("Sensitive");
            }
            else {
                System.out.println("Intuitive");
            }
            if(thinkerCounter>feelerCounter){
                System.out.println("Thinker");
            }
            else {
                System.out.println("Feeler");
            }
            if(judgingCounter>perceivingCounter){
                System.out.println("Judging");
            }
            else {
                System.out.println("Perceiving");
            }





        }
    }

