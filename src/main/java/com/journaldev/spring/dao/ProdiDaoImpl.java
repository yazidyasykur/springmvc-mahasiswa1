package com.journaldev.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.journaldev.spring.model.Prodi;

public class ProdiDaoImpl implements ProdiDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Prodi> getProdi() {
		Session session = sessionFactory.getCurrentSession();
		List<Prodi> list = session.createQuery("from Prodi").list();
		return list;
	}
	
}
