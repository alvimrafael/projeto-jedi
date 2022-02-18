package conquista_01;

/* Criar um código que declara e inicializa variáveis primitivas e
atribui o seu próprio valor somado a ele mesmo utilizando operadores de atribuição direta (+=, -=, *=...) */

public class exercicio_08 {
    public static void main (String[] args){
        int n1 = 8;
        n1 += n1;

        int n2 = 7;
        n2 -= n2;

        int n3 = 6;
        n3 *= n3;

        int n4 = 5;
        n4 /= n4;

        int n5 = 4;
        n5 %= n5;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);

    }
}
