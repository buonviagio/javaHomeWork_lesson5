package task3;

public enum FourSeasons {
    WINTER(-10, "Холодное время года"), SPRING(15, "Теплое время года"), SUMMER(25, "Жаркое время года"), AUTUMN(10, "Прохладное время года");

    private int temperature;
    private String description;

    FourSeasons(int t, String d){
        temperature = t;
        description = d;
    }

    int getTemperature(){
        return temperature;
    }

    void getDescription(FourSeasons description){
        System.out.println(description);
    }

    void getDescription(){
        System.out.println();
    }

}
