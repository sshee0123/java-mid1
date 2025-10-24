package exception.ex2;


public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        /**
         * 하나의 try 안에 정상 흐름을 모두 담는다.
         * 예외 부분은 catch 블럭에서 해결한다.
         */
        try {
            // 정상흐름
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            // 예외흐름
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
        }

    }
}
