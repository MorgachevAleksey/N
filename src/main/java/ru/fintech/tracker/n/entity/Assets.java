package ru.fintech.tracker.n.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "assets")
public class Assets {
    @Id
    @Column(name = "id")
    String id;

    @Column(name = "name")
    String name;

}
