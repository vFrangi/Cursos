// Base Pay |Hours    |Worked
// Employee |1 $7.50  |35
// Employee |2 $8.20  |47
// Employee |3 $10.00 |73

public class FooCorporation {
    public static void calculatePay(double basePay, int hoursWorked) {
        if (basePay < 8.0 || hoursWorked > 60) {
            System.out.println("Error");
        } else {
            if (hoursWorked > 40) {
                int extraHours = 0;
                double extraPay = 0.0;
                extraHours = hoursWorked - 40;
                extraPay = extraHours * (basePay * 1.5);
                System.out.println("Total Pay: " + (extraPay + (40 * basePay)));
                return;
            }
            System.out.println("Total Pay: " + (basePay * hoursWorked));
        }
    }

    public static void main(String[] args) {
        System.out.print("Employee 1: ");
        calculatePay(7.50, 35);
        System.out.print("Employee 2: ");
        calculatePay(8.20, 47);
        System.out.print("Employee 3: ");
        calculatePay(10, 73);
    }
}
