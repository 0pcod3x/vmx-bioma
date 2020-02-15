package com.natanviana.org.projetovmix;

import java.util.Scanner;

public class CardValidacao {
	Scanner entrada;

    public static void main(String[] args){
       
    	Scanner entrada = new Scanner(System.in);
        
        
    	
        Card a = new Card(); 
        
        
        System.out.println("\nDigite o nome de um animal da fauna brasileira:");
        a.nomeAnimal = entrada.nextLine();
        System.out.println("\nDigite o nome cientifico desse animal: ");
		a.nomeCientifico= entrada.nextLine();
		System.out.println("\nDigite o bioma desse animal:");
	    a.biomaAnimal= entrada.nextLine();
		System.out.println("\nInsira a imagem:");
	    a.imagemAnimal= entrada.nextLine();
	    entrada.close();
	    
	    
	    if((a.nomeAnimal == null) || (a.nomeAnimal.trim().isEmpty()) || (a.nomeCientifico == null) || (a.nomeCientifico.trim().isEmpty()) || (a.biomaAnimal.trim().isEmpty()) || (a.biomaAnimal == null) || (a.imagemAnimal.trim().isEmpty()) || (a.imagemAnimal == null) )
	    {
	    	
	    	System.out.println("Por favor, insira os dados corretamente para exibir o card.");
	    	
	    	
	    }
	    else 
	    {	
	    System.out.println(a.toString());
	    switch(a.nomeAnimal)
	    {
	    case "Onça":
	    	System.out.println(a.dadosOnca);
	    	break;
	    case "Tucano":
	    	System.out.println(a.dadosTucano);
	    	break;
	    case "Tuiuiu":
	    	System.out.println(a.dadosTuiuiu);
	    	break;
	    case "Tamanduá":
	    	System.out.println(a.dadosTamandua);
	    	break;
	    default:
	    	System.out.println("\nInsira um nome de animal válido para exibir o texto.");
	    	break;
	    }
	    entrada.close();
	    }
	    
	    

        
       
        
       
    }
}