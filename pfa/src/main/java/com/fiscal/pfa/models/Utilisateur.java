package com.fiscal.pfa.models;
// Generated May 26, 2020, 2:45:30 AM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Utilisateur generated by hbm2java
 */
@Entity
@Table(name = "utilisateur", catalog = "fiscal")
public class Utilisateur implements java.io.Serializable {

	private int idUser;
	private String nomUser;
	private String login;
	private String pwd;
	private String email;
	private String tel;

	public Utilisateur() {
	}

	public Utilisateur(int idUser) {
		this.idUser = idUser;
	
	}

	public Utilisateur(int idUser, String nomUser, String login, String pwd, String email, String tel, int idUser_1,
			String nomUser_1) {
		this.idUser = idUser;
		this.nomUser = nomUser;
		this.login = login;
		this.pwd = pwd;
		this.email = email;
		this.tel = tel;

	}

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idUser", unique = true, nullable = false)
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	@Column(name = "nomUser", length = 100)
	public String getNomUser() {
		return this.nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	@Column(name = "login", length = 100)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "pwd", length = 100)
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Column(name = "email", length = 300)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "tel", length = 30)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}


}
