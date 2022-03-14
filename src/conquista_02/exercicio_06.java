package conquista_02;

/* Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é igual ao case (a, b, c e default).
O código deve executar apenas o default com a mensagem: “O valor não é compatível”. */

public class exercicio_06 {
    public static void main (String[] main){

        String c1 = "r";

        switch (c1) {
            case "a":
                System.out.println("case a");
            case "b":
                System.out.println("case b");
            case "c":
                System.out.println("case c");
            default:
                System.out.println("the value is not compatible");
        }
    }
}
