package cz.mendelu.xpacako1.microlearning.domain.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TopicService {
    // repository
    private final TopicRepository repository;
    // constructor

    @Autowired
    public TopicService(TopicRepository topicRepository) {
        this.repository = topicRepository;
    }

    // fuctions
    public List<Topic> getAllTopics(){
        return StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Optional<Topic> getById(Long id){
        return repository.findById(id);
    }

    public Iterable<Topic> createTopic(List<Topic> topics){
        return repository.saveAll(topics);
    }

    public Topic createTopic(Topic topic){
        return repository.save(topic);
    }

}
