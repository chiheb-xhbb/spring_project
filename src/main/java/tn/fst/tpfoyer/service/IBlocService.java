package tn.fst.tpfoyer.service;
import tn.fst.tpfoyer.entity.Bloc;
import java.util.List;
public interface IBlocService {
    ///CRUD
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(Long blocId);
    public Bloc addBloc(Bloc bloc);
    public void removeBloc(Long blocId);
    public Bloc modifyBloc(Bloc bloc);
    ///Cas 1
    Bloc addBlocWithChambres(Bloc bloc);
    ///CAS 2
    void assignChambreToBloc(Long chambreId, Long blocId);
    ///CAS 3
    void assignBlocToFoyer(Long blocId, Long foyerId);




}
