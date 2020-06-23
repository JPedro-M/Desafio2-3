package desafio2.pkg3;
import java.util.Scanner;
/**
 *
 * @author troll
 */
public class Desafio23 {
    public static void main(String[] args) {
        int idade1, idade2, idade3;
        double media;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual a Primeira idade?");
        idade1 = ler.nextInt();
        System.out.println("Qual a Segunda idade?");
        idade2 = ler.nextInt();
        System.out.println("Qual a terceira idade?");
        idade3 = ler.nextInt();
        
        media = (idade1+idade2+idade3)/3;
        
        System.out.println("A media das idades é:"+media);  
    }
}
