package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.service.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String getOwners(Model model) {
        Set<Owner> owners = ownerService.findAll();
        model.addAttribute("owners", owners);
        return "owners/index";
    }
}
