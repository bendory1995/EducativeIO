public class GCD{
    public static void main(String args[] ){
        System.out.println(gcd(24, 18));
    }
    public static int gcd(int a, int b){
        if(a == b) return a;
        if(a > b){
            return gcd(a-b, b);
        }else{
            return gcd(a, b-a);
        }
    }
}