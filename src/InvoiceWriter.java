import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceWriter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Data> list = new ArrayList<>();

        System.out.print("Address (No Commas): ");
        String address = in.nextLine();
        list.add(new Data(address));

        while (SafeInput.getYNConfirm(in, "Add a product to the data chart?")) {
            System.out.print("item: ");
            String item = in.nextLine();
            System.out.print("Quantity: ");
            int qty = in.nextInt();
            System.out.print("Price per unit: ");
            double price = in.nextDouble();

            list.add(new Data(item, qty, price));
        }

        String textFileName = SafeInput.getNonZeroLenString(in, "\nEnter text file name");

        try {
            PrintWriter writer = new PrintWriter(textFileName);

            for(Data var : list) {
                if (var == list.get(0)) {
                    writer.println(var.getAddress());
                }
                writer.println(var.toCSV1());
            }
            writer.close();
            System.out.println("Data file written!");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}