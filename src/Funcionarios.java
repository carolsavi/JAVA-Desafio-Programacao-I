public class Funcionarios {
    private String nome;
    private String endereco;
    private double salario;


    //construtor

    public Funcionarios(String nome, String endereco, double salario){
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

    //getters e setters

    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public double getSalario(){
        return salario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    //metodos




    //método tostring

    public String toString(){
        return ("Nome do funcionário: " + nome + "\nEndereço: " + endereco + "\nSalário: " + salario);
    }

}
