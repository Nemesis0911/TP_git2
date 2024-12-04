import java.util.InputMismatchException;
import java.util.Scanner;

public class VisuExceptionSimple{
    public void testexceptionscanner(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Entrer un entier pour que saisie OK et autre chose pour exception");
            sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.print("Vous n'avez pas bien respecté les contraintes de type en entree !" +e.toString());
        }
        System.out.print("fini !");
    }
}
