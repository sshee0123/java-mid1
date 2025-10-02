package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        str.concat("java");
        // String은 불변객체
        System.out.println("str = " + str);
    }
}
