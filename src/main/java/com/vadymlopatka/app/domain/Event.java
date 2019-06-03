package com.vadymlopatka.app.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "event")
public class Event implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String type;

    @ManyToOne
    @NotNull
    private Actor actor;

    @ManyToOne
    @NotNull
    private Repo repo;

//    @JsonProperty("created_at")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC +0")
    @NotNull
    @Column(nullable = false)
    private Timestamp createdAt;

    public Event() {
    }

    public Event(Long id, String type, Actor actor, Repo repo, Timestamp createdAt) {
        this.id = id;
        this.type = type;
        this.actor = actor;
        this.repo = repo;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Repo getRepo() {
        return repo;
    }

    public void setRepo(Repo repo) {
        this.repo = repo;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
