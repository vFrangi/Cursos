class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        System.out.println("\nThe object's position after " + fallingTime +
        " seconds is " + finalPosition + " m.");// The output will be 0.0 m because the initial velocity is 0 and final position is 0.

        System.out.println("=====================================================");
        
        finalPosition = 0.5 * gravity * (fallingTime * fallingTime) + initialVelocity * fallingTime + initialPosition;
        System.out.println("The object's position after " + fallingTime +
        " seconds is " + finalPosition + " m.\n");
    }
}
