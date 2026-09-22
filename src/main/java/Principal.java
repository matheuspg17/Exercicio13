
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double salario, prestacao, prestacao30;
        
        System.out.println("Digite seu sálario:");
        salario = leia.nextDouble();
        
        System.out.println("Digite o valor da prestação:");
        prestacao = leia.nextDouble();
        
        prestacao30 = salario * 0.3;
        
        if (prestacao <= prestacao30){
            System.out.println("O empréstimo pode ser concedido");
        }else {
        System.out.println("O empréstimo não pode ser concedido");
        }
    }
}
