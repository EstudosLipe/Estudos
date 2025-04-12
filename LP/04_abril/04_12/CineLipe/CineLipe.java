import java.util.Scanner;

public class CineLipe {
    public static void main(String args[]) {
        // Declaração do obj Scanner
        Scanner sc = new Scanner(System.in);

        // Pega as informações de nome/email e login
        StringBuilder nome = new StringBuilder(sc.next()), pass = new StringBuilder(sc.next());
        int login = login(nome, pass), n=0;

        if (login==1) {
            while (n!=0) {
                System.out.print("Digite um valor:\n->");

                n=sc.nextInt();
            }
        }
        sc.close();
    }

    public static StringBuilder[][] users() {
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
}