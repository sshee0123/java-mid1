package exception.ex4;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        /**
         * NetworkServiceV4 는 발생하는 예외인 ConnectExceptionV4, SendExceptionV4 를 잡아도 해당 오류들을 복구할 수 없다. 따라서 예외를 밖으로 던진다.
         * 언체크 예외이므로 throws 사용하지 않는다.
         * 사실 NetworkServiceV4 개발자 입장에서 해당 예외를 복구할 수 없다.
         * 따라서 해당 예외들을 생각하지 않는 것이 더 나은 선택일 수 있다.
         * 해결할 수 없는 예외들은 다른 곳에서 공통으로 처리한다.
         */
        try {
            client.connect();
            client.send(data);
        }
        finally {
            client.disconnect();
        }
    }
}
