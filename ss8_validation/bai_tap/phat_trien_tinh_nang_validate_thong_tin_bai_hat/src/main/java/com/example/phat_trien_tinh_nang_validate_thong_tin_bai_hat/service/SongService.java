package com.example.phat_trien_tinh_nang_validate_thong_tin_bai_hat.service;

import com.example.phat_trien_tinh_nang_validate_thong_tin_bai_hat.model.Song;

import java.util.List;

public interface SongService {
    List<Song> findAll();
    void save(Song song);
    Song findById(Long id);
}
