package cz.mendelu.xpacako1.microlearning.domain.option;

import cz.mendelu.xpacako1.microlearning.domain.lesson.LessonService;
import cz.mendelu.xpacako1.microlearning.utils.response.ArrayResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("options")
@Validated
public class OptionController {

    // services
    private final OptionService optionService;

    // constructor with autowired
    @Autowired
    public OptionController(
            OptionService optionService
    ){
        this.optionService = optionService;
    }

    // endpoints
    //- GET seznamy
    @Operation(
            summary = "Get all options",
            description = "Get all options in the system."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of options")
    })
    @GetMapping(value = {"","/"}, produces = "application/json")
    public ArrayResponse<OptionResponse> getAllOptions() {
        return ArrayResponse.of(
                optionService.getAllOptions(),
                OptionResponse::new
        );
    }
}
