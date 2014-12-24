import java.util.Scanner;
import java.io.*;

public class ScannerDemo{
    public static void main(String[] args) throws IOException {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number !");
        System.out.printf("Your input is %d",scanner.nextInt());*/
        BufferedReader bufferedReader = 
        							new BufferedReader(
        										new InputStreamReader(System.in));
        										
        System.out.println("enter a text !");
        String text = bufferedReader.readLine();
        System.out.println("Your input is !" + text);
    }
}