
public class Main {
    public static void main(String[] args) {
    int i = 2;
    while (i <= 100){
        if (isPrime(i)){
            System.out.println(i);
        }
        i++;
    }
    }
    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}