package tn.fst.tpfoyer.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.fst.tpfoyer.entity.Bloc;
import tn.fst.tpfoyer.entity.Chambre;
import tn.fst.tpfoyer.entity.Foyer;
import tn.fst.tpfoyer.repositories.BlocRepository;
import tn.fst.tpfoyer.repositories.ChambreRepository;
import tn.fst.tpfoyer.repositories.FoyerRepository;
import java.util.List;
@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {
    private ChambreRepository chambreRepository;
    private BlocRepository blocRepository;
    private FoyerRepository foyerRepository;
    //CRUD
    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }
    @Override
    public Bloc retrieveBloc(Long blocId) {
        return blocRepository.findById(blocId).get();
    }
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
    @Override
    public void removeBloc(Long blocId) {
        blocRepository.deleteById(blocId);
    }
    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    //Cas 1
    @Override
    public Bloc addBlocWithChambres(Bloc bloc) {
        if (bloc.getChambres() != null) {
            for (Chambre c : bloc.getChambres()) {
                c.setBloc(bloc);
            }
        }
        return blocRepository.save(bloc);
    }
    //Cas 2
    @Override
    public void assignChambreToBloc(Long chambreId, Long blocId) {

        Chambre chambre = chambreRepository.findById(chambreId).orElse(null);
        Bloc bloc = blocRepository.findById(blocId).orElse(null);

        if (chambre != null && bloc != null) {
            chambre.setBloc(bloc);          // affectation
            chambreRepository.save(chambre); // save côté enfant
        }
    }
    //Cas 3
    @Override
    public void assignBlocToFoyer(Long blocId, Long foyerId) {
        Bloc bloc = blocRepository.findById(blocId).orElse(null);
        Foyer foyer = foyerRepository.findById(foyerId).orElse(null);

        if (bloc != null && foyer != null) {
            bloc.setFoyer(foyer);     // affectation
            blocRepository.save(bloc); // save côté propriétaire
        }
    }








}
