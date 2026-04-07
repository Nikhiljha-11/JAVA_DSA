public class Fibonacci{
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return 1;
        }
        int res = n *fibo(n-1);
        return res;
    }
}