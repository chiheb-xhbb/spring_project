package tn.fst.tpfoyer.entity;
import jakarta.persistence.*;
import java.util.List;
@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;
    // ASSOCIATIONS
    @ManyToOne
    private Foyer foyer;
    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
    private List<Chambre> chambres;
    // Constructors
    public Bloc() {}

    public Bloc(Long idBloc, String nomBloc, Long capaciteBloc) {
        this.idBloc = idBloc;
        this.nomBloc = nomBloc;
        this.capaciteBloc = capaciteBloc;
    }
    // Getters
    public Long getIdBloc() {
        return idBloc;
    }
    public String getNomBloc() {
        return nomBloc;
    }
    public Long getCapaciteBloc() {
        return capaciteBloc;
    }
    public Foyer getFoyer() {
        return foyer;
    }
    public List<Chambre> getChambres() {
        return chambres;
    }
    // Setters
    public void setIdBloc(Long idBloc) {
        this.idBloc = idBloc;
    }
    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }
    public void setCapaciteBloc(Long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }
    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }
    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }
}
