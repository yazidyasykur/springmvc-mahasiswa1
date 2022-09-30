package com.journaldev.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.journaldev.spring.model.Mahasiswa;

@Repository
public class MahasiswaDaoImpl implements MahasiswaDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Mahasiswa> getAll() {
		Session session = sessionFactory.getCurrentSession();
		List<Mahasiswa> list = session.createQuery("from Mahasiswa").list();
		return list;
	}

	@Override
	public Mahasiswa findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(String id) {
		Session session = sessionFactory.getCurrentSession();
		Mahasiswa m = session.load(Mahasiswa.class, id);
		session.delete(m);
	}

	@Override
	public void insert(Mahasiswa mhs) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(mhs);
	}

	@Override
	public void update(Mahasiswa mhs) {
		Session session = sessionFactory.getCurrentSession();
		session.update(mhs);
	}

}
