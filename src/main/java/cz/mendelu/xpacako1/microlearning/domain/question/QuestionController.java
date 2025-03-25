package cz.mendelu.xpacako1.microlearning.domain.question;

import cz.mendelu.xpacako1.microlearning.domain.lesson.Lesson;
import cz.mendelu.xpacako1.microlearning.domain.lesson.LessonResponse;
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
@RequestMapping("questions")
@Validated
public class QuestionController {

    // services
    private final QuestionService questionService;

    // constructor with autowired
    @Autowired
    public QuestionController(
            QuestionService questionService
    ){
        this.questionService = questionService;
    }

    // endpoints
    //- GET seznamy
    @Operation(
            summary = "Get all questions",
            description = "Get all questions in the system."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of Questions")
    })
    @GetMapping(value = {"","/"}, produces = "application/json")
    public ArrayResponse<QuestionResponse> getAllQuestions() {
        return ArrayResponse.of(
                questionService.getAllQuestions(),
                QuestionResponse::new
        );
    }

    // todo get question by id
//    @Operation(
//            summary = "Get one lesson by ID",
//            description = "Get lesson by ID."
//    )
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Lesson by ID"),
//            @ApiResponse(responseCode = "404", description = "Lesson not found"),
//    })
//    @GetMapping(value = "/{id}", produces = "application/json")
//    public ObjectResponse<LessonResponse> getLessonById(@PathVariable Long id) {
//        Lesson lesson = questionService.getById(id).orElseThrow(() -> new NotFoundException("Lesson not found"));
//        return ObjectResponse.of(
//                lesson,
//                LessonResponse::new
//        );
//    }
}
