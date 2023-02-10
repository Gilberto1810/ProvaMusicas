package com.tech4music.musics.service;

import java.util.List;
import java.util.Optional;

import com.tech4music.musics.compartilhado.MusicaDto;
import com.tech4music.musics.model.Musica;

public interface MusicaService {
    MusicaDto criarMusica(MusicaDto musica);
    List<MusicaDto> obterTodos();
    Optional<MusicaDto> obterPorId(String id);
    Musica atualizarMusica(String id, Musica musica);
    void removerMusica(String id);

}
