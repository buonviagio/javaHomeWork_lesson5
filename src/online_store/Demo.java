package online_store;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Goods travelSpain = new Goods("travel to Spain", 1650, 3);
        Goods travelGreece = new Goods("travel to Greece", 1200, 3);
        Goods traveEgypt = new Goods("travel to Egypt", 1000, 4);
        Goods travelTurkey = new Goods("travel to Turkey", 1200, 5);
        Goods travelThailand = new Goods("travel to Thailand", 1500, 4);
        Goods travelGerman = new Goods("travel to German", 1700, 3);
        Goods travelSwitzerland = new Goods("travel toSwitzerland", 2000, 5);
        Goods travelFrance = new Goods("travel to France", 2100, 5);

        Goods[] array = {travelSpain, travelGreece, traveEgypt, travelTurkey, travelThailand, travelGerman, travelSwitzerland, travelFrance};

        Category beachHolidays = new Category("beachHolidays", new Goods[]{traveEgypt, travelTurkey, travelSpain, travelGreece});
        Category excursion = new Category("excursion", new Goods[]{travelSwitzerland, travelGerman});
        Category skiVacation = new Category("skiVacation", new Goods[]{travelSwitzerland, travelFrance});

        Category[] categories = {beachHolidays, excursion, skiVacation};

        Basket basket = new Basket();

        Scanner log = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = log.nextLine();
        System.out.println("Введите пароль: ");
        String pass = log.nextLine();

        User user1 = new User("Fedor", "A1234", new Basket(array));
        User user = new User("Dmitry", "B1234", new Basket(array));
        User user3 = new User("Nikolay", "C1234", new Basket(array));

        User[] users = {user1, user, user3};

        for (int i = 0; i < users.length; i++) {
            if (users[i].getLogin().equals(login) && users[i].getPassword().equals(pass)) {
                System.out.println("Вы авторизированный пользователь, Вам доступны следующие возсожности:");
                System.out.println("Просмотр категорий отдыха - SHOWCATEGORY");
                System.out.println("Просмотр туристических пакетов - SHOWGOODS");
                System.out.println("Выбор туристического пакета в корзину - CHOICEGOODS");
                System.out.println("Купить продукт - BUYGOODS");
                System.out.println("Введите команду:");
                break;
            }
            if (i == users.length - 1)
                System.out.println("Вам необходима регистрация");
        }

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        Action action = Action.valueOf(tmp);

        switch (action) {
            case SHOWCATEGORY:
                System.out.println("Вам досткпны категории:");
                for (Category a : categories) {
                    System.out.println(a.getName());
                }
                break;
            case SHOWGOODS:
                System.out.println("Выберите одну из категорий отдыха: Морской отдых - beachHolidays, Экскурсии - excursion, Катание на лыжах - skiVacation");
                String a = sc.nextLine();
                if (beachHolidays.getName().equals(a)) {
                    for (Goods b : beachHolidays.getArrayGoods()) {
                        System.out.println(b.getName());
                    }
                }
                if (excursion.getName().equals(a)) {
                    for (Goods b : excursion.getArrayGoods()) {
                        System.out.println(b.getName());
                    }
                }
                if (skiVacation.getName().equals(a)) {
                    for (Goods b : skiVacation.getArrayGoods()) {
                        System.out.println(b.getName());
                    }
                }
                break;
            case CHOICEGOODS:
                System.out.println("Выберите продукт, указавши его имя_");
                String c = sc.nextLine();
                for (int i = 0; i < array.length; i++) {
                    if (array[i].getName().equals(c)) {
                        basket.setPurchasedFoods(new Goods[]{array[i]});
                        break;
                    }
                }
                basket.returnRating();
            case BUYGOODS:
                System.out.println("Вам необходимо оплатить: " + basket.returnPrise() + " условных единиц");
        }
    }
}

