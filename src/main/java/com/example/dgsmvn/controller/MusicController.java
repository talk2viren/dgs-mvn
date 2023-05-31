package com.example.dgsmvn.controller;

import com.example.dgsmvn.domain.Album;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//https://www.baeldung.com/spring-boot-domain-graph-service

@DgsComponent
public class MusicController {

    private final List<Album> albums = Arrays.asList(
            new Album("Rumours", "Fleetwood Mac", 20),
            new Album("What's Going On", "Marvin Gaye", 10),
            new Album("Pet Sounds", "The Beach Boys", 12)
    );

    @DgsQuery
    public List<Album> albums(@InputArgument String titleFilter) {
        if (Optional.ofNullable(titleFilter).isEmpty()) {
            return albums;
        }
        return albums.stream()
                .filter(s -> s.getTitle().contains(titleFilter))
                .collect(Collectors.toList());
    }

}
