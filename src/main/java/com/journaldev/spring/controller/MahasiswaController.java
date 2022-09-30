package com.journaldev.spring.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.journaldev.spring.model.Mahasiswa;
import com.journaldev.spring.model.Prodi;
import com.journaldev.spring.service.MahasiswaService;
import com.journaldev.spring.service.ProdiService;

@RequestMapping("/mahasiswa")
@Controller
public class MahasiswaController {

	@Autowired
	private MahasiswaService mhsService;
	private ProdiService prodiService;

	@RequestMapping
	public ModelAndView listMahasiswa(ModelAndView model) {
		List<Mahasiswa> mhs = mhsService.listMahasiswa();
		//List<Prodi> prodi = prodiService.listProdi();
		model.addObject("allMahasiswa", mhs);
		//model.addObject("allProdi", prodi);
		model.setViewName("view");

		return model;
	}

	@RequestMapping("/remove/{id}")
	public String hapusMahasiswa(@PathVariable("id") String id){
        mhsService.hapusMahasiswa(id);
        return "redirect:/mahasiswa";
    }
	
	@PostMapping(value="/add")
	public String tambahMahasiswa(Model model, HttpServletRequest req) {
		Mahasiswa mhs = new Mahasiswa();
		ensuresUUID uuid = new ensuresUUID();
		
		mhs.setMahasiswaNama(req.getParameter("nama"));
		mhs.setMahasiswaId(uuid.letterFirstUUID());
		mhs.setMahasiswaNim(req.getParameter("nim"));
		mhs.setMahasiswaEmail(req.getParameter("email"));
		mhsService.tambahMahasiswa(mhs);
		return "redirect:/mahasiswa";
	}
	
	@PostMapping(value="/edit")
	public String EditMahasiswa(Model mode, HttpServletRequest req) {
		Mahasiswa mhs = new Mahasiswa();
		mhs.setMahasiswaNama(req.getParameter("editNama"));
		mhs.setMahasiswaId(req.getParameter("editId"));
		mhs.setMahasiswaNim(req.getParameter("editNim"));
		mhs.setMahasiswaEmail(req.getParameter("editEmail"));
		mhsService.editMahasiswa(mhs);
		
		return "redirect:/mahasiswa";
	}

}

class ensuresUUID{
	public String letterFirstUUID() {
		String newUUID = UUID.randomUUID().toString();
		
		while(Character.isDigit(newUUID.charAt(0))){
			newUUID = UUID.randomUUID().toString();
		}
		
		return newUUID;
	}
}
