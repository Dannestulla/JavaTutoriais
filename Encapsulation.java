/*Serve para esconder dados dos usuários
é possível declarar classe, variáveis e atributos como private
get e set metodos podem pegar ou alterar esses valores privados

Modo de uso:
crie uma função iniciando com get ou set, seguido do nome da variavel, com a primeira letra maiúscula

Ex. getNome()
OBS: PRIVATE só fica privado para que outros arquivos não acessem. No mesmo arqquivo é possível ler a variavel
sem problema

 */

public class Encapsulation {

    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;

    }

    public String getSenha() {
        return nome;
    }

    public void setSenha(String novoNome) {
        this.nome = novoNome;

    }
}
