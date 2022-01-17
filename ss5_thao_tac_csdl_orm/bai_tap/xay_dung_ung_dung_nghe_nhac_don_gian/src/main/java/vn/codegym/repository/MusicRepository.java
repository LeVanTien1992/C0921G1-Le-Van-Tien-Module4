package vn.codegym.repository;

import vn.codegym.model.Music;

import java.util.List;

public interface MusicRepository {
    List<Music> findAll();
    void save(Music music);
    Music findById(int id);
    void remove(int id);
    
}
