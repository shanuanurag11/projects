package com.anurag.studentcourse.course.courseController;


import com.anurag.studentcourse.course.topicController.Topics;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    private String courseId;


    private String courseName;


    private String courseDescription;

    @ManyToOne
    private Topics topics;


    public Course(){

    }


    public Course(String courseId, String courseName, String courseDescription,String topicId) {
        super();
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.topics=new Topics(topicId,"","");

    }


    public Topics getTopics() {
        return topics;
    }

    public void setTopics(Topics topics) {
        this.topics = topics;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }



}
