package com.anurag.studentcourse.course.courseController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {



    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCourse(String topicId){
        List<Course> course= new ArrayList<>();
        courseRepository.findByTopicsTopicId(topicId)
                .forEach(course::add);
    return course;
    }


    public Optional<Course> getOneCourse(String id){
        return courseRepository.findById(id);
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse( Course course){
        courseRepository.save(course);
    }

    public void deleteCourse (String id){
        courseRepository.deleteById(id);
    }

}
