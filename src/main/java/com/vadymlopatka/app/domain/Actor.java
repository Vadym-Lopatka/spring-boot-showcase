package com.vadymlopatka.app.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "actor")
public class Actor implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String login;

    @JsonProperty("avatar_url")
    @NotNull
    @Column(nullable = false)
    private String avatar;

//    @OneToMany(mappedBy = "actor", fetch = FetchType.EAGER)
//    private Set<Event> events;

    public Actor() {
    }

    public Actor(Long id) {
        this.id = id;
    }

    public Actor(Long id, String login, String avatar) {
        this.id = id;
        this.login = login;
        this.avatar = avatar;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getAvatar() {
        return avatar;
    }
    
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /*public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }*/
}
