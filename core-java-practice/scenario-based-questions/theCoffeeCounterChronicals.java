import java.util.*;
public class theCoffeeCounterChronicals {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Welcome to the Coffee Counter! Please enter your coffee type (Espresso, Latte, Cappuccino) or 'exit' to quit:");
            String coffeeType=sc.nextLine();
            if(coffeeType.equalsIgnoreCase("exit")){
                System.out.println("Thank you for visiting the Coffee Counter. Goodbye!");
                break;
            }
            System.out.println("Please enter the quantity:");
            int quantity=sc.nextInt();
            sc.nextLine(); // Consume the newline character
            double price=0.0;
            double gst=18.00;
            System.out.println("Your Bill will be:");
            switch(coffeeType.toLowerCase()){
                case "espresso":
                    price=2.5;
                    System.out.println("Price per cup: $" + price);
                    break;
                case "latte":
                    price=3.0;
                    System.out.println("Price per cup: $" + price);
                    break;
                case "cappuccino":
                    price=3.5;
                    System.out.println("Price per cup: $" + price);
                    break;
                default:
                    System.out.println("Invalid coffee type");
                    continue;
            }
            System.out.println("Quantity: " + quantity);
            System.out.println("Subtotal: $" + (quantity*price));
            System.out.println("GST: $" + gst);
            double total=quantity*price+gst;
            System.out.println("Total cost: $" + total);
            System.out.println("Thank you for your order! Would you like to order another coffee? (yes/no)");
            String response=sc.nextLine();
            if(!response.equalsIgnoreCase("yes")){
                System.out.println("Thank you for visiting the Coffee Counter. Goodbye!");
            }
        }
        sc.close();
    }
}
