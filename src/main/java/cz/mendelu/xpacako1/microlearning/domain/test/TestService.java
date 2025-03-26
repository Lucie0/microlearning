package cz.mendelu.xpacako1.microlearning.domain.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TestService {
    // repository
    private final TestRepository repository;
    // constructor

    @Autowired
    public TestService(TestRepository testRepository) {
        this.repository = testRepository;
    }

    // fuctions
    public List<Test> getAllTests(){
        return StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Optional<Test> getById(Long id){
        return repository.findById(id);
    }

    public Iterable<Test> createTest(List<Test> tests){
        return repository.saveAll(tests);
    }

    public Test createTest(Test test){
        return repository.save(test);
    }

}
