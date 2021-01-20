
import java.util.Scanner;

public class ExercicioClass1 {

    static float motor;
    boolean civic = true;
    String carro;
    public static String cor;
    static void calculoDoMotor(int veloc) {

        //escolher entre 1.0, 1.6 ou 2.0
        //1.0 até 80, 1.6 até 120, 2.0 mais que 120
        if (veloc < 80) {
            motor = 1.0f;
        } else if (veloc < 120) {
            motor = 1.6f;
        } else {
            motor = 2.0f;
        }
        System.out.println(motor);
    }

    public void montagemDoCarro() {
        //String carro
        if (civic = true) {
            carro = "Civic";
        } else {
            carro = "Gol";
        }
        //String motor
        System.out.println("O carro escolhido é um "+ carro+", " + motor+", "+cor);
        
        
    }

    public static void main(String[] args) {
        boolean civic = true, velocidade = false; //true = carro novo, false = carro semi novo
        Scanner meuObjeto = new Scanner(System.in); //criado o objeto do input

        System.out.println("O carro sera escolhido baseado nas escolhas:"
                +"\n"+ "*Modelo"
                +"\n"+ "*Velocidade"
                +"\n"+ "*Novo/Semi-Novo");
        //MODELO
        System.out.println("Escolha o modelo:"
                +"\n"+ "1-Economico/Gol"
                +"\n"+ "2-Conforto/Civic");
        int opcao = Integer.parseInt(meuObjeto.nextLine());
        switch (opcao) {
            case 1:
                System.out.println("Seu carro é o Gol");
                civic = false;
                break;
            case 2:
                System.out.println("Seu carro é o Civic");
                break;
            default:
                System.out.println("Escolha uma das opcoes");
                break;
        }
        //VELOCIDADE
        System.out.println("Digite a Velocidade média desejada (de 60 a 150 km/h):");
        int veloc = Integer.parseInt(meuObjeto.nextLine());
        calculoDoMotor(veloc);

        //COR 
        System.out.println("Digite a cor que deseja em seu carro:");
        
        cor = meuObjeto.nextLine(); //le o input usado
        //MONTAGEM 
        ExercicioClass1 meuObjeto1 = new ExercicioClass1 ();
        meuObjeto1.montagemDoCarro();
        
    }
}
