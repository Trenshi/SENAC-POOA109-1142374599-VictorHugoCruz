/**
 * Produto
 */
public class Produto {

    public String nome;
    public float preço;

    public Produto (String nome, float preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(Float preço) {
        this.preço = preço;
    }
}