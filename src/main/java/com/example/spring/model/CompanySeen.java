package com.example.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter
@Entity
public class CompanySeen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<Long> companyIds = List.of();

    @ManyToOne
    @JoinColumn
    private User user;

    public void addCompanyId(Long newCompanyId) {
        if (companyIds == null) {
            companyIds = new ArrayList<>();
        }
        companyIds.add(newCompanyId);
    }
}


