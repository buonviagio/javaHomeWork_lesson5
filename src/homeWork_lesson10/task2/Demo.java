package homeWork_lesson10.task2;

public class Demo {
    public static void main(String[] args) {
        Instrument[] instruments = {new Guitar(7), new Drum(7), new Trumpet(20)};

        for (Instrument a : instruments){
            a.play();
        }
    }
}
