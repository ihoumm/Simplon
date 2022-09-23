package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.Size;

public interface SizeService {
	
	Size addSize(Size size);
	
	List<Size> getAllSizes();
	
	Size getSizeById(long id);
	
	Size updateSize(Size size, long id);

	void deleteSizeById(long id);
	
	
}
