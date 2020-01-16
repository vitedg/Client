package tn.rnu.isetch.service;

import java.util.List;

import tn.rnu.isetch.model.Client;

public interface GestionClientInterface {

	public Client insert(Client A);

	public List<Client> selectAll();

	public Client findByIdd(Integer id);

	public void delete(Integer Id);


}
