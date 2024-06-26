package rohan.strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverseString(str));
    }
    static String reverseString(String str) {
        String[] rev = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = rev.length-1; i >= 0; i--) {
            if(!sb.isEmpty()&& rev[i] != ""){
                sb.append(" ");
            }
            if(rev[i] != ""){
                sb.append(rev[i]);
            }
        }
        return sb.toString();
    }
}
