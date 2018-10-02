package com.dobodzinskiy.oauth2withspringbootimpl.persist.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "action")
public class Action extends MainEntity {

    @Column
    private String description;

    @Column
    private BigDecimal value;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

}
