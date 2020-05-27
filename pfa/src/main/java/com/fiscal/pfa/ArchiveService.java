package com.fiscal.pfa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiscal.pfa.models.Archive;



@Service
public class ArchiveService {
	@Autowired
	private ArchiveRepository repo;
	
	public List<Archive> listAll()
	{
		return repo.findAll();
	}
	public void save(Archive arch)
	{
		repo.save(arch);
	}
	public Archive get(Long id)
	{
		return repo.findById(id).get();
	}
	public void delete(Long id)
	{
		repo.deleteById(id);
	}
}
