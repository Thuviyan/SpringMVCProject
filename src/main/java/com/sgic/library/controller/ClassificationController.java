package com.sgic.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sgic.library.model.Classification;
import com.sgic.library.service.ClassificationService;

@Controller
public class ClassificationController {
	
	@Autowired
	private ClassificationService classificationService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String printWelcome(Model model) {
		model.addAttribute("classification", new Classification());
		return "addclassification";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute("classification") Classification classification) {
		classificationService.storeClassification(classification);
		return null;
	}

}
