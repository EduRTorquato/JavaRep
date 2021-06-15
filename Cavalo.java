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
			System.out.println("O cavalo est� parado");
		}
		else
		{
			trote = true;
			System.out.println("O cavalo est� trotando");
		}
		
	}
	public void estaTrotando()
	{
		if(trote == true)
		{
			System.out.println("Est� trotando");
		}
		else
		{
			System.out.println("Est� parado");
		}
		
		
	}
	@Override
	public void fazerBarulho(String barulho) {
		System.out.println("O barulho que seu animal emite �: " + barulho);
	}

	@Override
	public void Nome(String nomeAnimal) {
		System.out.println("O nome do seu animal �: "+ nomeAnimal);
	}

	@Override
	public void Idade(int idadeAnimal) {
		System.out.println("A idade do animal �: ");
	}
	public void Corre()
	{
		System.out.println("UMA DAS CARACTER�STICAS DO CAVALO � CORRER");
	}

}
