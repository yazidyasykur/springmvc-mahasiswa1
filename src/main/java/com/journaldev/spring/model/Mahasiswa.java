package com.journaldev.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@Table(name="mahasiswa")
public class Mahasiswa {

	@Id
	@Column(name="mahasiswa_id")
	private String mahasiswaId;
	
	@Column(name="mahasiswa_nim")
	private String mahasiswaNim;
	
	@Column(name="mahasiswa_nama")
	private String mahasiswaNama;
	
	@Column(name="mahasiswa_email")
	private String mahasiswaEmail;

	
}
