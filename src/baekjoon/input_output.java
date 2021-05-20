package baekjoon;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        // 2557. Hello World
        // System.out.println("Hello World!");

        // 10718. We love kriii
        // System.out.print("강한친구 대한육군\n강한친구 대한육군");

        // 10171. 고양이
        // System.out.println("\\    /\\");
        // System.out.println(" )  ( ')");
        // System.out.println("(  /  )");
        // System.out.print(" \\(__)|");

        // 10172. 개
        // System.out.println("|\\_/|");
        // System.out.println("|q p|   /}");
        // System.out.println("( 0 )\"\"\"\\");
        // System.out.println("|\"^\"`    |");
        // System.out.println("||_/=\\\\__|");

        // 10000. A+B
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(a+b);

        // 10001. A-B
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(a-b);

        // 10998. AxB
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(a*b);

        // 1008. A/B
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println((double) a/b);

        // 10869. 사칙연산
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(a+b);
        // System.out.println(a-b);
        // System.out.println(a*b);
        // System.out.println(a/b);
        // System.out.println(a%b);

        // 10430. 나머지
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        //
        // System.out.println((a+b)%c);
        // System.out.println(((a%c)+(b%c))%c);
        // System.out.println((a*b)%c);
        // System.out.println(((a%c) * (b%c))%c);

        // 2588. 곱셈
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();

        char [] arr = b.toCharArray();
        for(int i = arr.length -1; i >= 0; i--){
        int change = Integer.parseInt(String.valueOf(arr[i]));
        System.out.println(a * change);
        }
        System.out.println(a * Integer.parseInt(b));
    }
}
