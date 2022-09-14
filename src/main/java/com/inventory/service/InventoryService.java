package com.inventory.service;

import org.springframework.stereotype.Service;

import com.inventory.bean.InventoryItem;

@Service
public interface InventoryService {

	public InventoryItem getByProductCodeId(String productCode);
	public boolean updateItemByProductCode(String productCode,int availableQuantity);
	
}
