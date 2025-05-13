package cz.mendelu.xpacako1.microlearning.domain.topic;

import cz.mendelu.xpacako1.microlearning.domain.option.OptionResponse;
import cz.mendelu.xpacako1.microlearning.domain.question.Question;
import cz.mendelu.xpacako1.microlearning.utils.response.ArrayResponse;
import lombok.Data;

@Data
public class TopicResponse {
    private Long id;
    private String name;
    private Long firstNodeId;

    public TopicResponse(Topic topic){
        this.id = topic.getId();
        this.name = topic.getName();
        this.firstNodeId = topic.getFirstNode();
    }
}
