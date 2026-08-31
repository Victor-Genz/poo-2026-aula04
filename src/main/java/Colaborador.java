public class Colaborador {

    public String nome;
    public double salario;


private double getPrevidencia(){

    double bruto = salario;

    if (bruto > 8157.41) {
        bruto = 8157.41;
    }

    double aliquota;
    double deducao;

    if (bruto <= 1518.00) {
        aliquota = 0.075;
        deducao = 0.0;
    } else if (bruto <= 2793.88) {
        aliquota = 0.09;
        deducao = 22.77;
    } else if (bruto <= 4190.83) {
        aliquota = 0.12;
        deducao = 106.59;
    } else {
        // base > 4190.83 até o teto 8157.41
        aliquota = 0.14;
        deducao = 190.40;
    }

    return (bruto * aliquota) - deducao;

}


private double getImpostoRenda(){

    double base = salario - getPrevidencia();

    double aliquota;
    double deducao;

    if (base <= 2259.20) {
        aliquota = 0.0;
        deducao = 0.0;
    } else if (base <= 2826.65) {
        aliquota = 0.075;
        deducao = 182.16;
    } else if (base <= 3751.05) {
        aliquota = 0.15;
        deducao = 394.16;
    } else if (base <= 4664.68) {
        aliquota = 0.225;
        deducao = 675.49;
    } else {
        aliquota = 0.275;
        deducao = 908.73;
    }

    return (base * aliquota) - deducao;

}

    public double getSalarioLiquido(){{
        double salarioiLiquido;

        salarioiLiquido = salario - getPrevidencia() - getImpostoRenda();

        return salarioiLiquido;
    }

}

public void imprimeFolha(){
    System.out.println("Nome: " + nome);
    System.out.println("Salário Bruto: "+ salario);
    System.out.println("Previdencia: " + getPrevidencia());
    System.out.println("Imposto de Renda: " + getImpostoRenda());
    System.out.println("Salário Líquido: " + getSalarioLiquido());
}

}
