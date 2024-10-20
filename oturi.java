import java.util.Scanner;
public class oturi{
    public static void main(String[] args) {
        int siharai, kingaku, n, a, b, c, d, e, f;
        Scanner sc = new Scanner(System.in);

        System.out.print("支払額を入力してください<<");
        siharai = sc.nextInt();
        System.out.print("金額を入力してください<<");
        kingaku = sc.nextInt();
        n = siharai - kingaku;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        while (true){
            if (n == 0){
                break;
            }
            else if (n >= 500){
                n = n - 500;
                a++;
            }
            else if ((n >= 100)&&(n < 500)){
                n = n - 100;
                b++;
            }
            else if ((n >= 50)&&(n < 100)){
                n = n - 50;
                c++;
            }
            else if ((n >= 10)&&(n < 50)){
                n = n - 10;
                d++;
            }
            else if ((n >= 5)&&(n < 10)){
                n = n - 5;
                e++;
            }
            else if ((n >= 1)&&(n < 5)){
                n = n - 1;
                f++;
            }
        }
        System.out.println("おつりの500円は"+a+"枚100円は"+b+"枚50円は"+c+"枚10円は"+d+"枚5円は"+e+"枚1円は"+f+"枚です。");
    }
}