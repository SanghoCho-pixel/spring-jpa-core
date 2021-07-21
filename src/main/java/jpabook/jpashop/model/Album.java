package jpabook.jpashop.model;

import javax.persistence.Entity;

@Entity
public class Album extends Item {

    private String artist;
    private String etc;

}
