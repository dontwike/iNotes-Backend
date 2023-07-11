package com.inotes.inotes.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.inotes.inotes.Model.note;
import org.springframework.stereotype.Repository;

@Repository
public interface notesRepo extends JpaRepository<note, Integer> {
}
