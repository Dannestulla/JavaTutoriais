
public class ClassesObjetos {

    /*Everything in Java is associated with classes and objects, 
along with its attributes and methods. For example: in real life, 
a car is an object. The car has attributes, such as weight 
and color, and methods, such as drive and brake.
    
    Objetos são criados para utilizar os metodos e atributos de determinada classe
    ex. ClassesObjetos.x vai acessar a variável x do arquivo ClassesObjetos
    */
    //Exemplo 1
    int x = 5;
    int y = 10;
    //Exemplo 2

    static void metodoStatico() {
        //Metodos estaticos não precisam usar objetos
        System.out.println("este é um Metodo estatico");

    }

    public void metodoPublico() {
        //Metodos publicos devem usar objetos
        System.out.println("este é um Metodo publicos");
        int a = 3;
    }

    /*Class é o tipo, EX: Automóvel,
   Object é o tipo, EX:Fusca
   Attributes são as características, EX: cor
   Methods (ou functions) são as ações, EX: Velocidade
     */
    public static void main(String[] args) {
        // ============== Exemplo 1 ==============
        // Para criar um objeto, usar a palavra  NEW
        // o nome do objeto mais um ponto e o nome da variavel
        // vai acessar esta
        ClassesObjetos meuObjeto = new ClassesObjetos();
        System.out.println(meuObjeto.y);
        System.out.println(meuObjeto.x);
        /// é possivel modificar a variavel:
        meuObjeto.x = 100;
        System.out.println(meuObjeto.x);

        // ============== Exemplo 2 ==============
        // Metodos estaticos não precisam usar objetos:
        metodoStatico();

        //LEMBRE-SE: CRIAR UM OBJETO NA CLASSE PRINCIPAL
        // Metodos publicos devem usar objetos
        ClassesObjetos meuObjeto2 = new ClassesObjetos();
        meuObjeto2.metodoPublico();
    }

}
