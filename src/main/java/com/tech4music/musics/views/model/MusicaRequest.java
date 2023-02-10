package com.tech4music.musics.views.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MusicaRequest {

    @NotBlank(message = "Titulo não pode ter caracteres em branco")
    private String titulo;
    private String artista;
    private String album;
    private String genero;
    @Size(min = 4, message = "O ano tem que ter 4 caracteres")
    private Integer anoLancamento;
    private String compositor;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Integer getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    
    
}
