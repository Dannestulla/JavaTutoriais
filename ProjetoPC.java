import javax.swing.JOptionPane;
public class ProjetoPC extends ProjetoPCbase {
    
   
    public void novasPeças() {
        System.out.println("As novas peças foram");

    }

    public static void main(String[] args) {
        ProjetoPCbase meuObjeto = new ProjetoPCbase();
        System.out.println(meuObjeto.placamae);
        meuObjeto.peçasBase();
        meuObjeto.setUsuario("Timão");
        System.out.println("O usuario é : " + meuObjeto.getUsuario());
        ProjetoPCbase.SubClasse meuObjetoInterno = meuObjeto.new SubClasse();
        meuObjetoInterno.metodo();
        
        System.out.println(meuObjetoInterno.numero);
        ProjetoPCbase.SubClasse.SubSubClasse minhaSubSub = meuObjetoInterno.new SubSubClasse();
        
        System.out.println(minhaSubSub.sobrenome);
    }

}
