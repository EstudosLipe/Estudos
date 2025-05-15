// Media ponderada de alunos
// https://www.beecrowd.com.br/judge/pt/problems/view/1006
import java.util.Scanner;
public class Bee1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();

        System.out.print("MEDIA = "+String.format("%.1f",(a*2+b*3+c*5)/10));
        sc.close();
    }
}
