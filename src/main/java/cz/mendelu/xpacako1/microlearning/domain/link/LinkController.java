package cz.mendelu.xpacako1.microlearning.domain.link;

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
@RequestMapping("links")
@Validated
public class LinkController {

    // services
    private final LinkService linkService;

    // constructor with autowired
    @Autowired
    public LinkController(
            LinkService linkService
    ){
        this.linkService = linkService;
    }

    // endpoints
    //- GET seznamy
    @Operation(
            summary = "Get all links between nodes",
            description = "Get all links in the system."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of links between nodes")
    })
    @GetMapping(value = {"","/"}, produces = "application/json")
    public ArrayResponse<LinkAfterResponse> getAllLinks() {
        return ArrayResponse.of(
                linkService.getAllLinks(),
                LinkAfterResponse::new
        );
    }

    @Operation(
            summary = "Get one link by ID",
            description = "Get link by ID."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Link by ID"),
            @ApiResponse(responseCode = "404", description = "Link not found"),
    })
    @GetMapping(value = "/{id}", produces = "application/json")
    public ObjectResponse<LinkAfterResponse> getLinkById(@PathVariable Long id) {
        Link link = linkService.getById(id).orElseThrow(() -> new NotFoundException("Link not found"));
        return ObjectResponse.of(
                link,
                LinkAfterResponse::new
        );
    }

    @Operation(
            summary = "Get list of nodes preceding node.",
            description = "Get list of node IDs preceding the specified node."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of IDs of nodes"),
//            @ApiResponse(responseCode = "404", description = "Link not found"),
    })
    @GetMapping(value = "/before/{id}", produces = "application/json")
    public ArrayResponse<LinkBeforeResponse> getLinksBefore(@PathVariable Long id) {
        return ArrayResponse.of(
                linkService.getLinksBefore(id),
                LinkBeforeResponse::new
        );
    }

    @Operation(
            summary = "Get list of following nodes.",
            description = "list of node IDs following the specified node."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of IDs of nodes"),
//            @ApiResponse(responseCode = "404", description = "Link not found"),
    })
    @GetMapping(value = "/after/{id}", produces = "application/json")
    public ArrayResponse<LinkAfterResponse> getLinksAfter(@PathVariable Long id) {
        return ArrayResponse.of(
                linkService.getLinksAfter(id),
                LinkAfterResponse::new
        );
    }

}
