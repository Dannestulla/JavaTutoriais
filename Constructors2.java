// é possível usar o this. para referenciar o parametro com o atributo

public class Constructors2 {

    String bairro, cidade, estado, país, continente;
    int população, areatotal;
    float idh;

    public Constructors2(String bairro, String cidade, String estado, int população, float idh) {

        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.população = população;
        this.idh = idh;
    }

    public static void main(String[] args) {
        Constructors2 meuObjeto = new Constructors2("cidadebaixa", "PortoAlegre", "RS", 3000000, 0.805f);
        System.out.println(meuObjeto.bairro + " " + meuObjeto.cidade + " " + meuObjeto.estado + " " + meuObjeto.população + " " + meuObjeto.idh);

        Constructors2 meuObjeto1 = new Constructors2("Tijuca", "Rio de Janeiro", "RJ", 6000000, 0.761f);
        System.out.println(meuObjeto1.bairro + " " + meuObjeto1.cidade + " " + meuObjeto1.estado + " " + meuObjeto1.população + " " + meuObjeto1.idh);

    }
}
