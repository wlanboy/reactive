package com.wlanboy.reactive.tick;

import java.time.LocalDateTime;

public class Tick {

    public String text;
    public LocalDateTime timestamp;

    public Tick() {
    }

    public Tick(String text, LocalDateTime timestamp) {
        this.text = text;
        this.timestamp = timestamp;
    }
}