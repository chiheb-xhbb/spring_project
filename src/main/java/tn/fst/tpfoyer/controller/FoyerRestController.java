package tn.fst.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.fst.tpfoyer.entity.Foyer;
import tn.fst.tpfoyer.service.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {

    private IFoyerService foyerService;
    //CRUD
    // http://localhost:8089/tpfoyer/foyer/retrieve-all-foyers
    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    // http://localhost:8089/tpfoyer/foyer/retrieve-foyer/1
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long foyerId) {
        return foyerService.retrieveFoyer(foyerId);
    }

    // http://localhost:8089/tpfoyer/foyer/add-foyer
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    // http://localhost:8089/tpfoyer/foyer/remove-foyer/1
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long foyerId) {
        foyerService.removeFoyer(foyerId);
    }

    // http://localhost:8089/tpfoyer/foyer/modify-foyer
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer foyer) {
        return foyerService.modifyFoyer(foyer);
    }
}
