package cz.mendelu.xpacako1.microlearning.domain.node;

import lombok.Data;

@Data
public class NodeResponse {
    private Long id;
    private Long testId;
    private Long lessonId;
    private boolean walkThrough;
    private boolean successfullyCompleted;

    public NodeResponse(Node node){
        this.id = node.getId();

        // todo vyresit, pretest byva null
        if (node.getPretest() != null) this.testId = node.getPretest().getId();
        else this.testId = 0L;
//
//         todo vyresit
        if (node.getLesson() != null) this.lessonId = node.getLesson().getId();
        else this.lessonId = 0L;

        this.walkThrough = node.isWalkThrough();
        this.successfullyCompleted = node.isSuccessfullyCompleted();
    }
}
