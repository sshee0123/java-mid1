package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    private static int findValue(int[] intArr, int target) {
        for(int value:intArr) {
            if(value == target) {
                return value;
            }
        }
        // 값이 없으면 -1인데, intArr 배열에 있는 -1이랑 헷갈리는 문제발생.
        return -1;
    }
}
