package curso09_08;

public class Objeto {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		System.out.println("Aqui estão as suas informações!!");

		carro.setModelo("Porsche Boxster");
		carro.setCor("a cor é Branca");
		carro.setTamanho("A Altura é = 1.280mm e o comprimento é =  1 844 mm");
		carro.setValor("Preço estimado em R$ 718.750,00");
		
		System.out.println(carro.getModelo());
		System.out.println(carro.getCor());
		System.out.println(carro.getTamanho());
		System.out.println(carro.getValor());
		
	}

}
