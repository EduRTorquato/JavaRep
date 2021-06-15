package Turma24poo;

public class Preguica extends Animal{
	
	private boolean dormir;
	
	public Preguica() {
		super("Pregui�a");
		this.dormir = dormir;
	}
		public void dormir()
		{
			
			
			if(dormir == true)
			{	
				dormir = false;
				System.out.println("A pregui�a est� dormindo");
			}
			else
			{
				dormir = true;
				System.out.println("A pregui�a est� acordada");
			}
			
		}
		public void estaDormindo()
		{
			if(dormir == true)
			{
				System.out.println("Est� acordada");
			}
			else
			{
				System.out.println("Est� dormindo");
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
		public void subirArvores()
		{
			System.out.println("UMA DAS CARACTER�STICAS DA PREGUI�A � SUBIR EM �RVORES");
		}
		


	}


