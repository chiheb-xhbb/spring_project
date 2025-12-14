package tn.fst.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.fst.tpfoyer.entity.Universite;
import tn.fst.tpfoyer.service.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {

    private IUniversiteService universiteService;
    //CRUD
    // http://localhost:8089/tpfoyer/universite/retrieve-all-universites
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    // http://localhost:8089/tpfoyer/universite/retrieve-universite/1
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(
            @PathVariable("universite-id") Long universiteId) {
        return universiteService.retrieveUniversite(universiteId);
    }

    // http://localhost:8089/tpfoyer/universite/add-universite
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    // http://localhost:8089/tpfoyer/universite/remove-universite/1
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(
            @PathVariable("universite-id") Long universiteId) {
        universiteService.removeUniversite(universiteId);
    }

    // http://localhost:8089/tpfoyer/universite/modify-universite
    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite universite) {
        return universiteService.modifyUniversite(universite);
    }
}
