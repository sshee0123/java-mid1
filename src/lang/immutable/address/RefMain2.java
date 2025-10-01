package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스 공유 가능
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법이 없다.
        System.out.println("a = "+ a);
        System.out.println("b = " + b);

        // java: cannot find symbol
//        b.setValue("부산");
        b = new ImmutableAddress("부산");
        System.out.println("a = "+ a);
        System.out.println("b = " + b);
    }
}
