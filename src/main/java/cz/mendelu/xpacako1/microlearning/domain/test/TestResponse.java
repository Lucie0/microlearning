package cz.mendelu.xpacako1.microlearning.domain.test;

import lombok.Data;

@Data
public class TestResponse {
    private Long id;
    private String name;
    private Long nodeId;

    public TestResponse(Test test){
        this.id = test.getId();
        this.name = test.getName();

        // todo vyresit
        if (test.getNode() != null) this.nodeId = test.getNode().getId();
        else this.nodeId = 0L;
    }
}
