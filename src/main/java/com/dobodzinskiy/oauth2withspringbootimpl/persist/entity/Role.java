package com.dobodzinskiy.oauth2withspringbootimpl.persist.entity;

import com.dobodzinskiy.oauth2withspringbootimpl.oauth2.OAuth2Role;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@Table(name = "role")
public class Role extends MainEntity {

    @Column(name = "role_name")
    @Enumerated(EnumType.STRING)
    private OAuth2Role name;

}
