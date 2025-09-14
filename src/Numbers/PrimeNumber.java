package Numbers;

public class PrimeNumber {
    public static void main(String[] args) {
        int input = 4;
        if(isprime(input)){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
    }
    static boolean isprime(int n){
        if(n<=1)return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
