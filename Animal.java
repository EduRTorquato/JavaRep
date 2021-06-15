package Turma24poo;

public abstract class Animal {
	
	private String tipo;
	
	abstract public void fazerBarulho(String barulho);
	abstract public void Nome(String nomeAnimal);
	abstract public void Idade(int idadeAnimal);

	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Animal( String tipo)
	{
		this.tipo = tipo;
	}


}

