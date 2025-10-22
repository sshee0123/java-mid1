package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(final int paramVar) {

        final int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.
        
        // 지역 클래스
        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아 남는다.
                // 지역 클래스가 접근하는 지역 변수는 값이 변경되면 안된다.
                // 사실상 final
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);

                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        // 변수 캡처
        // LocalPrinter 인스턴스 생성할 때, 접근하는 지역 변수 복사
        LocalPrinter printer = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면? 다시 캡처해야하나?
        // 동기화 문제 발생
//        localVar = 10;
//        paramVar = 20;
        return printer;
    }

    public static void main(String[] args) {

        LocalOuterV4 localOuterV1 = new LocalOuterV4();
        Printer printer = localOuterV1.process(2);
        // printer.print(); 나중에 실행한다. process() 의 스택 프레임이 사라진 이후에 실행
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);

        }
    }
}
