//SUBCLASSE

public class Veterinario extends Funcionarios {
    
    //atributos são herdados automaticamente
        private String especialidade;
        private String crmv;

    //construtores

    public Veterinario(String nome, String endereco, double salario, String especialidade, String crmv){
        super (nome, endereco, salario); //chamar construtor da superclasse
        this.especialidade = especialidade;
        this.crmv = crmv;
    }

    //getters e setters

    public String getEspecialidade(){
        return especialidade;
    }
    public String getCrmv(){
        return crmv;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public void setCrmv(String crmv){
        this.crmv = crmv;
    }

    //metodos sao herdados mas é possivel alterar



}
