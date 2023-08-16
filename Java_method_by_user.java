package hello.com;
import java.util.Scanner;
public class Java_method_by_user {
    static int logic(int x, int y, int z){
        int u;
        if (x>y){
            u = x*y/z;

        }
        else {
            u = (x+y)*z;
        }
        return u;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        System.out.print("Enter the value of c:");
        int c = sc.nextInt();
        int d;
        d = logic(a, b, c);
        System.out.println(d);
    }
}
