import java.util.Scanner;
public class Menu {
    
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);    
    int opcao;
    arrayClientes = new Cliente[numMaximo];
    arrayEstoque = new Produto[numMaximo];
    
   
        
        do{
            System.out.println("Bem vindo! Escolha uma das opções: ");
            System.out.println("1. Adicionar produto.");
            System.out.println("2. Remover produto.");
            System.out.println("3. Exibir estoque.");
            System.out.println("4. Acessar produto pelo nome.");
            System.out.println("5. Adicionar cliente.");
            System.out.println("6. Adicionar pet.");
            System.out.println("7. Adicionar funcionário.");
            System.out.println("0. Sair");
    
            opcao = scanner.nextInt();        
            switch(opcao){
                case 1: //add produto
                    scanner.nextLine(); //limpar buffer
                    System.out.println("Digite o nome do produto que deseja adicionar: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.println("Digite a descrição do produto: ");
                    String descricao = scanner.nextLine();
                    Produto produto = new Produto(nome, preco, descricao);
                    produto.addProduto(produto);
                    break;
                case 2: //remover produto
                    scanner.nextLine(); //limpar buffer    
                    System.out.print("Digite o nome do produto a ser removido: ");
                    String nomeProduto = scanner.nextLine();
                    produto.removerProduto(nomeProduto);
                    break;
                case 3:
                    produto.exibirEstoque();
                    break;
                case 4: //pesquisar produto
                    scanner.nextLine(); //limpar buffer    
                    System.out.print("Digite o nome do produto a ser acessado: ");
                    String nomeProdutoBuscado = scanner.nextLine();
                    produto.pesquisarProduto(nomeProdutoBuscado);
                    break;
                case 5: //add cliente
                    scanner.nextLine(); //limpar buffer
                    System.out.println("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.println("Digite o endereço: ");
                    String enderecoCliente = scanner.nextLine();
                    Cliente cliente = new Cliente(nomeCliente, enderecoCliente);
                    cliente.addCliente(cliente);
                    break;

                case 6: //add pet
                    System.out.println("Digite o número correspondente ao pet: ");
                    System.out.println("1 - Mamífero");
                    System.out.println("2 - Peixe");
                    System.out.println("3 - Ave");
                    int opcaoPet = scanner.nextInt();
                    
                    switch(opcaoPet){
                    case 1:
                        scanner.nextLine(); //limpar buffer
                        System.out.println("Digite o nome do pet que deseja adicionar: ");
                        String nome = scanner.nextLine();
                        System.out.println("Espécie: ");
                        String especie = scanner.nextLine();
                        System.out.println("Raça: ");
                        String raca = scanner.nextLine();
                        System.out.println("Idade: ");
                        int idade = scanner.nextInt();
                        System.out.println("Sexo (F ou M): ")
                        char sexo = scanner.nextLine();
                        System.out.println("É castrado? (False ou True) ");
                        boolean castrado = scanner.nextBoolean();
                        Mamiferos mamifero = new Mamiferos(especie, raca, nome, idade, sexo, castrado);
                        System.out.println("Pet adicionado!");
                        break;

                    case 2: //peixe
                    scanner.nextLine(); //limpar buffer
                        System.out.println("Digite o nome do pet que deseja adicionar: ");
                        String nome = scanner.nextLine();
                        System.out.println("Espécie: ");
                        String especie = scanner.nextLine();
                        System.out.println("Raça: ");
                        String raca = scanner.nextLine();
                        System.out.println("Idade: ");
                        int idade = scanner.nextInt();
                        System.out.println("Sexo (F ou M): ")
                        char sexo = scanner.nextLine();
                        System.out.println("É castrado? (True ou False) ");
                        boolean castrado = scanner.nextBoolean();
                        System.out.println("É de água doce? (True ou False) ")
                        boolean aguaDoce = scanner.nextBoolean();
                        Peixes peixe = new Peixes(especie, raca, nome, idade, sexo, castrado, aguaDoce);
                        System.out.println("Pet adicionado!");
                        break;
                    case 3: //ave
                        scanner.nextLine(); //limpar buffer
                        System.out.println("Digite o nome do pet que deseja adicionar: ");
                        String nome = scanner.nextLine();
                        System.out.println("Espécie: ");
                        String especie = scanner.nextLine();
                        System.out.println("Raça: ");
                        String raca = scanner.nextLine();
                        System.out.println("Idade: ");
                        int idade = scanner.nextInt();
                        System.out.println("Sexo (F ou M): ");
                        char sexo = scanner.nextLine();
                        System.out.println("É castrado? (False ou True) ");
                        boolean castrado = scanner.nextBoolean();
                        Aves ave = new Aves(especie, raca, nome, idade, sexo, castrado);
                        System.out.println("Pet adicionado!");
                        break;
                    default: 
                        System.out.println("Número inválido. Tente novamente.");

                    }


                case 7: //add funcionario
                    System.out.println("Digite o número correspondente ao funcionário: ");
                    System.out.println("1 - Veterinário");
                    System.out.println("2 - Gestor");
                    int opcaoFuncionario = scanner.nextInt();
                    switch(opcaoFuncionario){
                    case 1:
                        System.out.println("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.println("Endereço: ");
                        String endereco = scanner.nextLine();
                        System.out.println("Salário: ");
                        double salario = scanner.nextDouble();
                        System.out.println("Especialidade: ");
                        String especialidade = scanner.nextLine();
                        System.out.println("CRMV: ");
                        String crmv = scanner.nextLine();
                        Veterinario vet = new Veterinario(nome, endereco, salario, especialidade, crmv);
                        break;
                    case 2:
                        System.out.println("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.println("Endereço: ");
                        String endereco = scanner.nextLine();
                        System.out.println("Salário: ");
                        double salario = scanner.nextDouble();
                        System.out.println("Quantos funcionários tem em sua equipe? ");
                        int numEquipe = scanner.nextInt();
                        System.out.println("Qual setor/equipe ele coordena? ");
                        String equipe = scanner.nextLine();
                        Gestor gestor = new Gestor(nome, endereco, salario, numEquipe, equipe);
                        break;

                    default:
                        System.out.println("Número inválido. Tente novamente.");
                    }

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default: 
                    System.out.println("Número inválido. Tente novamente.");     
            }        
        } while(opcao != 0);
    
        scanner.close();
        }
    
    }