import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("~Мій щоденник~");
        mynote();
    }
    public static void mynote() {
        LocalDate[] massdat = new LocalDate[5];
        String[] str1 = new String[5];
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        try {
        while (true) {
            for (int i = 0; i < massdat.length; i++) {
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
                    System.out.println(Arrays.toString(massdat));
                    System.out.println(Arrays.toString(str1));

//        System.out.println("Бажаете видалити деякий запис?: ");
//        String str2 = sc2.nextLine();
//        if(str2.equals("Так")) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Введіть рік який хочете видалити: ");
//            int data1 = scanner.nextInt();
//            System.out.println("Введіть місяць який хочете видалити: ");
//            int data2 = scanner.nextInt();
//            System.out.println("Введіть день який хочете видалити: ");
//            int data3 = scanner.nextInt();
//            if(data1 == year && data2 == month && data3 == day) {
//                massdat[i] = null;
//                System.out.println(Arrays.toString(massdat));
//            }
//        } else if(str2.equals("Ні")) {
//            continue;
//        }

            }
        }
    } catch (DateTimeException e) {
            System.out.println("Ви ввели не вірну дату: " + e.getMessage());
        }
        }
}