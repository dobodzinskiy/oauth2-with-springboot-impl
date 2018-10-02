package com.dobodzinskiy.oauth2withspringbootimpl.persist.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Optional;

@Getter
@Setter
@MappedSuperclass
public class MainEntity {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private LocalDateTime created;

    @JsonIgnore
    @Column
    private LocalDateTime updated;

    @PrePersist
    protected void onCreate() {
        created = LocalDateTime.now(ZoneId.of("UTC"));
        updated = created;
    }

    @PreUpdate
    protected void onUpdate() {
        updated = LocalDateTime.now(ZoneId.of("UTC"));
    }

    public Long getTimestamp() {
        return Optional.ofNullable(created).map(c -> c.toEpochSecond(ZoneOffset.UTC)).orElse(-1l);
    }
}
