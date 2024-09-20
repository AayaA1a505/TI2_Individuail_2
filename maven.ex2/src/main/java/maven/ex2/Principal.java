package maven.ex2;

import java.util.Scanner;

class remediosCRUD {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int entrada;

        do {
            System.out.println("====================");
            System.out.println("|       MENU       |");
            System.out.println("|==================|");
            System.out.println("| 1| Inserir item  |");
            System.out.println("| 2| Listar itens  |");
            System.out.println("| 3| Atualizar item|");
            System.out.println("| 4| Excluir item  |");
            System.out.println("====================");
            System.out.println("Pressione qualquer outro numero para Sair.");

            entrada = ler.nextInt();
            switch(entrada) {
                case 1: {
                    inserir(ler);
                    break;
                }
                case 2: {
                    listar();
                }
                case 3: {
                    atualizar(ler);
                    break;
                }
                case 4: {
                    excluir(ler);
                    break;
                }
            }
            if(entrada < 0 || entrada > 5){
                System.out.println("Pressione Enter para Sair");
            }else {
                System.out.println("Pressione Enter para continuar...");
            }
            ler.nextLine();
            ler.nextLine();
        } while(entrada > 0 && entrada < 5);
    }
    static void inserir(Scanner ler) {
        String nome;
        int valor;
        System.out.println("====================");
        System.out.println("|   Inserir item   |");
        System.out.println("|==================|");
        System.out.println("Insira o nome do item: ");
        nome = ler.nextLine();
        System.out.println("Insira o valor do item: ");
        valor = ler.nextInt();
       

        //comando pro terminal

        System.out.println("Item inserido com sucesso no banco de dados.");
        System.out.println("Pressione Enter para continuar...");
            ler.nextLine();
            ler.nextLine();
    }
    static void listar() {
        System.out.println("=====================");
        System.out.println("| listagem de itens |");
        System.out.println("|===================|");

        DAO.conectar();
        }
    static void atualizar(Scanner ler) {
        int id;
        System.out.println("====================");
        System.out.println("|  Atualizar item  |");
        System.out.println("|==================|");
        System.out.println("Insira o ID do item: ");
        id = ler.nextInt();
        System.out.println("Insira o campo a ser atualizado (preço/nome) do item: ");
    }
    static void excluir(Scanner ler) {
        int id;
        System.out.println("==================");
        System.out.println("|  Excluir item  |");
        System.out.println("|================|");
        System.out.println("Insira o ID do item: ");
        id = ler.nextInt();
    }
}
