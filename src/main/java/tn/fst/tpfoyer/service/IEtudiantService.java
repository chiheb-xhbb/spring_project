package tn.fst.tpfoyer.service;
import tn.fst.tpfoyer.entity.Etudiant;
import java.util.List;
public interface IEtudiantService {
    ///CRUD 
    public List<Etudiant> retrieveAllEtudiants();
    public Etudiant retrieveEtudiant(Long etudiantId);
    public Etudiant addEtudiant(Etudiant etudiant);
    public void removeEtudiant(Long etudiantId);
    public Etudiant modifyEtudiant(Etudiant etudiant);
}
