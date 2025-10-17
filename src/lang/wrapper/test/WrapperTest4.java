package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        // Integer -> int (auto-boxing)
        int intValue = integer1;
        System.out.println("intValue = " + intValue);

        // int -> Integer (auto-unboxing)
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);
    }
}
