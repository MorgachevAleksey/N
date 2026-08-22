package ru.fintech.tracker.n.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "id")
    String id;

    @Column(name = "user_name")
    String user_name;
}
