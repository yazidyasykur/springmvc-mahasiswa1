package com.journaldev.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.journaldev.spring.dao.MahasiswaDao;
import com.journaldev.spring.model.Mahasiswa;

@Service
public class MahasiswaServiceImpl implements MahasiswaService {

	@Autowired
	private MahasiswaDao mahasiswaDao;
	
	@Override
	@Transactional
	public List<Mahasiswa> listMahasiswa() {
		return mahasiswaDao.getAll();
	}

	@Override
	@Transactional
	public void hapusMahasiswa(String id) {
		mahasiswaDao.deleteById(id);
	}

	@Override
	@Transactional
	public void tambahMahasiswa(Mahasiswa mhs) {
		mahasiswaDao.insert(mhs);
	}

	@Override
	@Transactional
	public void editMahasiswa(Mahasiswa mhs) {
		mahasiswaDao.update(mhs);
	}
	
	

}
