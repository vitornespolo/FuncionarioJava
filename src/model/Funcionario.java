package model;

import javax.persistence.Entity;

@Entity
public class Funcionario extends BaseEntityImpl{
	
	private String nome;
	private String sobreNome;
	private String email;
	private Integer pis;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPis() {
		return pis;
	}
	public void setPis(Integer pis) {
		this.pis = pis;
	}
	

}