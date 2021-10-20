package model;

import javax.persistence.Entity;

@Entity
public class Funcionario extends BaseEntityImpl{
	
	private String nome;
	private String sobrenome;
	private String email;
	private Integer pis;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
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