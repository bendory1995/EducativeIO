public class ReverseString {
    public static void main(String args []){
        System.out.println(reverseString("Hi, my name is Alex Oh"));
    }

    public static String reverseString(String string){
        if(string.isEmpty()) return string;
        else{
            return reverseString(string.substring(1)) + string.charAt(0);
        }
    }
}
