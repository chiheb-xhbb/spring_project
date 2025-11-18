package tn.fst.tpfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.fst.tpfoyer.entity.Bloc;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
    // Tu peux ajouter des méthodes dérivées ici si besoin plus tard.
}
