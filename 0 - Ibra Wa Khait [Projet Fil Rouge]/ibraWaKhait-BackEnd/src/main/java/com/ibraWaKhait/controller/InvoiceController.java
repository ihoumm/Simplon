package com.ibraWaKhait.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ibraWaKhait.model.Invoice;
import com.ibraWaKhait.service.InvoiceService;

public class InvoiceController {
	
	private InvoiceService invoiceService;
	
	public InvoiceController(InvoiceService invoiceService) {
		super();
		this.invoiceService = invoiceService;
	}

	// build create Invoice REST API
	@PostMapping
	public ResponseEntity<Invoice> addInvoice(@RequestBody Invoice invoice) {
		return new ResponseEntity<Invoice>(invoiceService.addInvoice(invoice), HttpStatus.CREATED);
	}

	// build get all Invoice REST API
	@GetMapping
	public List<Invoice> getAllInvoices() {
		return invoiceService.getAllInvoices();
	}

	// build get Invoice by id REST API
	// http://localhost:8080/api/invoice/1
	@GetMapping("{id}")
	public ResponseEntity<Invoice> getInvoiceById(@PathVariable("id") long invoice_id) {
		return new ResponseEntity<Invoice>(invoiceService.getInvoiceById(invoice_id), HttpStatus.OK);
	}

	// build update Invoice REST API
	// http://localhost:8080/api/invoice/1
	@PutMapping("{id}")
	public ResponseEntity<Invoice> updateInvoice(@PathVariable("id") long id, @RequestBody Invoice invoice) {
		return new ResponseEntity<Invoice>(invoiceService.updateInvoice(invoice, id), HttpStatus.OK);
	}

	// build delete Invoice REST API
	// http://localhost:8080/api/invoice/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteInvoice(@PathVariable("id") long id) {

		// delete Invoice from DB
		invoiceService.deleteInvoiceById(id);

		return new ResponseEntity<String>("Invoice deleted successfully!.", HttpStatus.OK);
	}


}
