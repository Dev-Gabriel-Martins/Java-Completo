package BalaCanhao;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        
    System.out.println ("Digite a velocidade inicial");
    double veloInit = sc.nextDouble();

    System.out.println("Digite o angulo do lançamento");
    double angulo = sc.nextDouble();
    
    Canhao ch =new Canhao();

    ch.disparar(veloInit, angulo);

    System.out.println("O Alcance maximo da bala é " + ch.getAlcanceMaximo());

    



    sc.close();
    }
}