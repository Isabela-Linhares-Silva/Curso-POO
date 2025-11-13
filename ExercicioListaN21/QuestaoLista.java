package ExercicioListaN21;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestaoLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Isa");
        lista.add("Joao");
        lista.add("Nina");
        System.out.println(lista);

        System.out.print("Qual nome quer excluir? ");
        String nome = sc.nextLine();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(nome)) {
                lista.remove(i);
            }
        }
        System.out.println(lista);


        
        sc.close();
    }
}
