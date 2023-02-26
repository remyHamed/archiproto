package Infrastructure.Repository;


import Domaine.Offer;

import java.util.List;
import java.util.Optional;

public interface OffreClientRepository {

    void save(Offer offreClient);

    Optional<Offer> findById(Long id);

    List<Offer> findAll();

    void deleteById(Long id);
}