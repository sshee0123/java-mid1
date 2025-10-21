package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        // 중첩 클래스
        // class nested.nested.NestedOuter$Nested
        System.out.println("nested.getClass() = " + nested.getClass());
    }
}
