package org.javaacademy.homework.homework3.ex5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        Comparator<Feedback> sortedFeedback = (feedback1, feedback2) -> {
            if (feedback1.getLike() != feedback2.getLike()) {
                return feedback2.getLike() - feedback1.getLike();
            }
            if (!feedback1.getDateTime().equals(feedback2.getDateTime())) {
                return feedback2.getDateTime().compareTo(feedback1.getDateTime());
            }
            return feedback2.getId() - feedback1.getId();
        };

        Set<Feedback> feedbackSet = new TreeSet<>(sortedFeedback);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        feedbackSet.add(new Feedback(1, "отличный товар", 200,
                LocalDateTime.parse("25.01.2024 13:37", formatter)));
        feedbackSet.add(new Feedback(2, "так себе товар", 100,
                LocalDateTime.parse("25.01.2024 16:37", formatter)));
        feedbackSet.add(new Feedback(3, "плохой товар", 100,
                LocalDateTime.parse("25.01.2024 13:37", formatter)));
        feedbackSet.add(new Feedback(4, "плохой товар", 100,
                LocalDateTime.parse("25.01.2024 13:37", formatter)));

        System.out.println(feedbackSet);
    }
}
