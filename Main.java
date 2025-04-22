import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
        public static void menu() {
        LocalDate[] massdat = new LocalDate[5];
        String[] str1 = new String[5];
            System.out.println("~Мій щоденник~");
            mynote(massdat, str1);
    }
    public static LocalDate[] mynote(LocalDate[] massdat, String[] str1) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        while (true) {
            try {
            for (int i = 0; i < massdat.length; i++) {
                if (i > 5) {
                    System.out.println("Список повний.");
                    System.out.println("Бажаєте перевірити записи?: ");
                    String str2 = sc3.nextLine();
                    if (str2.equals("Так")) {
                        System.out.println(Arrays.toString(massdat));
                        System.out.println(Arrays.toString(str1));
                        System.out.println("Бажаєте повернутися на головне меню?: ");
                        String string = sc3.nextLine();
                        if (string.equals("Так")) {
                            menu();
                        }
                    }
                } else if (i < 5) {
                    System.out.println("Введіть рік: ");
                    int year = sc.nextInt();
                    System.out.println("Введіть місяць: ");
                    int month = sc.nextInt();
                    System.out.println("Введіть день: ");
                    int day = sc.nextInt();
                    LocalDate data = LocalDate.of(year, month, day);
                    System.out.println("Введіть запис на цю дату: ");
                    String str = sc1.nextLine();
                    System.out.println("Ваша дата: " + data);
                    System.out.println("Ваш запис: " + str);
                    massdat[i] = data;
                    str1[i] = str;
                    System.out.println("Бажаєте перевірити записи?(якщо ні, натисніть Enter): ");
                    String str2 = sc3.nextLine();
                    if (str2.equals("Так")) {
                        System.out.println(Arrays.toString(massdat));
                        System.out.println(Arrays.toString(str1));
                    }
                }
            }
            }catch (DateTimeException e) {
            System.out.println("Ви ввели не вірну дату: " + e.getMessage());
        }
        return massdat;
}
}
        }