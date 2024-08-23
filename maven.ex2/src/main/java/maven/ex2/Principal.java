package maven.ex2;

import java.util.*;

class X {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int entrada;

        do {
            System.out.println("====================");
            System.out.println("|       MENU       |");
            System.out.println("|==================|");
            System.out.println("| 1| Listar itens  |");
            System.out.println("| 2| Inserir item  |");
            System.out.println("| 3| Excluir item  |");
            System.out.println("| 4| Atualizar item|");
            System.out.println("====================");
            System.out.println("Pressione qualquer outro numero para Sair.");

            entrada = ler.nextInt();
            switch(entrada) {
                case 1: {
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
            }

            System.out.println("Pressione Enter para continuar...");
            ler.nextLine();
        } while(entrada > 0 && entrada < 5);
        ler.close();
    }
}
