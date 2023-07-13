package product;

import java.util.ArrayList;

public class Programs {
    public static void main(String[] args) {
        Products prod = new Products();
        ArrayList<Products> p = new ArrayList<>();
        ArrayList<Client> c = new ArrayList<>();

        p.add(new Products("Notebook ideapad i5", 3500.65));
        p.add(new Products("TV LG", 2540.39));

        c.add(new Client("Joao da Silva","Notebook ideapad i5"));
        c.add(new Client("Maria da Silva","TV LG"));
        prod.setPreco(2356.60);
        prod.setPreco(2354.00);
        System.out.println(prod.soma(prod.getPreco()));
        // Não ligue pra essa logica ruim 


    }
}
