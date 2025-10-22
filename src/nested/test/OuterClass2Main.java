package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        // 여기에서 InnerClassd의 hello() 메서드를 호출해라.
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass inner = outerClass2.new InnerClass();
        inner.hello();
    }
}
