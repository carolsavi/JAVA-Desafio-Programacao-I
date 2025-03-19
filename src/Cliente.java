public class Cliente {
    private String nome;
    private String endereco;
    private Pets pet;
    private int numClientes = 0;
    private Cliente[] arrayClientes;
     
     
    
 

//construtor
    public Cliente(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public Cliente(String nome, String endereco, Pets pet){
        this.nome = nome;
        this.endereco = endereco;
        this.pet = pet;
    }
    
//metodos
public String getNome(){
    return nome;
}
public String getEndereco(){
    return endereco;
}
public void setNome(String nome){
    this.nome = nome;
}
public void setEndereco(String endereco){
    this.endereco = endereco;}

public Pets getPet(){
    return pet;
}
public void setPet(Pets pet){
    this.pet = pet;
}
public int getNumClientes(){
    return numClientes;
}
public void setNumClientes(int numClientes){
    this.numClientes = numClientes;
}

public Cliente[] getArrayClientes(){
    return arrayClientes;
}

public void setArrayClientes(Cliente[] arrayClientes){
    this.arrayClientes = arrayClientes;
}


 //MÉTODO ADICIONAR CLIENTE

 public void addCliente(Cliente cliente){
        arrayClientes[numClientes] = cliente;
        numClientes ++;
        System.out.println("Cliente adicionado.");        
    }
 }

