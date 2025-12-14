package tn.fst.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.fst.tpfoyer.entity.Etudiant;
import tn.fst.tpfoyer.service.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {

    private IEtudiantService etudiantService;
    //CRUD
    // http://localhost:8089/tpfoyer/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    // http://localhost:8089/tpfoyer/etudiant/retrieve-etudiant/1
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        return etudiantService.retrieveEtudiant(etudiantId);
    }

    // http://localhost:8089/tpfoyer/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    // http://localhost:8089/tpfoyer/etudiant/remove-etudiant/1
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        etudiantService.removeEtudiant(etudiantId);
    }

    // http://localhost:8089/tpfoyer/etudiant/modify-etudiant
    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.modifyEtudiant(etudiant);
    }
}
