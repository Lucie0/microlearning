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
import org.springframework.data.jpa.repository.Query;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ArrayResponse<QuestionResponse> getAllQuestions(
            @RequestParam(required = false, value = "forLessonId") Long lessonId
    ) {
        List<Question> questions;
        if (lessonId != null) {
            questions = questionService.getAllQuestionsByLessonId(lessonId);
        } else {
            questions = questionService.getAllQuestions();
        }
        return ArrayResponse.of(
                questions,
                QuestionResponse::new
        );
    }


    @Operation(
            summary = "Get one question by ID",
            description = "Get question by ID."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Question by ID"),
            @ApiResponse(responseCode = "404", description = "Question not found"),
    })
    @GetMapping(value = "/{id}", produces = "application/json")
    public ObjectResponse<QuestionResponse> getQuestionById(@PathVariable Long id) {
        Question question = questionService.getById(id).orElseThrow(() -> new NotFoundException("Question not found"));
        return ObjectResponse.of(
                question,
                QuestionResponse::new
        );
    }
}
