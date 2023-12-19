package com.sample.curdDemo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tutorials")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="title")
    private String title;

     @Column(name="description")
    private String desription;

    @Column(name="published")
    private boolean published;

     //zero arg constructor
    public Tutorial() {
    }

     //paremeterized constructor
    public Tutorial(long id, String title, String desription, boolean published) {
        this.id = id;
        this.title = title;
        this.desription = desription;
        this.published = published;
    }
    
    //Getter methods
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesription() {
        return desription;
    }

    public boolean isPublished() {
        return published;
    }
 

    //Setter methods
    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public void setPublished(boolean published) {
        this.published = published;
    
    }
    
    //toString() method
    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desription=" + desription + ", published=" + published
                + "]";
    }
        
}