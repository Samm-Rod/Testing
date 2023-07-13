package product;

public class Create {

    private String pessoa;
    private String pais;

    public Create(String pessoa, String pais) {
        this.pessoa = pessoa;
        this.pais = pais;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
