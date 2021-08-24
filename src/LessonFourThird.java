/**
 * Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
 * Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */
public class LessonFourThird {
    private static int Words(String st) {
        StringBuffer z = new StringBuffer();
        String x;
        for (int i = 0; i < st.length(); i++) {
            x = String.valueOf(st.charAt(i));
            if (z.indexOf(x) == -1)
                z.append(x);
        }

        return z.length(); // возвращаем длину получившейся строки
    }

    public static void main(String[] args) {
        String str = new String("aa1scs erd ff4ff sd4");
        String[] a = str.split(" ");
        String goal = a[0];
        for (int i = 0; i < a.length; i++) {
            if (Words(a[i]) < Words(goal))
                goal = a[i];
        }
        System.out.println("");
        System.out.println("Искомое слово: " + goal);

    }
}