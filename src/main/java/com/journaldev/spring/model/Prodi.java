package com.journaldev.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prodi")
public class Prodi {

	@Id
	@Column(name="prodi_id")
	private String prodiId;
	
	@Column(name="prodi_nama")
	private String prodiNama;

	public String getProdiId() {
		return prodiId;
	}

	public void setProdiId(String prodiId) {
		this.prodiId = prodiId;
	}

	public String getProdiNama() {
		return prodiNama;
	}

	public void setProdiNama(String prodiNama) {
		this.prodiNama = prodiNama;
	}

}
