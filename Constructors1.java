
public class Constructors1 {

    String estado; //inicializar um atributo
    //EXEMPLO 1

    public Constructors1() { //criar o Constructor e aplicar os atributos desejados
        estado = "Rio Grande do Sul";
    }
    //EXEMPLO 2

    public static void main(String[] args) {
        //EXEMPLO 1
        Constructors1 meuObjeto = new Constructors1();
        System.out.println(meuObjeto.estado);

    }
}
