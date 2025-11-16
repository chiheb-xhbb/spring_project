package tn.fst.tpfoyer.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private Date anneeUniversitaire;

    private boolean estValide;

    // ASSOCIATIONS
    @ManyToOne
    private Chambre chambre;

    @ManyToOne
    private Etudiant etudiant;

    // Constructeur par défaut
    public Reservation() {}

    // Constructeur avec paramètres
    public Reservation(Long idReservation, Date anneeUniversitaire, boolean estValide) {
        this.idReservation = idReservation;
        this.anneeUniversitaire = anneeUniversitaire;
        this.estValide = estValide;
    }

    // Getters
    public Long getIdReservation() {
        return idReservation;
    }

    public Date getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public boolean isEstValide() {
        return estValide;
    }

    // Setters
    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }
}
