package tn.rnu.isetch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.rnu.isetch.model.Client;
import tn.rnu.isetch.service.GestionClient;
import tn.rnu.isetch.service.GestionClientInterface;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientController {

	@Autowired
	public GestionClient gestClient;

	@GetMapping("/clients")
	public List<Client> getAll() {

		 return gestClient.selectAll();

	}

	
	@GetMapping("/client/{id}")
	public Client getClient(@PathVariable Integer id) {
		
		return gestClient.findByIdd(id);
	}
	
	@PostMapping("/client")
	public Client newClient(@RequestBody Client A) {
			 return gestClient.insert(A);
	}
	
	@DeleteMapping("/client/{id}")
	public void deletee(@PathVariable Integer id) {
		gestClient.delete(id);
	}
	
	
	@PutMapping("/client/{id}")
	public Client updateClient (@PathVariable Integer id, @RequestBody Client A)
			
	{
		Client client = gestClient.findByIdd(id);		
		return gestClient.insert(A);
	}

}
