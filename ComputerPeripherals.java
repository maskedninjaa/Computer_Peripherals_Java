package javaproject3;

import java.util.Scanner;

/**
 * Third project done from scratch in java
 * A simple program that asks the user to describe the computer peripherals that they use
 *
 * @author Wasim Nasser
 */
public class ComputerPeripherals {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // scanner object

        System.out.println("Describe your keyboard!" +
                "\n1. Name the type of keyboard you are using!" +
                "\n2. Name the main color of your keyboard!" +
                "\n3. Describe the type of switches it uses (input 'l' for linear, 't' for tactile, or 'c' for clicky)." +
                "\n4. Say whether or not it has lighting effects (input 'y' if it does, or 'n' if it doesn't).");

        System.out.println();

        System.out.println("Describe your other computer peripherals as well!" +
                "\n5. Describe the type of mouse you have!" +
                "\n6. Name the model of your main monitor! " +
                "\n7. Say whether or not your monitor is curved or flat (input 'c' for curved, or 'f' for flat)." +
                "\n8. Lastly, input the max number of frames your monitor can run at! That's it!");
        Keyboard keyboard = new Keyboard(input.nextLine(), input.nextLine(), input.nextLine(),input.nextLine());

        OtherPeripherals otherPeripherals = new OtherPeripherals(input.nextLine(), input.nextLine(), input.nextLine(), input.nextDouble());

        System.out.println(keyboard + "\n" + otherPeripherals + " =)");
    }
}
