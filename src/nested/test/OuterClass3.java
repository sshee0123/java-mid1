package nested.test;

public class OuterClass3 {
    public void myMethod() {
        // 여기에 지역클래스 LocalClass 구현해라. 그리고 hello() 메서드를 호출해라.
        class LocalClass {
            public void hello() {
                System.out.println("OuterClass3.hello");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }

}
