package tn.fst.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.fst.tpfoyer.entity.Bloc;
import tn.fst.tpfoyer.service.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {

    private IBlocService blocService;
    //CRUD
    // http://localhost:8089/tpfoyer/bloc/retrieve-all-blocs
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        return blocService.retrieveAllBlocs();
    }

    // http://localhost:8089/tpfoyer/bloc/retrieve-bloc/1
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long blocId) {
        return blocService.retrieveBloc(blocId);
    }

    // http://localhost:8089/tpfoyer/bloc/add-bloc
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    // http://localhost:8089/tpfoyer/bloc/remove-bloc/1
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long blocId) {
        blocService.removeBloc(blocId);
    }

    // http://localhost:8089/tpfoyer/bloc/modify-bloc
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc bloc) {
        return blocService.modifyBloc(bloc);
    }
}
