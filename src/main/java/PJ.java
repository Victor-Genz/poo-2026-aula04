import java.util.Scanner;

public class PJ extends Colaborador{
Scanner entrada = new Scanner(System.in);

double quant_horas;
double valor_hora;


public void calculaBruto(){
    System.out.println("Informe o valor da hora de trabalho: ");
    valor_hora = entrada.nextDouble();
    System.out.println("Informe q quantidade de horas trabalhadas: ");
    quant_horas = entrada.nextDouble();

    salario = quant_horas * valor_hora;

    }

}
