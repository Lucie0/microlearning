-- -------------------------------------------------------------------------
-- LESSON ---------------------------------------------------------------------------
-- -------------------------------------------------------------------------
INSERT INTO public.lesson (id, name, content) VALUES (1, 'First source code', 'When you want to write your program in C you have to write so called ''main'' function.
Functions in C/C++ are a pieces of code that have own name (identificator) and body. Main function represents whole program, so it must be always written in source code.
The general form of function is:
<font face=''code''>data_type function_name (parameters) { body }</font>
So the main function may have following form:
<font face=''code''>int main() {
    // here are statements of function body
    return 0;  // so called return value of function
}</font>
The main function returns integer value, thus data type of function main is <b>int</b>.
');
INSERT INTO public.lesson (id, name, content) VALUES (2, 'Header files', 'A header file is a file with extension .h which contains declarations and definitions to be shared between several source files. There are two types of header files: the files that the programmer writes and the files that comes with your compiler.
The use of header file is necessary in almost every program. One of the most useful header file which come with compiler (or operating system) is file with declaration of input/output operations.
You request to use a header file in your program by including it with the C preprocessing directive #include. The syntax of #include has following two forms:
<font face=''code''>#include &lt;name&gt;</font>
This variant is for the system (compiler) files, and
#include ''name''
for files written by programmer.
Detailed information about preprocessing directives comes later in this course.
');
INSERT INTO public.lesson (id, name, content) VALUES (3, 'Common simple input/output', 'Almost every program needs to input some values and output results. So we have to use appropriate commands for it.
The input and output operations depend always on operation system environment. Every system and every situation is solved differently. But the programmer – the author of program – have no information about it. The source code of program must work on many systems and programmer have to write the same commands.
So the input and output operations are encapsulated into functions which bodies are implemented according to operation system you actually use and their headers are always the same.
Every programming language have some commands for the input and output operations, but every programming language have a different approach for it.
We will discuss two approaches because of two different versions of C language: pure C and C++ versions.
');
INSERT INTO public.lesson (id, name, content) VALUES (4, 'Standard library for simple input/output', 'In the C++ programming language, the C++ Standard Library is a collection of classes and functions, which are written in the core language and part of the C++ ISO Standard itself. The C++ Standard Library provides support for some language features and functions for everyday tasks such as finding the square root of a number or simple input/output.
There are differences between C and C++ standard library. We prefer C++ approach, so we show C++ simple input/output and appropriate part of standard library for this.
We need some input values and write output in almost every program. In very simple form we have statement for input: cin (it stands for ''console input''), and statement for output: cout (i.e. ''console output'').
When we need mentioned commands, we have to include a standard library for this in following form:
#include &lt;iostream&gt;
');
INSERT INTO public.lesson (id, name, content) VALUES (5, 'Simple input and output in C++', 'As mentioned earlier, cin and cout are available for input and output. Their use is supplemented by a special operator ''&lt;&lt;'' and ''&gt;&gt;''. Multiple items can be read or written with one cin command and one cout command. Small hint: Operator ''&gt;&gt;'' points from cin to the variable, operator ''&lt;&lt;'' points from variable or expression to cout. For example input to two variables:
cin &gt;&gt; Var1 &gt;&gt; Var2;
Output can be realized as a sequence of expressions:
cout &lt;&lt; ''The value is '' &lt;&lt; Var1 + Var2*5 &lt;&lt; ''.'' &lt;&lt; endl;
Note that cin, cout and endl (stands for ''end of line'') are objects in namespace std. When we use them directly, we have to open this namespace via command:
using namespace std;
If we did not specify this command, it would be necessary to write a space name for each element contained in it:
std::cout &lt;&lt; ''The value is '' &lt;&lt; Var1 + Var2*5 &lt;&lt; ''.'' &lt;&lt; std::endl;
Standard error output
Just as we can write to the standard output (stream cout), we can write to the standard error output in the same way using the stream cerr. Everything else remains the same as cout. We will always use the standard error output if we want to convey some non-standard situation or auxiliary information to the user. We never mix these auxiliary messages with data, so we don""t write them to standard output! For example:
double a, b;
cin &gt;&gt; a &gt;&gt; b; // input two non-zero numbers
if (a*b == 0) cerr &lt;&lt; ''invalid data!'' &lt;&lt; endl;  // error!
   else // valid data, output to stdout
      cout &lt;&lt; ''Contents of rectangle is '' &lt;&lt; a*b &lt;&lt; endl;
');
INSERT INTO public.lesson (id, name, content) VALUES (6, 'What is a variable?', 'A variable is certain place in computer memory which can hold some values. It""s different approach than in mathematics.
What place does the memory variable occupy? This depends on its data type. Data types will be discussed later in this course.
If a variable occupies some space, we can insert certain values into it.
Each memory space has its address. In order not to remember the numeric form of the address, these addresses are named, so we call it a variable identifier. It represents the numeric form of the address.
So each variable has its address (or name in form of identifier) and its value.
');
INSERT INTO public.lesson (id, name, content) VALUES (7, 'Values of variable', 'Each variable can hold some values. Because the variable occupies certain space in the computer""s memory, which is composed as a sequence of bits, each value is machine-displayed as a sequence of zeros and ones.
A sequence of ones and zeros can mean different values. The simplest interpretation is as a non-negative integer in the binary system.
Suppose a variable occupies a space of two bytes. What values can be stored on this space?
The minimum value is represented by all zeros and represents zero. The maximum value is formed by the ones themselves. Two bytes are 16 binary ones, which is a decimal number of 65,535. So a two-byte variable can hold a value between 0 and 65,535.
    Generally, a variable on a n-bit space can hold a maximum value of 2n-1.
');
INSERT INTO public.lesson (id, name, content) VALUES (8, 'Variable declaration', 'Each variable you planned to use have to be declared. This means we have to tell the computer how the variable will be named and what data type it will be. According to the data type, the compiler creates the appropriate space for this variable in computer memory. The declaration must always precede the use of the variable.
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
');

-- -------------------------------------------------------------------------
-- TEST
-- -------------------------------------------------------------------------
INSERT INTO public.test (id, name) VALUES (1, 'Hello World Test');
INSERT INTO public.test (id, name) VALUES (2, 'Test 1');
INSERT INTO public.test (id, name) VALUES (3, 'Test 2');
INSERT INTO public.test (id, name) VALUES (4, 'Test 3');

-- -------------------------------------------------------------------------
-- NODE
-- -------------------------------------------------------------------------
INSERT INTO public.node (id, walk_through, successfully_completed, lesson_id, pretest_id) VALUES (1, false, false, 1, 1);
INSERT INTO public.node (id, walk_through, successfully_completed, lesson_id, pretest_id) VALUES (2, false, false, 2, 2);
INSERT INTO public.node (id, walk_through, successfully_completed, lesson_id, pretest_id) VALUES (3, false, false, 3, 3);
INSERT INTO public.node (id, walk_through, successfully_completed, lesson_id, pretest_id) VALUES (4, false, false, 4, 3);
INSERT INTO public.node (id, walk_through, successfully_completed, lesson_id, pretest_id) VALUES (5, false, false, 5, 4);

-- -------------------------------------------------------------------------
-- OPTION -- TODO co s otevrenymi otazkami a spravnymi odpovedmi?
-- -------------------------------------------------------------------------
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (1, 'parenthesis', true, 1, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (2, 'curly brackets', false, 1, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (3, 'spaces', false, 1, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (4, 'file with function declaration and/or some definition in C/C++ language.', true, 2, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (5, 'file with a part of function body or main function body.', false, 2, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (6, 'file containing the first line of C/C++ source code.', false, 2, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (7, 'file containing any part of source code.', false, 2, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (8, '#include &lt;filename&gt;', true, 3, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (9, '#using &lt;filename&gt;', false, 3, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (10, '#include "filename"', false, 3, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (11, '!copy filename', false, 3, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (12, '#include "filename"', true, 4, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (13, '#define "filename"', false, 4, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (14, '#use "filename"', false, 4, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (15, '#include &lt;filename&gt;', false, 4, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (16, 'whole program', true, 6, 1);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (17, 'alternative part', false, 6, 1);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (18, 'int', true, 6, 2);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (19, 'string', false, 6, 2);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (20, 'returned value', true, 6, 3);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (21, 'clear screen', false, 6, 3);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (22, 'clear input buffer', false, 6, 3);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (23, 'True', false, 7, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (24, 'False', true, 7, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (25, 'True', true, 8, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (26, 'False', false, 8, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (27, '#include &lt;iostream&gt;', true, 9, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (28, '#include &lt;stdio&gt;', false, 9, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (29, '#include "inputoutput"', false, 9, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (30, '#input "iostream"', false, 9, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (31, 'Certain place in computer memory.', true, 10, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (32, 'Letter representing some real number.', false, 10, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (33, 'Number of program steps.', false, 10, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (34, 'represents the address of variable in memory.', true, 11, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (35, 'represents the value of variable.', false, 11, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (36, 'represents number of possible values.', false, 11, 0);
INSERT INTO public.option (id, text, correct_answer, question_id, group_number) VALUES (37, '24', true, 5, 0);

-- -------------------------------------------------------------------------
-- QUESTION
-- -------------------------------------------------------------------------
INSERT INTO public.question (id, text, points, number, question_type) VALUES (1, 'Parameters of the main function are enclosed by:', 1, 1, 0);
INSERT INTO public.question (id, text, points, number, question_type) VALUES (2, 'The header file is:', 1, 1, 0);
INSERT INTO public.question (id, text, points, number, question_type) VALUES (3, 'The header file to come with compiler or operating system is used to write:', 1, 2, 0);
INSERT INTO public.question (id, text, points, number, question_type) VALUES (4, 'The header file written by programmer is used to write', 1, 3, 0);
INSERT INTO public.question (id, text, points, number, question_type) VALUES (5, 'Assume the following variable declarations:
   <font face=''code''>double A, B = 0;
   float C, D=1.2E-2;</font>
How much total memory do these variables take?', 2, 4, 3);
INSERT INTO public.question (id, text, points, number, question_type) VALUES (6, 'The main function represents [[1]] of C-program. Its declaration consists of [[2]] type, identifier "main", parameters and body. The body of main function contains statement for [[3]].', 2, 5, 2);
INSERT INTO public.question (id, text, points, number, question_type) VALUES (7, 'The body of main function is enclosed by parenthesis.', 1, 1, 0);
INSERT INTO public.question (id, text, points, number, question_type) VALUES (8, 'Header files have two types: system and programmer made.', 1, 1, 0);
INSERT INTO public.question (id, text, points, number, question_type) VALUES (9, 'For input/output operations in C++ we use:', 1, 1, 0);
INSERT INTO public.question (id, text, points, number, question_type) VALUES (10, 'What is a variable in programming language?', 1, 1, 0);
INSERT INTO public.question (id, text, points, number, question_type) VALUES (11, 'Variable identifier in programming language', 1, 1, 0);

-- -------------------------------------------------------------------------
-- LINKS
-- -------------------------------------------------------------------------
INSERT INTO public.link (id, actual_node, next_node) VALUES (1, 1, 2);
INSERT INTO public.link (id, actual_node, next_node) VALUES (2, 2, 3);
INSERT INTO public.link (id, actual_node, next_node) VALUES (3, 2, 4);
INSERT INTO public.link (id, actual_node, next_node) VALUES (4, 3, 5);
INSERT INTO public.link (id, actual_node, next_node) VALUES (5, 4, 5);
