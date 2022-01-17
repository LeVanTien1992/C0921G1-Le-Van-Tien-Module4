package vn.codegym.service;

import vn.codegym.model.Music;

import java.util.List;

public interface MusicService {
    List<Music> findAll();
    void save(Music music);
    Music findById(int id);
    void remove(int id);

}
