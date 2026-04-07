public class Sum_Number{
    public static void main(String[] args) {
        int ans = Sum(53432);
        System.out.println(ans);
    }
    static int Sum(int n){
        if(n==0){
        return 0;

    }
    
    return (n%10)+Sum(n/10);
}
}