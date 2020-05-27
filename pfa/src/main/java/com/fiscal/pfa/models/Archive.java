package com.fiscal.pfa.models;
// Generated May 26, 2020, 2:45:30 AM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Archive generated by hbm2java
 */
@Entity
@Table(name = "archive", catalog = "fiscal")
public class Archive implements java.io.Serializable {

	private Long idArchive;
	private Societe societe;
	private TypeFichier typeFichier;
	private String nomArchive;
	private Date dateCreaction;


	public Archive() {
	}

	public Archive(Long idArchive) {
		this.idArchive = idArchive;
		
	}

	public Archive(Long idArchive, Societe societe, TypeFichier typeFichier, String nomArchive, Date dateCreaction) {
		this.idArchive = idArchive;
		this.societe = societe;
		this.typeFichier = typeFichier;
		this.nomArchive = nomArchive;
		this.dateCreaction = dateCreaction;

	}

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idArchive", unique = true, nullable = false)
	public Long getIdArchive() {
		return this.idArchive;
	}

	public void setIdArchive(Long idArchive) {
		this.idArchive = idArchive;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idSociete",referencedColumnName="idSociete")
	public Societe getSociete() {
		return this.societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idType",referencedColumnName="idType")
	public TypeFichier getTypeFichier() {
		return this.typeFichier;
	}

	public void setTypeFichier(TypeFichier typeFichier) {
		this.typeFichier = typeFichier;
	}

	@Column(name = "nomArchive", length = 200)
	public String getNomArchive() {
		return this.nomArchive;
	}

	public void setNomArchive(String nomArchive) {
		this.nomArchive = nomArchive;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateCreaction", length = 10)
	public Date getDateCreaction() {
		return this.dateCreaction;
	}

	public void setDateCreaction(Date dateCreaction) {
		this.dateCreaction = dateCreaction;
	}





}