import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        CLT clt = new CLT();
        PJ pj = new PJ();
        String categoria = entrada.next();

        if(categoria.equals("CLT")){
            System.out.println("Informe seu nome ! ");
            clt.nome=entrada.next();
            System.out.println("Informe o salário bruto do mês");
            clt.salario = entrada.nextDouble();
            clt.calculaBruto();
            clt.getSalarioLiquido();
            clt.imprimeFolha();

        } else if (categoria.equals("PJ")) {
            System.out.println("Informe seu nome ! ");
            pj.nome=entrada.next();
            pj.calculaBruto();
            pj.getSalarioLiquido();
            pj.imprimeFolha();
        } else {
            System.out.println("A categoria digitada não existe");
        }

    }

}
