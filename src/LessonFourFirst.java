import java.util.Locale;

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
        } else{
            System.out.println("abc - нет");
        }

        if(str.startsWith("555")){
            System.out.println("Начинается с 555");
        }
        else{
            System.out.println("Не начинается с 555");
        }

        if(str.toLowerCase().endsWith("1a2b")){
            System.out.println("Заканчивается на 1a2b");
        }else{
            System.out.println("Не заканчивается на 1a2b");
        }


    }
}
