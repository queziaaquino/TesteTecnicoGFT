package exercicio1;

public class Pessoa {

	String nome;
	String genero;
	String corDosOlhos;
	String corDoCabelo;
	int dataDeNasc;
	String tipoSanguineo;
	char fatorRH;
	
	//Método para calcular a idade
	public int idade(int dataDeNasc, int ano) {
		this.dataDeNasc = dataDeNasc;
		return ano - dataDeNasc; 
		
	}
	
	
}

