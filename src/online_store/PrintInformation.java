package online_store;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintInformation {
    public void printInformation(Basket basket) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("src//online_store//buffWriter.txt"))) {
            for (int i = 0; i < basket.getPurchasedFoods().size(); i++) {
                String text = basket.getPurchasedFoods().get(i).getName();
                Integer price = basket.getPurchasedFoods().get(i).getPrice();
                bufferedWriter.write(text);
                bufferedWriter.newLine();
                bufferedWriter.write(price);
                bufferedWriter.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
