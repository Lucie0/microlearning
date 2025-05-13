package cz.mendelu.xpacako1.microlearning.domain.topic;

import cz.mendelu.xpacako1.microlearning.domain.test.Test;
import cz.mendelu.xpacako1.microlearning.domain.test.TestResponse;
import cz.mendelu.xpacako1.microlearning.domain.test.TestService;
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
@RequestMapping("topics")
@Validated
public class TopicController {

    // services
    private final TopicService topicService;

    // constructor with autowired
    @Autowired
    public TopicController(
            TopicService topicService
    ){
        this.topicService = topicService;
    }

    // endpoints
    //- GET seznamy
    @Operation(
            summary = "Get all topics",
            description = "Get all topics in the system."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of topics")
    })
    @GetMapping(value = {"","/"}, produces = "application/json")
    public ArrayResponse<TopicResponse> getAllTests() {
        return ArrayResponse.of(
                topicService.getAllTopics(),
                TopicResponse::new
        );
    }

//    @Operation(
//            summary = "Get one topic by ID",
//            description = "Get topic by ID."
//    )
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Topic by ID"),
//            @ApiResponse(responseCode = "404", description = "Topic not found"),
//    })
//    @GetMapping(value = "/{id}", produces = "application/json")
//    public ObjectResponse<TestResponse> getTestById(@PathVariable Long id) {
//        Test test = testService.getById(id).orElseThrow(() -> new NotFoundException("Test not found"));
//        return ObjectResponse.of(
//                test,
//                TestResponse::new
//        );
//    }
}
