package com.sousstalent.service;

import java.util.List;

import com.sousstalent.model.Responsable;

public interface ResponsableService {
	
	List<Responsable> getAllResponsables();

	Responsable saveResponsable(Responsable responsable);

	Responsable getResponsableById(long id);
	
	Responsable updateResponsable(Responsable responsable, long id);

	void deleteResponsableById(long id);

}
