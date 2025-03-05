import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segunto parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm,parametroDois);

        }catch (ParametrosInvalidosException e){

            System.out.println(e.getMessage());
        }






    }
    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroDois < parametroUm){
            throw new ParametrosInvalidosException("O paramêtro dois deve ser maior que o paramêtro um");

        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número : " + i);

        }

    }

}

