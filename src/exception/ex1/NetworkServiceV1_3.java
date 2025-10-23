package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        // 추가
        client.initError(data);

        // 요구사항
        // 오류 발생한 경우 오류 코드 출력으로 남김.
        // 오류 발생한 경우 다음 단계로 넘어가면 안됨.
        // 오류 발생하면 연결을 해제해야함.
        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류코드 : " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류코드 : " + sendResult);
            }
        }
        // 무조건 호출해야 하는 메서드
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
