package cz.mendelu.xpacako1.microlearning.domain.question;

import cz.mendelu.xpacako1.microlearning.domain.option.Option;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long> {
}
