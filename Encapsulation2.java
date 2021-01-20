import java.util.Scanner;
public class Encapsulation2 {
    
    public static void main(String[] args) {
        //Está dando set na senha no arquivo/classe Encapsulation
        Encapsulation outroArquivo = new Encapsulation();
          
        //Está pegando a senha do arquivo/classe Encapsulation
        
        Scanner meuImput = new Scanner(System.in);
        System.out.println("Digite seu usuário");
        String resposta = meuImput.nextLine();
        //trocando o nome no outro arquivo
        outroArquivo.setNome(resposta);
        System.out.println("Seu nome é: "+ outroArquivo.getNome());
        System.out.println("Digite a senha desejada");
        System.out.println("Digite seu usuário");
        
    }
        
}
