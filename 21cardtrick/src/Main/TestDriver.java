package Main;



import java.util.Iterator;
import java.util.Scanner;

public class TestDriver {


    public static void main(String[] args) {
        Cardgame mygame;
        mygame = cards.getCards();
        String[] cards = mygame.get21Card();//access the method in the singleton "class cards" th get the needed 21 cards
        Stack<String> s1 = new Stack<>();
        mygame.Displaycards();
        String answer;

        SaveGame save = new SaveGame();
        Queue<String> column1 = new Queue<>();
        Queue<String> column2 = new Queue<>();
        Queue<String> column3 = new Queue<>();
        Scanner scan = new Scanner(System.in);

        for (String c : cards)
            s1.push(c);//push the 21 cards into stack

        System.out.println("=================================================\nShuffled Cards: ");
        save.write("\nShuffled Cards: ");

        for (String c : s1) {
            System.out.print(c + "\n");//print the stack
            save.write(c);//save in log file
        }

        System.out.println();
        save.write("\n");

        System.out.print("\nWould you like to see a magic trick? (y/n): ");
        save.write("\nWould you like to see a magic trick? (y/n): ");
        answer = scan.next();
        save.write(answer);
        if (answer.equalsIgnoreCase("y")) {
            // Beginning of magic trick
            System.out.println("\n");
            save.write("\n");
            System.out.println("21 Magic Card Trick: ");
            save.write("21 Magic Card Trick: ");
            System.out.println("Please select a random card from the list below: \n");
            save.write("Please select a random card from the list below: \n");

            for (int i = 0; i < 7; i++) {
                column1.push(s1.pop());
                column2.push(s1.pop());
                column3.push(s1.pop());
            }

            System.out.println("\t\t\t(1)\t\t\t(2)\t\t\t(3)");
            save.write("\t\t\t(1)\t\t\t(2)\t\t\t(3)");
            Iterator<String> c1 = column1.iterator();
            Iterator<String> c2 = column2.iterator();
            Iterator<String> c3 = column3.iterator();

            while (c1.hasNext()) {
                String a = c1.next(), b = c2.next(), c = c3.next();
                System.out.println(a + "\t\t\t" + b + "\t\t\t" + c);
                save.write(a + "\t\t\t" + b + "\t\t\t" + c);
            }
            System.out.println();
            save.write("\n");

            System.out.println("please choose Card ,Your card is in what group ? 1 ,2 ,3 ?");
            save.write("please choose Card ,Your Card is in what group ? 1 ,2 ,3 ?");


            int val = scan.nextInt();
            save.write(val + "\n");
            if (val == 1) {
                for (int i = 0; i < 7; i++)
                    s1.push(column3.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column1.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column2.pop());
            } else if (val == 2) {
                for (int i = 0; i < 7; i++)
                    s1.push(column1.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column2.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column3.pop());
            } else if (val == 3) {
                for (int i = 0; i < 7; i++)
                    s1.push(column2.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column3.pop());


                for (int i = 0; i < 7; i++)
                    s1.push(column1.pop());
            } else
                return;

            for (int i = 0; i < 7; i++) {
                column1.push(s1.pop());
                column2.push(s1.pop());
                column3.push(s1.pop());
            }

            System.out.println("\t\t\t(1)\t\t\t(2)\t\t\t(3)");
            save.write("\t\t\t(1)\t\t\t(2)\t\t\t(3)");
            c1 = column1.iterator();
            c2 = column2.iterator();
            c3 = column3.iterator();

            while (c1.hasNext()) {
                String a = c1.next(), b = c2.next(), c = c3.next();
                System.out.println(a + "             " + b + "              " + c);
                save.write(a + "            " + b + "            " + c);
            }
            System.out.println();
            save.write("\n");

            System.out.println("Your Card is in what group ? 1 ,2 ,3 ?");
            save.write("Your Card is in what group ? 1 ,2 ,3 ?");

            val = scan.nextInt();
            save.write(val + "\n");
            if (val == 1) {
                for (int i = 0; i < 7; i++)
                    s1.push(column3.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column1.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column2.pop());
            } else if (val == 2) {
                for (int i = 0; i < 7; i++)
                    s1.push(column1.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column2.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column3.pop());
            } else if (val == 3) {
                for (int i = 0; i < 7; i++)
                    s1.push(column2.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column3.pop());


                for (int i = 0; i < 7; i++)
                    s1.push(column1.pop());
            } else
                return;
            for (int i = 0; i < 7; i++) {
                column1.push(s1.pop());
                column2.push(s1.pop());
                column3.push(s1.pop());
            }

            System.out.println("\t\t\t(1)\t\t\t(2)\t\t\t(3)");
            save.write("\t\t\t(1)\t\t\t(2)\t\t\t(3)");
            c1 = column1.iterator();
            c2 = column2.iterator();
            c3 = column3.iterator();

            while (c1.hasNext()) {
                String a = c1.next(), b = c2.next(), c = c3.next();
                System.out.println(a + "             " + b + "              " + c);
                save.write(a + "            " + b + "            " + c);
            }
            System.out.println();
            save.write("\n");

            System.out.println("Your Card is in what group ? 1 ,2 ,3 ?");
            save.write("Your Card is in what group ? 1 ,2 ,3 ?");

            val = scan.nextInt();
            save.write(val + "\n");
            if (val == 1) {
                for (int i = 0; i < 7; i++)
                    s1.push(column3.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column1.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column2.pop());
            } else if (val == 2) {
                for (int i = 0; i < 7; i++)
                    s1.push(column1.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column2.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column3.pop());
            } else if (val == 3) {
                for (int i = 0; i < 7; i++)
                    s1.push(column2.pop());

                for (int i = 0; i < 7; i++)
                    s1.push(column3.pop());


                for (int i = 0; i < 7; i++)
                    s1.push(column1.pop());
            } else
                return;

            int i = 0;
            for (String r : s1) {
                if (i++ == 10) {
                    System.out.println("Is this your card ? " + r);
                    save.write("Is this your card ? " + r);
                    answer = scan.next();
                    save.write(answer);
                    if (answer.equalsIgnoreCase("y")) {
                        System.out.println("\nYaaaay i got it right !! ^_^ , did you like the Trick ?(y/n)");
                        save.write("\nYaaaay i got it right !! ^_^,did you like the Trick ?(y/n");
                        answer = scan.next();
                        save.write(answer);
                        if(answer.equalsIgnoreCase("y"))
                        {
                            System.out.println("Thanks i am a great magician ^-^");
                            save.write("Thanks i am a great Magician ^-^");
                            answer="n";
                            save.close();

                        }
                        else{
                            System.out.println("sorry , I'll practice more T-T ");
                            save.write("sorry, I'll practice more T-T");
                            save.close();
                        }


                    } else {
                        System.out.println("\n Ohh no i am sorry T-T , let me try again !? (y/n) ");
                        save.write("\n Ohh no i am sorry T_T , let me try again !? (y/n) ");
                        answer = scan.next();
                        save.write(answer);
                        if (answer.equalsIgnoreCase("y")) {
                            System.out.print("Let me rest and comeback again ^-^");
                            save.write(":et me practice  and comeback again ^-^");
                            save.close();
                        } else {
                            System.out.println("I'll Practice more , to be a great magician T-T  ");
                            save.write("I'll practice more , to be a great Magician T-T");
                            save.close();
                        }

                    }
                }


            }
        }

        else{
                System.out.println("OK Goodbye!");
                save.write("OK Goodbye!");
                save.close();
        }


    }
}

