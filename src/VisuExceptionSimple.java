import java.util.Scanner;

public class VisuExceptionSimple{
    public void testexceptionscanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un entier pour que saisie OK et autre chose pour exception");
        sc.nextInt();
        System.out.print("fini !");
    }
}
