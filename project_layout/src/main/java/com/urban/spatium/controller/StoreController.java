package com.urban.spatium.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.urban.spatium.dto.Store;
import com.urban.spatium.service.StoreService;

@Controller
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	
	@PostMapping("/addStore")
	public String addStore(Model model, Store store) {
		
		return "main";
	}
	
	@GetMapping("/addStore")
	public String addStore(Model model) {
		model.addAttribute("title", "업체 등록");
		return "store/addStore";
	}
	
	@GetMapping("/storeListOK")
	public String storeList(Model model) {
		List<Store> storeList = storeService.storeList();
		model.addAttribute("title", "업체 리스트");
		model.addAttribute("storeList", storeList);
		return "store/storeListOK";
	}
}	