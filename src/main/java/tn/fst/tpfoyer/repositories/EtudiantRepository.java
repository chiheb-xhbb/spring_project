package tn.fst.tpfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.fst.tpfoyer.entity.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    // Tu peux ajouter des méthodes personnalisées ici si besoin
}
