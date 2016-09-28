/*Zhipeng (Adrian) Mei
  Sept 23, 2016 
  Purpose: This program to create a memo file
  Inputs: This program ask for an topic and message inputs
  Output: Creates an txt file.
 */
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StoreMemo {

    //static scanner
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        //creating a new file "Memos"
        PrintWriter out = new PrintWriter("Memos.txt");

        boolean done = true;
        //while loop to iterate as many memo to write as user desire
        while (done) {
            // Instantiate a Date object
            Date date = new Date();

            System.out.print("Enter your memo topic: ");
            //user inout a topic
            out.println(in.nextLine());
            //auto create a date
            out.println(date.toString());
            System.out.print("Enter your memo message: ");
            //user input a memo message
            out.println(in.nextLine());

            //menu
            menu();
            //initialize a choice variable for user's acion
            int choice = 0;
            //handling input value or input type exception with do while
            do {
                //try catch block to determine user choice is an integer
                try {
                    choice = in.nextInt();
                    if (choice != 1 && choice != 2) {
                        //set choice to default, loop while one more time
                        choice = -9999;
                        //prompt error message
                        System.out.println("Invalid input");
                        menu();
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid Input");
                    menu();
                    choice = -9999;
                    //clear buffer
                    in.nextLine();
                }
            } while (choice == -9999);

            //switch method to determine action
            switch (choice) {
                case 1:
                    System.out.println(" ");
                    break;
                case 2:
                    done = false;
                    break;
            }//end switch
            in.nextLine();
        }//end while
        //close file
        out.close();
    }

    //menu method to prompt user
    public static void menu() {
        System.out.println("1. Would you like to write another memo?");
        System.out.println("2. Quit");
    }
}
