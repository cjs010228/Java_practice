import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
        System.out.println("enter your score");
        Scanner scanner = new Scanner(System.in);
        //int score=scanner.nextInt();
        int num = (scanner.nextInt()%2);
        System.out.printf("You are %s \n",(num>60?"good":"bad"));
        //int num = (scanner.nextInt()%2);
        System.out.printf("%s number\n",(scanner.nextInt()!=0 ?"odd":"even"));

     }
}
