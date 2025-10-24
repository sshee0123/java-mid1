package exception.ex2;

public class NetworkClientExceptionV2 extends Exception{

    /**
     * 어떤 오류가 발생했는지 구분하기 위해 예외 안에 오류 코드 보관
     */
    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        /**
         * 어떤 오류가 발생했는지 개발자가 보고 이해할 수 있는 설명 담아둔다.
         * 오류 메시지는 상위 클래스인 Throwable에서 기본적으로 제공하는 기능 사용
         */
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
