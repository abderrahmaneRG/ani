package com.fiscal.pfa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fiscal.pfa.models.Archive;

@Controller
public class ArchController {
	@Autowired
	private ArchiveService arch;
	
	@RequestMapping("/i2")
	public String viewHomePage(Model model)
	{
		List<Archive> listArchives = arch.listAll();
		model.addAttribute("listArchives",listArchives);
		return "i2";
	}
	
	@RequestMapping("/deleteArch/{idArchive}")
	public String deleteArchive(@PathVariable(name ="idArchive") Long idArchive)
	{
		arch.delete(idArchive);
		return "redirect:/i2";
	}
}
