package tn.fst.tpfoyer.service;
import tn.fst.tpfoyer.entity.Chambre;
import java.util.List;
public interface IChambreService {
    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
// Here we will add later methods calling keywords and methods calling JPQL
}