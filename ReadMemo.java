/*Zhipeng (Adrian) Mei
  Sept 23, 2016 
  Purpose: This program to create a memo file
  Inputs: This program ask for an topic and message inputs
  Output: Creates an txt file.
 */
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadMemo {

    //static scanner
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        //reading the file "ziptable"
        File input = new File("Memos.txt");

        //showOpenDialog method to enable the user to select a file to open
        JFileChooser chooser = new JFileChooser();
        //APPROVE_OPTION, if the user has chosen a file
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            Scanner in = new Scanner(selectedFile);

            //while loop to iterate as many memo to read as user desire
            boolean done = true;
            while (done) {
                if (in.hasNextLine()) {
                    for (int i = 0; i < 3; i++) {
                        System.out.println(in.nextLine());
                    }
                } else {
                    done = false;
                    System.out.println("No more memo");
                    break;
                }

                menu();
                int choice = 0;
                //handling input value or input type exception with do while
                do {
                    //try catch block to determine user choice is an integer
                    try {
                        choice = scan.nextInt();
                        if (choice != 1 && choice != 2) {
                            //set choice to default, loop while one more time
                            choice = -9999;
                            //prompt error message
                            System.out.println("Invalid input");
                            menu();
                        }
                        //catch mismatch type
                    } catch (java.util.InputMismatchException e) {
                        choice = -9999;
                        //prompt error message
                        System.out.println("Invalid Input");
                        menu();
                        //clear buffer
                        scan.nextLine();
                    }
                } while (choice == -9999);

                //switch for action
                switch (choice) {
                    case 1:
                        System.out.println("");
                        break;
                    case 2:
                        done = false;
                        break;
                }//end switch
            }//end while
            //close file
            in.close();
        }//end showopendialog if
    }//end main

    public static void menu() {
        System.out.println("\n1. Read the next memo");
        System.out.println("2. Quit");
    }
}//end class
