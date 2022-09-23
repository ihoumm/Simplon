package com.ibraWaKhait.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.Size;
import com.ibraWaKhait.repository.SizeRepository;
import com.ibraWaKhait.service.SizeService;


@Service
public class SizeServiceImplementation implements SizeService {
	
	private SizeRepository sizeRepository;

	@Override
	public Size addSize(Size size) {
		// TODO Auto-generated method stub
		return this.sizeRepository.save(size);
	}

	@Override
	public List<Size> getAllSizes() {
		// TODO Auto-generated method stub
		return sizeRepository.findAll();
	}

	@Override
	public Size getSizeById(long id) {
		// TODO Auto-generated method stub
		return this.sizeRepository.findById(id).get();
	}

	@Override
	public Size updateSize(Size size, long id) {
		
		Size existingSize = sizeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("sizeRepository", "id", id));
		
		existingSize.setSize_id(size.getSize_id());
		existingSize.setSizeName(size.getSizeName());
		existingSize.setSize(size.getSize());
		
		sizeRepository.save(existingSize);
		
		return existingSize;
	}

	@Override
	public void deleteSizeById(long id) {
		this.sizeRepository.deleteById(id);
	}

}
