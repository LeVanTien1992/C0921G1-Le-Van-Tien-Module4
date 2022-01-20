package com.example.phat_trien_tinh_nang_validate_thong_tin_bai_hat.repository;

import com.example.phat_trien_tinh_nang_validate_thong_tin_bai_hat.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
}
