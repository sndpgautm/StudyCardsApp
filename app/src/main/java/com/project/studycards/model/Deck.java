package com.project.studycards.model;

import java.util.LinkedList;
import java.util.List;

public class Deck {
    private String name;
    private List<Card> cards;

    public Deck (String name) {
        this.name = name;
        this.cards = new LinkedList<>();
    }

    public void addCard (String question, String answer, int priority, int count) {
        cards.add(new Card(question, answer, priority, count));
    }

    public void deleteCard (Card card) {
        cards.remove(card);
    }
}
