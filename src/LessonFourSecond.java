/**
 * Найти самое короткое слово в строке и вывести его на экран.
 * Найти самое длинное слово в строке и вывести его на экран.
 * Если таких слов несколько, то вывести последнее из них.
 */
public class LessonFourSecond {
    public static void main(String[] args) {
        String str = new String("Найти самое короткое слово в строке и вывести его на экран");
        String[] array = str.split(" ");
        String min = array[0];
        String max = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (min.length() >= array[i].length())
                min = array[i];
        }
        for (int i = 1; i < array.length; ++i) {
            if (max.length() <= array[i].length())
                max = array[i];
        }
        System.out.println("Самое короткое: " + min);
        System.out.println("Самое длинное: " + max);
    }
}
