package jpabook.jpashop.model;

import javax.persistence.Entity;

@Entity
public class Movie extends Item {
    private String director;
    private String actor;

}
