import java.util.Scanner;

public class LoginDemo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username:");
        String name = scanner.next();
        System.out.println("Enter your password:");
        String pwd = scanner.next();
        if ((name.equals("Brandon"))&&(pwd.equals("233two468"))){
            System.out.println("Successfull!!");
        }
    }
}