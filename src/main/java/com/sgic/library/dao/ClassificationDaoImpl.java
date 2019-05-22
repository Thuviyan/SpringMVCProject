package com.sgic.library.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sgic.library.model.Classification;

// transactional - no data loses
@Repository
@Transactional
public class ClassificationDaoImpl implements ClassificationDao{
	
	
	//creating new object
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

	@Override
	public List<Classification> getClassification() {
		// TODO Auto-generated method stub
		List<Classification> list = new ArrayList<Classification>();
		list = hibernateTemplate.loadAll(Classification.class);
		return list;
	}

	
}
