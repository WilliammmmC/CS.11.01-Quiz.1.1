import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int age;
        String firstName;
        String favouriteFood;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        age = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        firstName = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter your favourite food here:");
        favouriteFood = scanner2.nextLine();
        System.out.println("First Name:" + firstName + "\nAge:" + age + "\nFavourite food:" + favouriteFood);
    }
}
        
