public class RemoveDuplicates{
    public static void main(String[] args){
        System.out.println(removeDuplicates("Hii, Myy Name is Allllex"));
    }

    public static String removeDuplicates(String string){
        if(string.length() == 1) return string;
        if(string.substring(0,1).equals(string.substring(1,2))){
            return removeDuplicates(string.substring(1));
        }else{
            return string.substring(0,1) + removeDuplicates(string.substring(1));
        }
    }
}