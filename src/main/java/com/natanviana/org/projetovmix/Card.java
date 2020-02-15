package com.natanviana.org.projetovmix;

public class Card {


	
	String nomeAnimal ;
	String nomeCientifico = "" ;
	String biomaAnimal = "" ;
	String imagemAnimal = "" ;
	String dadosOnca = "\nA onça-pintada ou jaguar, também conhecida como onça-preta, é uma espécie de mamífero carnívoro da família Felidae encontrada nas Américas.\nÉ o terceiro maior felino do mundo,após o tigre e o leão, e o maior do continente americano. \n";
	String dadosTamandua = "\nDescriçãoO tamanduá-bandeira, também chamado iurumi, jurumim, tamanduá-açu, tamanduá-cavalo, papa-formigas-gigante \ne urso-formigueiro-gigante, é um mamífero xenartro da família dos mirmecofagídeos, encontrado na América Central e na América do Sul. ";
	String dadosTuiuiu = "\nO jaburu, também conhecido como tuiuiú, tuiuguaçu, tuiú-quarteleiro, tuiupara, rei-dos-tuinins, tuim-de-papo-vermelho,\n cauauá, jabiru e jabiru-americano, é uma ave ciconiforme da família Ciconiidae.";
	String dadosTucano = "\nSão designadas por tucano as aves da família Ramphastidae que vivem nas florestas da América Central e América do Sul. \nPossuem um bico grande e oco. A parte superior é constituída por trabéculas de sustentação e a parte inferior é de natureza óssea.";

	@Override
	public String toString() {
		return "Card [nomeAnimal=" + nomeAnimal + ", nomeCientifico=" + nomeCientifico + ", biomaAnimal=" + biomaAnimal
				+ ", imagemAnimal=" + imagemAnimal + "]";
	}
	int idAnimal;
	public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	public String getBiomaAnimal() {
		return biomaAnimal;
	}
	public void setBiomaAnimal(String biomaAnimal) {
		this.biomaAnimal = biomaAnimal;
	}
	public String getImagemAnimal() {
		return imagemAnimal;
	}
	public void setImagemAnimal(String imagemAnimal) {
		this.imagemAnimal = imagemAnimal;
	}
	

	
}
