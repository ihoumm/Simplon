package com.ibraWaKhait.service;

import java.util.List;

import com.ibraWaKhait.model.DeliveryMethod;

public interface DeliveryMethodService {
	
	DeliveryMethod addDeliveryMethod(DeliveryMethod deliveryMethod);
	
	List<DeliveryMethod> getAllDeliveryMethods();
	
	DeliveryMethod getDeliveryMethodById(long id);
	
	DeliveryMethod updateDeliveryMethod(DeliveryMethod deliveryMethod, long id);

	void deleteDeliveryMethodById(long id);
}
