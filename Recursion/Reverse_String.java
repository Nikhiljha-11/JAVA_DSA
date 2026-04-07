public class Reverse_String {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);
       String po=  Rev(str, str.length()-1);
        System.out.println(po);
    }
        public static String Rev(String str , int index){
            if(index<0){
                return "";
            }
           return str.charAt(index) + Rev(str, index-1);
        }
}
