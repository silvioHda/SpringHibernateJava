package com.example.SpringHibernateComputadora.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringHibernateComputadora.dao.ComputadoraDao;
import com.example.SpringHibernateComputadora.entidad.Computadora;
@Controller
@RequestMapping("/Computadora")
public class ComputadoraCtrl {
ComputadoraDao dao = null;
	
	
	
	@GetMapping("/inicio")
	public ModelAndView inicio2() {
		
		ModelAndView v = new ModelAndView("index");
		dao= new ComputadoraDao();
		List<Computadora>lista = dao.mostrar();
		v.addObject("list",lista);
		return v;
	}
	
	@GetMapping("/agregar")
	public ModelAndView agregar() {
		
		ModelAndView v = new ModelAndView("agregar");
		dao= new ComputadoraDao();
		//List<Computadora>lista = dao.mostrar();
		v.addObject("computadora",new Computadora());
		return v;
	}
	@PostMapping("/guardar")
	public ModelAndView guardar(Computadora Computadora) {
		
		ModelAndView v = new ModelAndView("index");
		dao= new ComputadoraDao();
		dao.guardar(Computadora);
		List<Computadora>lista = dao.mostrar();
		v.addObject("list",lista);
		return v;
		
	}
	@GetMapping("/editar")
	public ModelAndView editar(@RequestParam(name="id",required=true)int id) {
		ModelAndView v = new ModelAndView("editar");
		dao= new ComputadoraDao();
		Computadora s = new Computadora(id);
		s= (Computadora) dao.buscar(s);
		v.addObject("computadora",s);
		return v;
	}
	
	@PostMapping("/actualizar")
	public ModelAndView actualizar(Computadora Computadora) {
		
		ModelAndView v = new ModelAndView("index");
		dao= new ComputadoraDao();
		dao.editar(Computadora);
		List<Computadora>lista = dao.mostrar();
		v.addObject("list",lista);
		return v;
		
	}
	
	@GetMapping("/eliminar")
	public ModelAndView eliminar(@RequestParam(name="id",required=true)int id) {
		ModelAndView v = new ModelAndView("eliminar");
		dao= new ComputadoraDao();
		Computadora s = new Computadora(id);
		s= (Computadora) dao.buscar(s);
		v.addObject("computadora",s);
		return v;
	}
	
	@PostMapping("/borrar")
	public ModelAndView borrar(Computadora Computadora) {
		
		ModelAndView v = new ModelAndView("index");
		dao= new ComputadoraDao();
		dao.eliminar(Computadora);
		List<Computadora>lista = dao.mostrar();
		v.addObject("list",lista);
		return v;
		
	}
}
