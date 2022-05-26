package exercicio1;

public class PessoaTeste {
public static void main(String[] args) {
	//Retornando a idade da pessoa em questão;
	Pessoa p1 = new Pessoa ();
	System.out.println(p1.idade(2000, 2022));
	
	Pessoa mae = new Pessoa();
	//mae.genero = "Feminino";
	mae.corDosOlhos = "Azul";
	
	Pessoa pai = new Pessoa();
	//pai.genero = "Masculino";
	pai.corDosOlhos = "Castanho";
	
	if (pai.corDosOlhos.equalsIgnoreCase("Castanho") && mae.corDosOlhos.equals("Castanho")) {
		System.out.println("A probabilidade da cor dos olhos do bebê é: 75% castanho / 19% verdes / 6% azuis");
	}
	else if  (pai.corDosOlhos.equalsIgnoreCase("Verde") && mae.corDosOlhos.equals("Castanho")) {
		System.out.println("A probabilidade da cor dos olhos do bebê é: 50% castanho / 37% verdes / 12% azuis");
	}
	else if  (pai.corDosOlhos.equalsIgnoreCase("Azul") && mae.corDosOlhos.equals("Castanho")) {
		System.out.println("A probabilidade da cor dos olhos do bebê é: 50% castanho / 0% verdes / 50% azuis");
	}
	else if  (pai.corDosOlhos.equalsIgnoreCase("Verde") && mae.corDosOlhos.equals("Verde")) {
		System.out.println("A probabilidade da cor dos olhos do bebê é: -1% castanho / 75% verdes / 25% azuis");
	}
	else if  (pai.corDosOlhos.equalsIgnoreCase("Verde") && mae.corDosOlhos.equals("Azul")) {
		System.out.println( "A probabilidade da cor dos olhos do bebê é: 0% castanho / 50% verdes / 50% azuis");
	}
}
}
