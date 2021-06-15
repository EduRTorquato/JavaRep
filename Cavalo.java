package Turma24poo;

public class Cavalo extends Animal{
	private boolean trote;

	public Cavalo() {
		super("Cavalo");
		
	}
	public void trotar()
	{
		
		
		if(trote == true)
		{	
			trote = false;
			System.out.println("O cavalo está parado");
		}
		else
		{
			trote = true;
			System.out.println("O cavalo está trotando");
		}
		
	}
	public void estaTrotando()
	{
		if(trote == true)
		{
			System.out.println("Está trotando");
		}
		else
		{
			System.out.println("Está parado");
		}
		
		
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
	public void Corre()
	{
		System.out.println("UMA DAS CARACTERÍSTICAS DO CAVALO É CORRER");
	}

}
