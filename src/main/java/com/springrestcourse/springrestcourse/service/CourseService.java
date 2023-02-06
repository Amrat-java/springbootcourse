package com.springrestcourse.springrestcourse.service;

import com.springrestcourse.springrestcourse.Entity.Course;

import java.util.List;

public interface CourseService {


    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public void deleteCourse(long parseLong);


}
