import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ListaMB {

	String nome;
	String marca;
	String tipo;
//	Carro carro2 = new Carro();
//	Carro carro3 = new Carro();
//	Carro carro4 = new Carro();
	List<Carro> carros = new ArrayList<>();

	List<String> marcas;

	public ListaMB() {
//		carros = new ArrayList<>();
//		carro.setNome("Polo");
//		carro.setMarca("VW");
//		carro2.setNome("Fiesta");
//		carro2.setMarca("Ford");
//		carro3.setNome("Cruze");
//		carro3.setMarca("Chevrolet");
//		carro4.setNome("Virtus");
//		carro4.setMarca("VW");
//		carros.add(carro);
//		carros.add(carro2);
//		carros.add(carro3);
//		carros.add(carro4);
//		marcas = new ArrayList<>();
//		marcas.add("WV");
//		marcas.add("WV");
//		marcas.add("WV");
//		marcas.add("WV");
	}

//	public void salvarCarro() {
//		Carro carro = new Carro();
//		carro.setNome(nome);
//		carro.setMarca(marca);
//		carros.add(carro);
//	}

	public String salvarCarro() {
		Carro carro = new Carro();
		carro.setNome(nome);
		carro.setMarca(marca);
		carro.setTipo(tipo);
		carros.add(carro);
		return "index?faces-redirect=true";
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public List<String> getMarcas() {
		return marcas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setMarcas(List<String> marcas) {
		this.marcas = marcas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
