package br.gabrieelmoura.swapi.repository;

import br.gabrieelmoura.swapi.model.World;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorldRepository extends MongoRepository<World, String> {

    public List<World> findByName(String name);

}
