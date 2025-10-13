package lang.string.test;

public class StringTest11 {

    public static void main(String[] args) {
        String str = "Hello Java";
        String sb = new StringBuilder(str).reverse().toString();
        System.out.println("sb = " + sb);
    }
}
