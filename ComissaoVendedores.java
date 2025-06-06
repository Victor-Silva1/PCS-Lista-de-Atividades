import java.util.Scanner;

public class ComissaoVendedores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] faixas = new int[9];


        while (true) {
            System.out.print("Digite o valor das vendas brutas do vendedor (-1 para encerrar): ");
            double vendas = scanner.nextDouble();

            if (vendas == -1) {
                break;
            }


            double salario = 200 + (vendas * 0.09);


            int indice;
            if (salario >= 1000) {
                indice = 8;
            } else {
                indice = (int) (salario / 100) - 2;
            }


            if (indice >= 0 && indice < faixas.length) {
                faixas[indice]++;
            }
        }


        System.out.println("\nDistribuição dos salários:");
        String[] descricoes = {
            "$200 - $299",
            "$300 - $399",
            "$400 - $499",
            "$500 - $599",
            "$600 - $699",
            "$700 - $799",
            "$800 - $899",
            "$900 - $999",
            "$1000 ou mais"
        };

        for (int i = 0; i < faixas.length; i++) {
            System.out.printf("%-15s: %d\n", descricoes[i], faixas[i]);
        }

        System.out.println("\nPrograma encerrado.");
        scanner.close();
    }
}
