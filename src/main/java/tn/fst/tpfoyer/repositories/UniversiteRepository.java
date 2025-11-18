package tn.fst.tpfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.fst.tpfoyer.entity.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    // Tu peux ajouter des méthodes personnalisées ici si besoin
}
