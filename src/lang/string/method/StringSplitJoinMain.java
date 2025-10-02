package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banna,Orange";

        //split()
        String[] splitStr = str.split(",");
        for(String s : splitStr) {
            System.out.println(s);
        }

        String joinStr = "";
        for (int i = 0; i< splitStr.length; i++) {
            String string = splitStr[i];
            joinStr += string;
            if(i != splitStr.length-1) {
                joinStr += "-";
            }
        }
        System.out.println("joinStr = " + joinStr);

        //join()
        String joinedStr = String.join("-", splitStr);
        System.out.println("joinedStr = " + joinedStr);


    }
}
