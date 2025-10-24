package exception.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        /**
         * 예외를 계속 던지는 상황
         */
        service.catchThrow();
        System.out.println("정상 실행");
    }
}
