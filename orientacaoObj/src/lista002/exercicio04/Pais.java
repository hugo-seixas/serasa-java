package lista002.exercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pais {
	
	private String codigoISO;
	private String nome;
	private long populacao;
	private double dimensao;
	
	private List<String> paisesFronteiricos = new ArrayList<>();
	
	public Pais(String codigoISO, String nome, double dimensao) {
		this.codigoISO = codigoISO;
		this.nome = nome;
		this.dimensao = dimensao;
	}

	public String getCodigoISO() {
		return codigoISO;
	}

	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getPopulacao() {
		return populacao;
	}

	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	public List<String> getPaisesFronteiricos() {
		return paisesFronteiricos;
	}

	
	

//	@Override
//	public int hashCode() {
//		return Objects.hash(codigoISO, dimensao, nome, paisesFronteiricos, populacao);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(codigoISO, other.codigoISO);
	}

	public boolean isLimitrofe(String pais) {
		return getPaisesFronteiricos().contains(pais);
	}
	
	public double getDensidadePopulacional() {
		return this.populacao / this.dimensao;
	}
	
	public List<String> getPaisesFronteiricosEmComum(Pais pais){
		//Itera sobre a lista de um pais
		//Verificar se o item atual está contido na lista de outro país
		// se estiver adicionar a uma lista que sera retornado
		
		//retorna a lista 
		
		return null;
	}
	

}
