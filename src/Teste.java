public class Teste {
    public static void main(String[] args) {
        System.out.println("Calculadora");

        System.out.println();

        double x = 3.0;
        double y = 2.0;

        // foi para ver se estava funcionando
        /*Operacoes somar = Operacoes.SOMAR;
        Operacoes subtrair = Operacoes.SUBTRAIR;
        Operacoes multiplicar = Operacoes.MULTIPLICAR;
        Operacoes dividir = Operacoes.DIVIDIR;

        System.out.println(somar.toString() + " = " + somar.getSimbolos());
        System.out.println();
        System.out.println(subtrair.toString() + " = " + subtrair.getSimbolos());
        System.out.println();
        System.out.println(multiplicar.toString() + " = " + multiplicar.getSimbolos());
        System.out.println();
        System.out.println(dividir.toString() + " = " + dividir.getSimbolos());
        */

        for(Operacoes op : Operacoes.values()){
            System.out.print(x + " ");
            System.out.print(op.toString() + " ");
            System.out.print(y + " =  ");
            System.out.println(op.execultarOperacao(x, y));
        }
    }
}
