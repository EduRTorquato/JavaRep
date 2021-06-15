package Turma24poo;

import java.util.ArrayList;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner leia = new Scanner(System.in);
	ArrayList animais = new ArrayList();
	
	Cachorro cachorro = new Cachorro();
	Cavalo cavalo = new Cavalo();
	Preguica preguica = new Preguica();
		
		
	Animal animal = null;
	
	int x;
	do
	{
		System.out.println("\nQual o tipo do seu animal?\n\n1-Cachorro\n2-Cavalo\n3-Preguica");
		x = leia.nextInt();
		if(x==1)
		{
			animal=cachorro;
			System.out.println("Qual o nome do seu cachorro?");
			String nome = leia.next();
			System.out.println("Quantos anos o seu cachorro tem?");
			int idad = leia.nextInt();
			System.out.println("\nEssa é legal! Qual o som que eu cachorro emite");
			String som = leia.next();
			System.out.println("--------------------------------------");
			cachorro.Nome(nome);
			cachorro.Idade(idad);
			cachorro.fazerBarulho(som);
			animais.add(cachorro);
		}
		else if(x ==2)
		{
			
			animal=cavalo;
			System.out.println("Qual o nome do seu cavalo?");
			String nome = leia.next();
			System.out.println("Quantos anos o seu cavalo tem?");
			int idad = leia.nextInt();
			System.out.println("\nEssa é legal! Qual o som que eu cavalo emite");
			String som = leia.next();
			System.out.println("--------------------------------------");
			cavalo.Nome(nome);
			cavalo.Idade(idad);
			cavalo.fazerBarulho(som);		
			animais.add(cavalo);
			
		}
		else if( x== 3)
		{	
			animal=preguica;
			System.out.println("Qual o nome da sua preguiça?");
			String nome = leia.next();
			System.out.println("Quantos anos a sua preguiça tem?");
			int idad = leia.nextInt();
			System.out.println("\nEssa é legal! Qual o som que sua preguiça emite");
			String som = leia.next();
			System.out.println("--------------------------------------");
			preguica.Nome(nome);
			preguica.Idade(idad);
			preguica.fazerBarulho(som);		
			animais.add(preguica);
		}
		else
		{
			System.out.println("Informação inválida");
		}
	}
	while(x <= 0|| x >=4);
	
	
	
	
}
}
