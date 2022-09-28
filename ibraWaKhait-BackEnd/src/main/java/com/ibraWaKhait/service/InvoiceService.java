package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.Invoice;

public interface InvoiceService {
	

	Invoice addInvoice(Invoice invoice);
	
	List<Invoice> getAllInvoices();
	
	Invoice getInvoiceById(long id);
	
	Invoice updateInvoice(Invoice invoice, long id);

	void deleteInvoiceById(long id);
	
}
