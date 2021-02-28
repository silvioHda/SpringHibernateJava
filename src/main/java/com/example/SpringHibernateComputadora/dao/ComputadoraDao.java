package com.example.SpringHibernateComputadora.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.SpringHibernateComputadora.general.Metodos;
import com.example.SpringHibernateComputadora.entidad.Computadora;

public class ComputadoraDao implements Metodos{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Computadora");
	EntityManager em = emf.createEntityManager();
	Computadora Computadora = null;

	@Override
	public void guardar(Object o) {
		// TODO Auto-generated method stub
		Computadora = (Computadora) o;
		em.getTransaction().begin();
		try {
			em.persist(Computadora);
			em.getTransaction().commit();
			System.out.println("Se gurado la Computadora");
		} catch (Exception e) {
			System.out.println("Error insertar-> " + e.getMessage());
			em.getTransaction().rollback();
		}
	}

	@Override
	public void editar(Object o) {
		// TODO Auto-generated method stub
		Computadora = (Computadora) o;
		em.getTransaction().begin();
		try {
			em.merge(Computadora);
			em.getTransaction().commit();
			System.out.println("Se gurado la Computadora");
		} catch (Exception e) {
			System.out.println("Error editarr-> " + e.getMessage());
			em.getTransaction().rollback();
		}
	}

	@Override
	public void eliminar(Object o) {
		// TODO Auto-generated method stub
		Computadora = (Computadora) o;
		Computadora = em.find(Computadora.class, Computadora.getId());
		em.getTransaction().begin();
		try {
			em.remove(Computadora);
			em.getTransaction().commit();
			System.out.println("Se gurado la Computadora");
		} catch (Exception e) {
			System.out.println("Error eliminar-> " + e.getMessage());
			em.getTransaction().rollback();
		}
	}

	@Override
	public Object buscar(Object o) {
		// TODO Auto-generated method stub

		Computadora = (Computadora) o;
		return em.createQuery("from Computadora where id= " + Computadora.getId()).getResultList().get(0);
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return em.createQuery("from Computadora order by id").getResultList();
	}

}
