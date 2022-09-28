package com.ibraWaKhait.service.implementation;

import java.util.List;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.Invoice;
import com.ibraWaKhait.repository.InvoiceRepository;
import com.ibraWaKhait.service.InvoiceService;

public class InvoiceServiceImplementation implements InvoiceService {
	
	private InvoiceRepository invoiceRepository;

	@Override
	public Invoice addInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		return this.invoiceRepository.save(invoice);
	}

	@Override
	public List<Invoice> getAllInvoices() {
		// TODO Auto-generated method stub
		return invoiceRepository.findAll();
	}

	@Override
	public Invoice getInvoiceById(long id) {
		// TODO Auto-generated method stub
		return this.invoiceRepository.findById(id).get();
	}

	@Override
	public Invoice updateInvoice(Invoice invoice, long id) {
		Invoice existingInvoice = invoiceRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("invoiceRepository", "id", id));
		
		existingInvoice.setInvoice_id(invoice.getInvoice_id());
		existingInvoice.setInvoice_date(invoice.getInvoice_date());
		existingInvoice.setInvoice_reference(invoice.getInvoice_reference());
		existingInvoice.setInvoiceName(invoice.getInvoiceName());
		existingInvoice.setRecieptient_fName(invoice.getRecieptient_fName());
		existingInvoice.setRecieptient_lName(invoice.getRecieptient_lName());
		existingInvoice.setRecieptient_phone(invoice.getRecieptient_phone());
		existingInvoice.setRecieptient_address(invoice.getRecieptient_address());
		existingInvoice.setInserted_at(invoice.getInserted_at());
		existingInvoice.setUpdated_at(invoice.getUpdated_at());
		
		invoiceRepository.save(existingInvoice);
		
		return existingInvoice;
	}

	@Override
	public void deleteInvoiceById(long id) {
		this.invoiceRepository.deleteById(id);
		
	}

}
