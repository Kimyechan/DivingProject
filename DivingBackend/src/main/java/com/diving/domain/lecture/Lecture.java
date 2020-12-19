package com.diving.domain.lecture;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lecture {

    @Id @GeneratedValue
    Long id;
}
