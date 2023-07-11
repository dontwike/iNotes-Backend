package com.inotes.inotes.Service;

import com.inotes.inotes.Model.note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inotes.inotes.Repo.notesRepo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class notesService {

    @Autowired
    public notesRepo notesRepo;
    public List<note> getNotes() {
        return notesRepo.findAll();
    }

    public note addNote(note note) {
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy");
        SimpleDateFormat sf2 = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        String d = sf1.format(date);
        note.setDate(d);
        note.setTime(sf2.format(date));
        return notesRepo.save(note);
    }

    public note updateNote(note note) {
        return notesRepo.save(note);
    }

    public String deleteAllNote(){
        notesRepo.deleteAll();
        return "Deleted the Note Successfully";
    }

    public String deleteNoteById(int id){
        note n = notesRepo.findById(id).get();
        notesRepo.delete(n);
        return "Deleted the Note Successfully";
    }

    public note updateNoteWithID(int id, note note) {
        note n = notesRepo.findById(id).get();
        n.setTitle(note.getTitle());
        n.setDescription(note.getDescription());
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy");
        SimpleDateFormat sf2 = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        String d = sf1.format(date);
        n.setDate(d);
        n.setTime(sf2.format(date));
        return notesRepo.save(n);
    }

    public note getNoteWithID(int id) {
        return notesRepo.findById(id).get();
    }
}
