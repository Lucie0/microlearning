package cz.mendelu.xpacako1.microlearning.domain.node;

import cz.mendelu.xpacako1.microlearning.utils.exceptions.NotFoundException;
import cz.mendelu.xpacako1.microlearning.utils.response.ArrayResponse;
import cz.mendelu.xpacako1.microlearning.utils.response.ObjectResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("nodes")
@Validated
public class NodeController {

    // services
    private final NodeService nodeService;

    // constructor with autowired
    @Autowired
    public NodeController(
            NodeService nodeService
    ){
        this.nodeService = nodeService;
    }

    // endpoints
    //- GET seznamy
    @Operation(
            summary = "Get all nodes",
            description = "Get all nodes in the system."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of nodes")
    })
    @GetMapping(value = {"","/"}, produces = "application/json")
    public ArrayResponse<NodeResponse> getAllNodes() {
        return ArrayResponse.of(
                nodeService.getAllNodes(),
                NodeResponse::new
        );
    }

    @Operation(
            summary = "Get one node by ID",
            description = "Get node by ID."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Node by ID"),
            @ApiResponse(responseCode = "404", description = "Node not found"),
    })
    @GetMapping(value = "/{id}", produces = "application/json")
    public ObjectResponse<NodeResponse> getNodeById(@PathVariable Long id) {
        Node node = nodeService.getById(id).orElseThrow(() -> new NotFoundException("Node not found"));
        return ObjectResponse.of(
                node,
                NodeResponse::new
        );
    }

    @Operation(
            summary = "Get nodes by topicId",
            description = "Get nodes by topic ID"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of nodes with topic ID"),
//            @ApiResponse(responseCode = "404", description = "Node not found"),
    })
    @GetMapping(value = "/byTopic/{topicId}", produces = "application/json")
    public ArrayResponse<NodeResponse> getNodesByTopic(@PathVariable Long topicId) {
//        Node node = nodeService.getById(id).orElseThrow(() -> new NotFoundException("Node not found"));
        return ArrayResponse.of(
                nodeService.getByTopicId(topicId),
                NodeResponse::new
        );
    }
}
