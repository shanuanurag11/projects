package com.anurag.studentcourse.course.topicController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {



    @Autowired
    private TopicRepository topicRepository;

    public List<Topics> getTopics(){
        List<Topics> topics= new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
    return topics;
    }


    public Optional<Topics> getOneTopic(String id){
        return topicRepository.findById(id);
    }

    public void addTopics(Topics topic){
       topicRepository.save(topic);
    }

    public void updateTopic(String id, Topics topic){
        topicRepository.save(topic);
    }

    public void deleteTopic (String id){
        topicRepository.deleteById(id);
    }

}
