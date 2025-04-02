package cz.mendelu.xpacako1.microlearning.domain.lesson;

import cz.mendelu.xpacako1.microlearning.domain.node.Node;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.Data;

import java.sql.Clob;
import java.util.List;

@Data
public class LessonResponse {
    private Long id;
    private String name;
//    @Lob
//    private Clob content;
    private List<Long> nodeIds;
    private String content;

    public LessonResponse(Lesson lesson){
        this.id = lesson.getId();
        this.name = lesson.getName();

        this.nodeIds = lesson.getNodes().stream().map(Node::getId).toList();
        // todo vyresit lepe
//        if (lesson.getNode() != null) this.nodeId = lesson.getNode().getId();
//        else this.nodeId = 0L;

        this.content = lesson.getContent();
    }
}
