package com.soussHealthOnlineStore.service;

import java.util.List;

public interface PharmacieServices<T> {
	public List<T>getAll();
    public T getById(Long id);
    public T save(T t);
    public void update(T t, Long id);
    public void delete(Long id);	
	public List<T> findByNameOrPartName(String name);


}
