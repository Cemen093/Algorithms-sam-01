import java.util.HashMap;
import java.util.Scanner;

public class AlgorithmsSam01 {
    public static void main(String[] args) {
        HashMap<String, Product> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        map.put("Пароль от сейфа где деньги лежат", new Product("Пароль от сейфа где деньги лежат", "2416", 4));
        map.put("Имя домашнего питомца", new Product("Имя домашнего питомца", "c3po", 1));
        map.put("Где детонатор?", new Product("Где детонатор?", "У сдучайного прохожего", 9999));

        two: do {
            System.out.println("Добавить товар - (добавить)\n" +
                    "Вывести каталог на экран - (вывод)\n" +
                    "Поиск нужного элемента по ключу - (поиск)\n" +
                    "Выход - (выход)\n");
            switch (scanner.nextLine()) {
                case "добавить":
                    System.out.println("Введите имя продукта");
                    String name = scanner.nextLine();
                    System.out.println("Введите значение продукта");
                    String value = scanner.nextLine();
                    System.out.println("Введите количество продукта");
                    int namber = Integer.parseInt(scanner.nextLine());
                    Product tmp = map.get(name);
                    if (tmp == null) {
                        map.put(name, new Product(name, value, namber));
                    }
                    else{
                        tmp.addNumber(1);
                    }

                    break;
                case "вывод":
                    for (Product a:map.values()) {
                        System.out.println(a);
                    }
                    break;
                case "поиск":
                    System.out.println("Введите название продукта");
                    String tmp2 = scanner.nextLine();
                    System.out.println((map.get(tmp2) == null) ? "Не найдено": map.get(tmp2));
                    break;
                case "выход":
                    break two;
                default:
                    System.out.println("Ошибка ввода\n");
                    break;
            }
        }while (true);

        System.out.println(map.get("abs2"));
    }
}
