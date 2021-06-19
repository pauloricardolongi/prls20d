package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Produto;




public class App02 {

	public static void main(String[] args) {
Locale.setDefault(Locale.US);
		
		List<Produto>list = new ArrayList<>();
		
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse",50.00));
		list.add(new Produto("Tablet", 350.00));
		list.add(new Produto("HD Case", 80.90));
		
		//referencia para método
		list.removeIf(Produto::PredicadoProduto);
		
		for(Produto p : list) {
			System.out.println(p);
		}

	}

}


	


