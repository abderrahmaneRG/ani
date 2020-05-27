package com.fiscal.pfa;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiscal.pfa.models.Societe;

@Service
public class SocieteService {
	@Autowired
	private SocieteRepository repo;
	
	public List<Societe> listAll()
	{
		return repo.findAll();
	}
	public void save(Societe societe)
	{
		repo.save(societe);
	}
	public Societe get(Long id)
	{
		return repo.findById(id).get();
	}
	public void delete(Long id)
	{
		repo.deleteById(id);
	}
}
