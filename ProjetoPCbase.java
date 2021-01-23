
public class ProjetoPCbase {

    private String usuario;
    private String senha;
    String placamae;
    String memoria;
    String processador;

    class SubClasse {
        int numero = 3;

        public void metodo() {
            System.out.println("Essa é uma subclasse");
            
        }
        class SubSubClasse {
            String sobrenome = "Silva";
            
    }

    }
    int x = 5;

    public ProjetoPCbase() { //constructor
        placamae = "Gygabyte";
        memoria = "Samsung";
        processador = "Intel";
    }

    public void peçasBase() {

        System.out.println("Placa mãe");
        System.out.println("Processador");
        System.out.println("Memória");

    }

    public void osPreços() {
        int placamae = 1000, processador = 1200, memoria = 600;

    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

}
