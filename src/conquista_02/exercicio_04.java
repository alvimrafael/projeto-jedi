package conquista_02;

/* Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor qualquer,
sendo atendida na segunda condição, não executando a terceira e nem um ELSE */

public class exercicio_04 {
    public static void main (String[] args){

        int n1 = 13;

        if (n1 == 12){
            System.out.println("True 1");
        } else if (n1 <= 20){
            System.out.println("True 2");
        } else if (n1 == 13){
            System.out.println("True 3");
        } else {
            System.out.println("False");
        }
    }
}
