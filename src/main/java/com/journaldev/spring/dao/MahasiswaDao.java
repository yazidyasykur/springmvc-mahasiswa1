package com.journaldev.spring.dao;

import java.util.List;

import com.journaldev.spring.model.Mahasiswa;

public interface MahasiswaDao {

	public List<Mahasiswa> getAll();
	public Mahasiswa findById(String id);
	public void deleteById(String id);
	public void insert(Mahasiswa mhs);
	public void update(Mahasiswa mhs);
	
}
