package com.anurag.studentcourse.course.courseController;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicsTopicId(String topicId);

}
