import java.util.Scanner;
public class Example1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num= sc.nextInt();
        if(num>0){
            System.out.println("The given number is positive");
        }
        else if(num<0){
            System.out.println("The given number is negative");
        }
        else{
            System.out.println("The given number is zero");
        }
    }
}
