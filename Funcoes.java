
public class Funcoes {
    //Exemplo 1
    static void meuMetodo() {
        System.out.println("Teste");
    }
    //Exemplo 2
    static void meuMetodo2(String primeiroNome) {
        System.out.println(primeiroNome + "Silva");
    }
        
    //Exemplo 3
    static void meuMetodo3(String pNome, int idade) {
        System.out.println(pNome + " tem " + idade + " anos");
    }
    
    //Exemplo 4
    //Void serve para não retornar um valor. Ao usar return em vez de void, 
    //um valor é retornado
    static int meuMetodo4(int x) {
        return 5 + x;
    }
    
    //Exemplo 5
    static int meuMetodo5(int y, int z) {
        return y + z;
    }
    //Exemplo 6
    static void checarIdade(int idade) {
        if (idade > 18) {
            System.out.println("Você pode passar, você tem " + idade);
        } else { System.out.println("Você não tem 18 anos");
        } 
    }
    //Exemplo 7
                
    
    //==================INICIO DO PROGRAMA========================
    public static void main(String[] args) {
        
    //Exemplo 1
    meuMetodo();    
    //Exemplo 2
    meuMetodo2("Lucas");
    //Exemplo 3
    meuMetodo3("Daniel", 32);    
    //Exemplo 4
    System.out.println(meuMetodo4(10));
    //Exemplo 5
    System.out.println(meuMetodo5(20,5));
    //Exemplo 6
    checarIdade(20);
    //Exemplo 7
    
    
    
    
    
    }

    
}
