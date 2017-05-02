package com.groupone.Dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.groupone.Model.NewsModel;

@Transactional
public interface NewsDao extends CrudRepository<NewsModel, String>{
	NewsModel findNewsById(String id);
	
	void deleteById(String id); 
}
