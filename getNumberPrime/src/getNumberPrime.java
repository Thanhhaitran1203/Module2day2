import java.util.Scanner;

public class getNumberPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int count = 0;
        int i = 2;
        while (count < number){
            if (isPrime(i)){
                System.out.println(i);
                count++;
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