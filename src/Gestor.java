//SUBCLASSE

public class Gestor extends Funcionarios {
    
    //atributos são herdados automaticamente
    private int numEquipe;
    private String equipe;
   

    //construtores

    public Gestor(String nome, String endereco, double salario, int numEquipe, String equipe){
        super (nome, endereco, salario); //chamar construtor da superclasse
        this.numEquipe = numEquipe;
        this.equipe = equipe;
    }

    //getters e setters
    public int getNumEquipe(){
        return numEquipe;
    }
    public void setNumEquipe(int numEquipe){
        this.numEquipe = numEquipe;
    }
    public String getEquipe(){
        return equipe;
    }
    public void setEquipe(String equipe){
        this.equipe = equipe;
    }
   

    //metodos sao herdados mas é possivel alterar

}
