import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Stringutils {
    public static void main(String[] args) {
//        Tells whether or not what the user entered is a number
        System.out.println("Enter a letter or number");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


//        StringUtils.isNumeric()
        if(StringUtils.isNumeric(userInput)){
            System.out.println("you have entered a number");
        }
        else {
            System.out.println(userInput + " is not a number");
        }

//        Flips the case of the string
        System.out.println("Please enter some words");
        Scanner scanner0 = new Scanner (System.in);
        String userWords = scanner0.nextLine();
        System.out.println(StringUtils.swapCase(userWords));


//        Reverses the string
        System.out.println("Please enter a sentence");
        Scanner scanner1 = new Scanner (System.in);
        String userSent = scanner1.nextLine();
        System.out.println(StringUtils.reverse(userSent));


    }

}
