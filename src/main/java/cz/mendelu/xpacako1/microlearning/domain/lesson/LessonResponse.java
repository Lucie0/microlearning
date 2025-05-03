package cz.mendelu.xpacako1.microlearning.domain.lesson;

import cz.mendelu.xpacako1.microlearning.domain.node.Node;
import cz.mendelu.xpacako1.microlearning.domain.topic.TopicResponse;
import cz.mendelu.xpacako1.microlearning.utils.response.ObjectResponse;
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
    private int ordinalNumber;
    private List<Long> nodeIds;
    private String content;
    private ObjectResponse<TopicResponse> topic;

    public LessonResponse(Lesson lesson){
        this.id = lesson.getId();
        this.name = lesson.getName();

        this.ordinalNumber = lesson.getOrdinalNumber();
        this.nodeIds = lesson.getNodes().stream().map(Node::getId).toList();
        // todo vyresit lepe
//        if (lesson.getNode() != null) this.nodeId = lesson.getNode().getId();
//        else this.nodeId = 0L;

        this.content = lesson.getContent();
        this.topic = ObjectResponse.of(lesson.getTopic(), TopicResponse::new);
    }
}
