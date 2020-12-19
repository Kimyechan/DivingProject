package com.diving.domain.swimmingPool;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SwimmingPool {

    @Id @GeneratedValue
    Long id;
}
