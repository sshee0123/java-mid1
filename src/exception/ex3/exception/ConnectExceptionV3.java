package exception.ex3.exception;

/**
 * ConnectExceptionV3 : 연결 실패 시 발생하는 예외
 * 내부에 연결을 시도한 address 보관
 * NetworkClientExceptionV3 상속했다.
 */
public class ConnectExceptionV3 extends NetworkClientExceptionV3{

    private final String address;

    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
