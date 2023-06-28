package com.example.eventsnow.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter

public class Event {

    @Id
    private int eventId;
    private String eventName;
    private String eventDetails;
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
    private Date eventDate;

}
