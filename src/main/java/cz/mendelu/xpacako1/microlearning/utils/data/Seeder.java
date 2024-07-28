package cz.mendelu.xpacako1.microlearning.utils.data;

import cz.mendelu.xpacako1.microlearning.domain.lesson.Lesson;
import cz.mendelu.xpacako1.microlearning.domain.lesson.LessonService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class Seeder {

    private final LessonService lessonService;

    // constructor
    @Autowired
    public Seeder(LessonService lessonService){
        this.lessonService = lessonService;
    }

    private boolean shouldSeedData() {
        // return
        return lessonService.getAllLessons().isEmpty();
    }

    @PostConstruct
    public void seedDefaultData() {
        if (!shouldSeedData()) {
            log.info("--- Default data already seeded ---");
            return;
        }

        // else

        List<Lesson> lessonList = new ArrayList<>();
        lessonList.add(new Lesson("First source code", """
                When you want to write your program in C you have to write so called 'main' function.
                Functions in C/C++ are a pieces of code that have own name (identificator) and body. Main function represents whole program, so it must be always written in source code.
                The general form of function is:
                data_type function_name (parameters) { body }
                So the main function may have following form:
                int main() {
                    // here are statements of function body
                   return 0;  // so called return value of function
                }
                The main function returns integer value, thus data type of function main is int.
                """));
        lessonList.add(new Lesson("Header files", """
                A header file is a file with extension .h which contains declarations and definitions to be shared between several source files. There are two types of header files: the files that the programmer writes and the files that comes with your compiler.
                The use of header file is necessary in almost every program. One of the most useful header file which come with compiler (or operating system) is file with declaration of input/output operations.
                You request to use a header file in your program by including it with the C preprocessing directive #include. The syntax of #include has following two forms:
                #include <name>
                This variant is for the system (compiler) files, and
                #include 'name'
                for files written by programmer.
                Detailed information about preprocessing directives comes later in this course.
                """));

        lessonList.add(new Lesson("Common simple input/output", """
                Almost every program needs to input some values and output results. So we have to use appropriate commands for it.
                The input and output operations depend always on operation system environment. Every system and every situation is solved differently. But the programmer – the author of program – have no information about it. The source code of program must work on many systems and programmer have to write the same commands.
                So the input and output operations are encapsulated into functions which bodies are implemented according to operation system you actually use and their headers are always the same.
                Every programming language have some commands for the input and output operations, but every programming language have a different approach for it.
                We will discuss two approaches because of two different versions of C language: pure C and C++ versions.
                """));

        lessonList.add(new Lesson("Standard library for simple input/output", """
                In the C++ programming language, the C++ Standard Library is a collection of classes and functions, which are written in the core language and part of the C++ ISO Standard itself. The C++ Standard Library provides support for some language features and functions for everyday tasks such as finding the square root of a number or simple input/output.
                There are differences between C and C++ standard library. We prefer C++ approach, so we show C++ simple input/output and appropriate part of standard library for this.
                We need some input values and write output in almost every program. In very simple form we have statement for input: cin (it stands for 'console input'), and statement for output: cout (i.e. 'console output').
                When we need mentioned commands, we have to include a standard library for this in following form:
                #include <iostream>
                """));

        lessonList.add(new Lesson("Simple input and output in C++", """
                As mentioned earlier, cin and cout are available for input and output. Their use is supplemented by a special operator '<<' and '>>'. Multiple items can be read or written with one cin command and one cout command. Small hint: Operator '>>' points from cin to the variable, operator '<<' points from variable or expression to cout. For example input to two variables:
                cin >> Var1 >> Var2;
                Output can be realized as a sequence of expressions:
                cout << 'The value is ' << Var1 + Var2*5 << '.' << endl;
                Note that cin, cout and endl (stands for 'end of line') are objects in namespace std. When we use them directly, we have to open this namespace via command:
                using namespace std;
                If we did not specify this command, it would be necessary to write a space name for each element contained in it:
                std::cout << 'The value is ' << Var1 + Var2*5 << '.' << std::endl;
                Standard error output
                Just as we can write to the standard output (stream cout), we can write to the standard error output in the same way using the stream cerr. Everything else remains the same as cout. We will always use the standard error output if we want to convey some non-standard situation or auxiliary information to the user. We never mix these auxiliary messages with data, so we don""t write them to standard output! For example:
                double a, b;
                cin >> a >> b; // input two non-zero numbers
                if (a*b == 0) cerr << 'invalid data!' << endl;  // error!
                   else // valid data, output to stdout
                      cout << 'Contents of rectangle is ' << a*b << endl;
                """));

        lessonList.add(new Lesson("What is a variable?", """
                A variable is certain place in computer memory which can hold some values. It""s different approach than in mathematics.
                What place does the memory variable occupy? This depends on its data type. Data types will be discussed later in this course.
                If a variable occupies some space, we can insert certain values into it.
                Each memory space has its address. In order not to remember the numeric form of the address, these addresses are named, so we call it a variable identifier. It represents the numeric form of the address.
                So each variable has its address (or name in form of identifier) and its value.
                """));

        lessonList.add(new Lesson("Values of variable", """
                Each variable can hold some values. Because the variable occupies certain space in the computer""s memory, which is composed as a sequence of bits, each value is machine-displayed as a sequence of zeros and ones.
                A sequence of ones and zeros can mean different values. The simplest interpretation is as a non-negative integer in the binary system.
                Suppose a variable occupies a space of two bytes. What values can be stored on this space?
                The minimum value is represented by all zeros and represents zero. The maximum value is formed by the ones themselves. Two bytes are 16 binary ones, which is a decimal number of 65,535. So a two-byte variable can hold a value between 0 and 65,535.
                    Generally, a variable on a n-bit space can hold a maximum value of 2n-1.
                """));

        lessonList.add(new Lesson("Variable declaration", """
                Each variable you planned to use have to be declared. This means we have to tell the computer how the variable will be named and what data type it will be. According to the data type, the compiler creates the appropriate space for this variable in computer memory. The declaration must always precede the use of the variable.
                The declaration in C/C++ language is written as follows scheme:
                data_type variable_identifier;
                For example (int is identifier for integer data type):
                int Count;
                Now we can use the variable Count which can hold some integer value.
                If we need more variables of the same type, we can use the notation where we specify a data type and a list of variables of this type divided by commas:
                int suma, current_value, count;
                After the declaration, the value of the variable is undefined. If we want the variable to have its initial value along with the declaration, we can write it directly into the declaration statement. In one declaration statement, we can combine variables without and with an initial value. For example:
                int suma=0, current_value, count=1;
                The variable current_value has undefined value, but suma has value zero and count has value 1.
                """));

        lessonService.createLesson(lessonList);

        log.info("--- Default data seeded ---");
    }
}
