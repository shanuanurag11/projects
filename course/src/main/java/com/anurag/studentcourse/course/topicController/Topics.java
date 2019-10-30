package com.anurag.studentcourse.course.topicController;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topics {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    public String topicId;


    public String topicName;


    public String topicDescription;


    public Topics(){

    }


    public Topics(String topicId, String topicName, String topicDescription) {
        super();
        this.topicId = topicId;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
    }



    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }



}
