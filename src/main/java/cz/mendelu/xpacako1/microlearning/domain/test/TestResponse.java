package cz.mendelu.xpacako1.microlearning.domain.test;

import cz.mendelu.xpacako1.microlearning.domain.node.Node;
import lombok.Data;

import java.util.List;

@Data
public class TestResponse {
    private Long id;
    private String name;
    private List<Long> nodeIds;

    public TestResponse(Test test){
        this.id = test.getId();
        this.name = test.getName();

        this.nodeIds = test.getNodes().stream().map(Node::getId).toList();
    }
}
