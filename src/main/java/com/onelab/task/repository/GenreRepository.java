package com.onelab.task.repository;

import com.onelab.task.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface GenreRepository extends JpaRepository<Genre, Long> {
    void deleteGenreByGenreId(Long genreId);
}
