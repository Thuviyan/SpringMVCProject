package com.sgic.library.dao;

import java.util.List;

import com.sgic.library.model.Classification;

public interface ClassificationDao {
	
	// calling methods
	public abstract Classification addClassification(Classification classification);
	public abstract List<Classification> getClassification();

}
