package conquista_01;

/* Criar um código que compara valores iguais, maiores e menores para variáveis de tipos diferentes.
Ex: int numero1 = 20; long numero2 = 20; numero1 == numero2. (utilizar: int, long, double, float e short)
*/

public class exercicio_06 {
    public static void main (String[] args){

        int n1 = 13;
        long n2 = 12321;
        double n3 = 12.3;
        float n4 = 32.1f;
        short n5 = 321;

        System.out.println(n1 == n3);
        System.out.println(n2 > n1);
        System.out.println(n3 < n4);
        System.out.println(n4 >= n2);
        System.out.println(n5 <= n1);
        System.out.println(n3 != n1); // != (diferente)
    }
}
