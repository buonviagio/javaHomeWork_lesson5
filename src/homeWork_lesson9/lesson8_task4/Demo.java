package homeWork_lesson9.lesson8_task4;

public class Demo {
    public static void main(String[] args) {

        int roseCount = 0, tulipCount = 0, carnationCount = 0, lilacCount = 0;
        double roseSummPrise = 0.0, tulipSummPrise = 0.0, carnationSummPrise = 0.0, lilacSummPrise = 0.0;

        Roses roses = new Roses("Ukraine", "20.12.2018", 25.0, "rot");
        Tulips tulips = new Tulips("Netherland", "25.12.2018", 15.0, "yellow");
        Carnation carnation = new Carnation("German", "22.12.2018", 18.0, "rose");
        Lilac lilac = new Lilac("Italy", "27.12.2018", 23.0, "blue");

        //Flower[] bouquet1 = {roses, carnation, roses};
        //Flower[] bouquet2 = {tulips, roses, carnation};
        //Flower[] bouquet3 = {lilac, roses, tulips};

        Flower[][] flower = {{roses, carnation, roses},
                {tulips, roses, carnation},
                {lilac, roses, tulips},
                {lilac, roses, lilac}};

        for (Flower[] a : flower) {
            for (Flower b : a) {
                if (b == roses) {
                    Roses.setCount(++roseCount);
                    roseSummPrise += roses.getPrice();
                }
                if (b == tulips) {
                    Tulips.setCount(++tulipCount);
                    tulipSummPrise += tulips.getPrice();
                }
                if (b == carnation) {
                    Carnation.setCount(++carnationCount);
                    carnationSummPrise += carnation.getPrice();
                }
                if (b == lilac) {
                    Lilac.setCount(++lilacCount);
                    lilacSummPrise += lilac.getPrice();
                }
            }
        }

        for (int i = 0; i < flower.length; i++) {
            double summ = 0;
            for (int j = 0; j < flower[0].length; j++) {
                summ += flower[i][j].getPrice();
            }
            System.out.println("Цена букета " + (i + 1) + ": " + summ);
        }

        System.out.println("Продано роз: " + Roses.getCount() + " штуки, на сумму " + roseSummPrise + " гривен  " + roses);
        System.out.println("Продано тюльпанов: " + Tulips.getCount() + " штуки, на сумму " + tulipSummPrise + " гривен  " + tulips);
        System.out.println("Продано гвоздик: " + Carnation.getCount() + " штуки, на сумму " + carnationSummPrise + " гривен  " + carnation);
        System.out.println("Продано сирени: " + Lilac.getCount() + " штуки, на сумму " + lilacSummPrise + " гривен  " + lilac);
    }
}
