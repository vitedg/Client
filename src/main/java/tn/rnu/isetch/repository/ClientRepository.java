package tn.rnu.isetch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.rnu.isetch.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
