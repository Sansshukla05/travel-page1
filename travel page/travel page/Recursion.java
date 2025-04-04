public class Recursion{
    public static void printRev(String str, int index){
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        printRev(str, index-1);
    }
    public static void main (String[] args){
        String str="qwerty";
        printRev(str, str.length()-1);
    }
}