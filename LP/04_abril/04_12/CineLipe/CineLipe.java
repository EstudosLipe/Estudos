import java.util.Scanner;

public class CineLipe {
    public static void main(String args[]) {
        // Declaração do obj Scanner
        Scanner sc = new Scanner(System.in);

        // Login do usuario, coleta o email|nome e senha e realiza o método login
        StringBuilder nome = new StringBuilder(sc.next()), pass = new StringBuilder(sc.next());
        int login = login(nome, pass), n=0;

        if (login==1) {
            while (n!=0) {
                System.out.print("Seja bem-vindo ao *_CineLipe_* \n\n");
                
                System.out.print("1. Comprar ingressos\n2. Meus Ingressos\n0. Sair");
                // Realiza proxima ação
                System.out.print("Escolha um valor:\n-> ");
                n=sc.nextInt();

                switch (n) {
                    case 1:
                        comprarIngresos();
                        break;
                    default:
                        break;
                }
            }
        }
        sc.close();
    }

    /**
     * Método que gera a lista de todos os usuário cadastrados 
     * @return array user
     */
    private static StringBuilder[][] users() {
        String palavras[] = {"Philip","Kelly","Sophie","Jane","Viana","Soares"};
        StringBuilder user[][] = new StringBuilder[3][3];
        for (int i = 0; i < user.length; i++) {
            // Nome
            user[i][0].append(palavras[i]+" "+palavras[4]+" "+palavras[5]);
            // Email
            user[i][1].append(palavras[i].toLowerCase()+"."+palavras[5].toLowerCase()+"@gmail.com");
            // Senha
            user[i][2].append(palavras[i]+palavras[4].toLowerCase()+"1@");
        }
        return user;
    }
    /**
     * Percorre o array de usuário e verifica se tem user com esses dados
     * @param nome {StringBuilder}
     * @param pass {StringBuilder}
     * @return Logado {int}
     */
    public static int login(StringBuilder nome, StringBuilder pass) {
        StringBuilder users[][] = users();
        for (int i = 0; i < users.length; i++) {
            if (nome == users[i][0] || nome == users[i][1] && pass == users[i][2]) {
                // Logado
                return 1;
            }
        }
        // Não foi Logado
        return 0;
    }

    public static StringBuffer compraIngresso(Scanner sc) {
        StringBuffer stb = new StringBuffer("null");

        return stb;
    }

    publ
}