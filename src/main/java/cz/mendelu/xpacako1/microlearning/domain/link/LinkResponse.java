package cz.mendelu.xpacako1.microlearning.domain.link;

import lombok.Data;

@Data
public class LinkResponse {
    private Long id;
    private Long actualNodeId;
    private Long nextNodeId;

    public LinkResponse(Link link){
        this.id = link.getId();
        this.actualNodeId = link.getActualNode().getId();
        this.nextNodeId = link.getNextNode().getId();
    }
}
