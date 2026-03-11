class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    static void checkNumber(int num) throws MyException {
        if (num < 0) {
            throw new MyException("Number cannot be negative");
        } else {
            System.out.println("Number is valid");
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
