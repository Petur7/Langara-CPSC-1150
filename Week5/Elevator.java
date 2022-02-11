import java.util.Scanner;


public class Elevator {
    // Function to print moving the elevator
    public static void elevator(int floor, boolean up) {
        if (up) {
            System.out.println("o---o   /\\");
            System.out.printf("| %d |  /  \\\n", floor);
            System.out.println("o---o /    \\");
        } else {
            System.out.println("o---o \\    /");
            System.out.printf("| %d |  \\  /\n", floor);
            System.out.println("o---o   \\/");
        }
    }

    // Function to print stand still elevator
    public static void elevator(int floor) {
        System.out.println("o---o");
        System.out.printf("| %d |\n", floor);
        System.out.println("o---o");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int currentFloor = 1;

        // Print the elevator standing at the first floor
        // This will print the elevator standing at the first floor without any moving symbol
        elevator(currentFloor); 
        System.out.println("You are on floor " + currentFloor);
        

        while (true) {
            // Ask the user for the next floor
            System.out.print("Enter floor (1-9): ");
            int targetFloor = input.nextInt();

            // Validation
            if (targetFloor < 0  || targetFloor > 9) {
                System.out.println("Invalid floor");
                continue;
            }

            // Clear the terminal
            // System.out.print("\033[H\033[2J");
            // System.out.flush();

            // If the floor is 0 then exit the program
            if (targetFloor == 0) break;

            // If the targetFloor is the same with currentFloor
            if (targetFloor == currentFloor) {
                System.out.println("You are already on floor " + currentFloor);
                elevator(targetFloor);
                continue;
            }

            // If moving up
            if (targetFloor > currentFloor) {
                // Print from the target floor to the current floor
                for (int position = targetFloor; position >= currentFloor; position--) {
                    elevator(position, true);
                }
                // Set the currentFloor as targetFloor
            } 
            
            // Else moving down
            else {
                // Print from the current floor to the target floor
                for (int position = currentFloor; position >= targetFloor; position--) {
                    elevator(position, false);
                }
                // Set the currentFloor as targetFloor
            }
            currentFloor = targetFloor;

            System.out.println("You are on floor " + currentFloor);
        }

        input.close();
    }
}
