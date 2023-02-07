package com.springrestcourse.springrestcourse.dao;


import com.springrestcourse.springrestcourse.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {

}
