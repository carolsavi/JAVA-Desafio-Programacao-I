//CLASSE PRODUTO
import java.util.Scanner;

public class Produto {
   
    Scanner scanner = new Scanner(System.in);

   //atributos
    private String nome;
    private double preco;
    private String descricao;
    private static final int numMaximo = 1000; //quantidade máxima de produtos que tem capacidade de estocar
    private int estoqueAtual = 0;
    private Produto[] arrayEstoque;
    
    //construtores

    public Produto(String nome, double preco, String descricao){
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    //getters e setters

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public int getEstoqueAtual(){
        return estoqueAtual;
    }
    public void setEstoqueAtual(int estoqueAtual){
        this.estoqueAtual = estoqueAtual;
    }

    

    //Descrição básica de como realizar as possíveis ações do sistema: cadastro, busca e exclusão

   
 
    //MÉTODO ADICIONAR PRODUTO

        public void addProduto(Produto produto){
            if (estoqueAtual >= numMaximo){
            System.out.println("O estoque já está cheio.");
         }
            else{
                arrayEstoque[estoqueAtual] = produto;
                estoqueAtual ++;
                System.out.println("Produto adicionado ao estoque.");
            }
         }

    //MÉTODO BUSCAR PRODUTO PELO NOME

    public void pesquisarProduto(String nome){
        boolean encontrado = false;
        for (int i=0; i<estoqueAtual; i++){
            if ((arrayEstoque[i].getNome()).equalsIgnoreCase(nome)){
                System.out.println("Produto encontrado:");
                System.out.println("Nome: " + arrayEstoque[i].getNome());
                System.out.println("Preço: " + arrayEstoque[i].getPreco());
                encontrado = true;
            }
        }
            if (!encontrado){
                System.out.println("Produto não encontrado.");
            }
        }

    //MÉTODO EXIBIR ESTOQUE

        public void exibirEstoque(){
            System.out.println("---ESTOQUE---");
            
            if (estoqueAtual>0){
                for (int i=0; i<arrayEstoque.length; i++){
                    System.out.println("Produto " + i + ": " + arrayEstoque[i].getNome() + " - Preço: " + arrayEstoque[i].getPreco());
                }
            } else{
                System.out.println("O estoque está vazio.");
            }
        }

    //MÉTODO REMOVER PRODUTO


    public void removerProduto(String nome){
        if(estoqueAtual <= 0){
            System.out.println("O estoque já está vazio.");
        }
        else{
            for(int i = 0; i<estoqueAtual; i++){
                if ((arrayEstoque[i].getNome()).equalsIgnoreCase(nome)){
                    arrayEstoque[i] = arrayEstoque[i + 1];
                    
                }
            }
                arrayEstoque[estoqueAtual - 1] = null;
                estoqueAtual --;
                System.out.println("Produto removido do estoque.");
        }
    }

    //método tostring

    public String toString(){
        return ("Produto: " + nome + "\nPreço: " + preco + "\nDescrição: " + descricao);
    }

}
