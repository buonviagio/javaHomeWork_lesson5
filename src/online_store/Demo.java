package online_store;

import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Goods travelSpain = new Goods("travel to Spain", 1650, 3);
        Goods travelGreece = new Goods("travel to Greece", 1200, 3);
        Goods travelEgypt = new Goods("travel to Egypt", 1000, 4);
        Goods travelTurkey = new Goods("travel to Turkey", 1200, 5);
        Goods travelThailand = new Goods("travel to Thailand", 1500, 4);
        Goods travelGerman = new Goods("travel to German", 1700, 3);
        Goods travelSwitzerland = new Goods("travel to Switzerland", 2000, 5);
        Goods travelFrance = new Goods("travel to France", 2100, 5);

        List<Goods> arrayList = List.of(travelSpain, travelGreece, travelEgypt, travelTurkey, travelThailand, travelGerman, travelSwitzerland, travelFrance);

        Category beachHolidays = new Category("beachHolidays", List.of(travelEgypt, travelTurkey, travelSpain, travelGreece));
        Category excursion = new Category("excursion", List.of(travelSwitzerland, travelGerman));
        Category skiVacation = new Category("skiVacation", List.of(travelSwitzerland, travelFrance));

        List<Category> categories = List.of(beachHolidays, excursion, skiVacation);

        Basket basket = new Basket();

        User user1 = new User("Fedor", "A1234", new Basket());
        User user = new User("Dmitry", "B1234", new Basket());
        User user3 = new User("Nikolay", "C1234", new Basket());

        List<User> users = List.of(user1, user, user3);
        Scanner sc = new Scanner(System.in);

        if (authentication(users, sc)) {
            while (true) {
                System.out.println("Вы авторизированный пользователь, Вам доступны следующие возможности:");
                System.out.println("Просмотр категорий отдыха - SHOW_CATEGORY");
                System.out.println("Просмотр туристических пакетов - SHOW_GOODS");
                System.out.println("Выбор туристического пакета в корзину - CHOICE_GOODS");
                System.out.println("Введите команду:");
                String tmp = sc.nextLine();
                Action action = Action.valueOf(tmp);
                switch (action) {
                    case SHOW_CATEGORY:
                        System.out.println("Вам доступны категории:");
                        for (Category a : categories) {
                            System.out.println(a.getName());
                        }
                        break;
                    case SHOW_GOODS:
                        System.out.println("Выберите одну из категорий отдыха: Морской отдых - beachHolidays, Экскурсии - excursion, Катание на лыжах - skiVacation");
                        String a = sc.nextLine();
                        chooseCategory(beachHolidays, a);
                        chooseCategory(excursion, a);
                        chooseCategory(skiVacation, a);
                        break;
                    case CHOICE_GOODS:
                        System.out.println("Выберите продукт, указавши его имя_");
                        String c = sc.nextLine();
                        for (Goods good : arrayList) {
                            if (good.getName().equals(c)) {
                                basket.addGood(good);
                                break;
                            }
                        }
                        basket.returnRating();
                        break;
                    case BUY_GOODS:
                        System.out.println("Вы приобрели: ");
                        basket.printGoods();
                        System.out.println("Вам необходимо оплатить: " + basket.returnPrise() + " условных единиц");
                        basket.getDate();
                }
            }
        }
    }

    private static boolean authentication(List<User> users, Scanner log) {
        System.out.println("Введите логин: ");
        String login = log.nextLine();
        System.out.println("Введите пароль: ");
        String pass = log.nextLine();
        if (Authentication.authenticate(login, pass)) {

            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getLogin().equals(login) && users.get(i).getPassword().equals(pass)) {
                    return true;
                }
                if (i == users.size() - 1) {
                    System.out.println("Вам необходима регистрация");
                    return false;
                }
            }
        }
        return false;
    }

    private static void chooseCategory(Category category, String a) {
        if (category.getName().equals(a)) {
            for (Goods b : category.getArrayGoods()) {
                System.out.println(b.getName());
            }
        }
    }
}

