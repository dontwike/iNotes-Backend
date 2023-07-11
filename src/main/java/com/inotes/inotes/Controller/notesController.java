package com.inotes.inotes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.inotes.inotes.Model.note;
import com.inotes.inotes.Service.notesService;

import java.util.List;

@RestController
public class notesController {

    @Autowired
    public notesService notesService;

    @CrossOrigin
    @GetMapping("/read")
    public List<note> getNotes(){
        return notesService.getNotes();
    }

    @CrossOrigin
    @GetMapping("/read/{id}")
    public note getPostWithId(@PathVariable("id") int id){
        return notesService.getNoteWithID(id);
    }

    @CrossOrigin
    @PostMapping("/post")
    public note addPost(@RequestBody note note){
        return notesService.addNote(note);
    }

    @CrossOrigin
    @PutMapping("/update/{id}")
    public note updatePostWithId(@PathVariable("id") int id, @RequestBody note note){
        return notesService.updateNoteWithID(id, note);
    }

    @CrossOrigin
    @PutMapping("/update")
    public note updatePost(@RequestBody note note){
        return notesService.updateNote(note);
    }

    @CrossOrigin
    @DeleteMapping("/delete/{id}")
    public String deletePost(@PathVariable("id") int id){
        return notesService.deleteNoteById(id);
    }

    @CrossOrigin
    @DeleteMapping("/deleteAll")
    public String deleteAllPost(){
        return notesService.deleteAllNote();
    }
}
