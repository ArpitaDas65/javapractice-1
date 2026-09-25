import java.util.Scanner;
public class dowhileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.println("enter a positive number:");
            number = scanner.nextInt();
        } 
        while(number<=0);
        System.out.println("you entered:"+number);
        scanner.close();

    }
    
}
