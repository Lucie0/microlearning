package cz.mendelu.xpacako1.microlearning.domain.lesson;

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
@RequestMapping("lessons")
@Validated
public class LessonController {

    // services
    private final LessonService lessonService;

    // constructor with autowired
    @Autowired
    public LessonController(
            LessonService lessonService
    ){
        this.lessonService = lessonService;
    }

    // endpoints
    //- GET seznamy
    @Operation(
            summary = "Get all lessons",
            description = "Get all lessons in the system."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of lessons")
    })
    @GetMapping(value = {"","/"}, produces = "application/json")
    public ArrayResponse<LessonResponse> getAllLessons() {
        return ArrayResponse.of(
                lessonService.getAllLessons(),
                LessonResponse::new
        );
    }

    @Operation(
            summary = "Get one lesson by ID",
            description = "Get lesson by ID."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lesson by ID"),
            @ApiResponse(responseCode = "404", description = "Lesson not found"),
    })
    @GetMapping(value = "/{id}", produces = "application/json")
    public ObjectResponse<LessonResponse> getLessonById(@PathVariable Long id) {
        Lesson lesson = lessonService.getById(id).orElseThrow(() -> new NotFoundException("Lesson not found"));
        return ObjectResponse.of(
                lesson,
                LessonResponse::new
        );
    }
}
