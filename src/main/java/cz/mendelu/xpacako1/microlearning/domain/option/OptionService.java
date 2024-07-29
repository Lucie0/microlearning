package cz.mendelu.xpacako1.microlearning.domain.option;

import cz.mendelu.xpacako1.microlearning.domain.lesson.Lesson;
import cz.mendelu.xpacako1.microlearning.domain.lesson.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class OptionService {
    // repository
    private final OptionRepository repository;
    // constructor

    @Autowired
    public OptionService(OptionRepository optionRepository) {
        this.repository = optionRepository;
    }

    // fuctions
    public List<Option> getAllOptions(){
        return StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Iterable<Option> createOption (List<Option> options){
        return repository.saveAll(options);
    }

    public Option createOption(Option option){
        return repository.save(option);
    }

}
