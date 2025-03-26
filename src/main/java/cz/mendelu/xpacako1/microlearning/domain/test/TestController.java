package cz.mendelu.xpacako1.microlearning.domain.test;

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
@RequestMapping("tests")
@Validated
public class TestController {

    // services
    private final TestService testService;

    // constructor with autowired
    @Autowired
    public TestController(
            TestService testService
    ){
        this.testService = testService;
    }

    // endpoints
    //- GET seznamy
    @Operation(
            summary = "Get all tests",
            description = "Get all tests in the system."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of tests")
    })
    @GetMapping(value = {"","/"}, produces = "application/json")
    public ArrayResponse<TestResponse> getAllTests() {
        return ArrayResponse.of(
                testService.getAllTests(),
                TestResponse::new
        );
    }

    @Operation(
            summary = "Get one test by ID",
            description = "Get test by ID."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Test by ID"),
            @ApiResponse(responseCode = "404", description = "Test not found"),
    })
    @GetMapping(value = "/{id}", produces = "application/json")
    public ObjectResponse<TestResponse> getTestById(@PathVariable Long id) {
        Test test = testService.getById(id).orElseThrow(() -> new NotFoundException("Test not found"));
        return ObjectResponse.of(
                test,
                TestResponse::new
        );
    }
}
