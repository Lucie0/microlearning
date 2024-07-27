package cz.mendelu.xpacako1.microlearning.utils.response;

import cz.mendelu.xpacako1.microlearning.domain.lesson.Lesson;
import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Getter
@AllArgsConstructor
public class ArrayResponse<T> {

    List<T> items;

    // factory method
    static public <I, T> ArrayResponse<T> of(List<I> items, Function<I, T> mapper) {
        List<T> responses = items.stream()
                .map(mapper)
                .toList();
        int version = 1; // example of meta information
        return new ArrayResponse<>(responses, responses.size(), version);
    }

    // Here is place for meta information about items:

    int count;

    int version;
}
