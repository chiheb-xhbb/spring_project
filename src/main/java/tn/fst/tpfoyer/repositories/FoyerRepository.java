package tn.fst.tpfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.fst.tpfoyer.entity.Foyer;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {
    // Tu peux ajouter des méthodes personnalisées ici si besoin
}
