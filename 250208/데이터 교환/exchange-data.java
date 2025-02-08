public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 5, b = 6, c = 7, tmp1, tmp2;
        tmp1 = b; tmp2 = c; b = a; c = tmp1; a = tmp2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //int tmp, a = 5, b = 6, c =7;
        // tmp = a; a = c ; c = b; b = tmp;

    }
}