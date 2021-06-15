package Turma24poo;

public class Cachorro extends Animal {

	public Cachorro() {
		super("Cachorro");
	}

	@Override
	public void fazerBarulho(String barulho) {
		System.out.println("O barulho que seu animal emite é: " + barulho);
	}

	@Override
	public void Nome(String nomeAnimal) {
		System.out.println("O nome do seu animal é: "+ nomeAnimal);
	}

	@Override
	public void Idade(int idadeAnimal) {
		System.out.println("A idade do animal é: ");
	}
		
}