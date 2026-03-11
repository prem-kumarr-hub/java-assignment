import java.io.*;

public class Exceptiondemo {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e);
        }

        try {
            FileReader file = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(file);
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Checked Exception: " + e);
        }
    }
}