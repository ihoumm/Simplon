package com.ibraWaKhait.service.implementation;

import java.util.List;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.Color;
import com.ibraWaKhait.repository.ColorRepository;
import com.ibraWaKhait.service.ColorService;

public class ColorServiceImplementation implements ColorService {
	
	private ColorRepository colorRepository;

	@Override
	public Color addColor(Color color) {
		// TODO Auto-generated method stub
		return this.colorRepository.save(color);
	}

	@Override
	public List<Color> getAllColors() {
		// TODO Auto-generated method stub
		return colorRepository.findAll();
	}

	@Override
	public Color getColorById(long id) {
		// TODO Auto-generated method stub
		return this.colorRepository.findById(id).get();
	}

	@Override
	public Color updateColor(Color color, long id) {
		
		Color exestingColor = colorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("colorRepository", "id", id));
		
		exestingColor.setColor_id(color.getColor_id());
		exestingColor.setColorName(color.getColorName());
		
		colorRepository.save(exestingColor);
		
		
		return exestingColor;
	}

	@Override
	public void deleteColoryById(long id) {
		this.colorRepository.deleteById(id);
		
	}

}
