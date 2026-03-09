package MODULE4;

public class StaticExample {
    static int count = 0;

    static void display() {
        count++;
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        StaticExample.display();
        StaticExample.display();
    }
}
