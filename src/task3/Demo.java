package task3;

public class Demo {
    public static void main(String[] args) {
        FourSeasons mySeason = FourSeasons.SPRING;

        switch (mySeason){
            case WINTER:
                System.out.println("I like winter");
                break;
            case SPRING:
                System.out.println("I like spring");
                break;
            case SUMMER:
                System.out.println("I like summer");
                break;
            case AUTUMN:
                System.out.println("I like autumn");
                break;
        }



        FourSeasons[] seasons = FourSeasons.values();
        for (FourSeasons a : seasons){
            System.out.println(a + " " + a.getTemperature());
        }
    }
}
