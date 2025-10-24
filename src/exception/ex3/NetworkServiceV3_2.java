package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        /**
         * ConnectExceptionV3 : 연결 오류만 자세하게 출력
         * 나머지는 그 부모 NetworkClientExceptionV3
         * 더 나머지는 Exception
         * catch 순서대로 잡는다. (위에서 아래) -> 디테일한 예외를 위에 작성..
         */
        try {
            // 정상흐름
            client.connect();
            client.send(data);

        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지 : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지 : " + e.getMessage());
        }
        finally {
            client.disconnect();
        }
    }
}
