package com.example.eventsnow.service;

import com.example.eventsnow.model.Event;
import com.example.eventsnow.repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventsService {

    @Autowired
    private EventsRepository eventsRepository;


    public Event addNewEvent (Event event) {
        this.eventsRepository.save(event);
        return event;
    }

    public List<Event> getAllEvents(){
        return this.eventsRepository.findAll();
    }

    public String deleteEvent(Integer selectedEventId){
        this.eventsRepository.deleteById(selectedEventId);
        return "deleted the event " +selectedEventId + "successfully";
    }

    public Event updateEvent(Integer myId, Event updatedEvent){
        Event oldEvent = this.eventsRepository.findById(myId).get();
        oldEvent.setEventName(updatedEvent.getEventName());
        oldEvent.setEventDetails(updatedEvent.getEventDetails());
        oldEvent.setEventDate(updatedEvent.getEventDate());

        this.eventsRepository.save(oldEvent);
        return updatedEvent;
    }

    public Event updateSpecificData(Integer id, Event event){
        Event oldEvent = this.eventsRepository.findById(id).get();

        oldEvent.setEventName(event.getEventName());
        this.eventsRepository.save(oldEvent);
        return event;
    }
}

