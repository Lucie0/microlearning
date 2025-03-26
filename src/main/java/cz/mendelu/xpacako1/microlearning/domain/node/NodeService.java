package cz.mendelu.xpacako1.microlearning.domain.node;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class NodeService {
    // repository
    private final NodeRepository repository;
    // constructor

    @Autowired
    public NodeService(NodeRepository nodeRepository) {
        this.repository = nodeRepository;
    }

    // fuctions
    public List<Node> getAllNodes(){
        return StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Optional<Node> getById(Long id){
        return repository.findById(id);
    }

    public Iterable<Node> createNode(List<Node> nodes){
        return repository.saveAll(nodes);
    }

    public Node createNode(Node node){
        return repository.save(node);
    }

}
