package com.ibraWaKhait.service.implementation;

import java.util.List;

import com.ibraWaKhait.exception.ResourceNotFoundException;
import com.ibraWaKhait.model.DeliveryMethod;
import com.ibraWaKhait.repository.DeliveryMethodRepository;
import com.ibraWaKhait.service.DeliveryMethodService;

public class DeliveryMethodServiceImplementation implements DeliveryMethodService {
	
	private DeliveryMethodRepository deliveryMethodRepository;

	@Override
	public DeliveryMethod addDeliveryMethod(DeliveryMethod deliveryMethod) {
		// TODO Auto-generated method stub
		return this.deliveryMethodRepository.save(deliveryMethod);
	}

	@Override
	public List<DeliveryMethod> getAllDeliveryMethods() {
		// TODO Auto-generated method stub
		return deliveryMethodRepository.findAll();
	}

	@Override
	public DeliveryMethod getDeliveryMethodById(long id) {
		// TODO Auto-generated method stub
		return this.deliveryMethodRepository.findById(id).get();
	}

	@Override
	public DeliveryMethod updateDeliveryMethod(DeliveryMethod deliveryMethod, long id) {
		DeliveryMethod existingDeliveryMethod = deliveryMethodRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("activiteRepository", "id", id));
		
		existingDeliveryMethod.setDeliveryMethod_id(deliveryMethod.getDeliveryMethod_id());
		existingDeliveryMethod.setDeliveryMethodName(deliveryMethod.getDeliveryMethodName());
		existingDeliveryMethod.setShipped_at(deliveryMethod.getShipped_at());
		existingDeliveryMethod.setRecieved_at(deliveryMethod.getRecieved_at());
		
		deliveryMethodRepository.save(existingDeliveryMethod);
		
		return existingDeliveryMethod;
	}

	@Override
	public void deleteDeliveryMethodById(long id) {
		this.deliveryMethodRepository.deleteById(id);
	}

}
