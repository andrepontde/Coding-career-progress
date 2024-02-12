import java.util.Scanner;

public class Room3 {

    public static void  main (String [] args){
         // Here I declare that the usersInput is the name of the scanner class
        Scanner userInput = new Scanner(System.in);
        // Here I ask the user to enter the width of the room
        System.out.println("Please enter the width of the room");
        // I can only take this value if I declare that the width of the room is going to be entered so I assign it as a Variable and declare that it will be equal to a next double.
        double widthRoom = userInput.nextDouble();
        // Here I continue with needing the user to provide the length
        System.out.println("Please enter the length of the room");
        // And declaring the next double will be assigned to the variable lengthRoom
        double lengthRoom = userInput.nextDouble();
        // Here I take the perimeter
        double roomPerimeter = Math.round(2*( widthRoom + lengthRoom));
        // Here I take the area
        double roomFloorSpace = (lengthRoom * widthRoom);
        // Here I provide the final outcomes.
        System.out.println("The floor space in the room is " + roomFloorSpace);
        System.out.println ("The perimiter of the room is " + roomPerimeter);



    }

}
