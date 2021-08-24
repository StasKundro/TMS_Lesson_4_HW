/**
 * Вывести на экран в одну строку два первых блока по 4 цифры
 * Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
 * Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
 * Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder)
 * Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
 * Проверить начинается ли номер документа с последовательности 555.
 * Проверить заканчивается ли номер документа на последовательность 1a2b.
 */
public class LessonFourFirst {
    public static void main(String[] args) {
        String str = new String("2314-AbС-7462-PkP-4X2X");
        System.out.println(str.substring(0, 4) + str.substring(9, 13));
        System.out.println(str.substring(0, 5) + "***" + str.substring(8, 14) + "***" + str.substring(17));
        System.out.println(str.toLowerCase().substring(5, 8) + "/" + str.toLowerCase().substring(14, 17) + "/" + str.toLowerCase().substring(19, 20) + "/" + str.toLowerCase().substring(21, 22));

        StringBuilder sb = new StringBuilder();
        sb.append("\"Letters:");
        sb.append(str.toUpperCase().substring(5, 8) + "/");
        sb.append(str.toUpperCase().substring(14, 17) + "/");
        sb.append(str.toUpperCase().substring(19, 20) + "/");
        sb.append(str.toUpperCase().substring(21, 22) + "/");
        System.out.println(sb);

        String[] array = str.split("-");
        if (array[1].toLowerCase().equals("abc")) {
            System.out.println("abc - есть");
        } else if (array[3].toLowerCase().equals("abс")) {
            System.out.println("abc - есть");
        } else {
            System.out.println("abc - нет");
        }

        if (str.startsWith("555")) {
            System.out.println("Начинается с 555");
        } else {
            System.out.println("Не начинается с 555");
        }

        if (str.toLowerCase().endsWith("1a2b")) {
            System.out.println("Заканчивается на 1a2b");
        } else {
            System.out.println("Не заканчивается на 1a2b");
        }


    }
}
