package MODULE5;

public class MyException extends Exception{
    MyException(String message) {
        super(message);
    }
}

class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new MyException("Custom Exception Occurred");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
