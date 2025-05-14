package cz.mendelu.xpacako1.microlearning.domain.test;

import cz.mendelu.xpacako1.microlearning.domain.node.Node;
import lombok.Data;

import java.util.List;

@Data
public class TestResponse {
    private Long id;
    private String name;
    private List<Long> nodeIds;

    // todo pridat Array of Questions, cele objekty, aby se cely test stahl najednou
//    private ArrayResponse<QuestionResponse> questions;

    public TestResponse(Test test){
        this.id = test.getId();
        this.name = test.getName();
//        this.questions = ArrayResponse.of(test.getQuestions, QuestionResponse::new);

//        this.nodeIds = test.getNodes().stream().map(Node::getId).toList();
    }
}
