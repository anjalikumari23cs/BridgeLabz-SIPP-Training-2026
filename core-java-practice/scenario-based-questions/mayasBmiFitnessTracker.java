import java.util.*;
public class mayasBmiFitnessTracker {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Maya's BMI Fitness Tracker!");
        System.out.println("Please enter the below details to calculate your BMI:");
        System.out.println("Weight (in kg):");
        double weight=sc.nextDouble();
        System.out.println("Height (in meters):");
        double height=sc.nextDouble();
        double bmi=weight/(height*height);
        System.out.println("Your BMI is:"+bmi);
        if(bmi<18.5){
            System.out.println("You are underweight.\n Consider a balanced diet and regular exercise.");
        } else if(bmi>=18.5 && bmi<24.9){
            System.out.println("You have a normal weight.\n Keep up the good work!");
        } else if(bmi>=25 && bmi<29.9){
            System.out.println("You are overweight.\n Consider a healthy diet and regular exercise.");
        } else {
            System.out.println("You are obese.\n It's important to consult with a healthcare provider for personalized advice.");
        }
        sc.close();
    }
}
