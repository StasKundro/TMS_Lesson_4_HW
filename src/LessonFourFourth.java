import java.util.Scanner;

public class LessonFourFourth {

    public static void main(String[] args) {

        String s = new String("abca aba bbcc");
        String[] a = s.split(" ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i <= a.length)
            palindrome(a[i - 1]);
        else
            System.out.println("такого слова нет");
    }

    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }

    public static Boolean palindrome(String s) {
        if (s.equals(reverse(s))) {
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
        return s.equals(reverse(s));
    }
}
