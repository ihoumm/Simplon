package com.ibraWaKhait.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ibraWaKhait.model.Invoice;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "invoices", path = "invoices")
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}