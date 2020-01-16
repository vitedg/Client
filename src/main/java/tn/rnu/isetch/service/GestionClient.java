package tn.rnu.isetch.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.rnu.isetch.model.Client;
import tn.rnu.isetch.repository.ClientRepository;

@Service
@Transactional
public class GestionClient implements GestionClientInterface {

	@Autowired
	private ClientRepository cli;

	@Override
	public Client insert(Client A) {
		// TODO Auto-generated method stub
		
		return cli.save(A);
	}

	@Override
	public List<Client> selectAll() {
		// TODO Auto-generated method stub
		return cli.findAll();
	}

	@Override
	public Client findByIdd(Integer id) {
		// TODO Auto-generated method stub
		return cli.getOne(id);
	}

	@Override
	public void delete(Integer Id) {
		// TODO Auto-generated method stub

		cli.deleteById(Id);
		
	}


}
