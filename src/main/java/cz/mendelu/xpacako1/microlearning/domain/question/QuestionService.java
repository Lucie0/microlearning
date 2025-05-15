package cz.mendelu.xpacako1.microlearning.domain.question;

import cz.mendelu.xpacako1.microlearning.domain.lesson.Lesson;
import cz.mendelu.xpacako1.microlearning.domain.option.Option;
import cz.mendelu.xpacako1.microlearning.domain.option.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class QuestionService {
    // repository
    private final QuestionRepository repository;
    // constructor

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.repository = questionRepository;
    }

    // fuctions
    public List<Question> getAllQuestions(){
        return StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public List<Question> getAllQuestionsByLessonId(Long lessonId){
        return StreamSupport.stream(repository.findAllByLessonId(lessonId).spliterator(), false).collect(Collectors.toList());
    }



    public Optional<Question> getById(Long id){
        return repository.findById(id);
    }

    public Iterable<Question> createQuestion(List<Question> questions){
        return repository.saveAll(questions);
    }

    public Question createQuestion(Question question){
        return repository.save(question);
    }

}
