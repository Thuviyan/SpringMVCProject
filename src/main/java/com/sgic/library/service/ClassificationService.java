package com.sgic.library.service;

import java.util.List;

import com.sgic.library.model.Classification;

public interface ClassificationService {

	public abstract Classification storeClassification(Classification classification);
	public abstract List<Classification> getClassification();
}
