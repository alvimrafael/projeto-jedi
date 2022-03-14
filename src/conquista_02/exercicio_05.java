package conquista_02;

/* Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é igual ao case (1, 2, 3).
Os cases devem escrever quando o valor for igual ao seu próprio.
Mostrando apenas a frase do case referente ao valor. */

public class exercicio_05 {
    public static void main (String[] args){

        int n1 = 10;

        switch (n1) {
            case 2:
                System.out.println("number 1");
                break;
            case 10:
                System.out.println("number 2");
                break;
            case 13:
                System.out.println("number 3");
                break;
        }
    }
}
