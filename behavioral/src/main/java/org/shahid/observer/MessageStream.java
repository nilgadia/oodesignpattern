package org.shahid.observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {

    private final Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    String getState() {
        return messageHistory.getLast();
    }

    @Override
    void setState(String message) {
        messageHistory.add(message);
        this.notifyObservers();
    }
}
