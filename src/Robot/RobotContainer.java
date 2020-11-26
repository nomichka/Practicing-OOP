package Robot;

import java.util.Scanner;

public class RobotContainer {
    Joystick joystick = new Joystick();
    Scanner input = new Scanner(System.in);
    // Create two button objects

    public RobotContainer() {}


    public void resultOfAction() {
            System.out.println();
            System.out.println("-----------------------");
            if (joystick.angle == 0.0) {
                System.out.println("The robot is not moving.");
            } else if (joystick.angle > 0) {
                System.out.println("The Robot is moving forward with a power of " + joystick.angle);
            } else {
                System.out.println("The Robot is moving backward with a power of " + (-1.0 * joystick.angle));
            }
            System.out.println("-----------------------");
            System.out.println();
    }

    public void nextAction() {
        System.out.println("Please enter an input. Inputs are joystick, button1, button2, quit.");

        boolean running = true;
        while (running) {
            System.out.println("What action should the robot do?");

            String action = input.nextLine();

            if (action.equals("joystick")) {
                System.out.println("Enter an angle from -1.0 to 1.0.");
                double angle = input.nextDouble();
                input.nextLine();
                joystick.angle = angle;
            } else if (action.equals("quit")) {
                running = false;
            } else {
                System.out.println("Sorry, I didn't understand that.");
                System.out.println("Please enter an input. Inputs are joystick, quit.");
            }

            resultOfAction();
        }

        System.out.println("Robot is off.");
    }
}