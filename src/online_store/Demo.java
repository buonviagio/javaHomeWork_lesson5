package online_store;

import java.io.File;
import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Basket basket = new Basket();
        RetrieveData retrieveData = new RetrieveData();
        Serializable serializable = new Serializable();
        PrintInformation printInformation = new PrintInformation();
        File file = new File("src//online_store//BasketSer.ser");

        List<Goods> listGoods = retrieveData.getGoods();
        List<Goods> listBeachHolidays = retrieveData.getBeachHolidays();
        List<Goods> listExcursion = retrieveData.getExcursion();
        List<Goods> listSkiVacation = retrieveData.getSkiVakation();

        Category beachHolidays = new Category("beachHolidays", listBeachHolidays);
        Category excursion = new Category("excursion", listExcursion);
        Category skiVacation = new Category("skiVacation", listSkiVacation);

        List<Category> categories = List.of(beachHolidays, excursion, skiVacation);

        User user1 = new User("Fedor", "A1234", new Basket());
        User user2 = new User("Dmitry", "B1234", new Basket());
        User user3 = new User("Nikolay", "C1234", new Basket());

        Map<String, User> users = Map.of(
                user1.getLogin(), user1,
                user2.getLogin(), user2,
                user3.getLogin(), user3);
        Scanner sc = new Scanner(System.in);

        if (authentication(users, sc)) {
            basketSerialize(basket, serializable, file, sc);
            System.out.println("Вы авторизированный пользователь, Вам доступны следующие возможности:");
            while (true) {
                System.out.println(" - SHOW_CATEGORY - SHOW_GOODS - CHOICE_GOODS - SHOW_BASKET - BUY_GOODS - EXIT");
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
                        System.out.println("Выберите категорию:  - beachHolidays - excursion - skiVacation");
                        String a = sc.nextLine();
                        for (Category categories1 : categories) {
                            if (categories1.getName().equals(a)) {
                                chooseCategory(categories1, a);
                            }
                        }
                        break;
                    case CHOICE_GOODS:
                        System.out.println("Выберите продукт, указавши его имя_");
                        String c = sc.nextLine();
                        for (Goods good : listGoods) {
                            if (good.getName().equals(c)) {
                                basket.addGood(good);
                                break;
                            }
                        }
                        basket.returnRating();
                        break;
                    case SHOW_BASKET:
                        basket.printGoods();
                        if (basket.getPurchasedFoods().size()==0){
                            System.out.println("Корзина пуста");
                        }
                        break;
                    case BUY_GOODS:
                        if (basket.getPurchasedFoods().size()!=0) {
                            System.out.println("Вы приобритаете: ");
                            basket.printGoods();
                            System.out.println("Вам необходимо оплатить: " + basket.returnPrise() + " euro");
                            basket.getDate();
                            printInformation.printInformation(basket);
                            basket = null;
                        }else {
                            System.out.println("Корзина пуста");
                        }
                        break;
                    case EXIT:
                        if (basket != null) {
                            serializable.serialize(basket);
                        } else {
                            file.delete();
                        }
                        System.exit(0);
                }
            }
        }
    }

    private static void basketSerialize(Basket basket, Serializable serializable, File file, Scanner sc) {
        if (file.exists()) {
            Basket tmp0 = serializable.deserialize();
            List<Goods> tmpList = tmp0.getPurchasedFoods();
            if (tmpList.size() > 0) {
                System.out.println("У Вас в корзине имеется не оплаченный товар, " + tmp0 + " если Вы хотите его приобрести введите - EDD " +
                        "Если желаете очистить корзину, введите любой символ");
                String f = sc.nextLine();
                if (f.equals("EDD")) {
                    for (int i = 0; i < tmpList.size(); i++) {
                        basket.addGood(tmpList.get(i));
                        System.out.println("Toвар добавлен в корзину:");
                        basket.printGoods();
                    }
                }
            }
        }
    }

    private static boolean authentication(Map<String, User> users, Scanner log) {
        System.out.println("Введите логин: ");
        String login = log.nextLine();
        System.out.println("Введите пароль: ");
        String pass = log.nextLine();
        if (Authentication.authenticate(login, pass)) {
            User user = users.get(login);
            if (user != null && user.getPassword().equals(pass)) {
                return true;
            } else {
                System.out.println("Такого пользователя нет, Вам необходимо регестрироваться");
                return false;
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

