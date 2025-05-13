package cz.mendelu.xpacako1.microlearning.domain.lesson;

import cz.mendelu.xpacako1.microlearning.utils.exceptions.NotFoundException;
import cz.mendelu.xpacako1.microlearning.utils.response.ArrayResponse;
import cz.mendelu.xpacako1.microlearning.utils.response.ObjectResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @Operation(
            summary = "Get lessons with topic",
            description = "Get all lessons with the topic in parameter."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lessons with topic"),
    })
    @GetMapping(value = "/byTopic/{topicId}", produces = "application/json")
    public ArrayResponse<LessonResponse> getLessonsByTopicId(
            @PathVariable Long topicId
    ) {
        return ArrayResponse.of(
                lessonService.getLessonsByTopicId(topicId),
                LessonResponse::new
        );
    }

    @Operation(
            summary = "Get lesson by ordinal number",
            description = "Get lesson by ordinal number."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lessons by ordinal number"),
            @ApiResponse(responseCode = "404", description = "Lessons not found"),
    })
    @GetMapping(value = "/byTopic/{topicId}/byOrdinalNumber/{ordinalNumber}", produces = "application/json")
    public ObjectResponse<LessonResponse> getLessonsByOrdinalNumberAndTopicId(
            @PathVariable int ordinalNumber,
            @PathVariable Long topicId
    ) {
        Lesson lesson =  lessonService.getByOrdinalNumberAndTopicId(ordinalNumber, topicId).orElseThrow(() -> new NotFoundException("Lesson not found"));

        return ObjectResponse.of(
                lesson,
                LessonResponse::new
        );
    }


}
