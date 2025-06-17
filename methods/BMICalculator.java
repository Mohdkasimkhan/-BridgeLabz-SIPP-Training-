import java.util.Scanner;

public class BMICalculator {

    
    public static void calculateBMI(double[][] people) {
        for (int i = 0; i < people.length; i++) {
            double weight = people[i][0];
            double heightCm = people[i][1];
            double heightM = heightCm / 100.0; // cm to meter
            double bmi = weight / (heightM * heightM);
            people[i][2] = bmi;
        }
    }

   
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi >= 18.5 && bmi < 25) return "Normal";
        else if (bmi >= 25 && bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void printResults(double[][] people) {
        System.out.println(" BMI Report");
       
        for (int i = 0; i < people.length; i++) {
            double weight = people[i][0];
            double height = people[i][1];
            double bmi = people[i][2];
            String status = getBMIStatus(bmi);
            System.out.printf( weight, height, bmi, status);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] people = new double[10][3];

        System.out.println("Enter weight (kg) and height (cm) for 10 people:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("  Weight (kg): ");
            people[i][0] = sc.nextDouble();
            System.out.print("  Height (cm): ");
            people[i][1] = sc.nextDouble();
        }

        // Calculate BMI and print report
        calculateBMI(people);
        printResults(people);
        sc.close();
    }
}
