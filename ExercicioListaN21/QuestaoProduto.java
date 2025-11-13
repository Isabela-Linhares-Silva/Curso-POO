package ExercicioListaN21;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestaoProduto {
    public static void main(String[] args) {
        

        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto("caneta",2.50));
        produtos.add(new Produto("borracha",0.50));
        produtos.add(new Produto("caderno",15.50));

        double soma = 0 ;
        for (int i = 0; i < produtos.size(); i++) {
            soma += produtos.get(i).getPreco();
        }
        System.out.println(soma); 

        Produto encontrado = mostraProduto(produtos);
        if (encontrado != null) {
            System.out.println("Produto encontrado: " + encontrado.getNome() +
           " - Preço: R$" + encontrado.getPreco());
        } else {
            System.out.println("Produto não encontrado!");
        }
        
    }
    public static Produto mostraProduto(ArrayList<Produto> p){
    Scanner sc = new Scanner(System.in);
    String name;
    System.out.println("Qual produto vc deseja informaçoes? ");
    name = sc.nextLine();
    sc.close();
    for (int i = 0; i < p.size(); i++) {
        if (p.get(i).getNome().equals(name)) {
                return p.get(i);
            }
        }
    
    return null;
    }   
}




// 4️⃣ Faça um método que busque um produto pelo nome e retorne o objeto correspondente, ou null se não existir.
// ➡️ Simula busca genérica de elementos.