package com.example.SpringHibernateComputadora.general;

import java.util.List;

public interface Metodos {
	public void guardar(Object o);
	public void editar(Object o);
	public void eliminar(Object o);
	public Object buscar(Object o);
	public List mostrar();
}
