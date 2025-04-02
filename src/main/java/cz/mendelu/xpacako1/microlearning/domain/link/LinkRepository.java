package cz.mendelu.xpacako1.microlearning.domain.link;

import org.springframework.data.repository.CrudRepository;

public interface LinkRepository extends CrudRepository<Link, Long> {

    Iterable<Link> findByNextNode_Id(Long id);

    Iterable<Link> findByActualNode_Id(Long id);
}
