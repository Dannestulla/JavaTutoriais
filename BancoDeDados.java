
import java.util.Scanner;

public class BancoDeDados {

    String login;
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static void main(String[] args) {
        System.out.println("Digite seu login");
        Scanner meuLogin = new Scanner(System.in);
        String login = meuLogin.nextLine();
        
        //Guardando o valor da senha
        System.out.println("Digite sua senha");
        Scanner minhaSenha = new Scanner(System.in);
        String senha1 = minhaSenha.nextLine();
        
        //Setando a senha no "private senha"
        BancoDeDados minhaSenha1 = new BancoDeDados();
        minhaSenha1.setSenha(senha1);
        
        
        BancoDeDados minhaSenha2 = new BancoDeDados();
        minhaSenha2.getSenha();
        System.out.println("Seu login é: " + login);
        System.out.println("Sua senha é: " + minhaSenha2);

    }

}
