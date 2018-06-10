package com.arv.shoppingbackend.dao;

import java.util.List;

import com.arv.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	
	List<Category> list();
	Category get(int id);
	
	

}
