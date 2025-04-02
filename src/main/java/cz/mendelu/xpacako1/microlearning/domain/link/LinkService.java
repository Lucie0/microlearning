package cz.mendelu.xpacako1.microlearning.domain.link;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class LinkService {
    // repository
    private final LinkRepository repository;
    // constructor

    @Autowired
    public LinkService(LinkRepository linkRepository) {
        this.repository = linkRepository;
    }

    // fuctions
    public List<Link> getAllLinks(){
        return StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Optional<Link> getById(Long id){
        return repository.findById(id);
    }

    public Iterable<Link> createNode(List<Link> links){
        return repository.saveAll(links);
    }

    public Link createLink(Link link){
        return repository.save(link);
    }

    public List<Link> getLinksBefore(Long id) {
        List<Link> list = new ArrayList<>();
        repository.findByNextNode_Id(id).forEach(list::add);

        return list;
    }

    public List<Link> getLinksAfter(Long id) {
        List<Link> list = new ArrayList<>();
        repository.findByActualNode_Id(id).forEach(list::add);

        return list;
    }

}
