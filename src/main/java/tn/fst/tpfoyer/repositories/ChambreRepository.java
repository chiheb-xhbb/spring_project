package tn.fst.tpfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.fst.tpfoyer.entity.Chambre;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    // Tu ajouteras plus tard des méthodes dérivées si besoin
}
