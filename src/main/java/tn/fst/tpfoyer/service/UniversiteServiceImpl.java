package tn.fst.tpfoyer.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.fst.tpfoyer.entity.Foyer;
import tn.fst.tpfoyer.entity.Universite;
import tn.fst.tpfoyer.repositories.FoyerRepository;
import tn.fst.tpfoyer.repositories.UniversiteRepository;
import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    private FoyerRepository foyerRepository;
    private UniversiteRepository universiteRepository;
    //CRUD
    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }
    @Override
    public Universite retrieveUniversite(Long universiteId) {return universiteRepository.findById(universiteId).get();}
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
    @Override
    public void removeUniversite(Long universiteId) {
        universiteRepository.deleteById(universiteId);
    }
    @Override
    public Universite modifyUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
    //CAS 4
    @Override
    public void assignFoyerToUniversite(Long foyerId, Long universiteId) {
        Foyer foyer = foyerRepository.findById(foyerId).orElse(null);
        Universite universite = universiteRepository.findById(universiteId).orElse(null);

        if (foyer != null && universite != null) {
            universite.setFoyer(foyer);         // assign foyer to université
            universiteRepository.save(universite);
        }
    }

}
