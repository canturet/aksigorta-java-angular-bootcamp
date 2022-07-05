package org.egitim.springboot.controller.mvc;

import org.egitim.springboot.controller.rest.KisiRestController;
import org.egitim.springboot.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KisiController {

	@Autowired
	KisiService kisiService;

	@Autowired
	KisiRestController kisiRestController;

	@GetMapping("/islem/kisitumliste")
	public String getKisiTumListe(Model model) {
		model.addAttribute("kisiTumListeAttribute", kisiService.tumunuListele());
		return "";
	}

	@GetMapping("/islem/kisitumliste")
	public String getKisiTumListeRest(Model model) {
		model.addAttribute("kisiTumListeAttribute", kisiRestController.getAllKisi());
		return "";
	}

}
