package tn.fst.tpfoyer.service;
import tn.fst.tpfoyer.entity.Foyer;
import java.util.List;
public interface IFoyerService {
    ///CRUD 
    public List<Foyer> retrieveAllFoyers();
    public Foyer retrieveFoyer(Long foyerId);
    public Foyer addFoyer(Foyer foyer);
    public void removeFoyer(Long foyerId);
    public Foyer modifyFoyer(Foyer foyer);
}
