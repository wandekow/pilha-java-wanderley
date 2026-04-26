import java.util.Scanner;

public class Simples {

    static String[] acoes = new String[3];
    static int topo = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 Inserir | 2 Desfazer | 3 Listar | 0 Sair");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                if (topo == 2) {
                    System.out.println("Cheio");
                } else {
                    topo++;
                    System.out.print("Ação: ");
                    acoes[topo] = sc.nextLine();
                }
            } else if (op == 2) {
                if (topo == -1) {
                    System.out.println("Vazio");
                } else {
                    System.out.println("Desfeito: " + acoes[topo]);
                    topo--;
                }
            } else if (op == 3) {
                if (topo == -1) {
                    System.out.println("Nada");
                } else {
                    for (int i = topo; i >= 0; i--) {
                        System.out.println(acoes[i]);
                    }
                }
            } else if (op == 0) {
                break;
            }
        }
    }
}