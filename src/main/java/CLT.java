import java.util.Scanner;

public class CLT extends Colaborador{
Scanner entrada = new Scanner(System.in);
    double valor_hr_extra;
    double quant_hr_extra;

    public void  calculaBruto(){


        System.out.println("Informe o valor da hora extra: ");
        valor_hr_extra = entrada.nextDouble();
        System.out.println("Informe a qauntidade de horas extras realizadas no mês: ");
        quant_hr_extra = entrada.nextDouble();

         salario = salario+(valor_hr_extra*quant_hr_extra);



    }

}
