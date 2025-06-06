import java.util.ArrayList;
import java.util.Scanner;

public class InvestigacaoCrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        int respostasPositivas = 0;


        for (String pergunta : perguntas) {
            System.out.print(pergunta + " (s/n): ");
            String resposta = scanner.nextLine().trim().toLowerCase();


            if (resposta.equals("s") || resposta.equals("sim")) {
                respostasPositivas++;
            }
        }


        System.out.print("\nClassificação: ");
        if (respostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

        scanner.close();
    }
}
