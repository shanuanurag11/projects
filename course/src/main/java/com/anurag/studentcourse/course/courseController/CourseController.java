package com.anurag.studentcourse.course.courseController;

import com.anurag.studentcourse.course.topicController.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/course")
    public List<Course> getAllCourse(@PathVariable String id){
       return courseService.getCourse(id);
    }
    @RequestMapping("/topics/{topicId}/course/{id}")
    public Optional<Course> getOneCourse(@PathVariable String id){
        return courseService.getOneCourse(id);
    }
    @RequestMapping(method= RequestMethod.POST ,value="/topics/{topicId}/course")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopics(new Topics(topicId,"",""));
        courseService.addCourse(course);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/topics/{topicId}/course/{id}")
    public void updateCourse(@RequestBody Course course,@PathVariable String topicId, @PathVariable String id){
        course.setTopics(new Topics(topicId,"",""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method= RequestMethod.DELETE,value="/topics/{topicId}/course/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}
