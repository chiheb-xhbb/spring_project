package tn.fst.tpfoyer.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;
    // ASSOCIATIONS
    @OneToOne(mappedBy = "foyer")
    private Universite universite;
    @OneToMany(mappedBy = "foyer")
    private List<Bloc> blocs;
    // Constructors
    public Foyer() {}
    public Foyer(Long idFoyer, String nomFoyer, Long capaciteFoyer) {
        this.idFoyer = idFoyer;
        this.nomFoyer = nomFoyer;
        this.capaciteFoyer = capaciteFoyer;
    }
    // Getters
    public Long getIdFoyer() {
        return idFoyer;
    }
    public String getNomFoyer() {
        return nomFoyer;
    }
    public Long getCapaciteFoyer() {
        return capaciteFoyer;
    }
    public List<Bloc> getBlocs() {
        return blocs;
    }
    public Universite getUniversite() {
        return universite;
    }
    // Setters
    public void setIdFoyer(Long idFoyer) {
        this.idFoyer = idFoyer;
    }
    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }
    public void setCapaciteFoyer(Long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }
    public void setBlocs(List<Bloc> blocs) {
        this.blocs = blocs;
    }
    public void setUniversite(Universite universite) {
        this.universite = universite;
    }
}
