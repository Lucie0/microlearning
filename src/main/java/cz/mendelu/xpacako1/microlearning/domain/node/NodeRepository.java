package cz.mendelu.xpacako1.microlearning.domain.node;

import org.springframework.data.repository.CrudRepository;

public interface NodeRepository extends CrudRepository<Node, Long> {

    Iterable<Node> findByLesson_Topic_Id(Long topicId);

}
