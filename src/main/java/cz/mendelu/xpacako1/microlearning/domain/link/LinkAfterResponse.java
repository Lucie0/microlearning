package cz.mendelu.xpacako1.microlearning.domain.link;

import lombok.Data;

@Data
public class LinkAfterResponse {
    private Long id;
    private Long actualNodeId;
    private Long nextNodeId;

    public LinkAfterResponse(Link link){
        this.id = link.getId();
        this.actualNodeId = link.getActualNode().getId();
        this.nextNodeId = link.getNextNode().getId();
    }
}
