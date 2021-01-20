import java.util.Scanner;
        
public class ContaBancaria {

    public static void main(String[] args) {
        boolean verdade = true;
        while (verdade) {
        int saldo = 1000;
        Scanner meuObjeto = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Selecione a sua opção: 1-Saldo "
                + "2-Adicionar Dinheiro "
                + "3-Sacar dinheiro "
                + "4-Sair");
        String opcao = meuObjeto.nextLine();  // Read user input
        int opcao1=Integer.parseInt(opcao);   
        switch (opcao1) {
            case 1:
                System.out.println("Saldo:");
                System.out.println("Seu saldo e de " + saldo); 
                break;
            case 2:
                System.out.println("Quanto você quer adicionar?");
                String adc = meuObjeto.nextLine();
                int adc1=Integer.parseInt(adc);
                saldo = saldo + adc1;
                System.out.println(adc1 + " adicionados a conta"); 
                System.out.println("Seu saldo e de " + saldo); 
                break;
            case 3:
                System.out.println("Quanto você quer sacar?");
                String scr = meuObjeto.nextLine();
                int scr1 =Integer.parseInt(scr);
                 saldo = saldo - scr1;
                System.out.println(scr+" sacados da conta");
                System.out.println("Seu saldo e de " + saldo); 
                break;
            case 4:
                System.out.println("Volte sempre!");
                verdade = false;
                break;
            default:
                System.out.println("Opção inválida");
                
        }       
        
        
        
}
    }
    }
    
    
        
    
    

