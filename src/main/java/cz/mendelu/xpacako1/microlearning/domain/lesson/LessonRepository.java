package cz.mendelu.xpacako1.microlearning.domain.lesson;

import jakarta.persistence.OrderBy;
import org.hibernate.annotations.SQLOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LessonRepository extends CrudRepository<Lesson, Long> {
//    @OrderBy(value = "ordinal_number")
    Iterable<Lesson> findByTopic_IdOrderByOrdinalNumberAsc(Long topicId);

    Optional<Lesson> findByOrdinalNumber(int ordinalNumber);

    Optional<Lesson> findByOrdinalNumberAndTopic_Id(int ordinalNumber, Long topicId);
}
