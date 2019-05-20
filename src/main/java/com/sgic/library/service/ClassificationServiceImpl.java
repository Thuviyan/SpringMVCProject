package com.sgic.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.dao.ClassificationDao;
import com.sgic.library.model.Classification;

@Service
public class ClassificationServiceImpl implements ClassificationService{
	
	@Autowired
	private ClassificationDao classificationDao;
	

//
//public void setClassificationDao(ClassificationDao classificationDao) {
//	this.classificationDao = classificationDao;
//}
	
	public Classification storeClassification(Classification classification) {
		classificationDao.addClassification(classification);
		return null;
		
		
	}

}
