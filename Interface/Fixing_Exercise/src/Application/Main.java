package Application;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        List<Installment> installments = new ArrayList<>();

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero:");
        Integer number = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy):");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.println("Valor do contrato");
        Double value = sc.nextDouble();
        System.out.println("Entre com o numero de parcelas:");
        int numberInstallmentes = sc.nextInt();

        Contract contract = new Contract(number, date, value);

        System.out.println("Pacelas");
        for( Installment i : installments){
            System.out.println(i);
        }





    }
}