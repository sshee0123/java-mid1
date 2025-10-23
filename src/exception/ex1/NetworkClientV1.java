package exception.ex1;

public class NetworkClientV1 {

    // 접속할 외부 서버 주소
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if (connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        if (sendError) {
            System.out.println(address + " 서버 데이터 전송 실패");
            return "sendError";
        }

        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
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
