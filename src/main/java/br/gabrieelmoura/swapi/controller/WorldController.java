package br.gabrieelmoura.swapi.controller;

import br.gabrieelmoura.swapi.model.World;
import br.gabrieelmoura.swapi.repository.WorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/world")
public class WorldController {

    @Autowired
    private WorldRepository worldRepository;

    @PostMapping
    public ResponseEntity<Object> create(World world) {
        worldRepository.insert(world);
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }

    @GetMapping
    public List<World> read(@Param("name") String name) {
        if (name != null) {
            return worldRepository.findByName(name);
        }
        return worldRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<World> find(@PathVariable("id") String id) {
        return worldRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        worldRepository.deleteById(id);
    }

}
