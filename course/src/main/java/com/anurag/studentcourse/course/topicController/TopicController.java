package com.anurag.studentcourse.course.topicController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topics> getAllTopics(){
       return topicService.getTopics();
    }
    @RequestMapping("/topics/{id}")
    public Optional<Topics> getOneTopic(@PathVariable String id){
        return topicService.getOneTopic(id);
    }
    @RequestMapping(method= RequestMethod.POST ,value="/topics")
    public void addTopic(@RequestBody Topics topic){
        topicService.addTopics(topic);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topics topic, @PathVariable String id){
        topicService.updateTopic(id,topic);
    }

    @RequestMapping(method= RequestMethod.DELETE,value="/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
