package com.sample.curdDemo.repository;

import java.util.List;
//import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.curdDemo.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial ,Long >{
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitle(String title);
    
}