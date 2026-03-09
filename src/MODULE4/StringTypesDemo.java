package MODULE4;

public class StringTypesDemo {
    public static void main(String[] args) {
        String s = "Hello";
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sbf = new StringBuffer("Hello");

        s.concat(" World");
        sb.append(" World");
        sbf.append(" World");

        System.out.println(s);
        System.out.println(sb);
        System.out.println(sbf);
    }
}

