package List.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        
        List<String> list = new ArrayList<>();
        
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add(2,"Marco");
        
        System.out.println(list.size());
        for(String x : list){
        System.out.println(x);
        }
       /*Terminal:
         Maria
         Alex
         Marco
         Bob
        */
        
        System.out.println("-------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for(String x : list){
        System.out.println(x);
        }
        
       /* .removeif removendo todos que inician com a letra 'M'
        Terminal:
        -------------------
        Alex
        Bob
        
        */
        
        System.out.println("-------------------");
        System.out.println("Index of Bob: "+list.indexOf("Bob"));
        System.out.println("Index of Bob: "+list.indexOf("Marco"));
        /* .indexOf retorna o valor do indice de cada valor
            No caso "marcos" e voltado o valor -1 visto que não marco na lista mais
        
        Terminal:
        -------------------
        Index of Bob: 1
        Index of Bob: -1
        
        */
        
        System.out.println("-------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x: result){
            System.out.println(x);
        }
        /* Criando uma nova List e passando apenas quem começa com letra A
           necessario converter para .stream e depois para colleção denovo. 
        Terminal:
        -------------------
        Alex
        
        */
        
        System.out.println("-------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
        System.out.println(name);
                
       /* E possivel passar valores por uma lista pelo medo .stream
        *Terminal:
        -------------------
        * null
        */
        
        
    }
}
