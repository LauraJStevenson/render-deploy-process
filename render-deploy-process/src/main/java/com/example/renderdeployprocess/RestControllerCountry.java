package com.example.renderdeployprocess;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/v1/countries")

public class RestControllerCountry {
    private static final List<Country> COUNTRIES = List.of(
            new Country("United States of America", "Washington D.C.", 339_996_563),
            new Country("China", "Beijing", 1_411_750_000),
            new Country("India", "New Delhi", 1_428_627_663),
            new Country("United Kingdom", "London", 8_982_000)
    );

    @GetMapping
    public List<Country> getCountries(){
        return COUNTRIES;
    }

}
