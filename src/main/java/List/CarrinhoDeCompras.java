package List;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer qtd){
        itemList.add(new Item(nome, preco, qtd));
    }

    public void removerItem(String nome){
        List<Item> itemARemover = new ArrayList<>();
        for (Item i: itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemARemover.add(i);
            }
        }
        itemList.removeAll(itemARemover);
    }

    public int obterTotalDeItens(){
        return itemList.size();
    }

    public void obterDescricaoItem(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        System.out.println("O número total de item no carrinho é: " + carrinho.obterTotalDeItens());

        carrinho.adicionarItem("Tv", 1999.99, 3);
        carrinho.adicionarItem("IPhone", 5999.99, 5);
        carrinho.adicionarItem("Geladeira", 7999.99, 1);
        System.out.println("O número total de item no carrinho é: " + carrinho.obterTotalDeItens());

        carrinho.removerItem("Tv");
        System.out.println("O número total de item no carrinho é: " + carrinho.obterTotalDeItens());

        carrinho.obterDescricaoItem();

    }



}
