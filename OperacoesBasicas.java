
public class OperacoesBasicas {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("teste");

        String nome = "Daniel";
        System.out.println(nome);

        int umNumero = 123;
        System.out.println(umNumero);

        //Como já foi declarado o que a variavel é, 
        //não é necessário fazer de novo
        umNumero = 321;
        System.out.println(umNumero);

        // Para que não seja alterada a variavel
        // é possível usar a palavra "final"
        final int outroNumero = 15;

        String primeiroNome = "Daniel";
        String ultimoNome = "Dutra";
        System.out.println(primeiroNome + ultimoNome);

        int x = 5;
        int y = 6;
        System.out.println(x + y);

        //declarar várias variáveis:
        int a = 3, b = 6, z = 50;
        System.out.println(a + b + z);

        float myFLoatNum = 5.10f;
        char minhaLetra = 'D';
        boolean myBool = true;
        String myText = "Hello";
        System.out.println("If/Else");

        if (20 > 30) {
            System.out.println("20 é maior que 30");
        } else {
            System.out.println("não é");
        };

        b = 13;
        int c = 56;
        a = b + c;

        if (a > 60) {
            System.out.println("e maior que 60");
        } else {
            System.out.println("não é");
        }

        //Switch 
        System.out.println("Switch Case");
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            default:
                System.out.println("Nenhum dia");
                break;
        }

        System.out.println("While");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        System.out.println("For Loop");
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        System.out.println("Arrays/Lists");
        String[] carros = {"fusca", "gol", "fiat"};
        int[] meusNumeros = {10, 20, 30};
        System.out.println(carros[1]);

        //duas listas dentro de uma só
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};

        x = myNumbers[1][2];

    }

}
