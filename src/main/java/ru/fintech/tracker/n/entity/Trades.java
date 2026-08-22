package ru.fintech.tracker.n.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trades")
public class Trades {
    @Id
    @Column(name = "id")
    String id;

    @Column(name = "side")
    String side;
}
