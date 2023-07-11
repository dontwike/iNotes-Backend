package com.inotes.inotes.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class note {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "notes_id")
    public int id;

    @Column(name = "notes_title")
    public String title;

    @Column(name = "notes_description", columnDefinition="LONGTEXT")
    public String description;

    @Column(name = "notes_date")
    public String date;

    @Column(name = "notes_time")
    public String time;
}