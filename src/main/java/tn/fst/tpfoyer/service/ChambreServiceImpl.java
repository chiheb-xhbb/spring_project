package tn.fst.tpfoyer.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import tn.fst.tpfoyer.entity.Chambre;
import tn.fst.tpfoyer.repositories.ChambreRepository;
import tn.fst.tpfoyer.service.IChambreService;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {
    ChambreRepository chambreRepository;
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }
    public Chambre retrieveChambre(Long chambreId) {
        return chambreRepository.findById(chambreId).get();
    }
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }
    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);
    }
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
}