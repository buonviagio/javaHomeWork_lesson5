package online_store;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serializable {
    public static final String FILE_NAME = "src//online_store//BasketSer.ser";

    public void serialize(Basket basket) {
        try (FileOutputStream fs = new FileOutputStream(FILE_NAME);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
             os.writeObject(basket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Basket deserialize() {
        try (FileInputStream fs = new FileInputStream(FILE_NAME);
             ObjectInputStream os = new ObjectInputStream(fs)) {
            Basket basket;
            basket = (Basket) os.readObject();
            return basket;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
