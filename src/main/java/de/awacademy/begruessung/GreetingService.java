package de.awacademy.begruessung;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingService {
    private final List<Greeting> greetingList = new ArrayList<>();
    private final BeitragRepository beitragRepository;

    public GreetingService(BeitragRepository beitragRepository) {
        this.beitragRepository = beitragRepository;
        this.addGreeting(new Greeting(0, "No name", "1st Greeting", "Hello!"));
        this.addGreeting(new Greeting(1, "Nemo", "2nd Greeting", "Polyphem kann nicht zählen"));
    }

    public void addGreeting(Greeting greeting) {
        greeting.setId(greetingList.size());
        Beitrag beitrag = new Beitrag();
        beitrag.setTitle(greeting.getTitle());
        beitrag.setNachricht(greeting.getContent());
        beitragRepository.save(beitrag);
        greetingList.add(greeting);
    }

    public List<Beitrag> getList() {
        return beitragRepository.findAll();
    }
}
