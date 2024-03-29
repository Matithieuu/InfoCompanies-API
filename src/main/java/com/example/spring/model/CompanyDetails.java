package com.example.spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CompanyDetails {

    private Long id;
    private String denomination;
    private String secteurActivite;
    private String ville;
    private String region;
}
