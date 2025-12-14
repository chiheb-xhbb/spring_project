package tn.fst.tpfoyer.service;
import tn.fst.tpfoyer.entity.Universite;
import tn.fst.tpfoyer.entity.Universite;
import java.util.List;
public interface IUniversiteService {
    ///CRUD
    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite(Long universiteId);
    public Universite addUniversite(Universite universite);
    public void removeUniversite(Long universiteId);
    public Universite modifyUniversite(Universite universite);
}
