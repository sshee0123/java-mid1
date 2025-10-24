package exception.ex2;


public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        /**
         * 하나의 try 안에 정상 흐름을 모두 담는다.
         * 예외 부분은 catch 블럭에서 해결한다.
         * disconnect() 메서드 항상 호출되어야한다.
         */
        try {
            // 정상흐름
            client.connect();
            client.send(data);

        } catch (NetworkClientExceptionV2 e) {
            // 예외흐름
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
        }
        /**
         * 이렇게 하면 문제 발생
         * 바로 catch 에서 잡을 수 없는 예외 발생할 때
         */
        client.disconnect();

    }
}
