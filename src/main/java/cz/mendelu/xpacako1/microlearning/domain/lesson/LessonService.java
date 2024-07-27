package cz.mendelu.xpacako1.microlearning.domain.lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class LessonService {
    // repository
    private final LessonRepository repository;
    // constructor

    @Autowired
    public LessonService(LessonRepository lessonRepository) {
        this.repository = lessonRepository;
    }

    // fuctions
    public List<Lesson> getAllLessons(){
        return StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
