package product;

public class Products {

    private String nome;
    private Double preco;

    public Products(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Products(){

    }

    public double soma(double preco){
        double somar = 0;
        return somar += preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
