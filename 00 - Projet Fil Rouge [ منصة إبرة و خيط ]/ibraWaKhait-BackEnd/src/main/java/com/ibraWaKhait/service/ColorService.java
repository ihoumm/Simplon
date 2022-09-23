package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.Color;

public interface ColorService {
	
	Color addColor(Color color);
	
	List<Color> getAllColors();
	
	Color getColorById(long id);
	
	Color updateColor(Color color, long id);

	void deleteColoryById(long id);
}
