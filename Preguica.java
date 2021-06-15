package Turma24poo;

public class Preguica extends Animal{
	
	private boolean dormir;
	
	public Preguica() {
		super("Preguiça");
		this.dormir = dormir;
	}
		public void dormir()
		{
			
			
			if(dormir == true)
			{	
				dormir = false;
				System.out.println("A preguiça está dormindo");
			}
			else
			{
				dormir = true;
				System.out.println("A preguiça está acordada");
			}
			
		}
		public void estaDormindo()
		{
			if(dormir == true)
			{
				System.out.println("Está acordada");
			}
			else
			{
				System.out.println("Está dormindo");
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
		public void subirArvores()
		{
			System.out.println("UMA DAS CARACTERÍSTICAS DA PREGUIÇA É SUBIR EM ÁRVORES");
		}
		


	}


