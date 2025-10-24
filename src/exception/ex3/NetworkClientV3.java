package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {

    // 접속할 외부 서버 주소
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    /**
     * 오류가 발생했을 때 오류 코드를 반환하는 것이 아니라 예외를 던진다.
     *
     */
    public void connect() throws ConnectExceptionV3{
        if (connectError) {
            throw new ConnectExceptionV3(address, address + " 서버 연결 실패");
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV3 {
        if (sendError) {
            throw new SendExceptionV3(data, address + " 서버 데이터 전송 실패");
            // 언체크 예외 발생
            //throw new RuntimeException("ex")
        }
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }
    
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    // 요구사항
    // data에 error1 이 포함되면 서버 연결 실패
    // data에 error2 이 포함되면 데이터 연결 실패
    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
