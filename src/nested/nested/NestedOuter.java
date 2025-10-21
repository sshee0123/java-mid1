package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstaceValue = 1;
        
        public void print() {
            // 자신의 멤버에 접근
            System.out.println("nestedInstaceValue = " + nestedInstaceValue);
            
            // 바깥 클래스의 인스턴스 멤버에 접근 불가 (static은 인스턴스 영역에 접근 불가)
            //System.out.println("outInstanceValue = " + outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근 가능, private도 접근 가능
            // 중첩 클래스도 같은 클래스 안에 있는 것이기 때문에 private 접근 가능
            System.out.println(NestedOuter.outClassValue);
        }
    }
}
