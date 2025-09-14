package Numbers;

public class AddDigits {
    public static void main(String[] args) {
        int n = Digits(19);
        System.out.println(n);
    }
    static int Digits(int num){
        while(num>9){
            int sum =0;
           while(num >0){
               int last = num%10;
               sum = sum+last;
               num = num/10;
           }
           num = sum;
        }
        return num;
    }
}
