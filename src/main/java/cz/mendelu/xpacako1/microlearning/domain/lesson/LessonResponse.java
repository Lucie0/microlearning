package cz.mendelu.xpacako1.microlearning.domain.lesson;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import lombok.Data;

import java.sql.Clob;

@Data
public class LessonResponse {
    private Long id;
    private String name;
//    @Lob
//    private Clob content;
    private String content;

    public LessonResponse(Lesson lesson){
        this.id = lesson.getId();
        this.name = lesson.getName();
        this.content = lesson.getContent();
    }
}
