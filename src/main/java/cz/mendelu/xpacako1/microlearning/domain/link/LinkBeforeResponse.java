package cz.mendelu.xpacako1.microlearning.domain.link;

import lombok.Data;

@Data
public class LinkBeforeResponse {
    private Long id;
    private Long beforeNodeId;
    private Long actualNodeId;

    public LinkBeforeResponse(Link link){
        this.id = link.getId();
        this.beforeNodeId = link.getActualNode().getId();
        this.actualNodeId = link.getNextNode().getId();
    }
}
