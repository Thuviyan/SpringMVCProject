package com.sgic.library.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sgic.library.model.Classification;
import com.sgic.library.service.ClassificationService;
import com.sgic.library.service.ClassificationServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//@SuppressWarnings("resource")
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("SpringConfig.xml");

	ClassificationService classificationService = ctx.getBean("classificationService", ClassificationServiceImpl.class);
		
//		Classification classification = new Classification();
//		classification.setClassificationName("spring");
//		
//		classificationService.storeClassification(classification);
		
//		for(Classification classification:classificationService.getClassification()) {
//			System.out.println(classification.getId()+" "+classification.getClassificationName());
//		}
		
		
	}

}
