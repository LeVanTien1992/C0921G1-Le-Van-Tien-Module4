package com.example.phat_trien_tinh_nang_validate_thong_tin_bai_hat.service.ipml;

import com.example.phat_trien_tinh_nang_validate_thong_tin_bai_hat.model.Song;
import com.example.phat_trien_tinh_nang_validate_thong_tin_bai_hat.repository.SongRepository;
import com.example.phat_trien_tinh_nang_validate_thong_tin_bai_hat.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongServiceIpml implements SongService {

    @Autowired
    private SongRepository repository;
    @Override
    public List<Song> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Song song) {
        repository.save(song);
    }

    @Override
    public Song findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
