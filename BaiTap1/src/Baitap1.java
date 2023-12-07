import java.util.Scanner;
public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        int num = sc.nextInt();
        String result = "";
        switch (num){
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 2:
                System.out.println("The corner is square at 4 different angles");
                System.out.println("1.Top-left");
                System.out.println("2.Botton-left");
                System.out.println("3.Top-right");
                System.out.println("4.Botton-right");
                int number = sc.nextInt();
                switch (number){
                    case 1:
                        for (int i = 0; i < 5; i++) {
                            for (int j = 5 - i; j > 0; j--) {
                                result += "*";
                            }
                            result += "\n";
                        }
                        break;
                    case 2:
                        for (int i = 1; i <= 6; i++) {
                            for (int j = 0; j < i; j++) {
                                result += "*";
                            }
                            result += "\n";
                        }
                        break;
                    case 3:
                        for (int i = 0; i < 5; i++) {
                            for (int j =  0; j < i; j++) {
                                result += " ";
                            }
                            for (int j = 5 - i; j > 0; j--){
                                result += "*";
                            }
                            result += "\n";
                        }
                        break;
                    case 4:
                        for (int i = 5; i > 0; i--) {
                            for (int j = i; j > 0; j--) {
                                result += " ";
                            }
                            for (int j = 0; j < 6 - i; j++) {
                                result += "*";
                            }
                            result += "\n";
                        }
                        break;
                }
                break;
            case 3:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 0; j <= 5-i; j++) {
                        result += " ";
                    }
                    for (int j = 1; j <= 2 * i -1; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            default:
                break;
        }
        System.out.println(result);
    }
}
