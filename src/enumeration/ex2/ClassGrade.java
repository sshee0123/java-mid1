package enumeration.ex2;

public class ClassGrade {

    // 타입 안전 열거형 패턴 구현

    // 1. 회원 등급을 다루는 클래스를 만들고, 각각의 회원 등급별로 상수를 선언
    // 2. 이때 각각의 상수마다 별도의 인스턴스를 생성하고, 대입
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 생성자 추가
    private ClassGrade() {}
}
