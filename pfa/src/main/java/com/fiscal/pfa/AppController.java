package com.fiscal.pfa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fiscal.pfa.models.Societe;

@Controller
public class AppController {

	@Autowired
	private SocieteService service;
	
	@RequestMapping("/index")
	public String viewHomePage(Model model)
	{
		List<Societe> listSocietes = service.listAll();
		model.addAttribute("listSocietes",listSocietes);
		return "index";
	}
	@RequestMapping("/dashboard")
	
	public String dash()
	{
		
		return "test";
	}
	
	@RequestMapping("/new")
	public String ajouter(Model model) {
		Societe societe=new Societe();
		model.addAttribute("societe",societe);
		return "new_societe";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST )
	public String ajouterSociete(@ModelAttribute("societe") Societe societe) {
	
		service.save(societe);
		return "redirect:/";
		
		
	}
	
	@RequestMapping("/edit/{idSociete}")
	public ModelAndView modifierSociete(@PathVariable(name="idSociete") Long idSociete) {
		ModelAndView mav=new ModelAndView("edit_societe");
		Societe societe=service.get(idSociete);
		mav.addObject("societe", societe);
				return mav;
	}
	

	
	@RequestMapping("/deleteSociete/{idSociete}")
	public String deleteSociete(@PathVariable(name ="idSociete") Long idSociete)
	{
		service.delete(idSociete);
		return "redirect:/";
	}
	
}