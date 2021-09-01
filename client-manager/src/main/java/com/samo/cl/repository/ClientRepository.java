package com.samo.cl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samo.cl.entity.Client;


public interface ClientRepository extends JpaRepository<Client, Long>{

}
