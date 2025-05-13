package cz.mendelu.xpacako1.microlearning.domain.lesson;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LessonRepository extends CrudRepository<Lesson, Long> {
    Iterable<Lesson> findByTopic_Id(Long topicId);

    Optional<Lesson> findByOrdinalNumber(int ordinalNumber);
    Optional<Lesson> findByOrdinalNumberAndTopic_Id(int ordinalNumber, Long topicId);
}
