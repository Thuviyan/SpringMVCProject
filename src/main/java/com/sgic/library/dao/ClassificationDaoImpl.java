package com.sgic.library.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sgic.library.model.Classification;

@Repository
@Transactional
public class ClassificationDaoImpl implements ClassificationDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
//	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//		this.hibernateTemplate = hibernateTemplate;
//	}

	@Override
	public Classification addClassification(Classification classification) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(classification);
		
		return null;
	}

	
}
