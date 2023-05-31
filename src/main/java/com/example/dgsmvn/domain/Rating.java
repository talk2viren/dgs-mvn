package com.example.dgsmvn.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.yaml.snakeyaml.events.Event;

@Data
@AllArgsConstructor
public class Rating {
    int id;
    int rating;
    String comment;
    String user;
}
