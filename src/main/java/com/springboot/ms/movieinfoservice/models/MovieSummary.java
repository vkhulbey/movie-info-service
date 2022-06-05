package com.springboot.ms.movieinfoservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MovieSummary {

    private String id;
    private String title;
    private String overview;
}
