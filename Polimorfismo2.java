
public class Polimorfismo2 extends Polimorfismo {

    public void metodoPoli2() {
        System.out.println("Isso é um Poli2!");
    }

    public static void main(String[] args) {
        Polimorfismo meuObjeto = new Polimorfismo();
        meuObjeto.metodoPoli();
        
        Polimorfismo2 meuObjeto2 = new Polimorfismo2();
        meuObjeto2.metodoPoli2();
    }
}
