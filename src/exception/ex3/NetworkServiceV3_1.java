package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        /**
         * 하나의 try 안에 정상 흐름을 모두 담는다.
         * 예외 부분은 catch 블럭에서 해결한다.
         * disconnect() 메서드 항상 호출되어야한다. -> finally
         */
        try {
            // 정상흐름
            client.connect();
            client.send(data);

        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터 : " + e.getSendData() + ", 메시지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
