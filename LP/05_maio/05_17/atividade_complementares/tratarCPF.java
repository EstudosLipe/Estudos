import java.util.Scanner;

public class tratarCPF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String regioes[][] = {
                { "RS" },
                { "DF", "GO", "MT", "MS", "TO" },
                { "AC", "AP", "AM", "PA", "RO", "RR" },
                { "CE", "MA", "PI" },
                { "AL", "PB", "PE", "RN" },
                { "BA", "SE" },
                { "MG" },
                { "ES", "RJ" },
                { "SP" },
                { "PR", "CS" }
        };
        try {
            int cpf = sc.nextInt();
            // String estado = sc.nextLine();
            // if (verificarCPF(cpf, estado, regioes)) {
            //     System.out.print("CPF validado parabéns");
            // } else {
            //     System.out.print("CPF Inválido");
            // }
        } catch (java.util.InputMismatchException e) {
            System.err.print("Digite somente os números do seu CPF");
        }
        sc.close();
    }

    public static boolean verificarCPF(int cpf, String estado, String regioes[][]) {

        for (int i = 0; i < regioes.length; i++) {
            for (int j = 0; j < regioes.length; j++) {
                estado.compareTo(regioes[i][j]);
            }
        }

        return true;
    }
}
/*
 * Questão B) Faça um programa em Java, usando tratamento de exceções, que
 * receba o CPF e
 * o estado de uma pessoa e verifique se as informações estão de acordo. Faça o
 * tratamento
 * caso as informações não sejam coerentes. Obs: Para esse programa é necessário
 * criar uma
 * exceção própria.
 */