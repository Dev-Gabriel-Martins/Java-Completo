package pkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "g:\\input.csv";
        List<Product> list = new ArrayList<Product>();

        File sourceFile = new File(path);

        //Create folder \out
        boolean sucess = new File(sourceFile.getParent() + "\\out").mkdir();

        //Create file in folder \out
        String targetFileStr = sourceFile.getParent() + "\\out\\summary.csv";

        // Cada vezes que while gira, ele le um nova linha e
        //Cada linha do .readline vai se tornar um String List,
        // a onde eu vou separar os valores pelo .split
        // e carregar pela posicao no objeto
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for(Product item: list){
                    bw.write(item.getName() + "," + item.totalPrice());
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }

}
