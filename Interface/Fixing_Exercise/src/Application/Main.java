package Application;

import model.entities.Installment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero:");
        Integer number = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy):");
        LocalDateTime data = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("Valor do contrato");
        Double value = sc.nextDouble();

        System.out.println("Pacelas");
        LinkedList<Installment> installments = new LinkedList<>();


        for( Installment i : installments){
            System.out.println(i);
        }





    }
}