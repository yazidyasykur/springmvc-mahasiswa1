package com.journaldev.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.journaldev.spring.dao.ProdiDao;
import com.journaldev.spring.model.Prodi;

public class ProdiServiceImpl implements ProdiService {

	@Autowired
	private ProdiDao prodidao;
	
	@Override
	@Transactional
	public List<Prodi> listProdi() {
		return prodidao.getProdi();
	}

}
