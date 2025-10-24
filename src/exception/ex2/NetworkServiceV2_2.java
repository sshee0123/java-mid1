package exception.ex2;


public class NetworkServiceV2_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        /**
         * 예외가 발생할 수 있는 코드를 try catch로 예외를 잡아서 처리해서 프로그램 계속 수행할 수 있게 변경
         */
        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
            return;
        }
        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
            return;
        }
        client.disconnect();
    }
}
