import java.util.Scanner;

public class Magic8Ball
{
    public static void main(String[] args)
    {
        // Tell the user to enter a question
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();

        String response = "";  // update this variable with the response

        // Write code here to generate a random number from 1 to 6
        int random = (int)(Math.random() * 6) + 1;

        // Write code here to use
        // appropriate selection statements (if, if else, else)
        // to choose from 1 of 6 responses and set response to it.
        // for example, if the number is 1, set response to "Outlook good"
        // if it’s 2, set response to "Without a doubt!"
        // etc.

       /* if (random == 1) {
            response = "Outlook good!";
        } else if (random == 2) {
            response = "Without a doubt!";
        } else if (random == 3){
            response = "Of course!";
        } else if (random == 4){
            response = "Hmm perhaps";
        } else if (random == 5){
            response = "Chances are low";
        } else {
            response = "Never!";
        } */


        if (random == 1) {
            response = "Outlook good!";
        }
        if (random == 2) {
            response = "Without a doubt!";
        }
        if (random == 3){
            response = "Of course!";
        }
        if (random == 4){
            response = "Hmm perhaps";
        }
        if (random == 5){
            response = "Chances are low";
        }
        if (random == 6) {
            response = "Never!";
        }

        System.out.println(response);  // print response


    }
}

