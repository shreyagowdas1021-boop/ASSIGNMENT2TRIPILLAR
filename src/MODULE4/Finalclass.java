package MODULE4;

final class Finalclass {
        void display() { System.out.println("This is a final class"); }
}

class TestFinal {
    public static void main(String[] args) {
        Finalclass obj = new Finalclass();
        obj.display();
    }
}

