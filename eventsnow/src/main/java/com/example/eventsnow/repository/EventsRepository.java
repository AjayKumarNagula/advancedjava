package com.example.eventsnow.repository;

import com.example.eventsnow.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventsRepository extends JpaRepository<Event,Integer> {

}
