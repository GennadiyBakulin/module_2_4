package org.javaacademy.homework.homework3.ex5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Feedback {
    private final int id;
    private final String text;
    private final int like;
    private final LocalDateTime dateTime;

    public Feedback(int id, String text, int like, LocalDateTime dateTime) {
        this.id = id;
        this.text = text;
        this.like = like;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getLike() {
        return like;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Feedback feedback = (Feedback) o;
        return id == feedback.id;
    }

    @Override
    public int hashCode() {
        return 31 * id;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        return "Feedback{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", like=" + like +
                ", dateTime=" + dateTime.format(formatter) +
                "}\n";
    }
}
