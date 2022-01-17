package vn.codegym.service.ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Music;
import vn.codegym.repository.MusicRepository;
import vn.codegym.service.MusicService;

import java.util.ArrayList;
import java.util.List;
@Service
public class MusiceServiceIpml implements MusicService {
    @Autowired
    private  MusicRepository musicRepository;

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public Music findById(int id) {
        return musicRepository.findById(id);
    }

    @Override
    public void remove(int id) {
        musicRepository.remove(id);
    }
}
