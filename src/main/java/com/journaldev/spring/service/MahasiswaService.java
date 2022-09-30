package com.journaldev.spring.service;

import java.util.List;

import com.journaldev.spring.model.Mahasiswa;

public interface MahasiswaService {

	public List<Mahasiswa> listMahasiswa();
	public void hapusMahasiswa(String id);
	public void tambahMahasiswa(Mahasiswa mhs);
	public void editMahasiswa(Mahasiswa mhs);
	
}
