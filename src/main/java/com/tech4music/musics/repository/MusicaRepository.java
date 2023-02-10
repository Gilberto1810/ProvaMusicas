package com.tech4music.musics.repository;
import com.tech4music.musics.model.Musica;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MusicaRepository extends MongoRepository<Musica, String> {
    
}
