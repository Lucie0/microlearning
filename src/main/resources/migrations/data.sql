-- -------------------------------------------------------------------------
-- LESSON ---------------------------------------------------------------------------
-- -------------------------------------------------------------------------
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('1', 'Matematika', '<div align="center">
Bakalářská práce<br>
<br>
<b>Mobilní aplikace pro adaptivní mikrolearning</b>
<br><br>
Ukázková sada lekcí z oboru matematika pro demonstraci funkce vyvíjené mobilní aplikace.<br>
</div>', '0', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('2', 'Sčítání', '<b>Vysvětlení pojmu</b><br>
Sčítání je aritmetická operace, která přiřazuje každé dvojici čísel A a B třetí číslo C, které se nazývá jejich součet.<br>
<br>
<b>Symbolický zápis</b>
<ul>
<li>A + B = C</li>
</ul>
<b>Příklad</b><br>
Pokud máme dvě čísla, například 3 a 5, jejich součet je 8.
<ul>
<li>3 + 5 = 8</li>
</ul>', '1', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('3', 'Odčítání', '<b>Vysvětlení pojmu</b><br>
Odčítání je aritmetická operace, která přiřazuje každé dvojici čísel A a B třetí číslo C, které se nazývá jejich rozdíl.<br>
<br>
<b>Symbolický zápis</b>
<ul>
<li>A - B = C</li>
</ul>
<b>Příklad</b><br>
Pokud máme dvě čísla, například 8 a 3, jejich rozdíl je 5.
<ul>
<li>8 - 3 = 5</li>
</ul>', '2', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('4', 'Násobení', '<b>Vysvětlení pojmu</b><br>
Násobení je aritmetická operace, která přiřazuje každé dvojici čísel A a B třetí číslo C, které se nazývá jejich součin.<br>
<br>
<b>Symbolický zápis</b>
<ul>
<li>A ⋅ B = C</li>
</ul>
<b>Příklad</b><br>
Pokud máme dvě čísla, například 4 a 6, jejich součin je 24.
<ul>
<li>4 ⋅ 6 = 24</li>
</ul>', '3', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('5', 'Dělení', '<b>Vysvětlení pojmu</b><br>
Dělení je aritmetická operace, která přiřazuje každé dvojici čísel A a B třetí číslo C, které se nazývá jejich podíl.<br>
<br>
<b>Symbolický zápis</b>
<ul>
<li>A / B = C</li>
</ul>
<b>Příklad</b><br>
Pokud máme dvě čísla, například 12 a 4, jejich podíl je 3.
<ul>
<li>12 / 4 = 3</li>
</ul>', '4', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('6', 'Mocnina', '<b>Vysvětlení pojmu</b><br>
Mocnina je matematická operace, která povyšuje číslo (základ) na určitou mocninu (exponent). <br>
<br>
<b>Symbolický zápis</b>
<ul>
<li>A^B = C</li>
</ul>
kde A je základ a B je exponent.<br>
<br>
<b>Příklad</b><br>
Pokud máme základ A = 2 a exponent B = 3, pak jejich mocnina je 8.
<ul>
<li>2 ^ 3 = 2 ⋅ 2 ⋅ 2 = 8</li>
</ul>', '5', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('7', 'Odmocnina', '<b>Vysvětlení pojmu</b><br>
Odmocnina je matematická operace, která hledá číslo, které při umocnění na určitý exponent dává původní číslo. Nejčastěji se používá druhá odmocnina, která hledá číslo, které při umocnění na druhou dává původní číslo. <br>
<br>
<b>Symbolický zápis</b>
<ul>
<li>√A = B</li>
</ul>
<b>Příklad</b><br>
Pokud máme číslo A = 16, pak druhá odmocnina z A je 4.
<ul>
<li>√16 = 4</li>
</ul>', '6', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('8', 'Priorita aritmetických operací', '<b>Vysvětlení pojmu</b><br>
Priorita vyhodnocování aritmetických operací určuje, jakým způsobem se matematické výrazy vyhodnocují, když obsahují více operací různého druhu. Existují pevně daná pravidla, která určují pořadí vyhodnocení operací:<br>
<br>
<u>1. Závorky: </u> Výrazy uvnitř závorek mají nejvyšší prioritu a jsou vyhodnocovány jako první.<br>
Příklad:  4 ⋅ <b>(2 + 3)</b> = 4 ⋅ 5 = 20<br>
<br>
<u>2. Mocniny a odmocniny: </u>Výrazy s mocninami a odmocninami jsou vyhodnocovány jako druhé.<br>
Příklad:  4 ⋅ <b>2^3</b> = 4 ⋅ 8 = 32<br>
<br>
<u>3. Násobení a dělení: </u> Tyto operace mají stejnou prioritu a jsou vyhodnocovány zleva doprava.<br>
Příklad: 1 + <b>6 / 2 ⋅ 3</b> = 1 + 3 ⋅ 3 = 1 + 9 = 10<br>
<br>
<u>4. Sčítání a odčítání: </u> Tyto operace mají nejnižší prioritu a jsou vyhodnocovány zleva doprava.<br>
Příklad: 5 + 3 - 2 = 8 - 2 = 6', '7', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('9', 'Komutativita', '<b>Vysvětlení pojmu</b><br>
Pořadí operandů při operaci nemá vliv na výsledek.<br>
<br>
Tato vlastnost platí např. pro sčítání:<br>
<ul>
<li>A + B = B + A</li>
</ul>
<br>
<b>Příklad</b><br>
<ul>
<li>3 + 5 = 5 + 3</li>
</ul>', '8', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('10', 'Asociativita', '<b>Vysvětlení pojmu</b><br>
Při operaci více operandů nezáleží na tom, jak jsou seskupeny.<br>
<br>
Tato vlastnost platí např. pro sčítání:<br>
<ul>
<li>(A + B) + C = A + (B + C)</li>
</ul>
<br>
<b>Příklad</b><br>
<ul>
<li>(2 + 3) + 4 = 2 + (3 + 4)</li>
</ul>', '9', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('11', 'Distributivita', '<b>Vysvětlení pojmu</b><br>
Distributivita je matematická vlastnost, která umožňuje distribuci („rozložení“) jedné operace přes jinou operaci. <br>
<br>
Tato vlastnost platí např. pro násobení vzhledem ke sčítání, což znamená, že násobení čísla součtem dvou čísel je stejné jako součet jednotlivých násobků.<br>
<ul>
<li>A ⋅ (B + C) = (A ⋅ B) + (A ⋅ C)</li>
<li>(A + B) ⋅ C = (A ⋅ C) + (B ⋅ C)</li>
</ul>
<br>
<b>Příklad</b><br>
<ul>
<li>2 ⋅ (3 + 4) = (2 ⋅ 3) + (2 ⋅ 4)</li>
<li>(2 + 3) ⋅ 4 = (2 ⋅ 4) + (3 ⋅ 4)</li>
</ul>', '10', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('12', 'Vlastnosti sčítání', '<b>1. Je komutativní: </b>
<ul>
<li>A + B = B + A</li>
</ul>
Příklad: <br>
<ul>
<li>3 + 5 = 5 + 3</li>
</ul>
<br>
<b>2. Je asociativní: </b>
<ul>
<li>(A + B) + C = A + (B + C)</li>
</ul>
Příklad:<br>
<ul>
<li>(2 + 3) + 4 = 2 + (3 + 4)</li>
</ul>
<br>
<b>3. Není distributivní. </b><br>
.                                                                             .<br>', '11', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('13', 'Vlastnosti odčítání', '<b>1. Není komutativní: </b>
<ul>
<li>A - B ≠ B - A</li>
</ul>
Příklad: <br>
<ul>
<li>5 - 3 ≠ 3 - 5</li>
</ul>
<br>
<b>2. Není asociativní: </b>
<ul>
<li>(A - B) - C ≠ A - (B - C)</li>
</ul>
Příklad:<br>
<ul>
<li>(10 - 5) - 2 ≠ 10 - (5 - 2)</li>
</ul>
<br>
<b>3. Není distributivní. </b>', '12', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('14', 'Vlastnosti násobení', '<b>1. Je komutativní: </b>
<ul>
<li>A ⋅ B = B ⋅ A</li>
</ul>
Příklad: <br>
<ul>
<li>4 ⋅ 6 = 6 ⋅ 4</li>
</ul>
<br>
<b>2. Je asociativní: </b>
<ul>
<li>(A ⋅ B) ⋅ C = A ⋅ (B ⋅ C)</li>
</ul>
Příklad:<br>
<ul>
<li>(2 ⋅ 3) ⋅ 4 = 2 ⋅ (3 ⋅ 4)</li>
</ul>
<br>
<b>3. Je distributivní vzhledem ke sčítání a odčítání:</b>
<ul>
<li>A ⋅ (B + C) = (A ⋅ B) + (A ⋅ C)</li>
<li>A ⋅ (B - C) = (A ⋅ B) - (A ⋅ C)</li>
<li>(A + B) ⋅ C = (A ⋅ C) + (B ⋅ C)</li>
<li>(A - B) ⋅ C = (A ⋅ C) - (B ⋅ C)</li>
</ul>
Příklad:<br>
<ul>
<li>2 ⋅ (3 + 4) = (2 ⋅ 3) + (2 ⋅ 4)</li>
<li>2 ⋅ (3 - 4) = (2 ⋅ 3) - (2 ⋅ 4)</li>
<li>(2 + 3) ⋅ 4 = (2 ⋅ 4) + (3 ⋅ 4)</li>
<li>(2 - 3) ⋅ 4 = (2 ⋅ 4) - (3 ⋅ 4)</li>
</ul>', '13', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('15', 'Vlastnosti dělení', '<b>1. Není komutativní: </b>
<ul>
<li>A / B ≠ B / A</li>
</ul>
Příklad: <br>
<ul>
<li>12 / 4 ≠ 4 / 12</li>
</ul>
<br>
<b>2. Není asociativní: </b>
<ul>
<li>(A / B) / C ≠ A / (B / C)</li>
</ul>
Příklad:<br>
<ul>
<li>(12 / 4) / 3 ≠ 12 / (4 / 3)</li>
</ul>
<br>
<b>3. Je distributivní zprava vzhledem ke sčítání a odčítání:</b>
<ul>
<li>(A + B) / C = (A / C) + (B / C)</li>
<li>(A - B) / C = (A / C) - (B / C)</li>
<li>ale A / (B + C) ≠ (A / B) + (A / C)</li>
<li>ale A / (B - C) ≠ (A / B) - (A / C)</li>
</ul>
Příklad:<br>
<ul>
<li>(6 + 4) / 2 = (6 / 2) + (4 / 2)</li>
<li>(6 - 4) / 2 = (6 / 2) - (4 / 2)</li>
<li>ale 10 / (6 + 4) ≠ (10 / 6) + (10 / 4)</li>
<li>ale 10 / (6 - 4) ≠ (10 / 6) - (10 / 4)</li>
</ul>', '14', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('16', 'Vlastnosti mocniny', '<b>1. Není komutativní: </b>
<ul>
<li>A^B ≠ B^A</li>
</ul>
Příklad: <br>
<ul>
<li>2^3 ≠ 3^2</li>
</ul>
<br>
<b>2. Není asociativní: </b>
<ul>
<li>(A^B)^C ≠ A^(B^C)</li>
</ul>
Příklad:<br>
<ul>
<li>(2^3)^2 ≠ 2^(3^2)</li>
</ul>
<br>
<b>3. Je distributivní zprava vzhledem k násobení a dělení:</b>
<ul>
<li>(A ⋅ B) ^ C = (A ^ C) ⋅ (B ^ C)</li>
<li>(A / B) ^ C = (A ^ C) / (B ^ C)</li>
<li>ale A ^ (B ⋅ C) ≠ (A ^ B) ⋅ (A ^ C)</li>
<li>ale A ^ (B / C) ≠ (A ^ B) / (A ^ C)</li>
</ul>
Příklad:<br>
<ul>
<li>(2 ⋅ 3)^2 = 2^2 ⋅ 3^2</li>
<li>(2 / 3)^2 = 2^2 / 3^2</li>
<li>ale 2^(3 ⋅ 4) ≠ (2^3) ⋅ (2^4)</li>
<li>ale 2^(3 / 4) ≠ (2^3) / (2^4)</li>
</ul>', '15', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('17', 'Vlastnosti (druhé) odmocniny', '<b>1. Není komutativní: </b> Komutativní operace umožňují zaměnit pořadí čísel, aniž by se změnil výsledek. U odmocniny však nelze zaměnit pořadí čísel, protože odmocňování se provádí pouze na jednom čísle.<br>
<br>
<b>2. Není asociativní: </b> Zdůvodnění obdobné, jako v předchozím případě.<br>
<br>
<b>3. Je distributivní vzhledem k násobení a dělení:</b>
<ul>
<li>√(A ⋅ B) = √A ⋅ √B</li>
<li>√(A / B) = √A / √B</li>
</ul>
Příklad:<br>
<ul>
<li>√(4 ⋅ 9) = √4 ⋅ √9</li>
<li>√(16 / 4) = √16 / √4</li>
</ul>', '16', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('18', 'Goniometrie', '<b>Vysvětlení pojmu</b><br>
Goniometrie je odvětví matematiky, které se zabývá měřením úhlů a studiem úhlových funkcí, jako jsou sinus, kosinus, tangens a kotangens.', '17', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('19', 'Sinus', '<b>Vysvětlení pojmu</b><br>
V pravoúhlém trojúhelníku je sinus úhlu poměr délky protilehlé strany k délce přepony.<br>
<br>
<b>Symbolický zápis</b>
<ul>
<li>sin(α) = protilehlá strana / přepona</li>
</ul>
<b>Příklad</b><br>
Pokud máme pravoúhlý trojúhelník s přeponou délky 5 a protilehlou stranou délky 3, pak sinus vrcholového úhlu je 0,6.
<ul>
<li>sin(α) = 3 / 5 = 0,6</li>
</ul>', '18', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('20', 'Kosinus', '<b>Vysvětlení pojmu</b><br>
V pravoúhlém trojúhelníku je kosinus úhlu poměr délky přilehlé strany k délce přepony.<br>
<br>
<b>Symbolický zápis</b>
<ul>
<li>cos(α) = přilehlá strana / přepona</li>
</ul>
<b>Příklad</b><br>
Pokud máme pravoúhlý trojúhelník s přeponou délky 5 a přilehlou stranou délky 4, pak kosinus vrcholového úhlu je 0,8.
<ul>
<li>cos(α) = 4 / 5 = 0,8</li>
</ul>', '19', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('21', 'Tangens', '<b>Vysvětlení pojmu</b><br>
V pravoúhlém trojúhelníku je tangens úhlu poměr délky protilehlé strany k délce přilehlé strany.<br>
<br>
<b>Symbolický zápis</b>
<ul>
<li>tg(α) = protilehlá strana / přilehlá strana</li>
</ul>
nebo<br>
<ul>
<li>tan(α) = protilehlá strana / přilehlá strana</li>
</ul>
<b>Příklad</b><br>
Pokud máme pravoúhlý trojúhelník s protilehlou stranou délky 3 a přilehlou stranou délky 4, pak tangens vrcholového úhlu je 0,75.
<ul>
<li>tg(α) = 3 / 4 = 0,75</li>
</ul>', '20', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('22', 'Kotangens', '<b>Vysvětlení pojmu</b><br>
V pravoúhlém trojúhelníku je kotangens úhlu poměr délky přilehlé strany k délce protilehlé strany.<br>
<br>
<b>Symbolický zápis</b>
<ul>
<li>cotg(α) = přilehlá strana / protilehlá strana</li>
</ul>
nebo<br>
<ul>
<li>cot(α) = přilehlá strana / protilehlá strana</li>
</ul>
<b>Příklad</b><br>
Pokud máme pravoúhlý trojúhelník s přilehlou stranou délky 5 a protilehlou stranou délky 2, pak kotangens vrcholového úhlu je 2,5.
<ul>
<li>cotg(α) = 5 / 2 = 2,5</li>
</ul>', '21', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('23', 'Goniometrické vzorce základní', '<ul>
<li>tan(α) = sin(α) / cos(α)</li>
</ul>
<ul>
<li>cot(α) = cos(α) / sin(α)</li>
</ul>
<ul>
<li>sin²(α) + cos²(α) = 1</li>
</ul>
<ul>
<li>tan(α) ⋅ cot(α) = 1</li>
</ul>', '22', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('24', 'Goniometrické vzorce součtu a rozdílu', '<ul>
<li><b>sin(α ± β)</b> = sin(α)cos(β) ± cos(α)sin(β)</li>
</ul>
<ul>
<li><b>cos(α ± β)</b> = cos(α)cos(β) ∓ sin(α)sin(β)</li>
</ul>
<ul>
<li><b>tan(α ± β)</b> = (tan(α) ± tan(β)) / (1 ∓ tan(α)tan(β))</li>
</ul>
<ul>
<li><b>cot(α ± β)</b> = (cot(α)cot(β) ∓ 1) / (cot(α) ± cot(β))</li>
</ul>', '23', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('25', 'Goniometrické vzorce dvojnásobného úhlu', '<ul>
<li><b>sin(2α)</b> = 2sin(α)cos(α)</li>
</ul>
<ul>
<li><b>cos(2α)</b> = cos²(α) - sin²(α)</li>
</ul>
<ul>
<li><b>tan(2α)</b> = 2tan(α) / (1 - tan²(α))</li>
</ul>
<ul>
<li><b>cot(2α)</b> = (cot²(α) - 1) / 2cot(α)</li>
</ul>', '24', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('26', 'Goniometrické vzorce polovičního úhlu', '<ul>
<li><b>sin(α/2)</b> = √[(1 - cos(α)) / 2]</li>
</ul><ul>
<li><b>cos(α/2)</b> = √[(1 + cos(α)) / 2]</li>
</ul><ul>
<li><b>tan(α/2)</b> = √[(1 - cos(α)) / (1 + cos(α)]</li>
</ul><ul>
<li><b>cot(α/2)</b> = √[(1 + cos(α)) / (1 - cos(α)]</li>
</ul>', '25', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('27', 'Goniometrické vzorce součinu', '<ul>
<li><b>sin(α)sin(β)</b> = 1/2 [cos(α - β) - cos(α + β)]</li>
</ul><ul>
<li><b>cos(α)cos(β)</b> = 1/2 [cos(α + β) + cos(α - β)]</li>
</ul><ul>
<li><b>sin(α)cos(β)</b> = 1/2 [sin(α + β) + sin(α - β)]</li>
</ul><ul>
<li><b>tan(α)tan(β)</b> = (tan(α) + tan(β)) / (cot(α) + cot(β))</li>
</ul><ul>
<li><b>cot(α)cot(β)</b> = (cot(α) + cot(β)) / (tan(α) + tan(β))</li>
</ul><ul>
<li><b>tan(α)cot(β)</b> = (tan(α) + cot(β)) / (cot(α) + tan(β))</li>
</ul>', '26', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('28', 'Hodnoty goniometrických funkcí', '   	       0°     30°     45°     60°     90°<br>
          0      π/6      π/4     π/3     π/2<br>
––––––––––––––––––––––––––––<br>
sin     0     1/2     (√2)/2     (√3)/2     1<br>
cos     1     (√3)/2     (√2)/2     1/2     0<br>
tan     0     (√3)/3     1     √3     x<br>
cot     x     √3     1     (√3)/3     0<br>', '27', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('29', 'HOTOVO', '<div align="center">
<br><b>Gratulujeme!</b><br><br>
Tvé znalosti matematiky plně dostačují na úspěšné provedení tohoto testu.<br>
<br>
🙂<br>
</div>', '28', '1');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('101', 'Programming', '<div align="center">
Bachelor''s thesis<br>
<br>
<b>Mobile application for adaptive microlearning</b>
<br><br>
A sample set of lessons of programming to demonstrate the functionality of a mobile application being developed.<br>
</div<br>', '0', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('103', 'First source code', 'When you want to write your program in C you have to write so called ''main'' function.<br>
Functions in C/C++ are a pieces of code that have own name (identificator) and body. Main function represents whole program, so it must be always written in source code.<br>
The general form of function is:<br>
<font face=''code''>data_type function_name (parameters) { body }</font>
So the main function may have following form:<br>
<font face=''code''>int main() {<br>
 // here are statements of function body<br>
 return 0; // so called return value of function<br>
}</font>
The main function returns integer value, thus data type of function main is <b>int</b>', '1', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('104', 'Header files', 'A header file is a file with extension .h which contains declarations and definitions to be shared between several source files. There are two types of header files: the files that the programmer writes and the files that comes with your compiler.<br>The use of header file is necessary in almost every program. One of the most useful header file which come with compiler (or operating system) is file with declaration of input/output operations.<br>You request to use a header file in your program by including it with the C preprocessing directive #include. The syntax of #include has following two forms:<br><font face=''code''>#include &lt;name&gt;</span><br>This variant is for the system (compiler) files, and<br>#include ''name''<br>for files written by programmer.<br>Detailed information about preprocessing directives comes later in this course<br>', '2', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('105', 'Common simple input/output', 'Almost every program needs to input some values and output results. So we have to use appropriate commands for it.<br>The input and output operations depend always on operation system environment. Every system and every situation is solved differently. But the programmer – the author of program – have no information about it. The source code of program must work on many systems and programmer have to write the same commands.<br>So the input and output operations are encapsulated into functions which bodies are implemented according to operation system you actually use and their headers are always the same.<br>Every programming language have some commands for the input and output operations, but every programming language have a different approach for it.<br>We will discuss two approaches because of two different versions of C language: pure C and C++ versions<br>', '3', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('106', 'Standard library for simple input/output', 'In the C++ programming language, the C++ Standard Library is a collection of classes and functions, which are written in the core language and part of the C++ ISO Standard itself. The C++ Standard Library provides support for some language features and functions for everyday tasks such as finding the square root of a number or simple input/output.<br>There are differences between C and C++ standard library. We prefer C++ approach, so we show C++ simple input/output and appropriate part of standard library for this.<br>We need some input values and write output in almost every program. In very simple form we have statement for input: cin (it stands for ''console input''), and statement for output: cout (i.e. ''console output'').<br>When we need mentioned commands, we have to include a standard library for this in following form:<br>#include &lt;iostream&gt<br>', '4', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('107', 'Simple input and output in C++', 'As mentioned earlier, cin and cout are available for input and output. Their use is supplemented by a special operator ''&lt;&lt;'' and ''&gt;&gt;''. Multiple items can be read or written with one cin command and one cout command. Small hint: Operator ''&gt;&gt;'' points from cin to the variable, operator ''&lt;&lt;'' points from variable or expression to cout. For example input to two variables:<br>cin &gt;&gt; Var1 &gt;&gt; Var2;<br>Output can be realized as a sequence of expressions:<br>cout &lt;&lt; ''The value is '' &lt;&lt; Var1 + Var2*5 &lt;&lt; ''.'' &lt;&lt; endl;<br>Note that cin, cout and endl (stands for ''end of line'') are objects in namespace std. When we use them directly, we have to open this namespace via command:<br>using namespace std;<br>If we did not specify this command, it would be necessary to write a space name for each element contained in it:<br>std::cout &lt;&lt; ''The value is '' &lt;&lt; Var1 + Var2*5 &lt;&lt; ''.'' &lt;&lt; std::endl;<br>Standard error output<br>Just as we can write to the standard output (stream cout), we can write to the standard error output in the same way using the stream cerr. Everything else remains the same as cout. We will always use the standard error output if we want to convey some non-standard situation or auxiliary information to the user. We never mix these auxiliary messages with data, so we don""t write them to standard output! For example:<br>double a, b;<br>cin &gt;&gt; a &gt;&gt; b; // input two non-zero numbers<br>if (a*b == 0) cerr &lt;&lt; ''invalid data!'' &lt;&lt; endl; // error!<br> else // valid data, output to stdout<br>  cout &lt;&lt; ''Contents of rectangle is '' &lt;&lt; a*b &lt;&lt; endl<br>', '5', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('108', 'What is a variable?', 'A variable is certain place in computer memory which can hold some values. It""s different approach than in mathematics.<br>What place does the memory variable occupy? This depends on its data type. Data types will be discussed later in this course.<br>If a variable occupies some space, we can insert certain values into it.<br>Each memory space has its address. In order not to remember the numeric form of the address, these addresses are named, so we call it a variable identifier. It represents the numeric form of the address.<br>So each variable has its address (or name in form of identifier) and its value<br>', '6', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('109', 'Values of variable', 'Each variable can hold some values. Because the variable occupies certain space in the computer""s memory, which is composed as a sequence of bits, each value is machine-displayed as a sequence of zeros and ones.<br>
A sequence of ones and zeros can mean different values. The simplest interpretation is as a non-negative integer in the binary system.<br>
Suppose a variable occupies a space of two bytes. What values can be stored on this space?<br>
The minimum value is represented by all zeros and represents zero. The maximum value is formed by the ones themselves. Two bytes are 16 binary ones, which is a decimal number of 65,535. So a two-byte variable can hold a value between 0 and 65,535.<br>
 Generally, a variable on a n-bit space can hold a maximum value of 2n-1<br>', '7', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('110', 'Variable declaration', 'Each variable you planned to use have to be declared. This means we have to tell the computer how the variable will be named and what data type it will be. According to the data type, the compiler creates the appropriate space for this variable in computer memory. The declaration must always precede the use of the variable.<br>
The declaration in C/C++ language is written as follows scheme:<br>
data_type variable_identifier;<br>
For example (int is identifier for integer data type):<br>
int Count;<br>
Now we can use the variable Count which can hold some integer value.<br>
If we need more variables of the same type, we can use the notation where we specify a data type and a list of variables of this type divided by commas:<br>
int suma, current_value, count;<br>
After the declaration, the value of the variable is undefined. If we want the variable to have its initial value along with the declaration, we can write it directly into the declaration statement. In one declaration statement, we can combine variables without and with an initial value. For example:<br>
int suma=0, current_value, count=1;<br>
The variable current_value has undefined value, but suma has value zero and count has value 1<br>', '8', '2');

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
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('1', '0', '1', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('2', '1', '2', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('3', '1', '3', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('4', '1', '3', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('5', '1', '4', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('6', '2', '6', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('7', '2', '7', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('8', '3', '8', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('9', '4', '9', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('10', '4', '10', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('11', '4', '11', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('12', '5', '12', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('13', '5', '13', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('14', '5', '14', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('15', '5', '15', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('16', '6', '16', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('17', '6', '17', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('18', '7', '18', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('19', '8', '19', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('20', '8', '20', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('21', '8', '21', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('22', '8', '22', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('23', '9', '23', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('24', '10', '24', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('25', '10', '25', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('26', '10', '26', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('27', '10', '27', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('28', '11', '28', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('29', '100', '29', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('101', '0', '101', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('103', '1', '103', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('104', '2', '104', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('105', '3', '105', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('106', '4', '106', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('107', '5', '107', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('108', '6', '108', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('109', '7', '109', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('110', '8', '110', 'False', 'False', '1', '1');

-- -------------------------------------------------------------------------
-- OPTION -- TODO co s otevrenymi otazkami a spravnymi odpovedmi?
-- -------------------------------------------------------------------------
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1', 'Ano', 'True', '0', '1');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('2', 'Ne', 'False', '0', '1');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('3', '8', 'True', '0', '11');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('4', '19', 'True', '0', '12');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('5', '35', 'True', '0', '13');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('6', '14', 'True', '0', '14');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('7', '23', 'True', '0', '15');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('8', '35', 'True', '0', '16');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('9', '50', 'True', '0', '17');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('10', '12', 'True', '0', '18');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('11', '22', 'True', '0', '19');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('12', '22', 'True', '0', '20');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('13', '7', 'True', '0', '21');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('14', '8', 'True', '0', '22');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('15', '15', 'True', '0', '23');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('16', '12', 'True', '0', '24');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('17', '11', 'True', '0', '25');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('18', '15', 'True', '0', '26');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('19', '30', 'True', '0', '27');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('20', '7', 'True', '0', '28');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('21', '18', 'True', '0', '29');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('22', '11', 'True', '0', '30');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('23', '15', 'True', '0', '31');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('24', '84', 'True', '0', '32');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('25', '300', 'True', '0', '33');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('26', '48', 'True', '0', '34');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('27', '126', 'True', '0', '35');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('28', '250', 'True', '0', '36');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('29', '600', 'True', '0', '37');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('30', '35', 'True', '0', '38');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('31', '72', 'True', '0', '39');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('32', '121', 'True', '0', '40');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('33', '5', 'True', '0', '41');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('34', '5', 'True', '0', '42');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('35', '5', 'True', '0', '43');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('36', '3', 'True', '0', '44');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('37', '5', 'True', '0', '45');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('38', '3', 'False', '0', '46');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('39', '2', 'False', '0', '47');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('40', '3', 'False', '0', '48');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('41', '11', 'False', '0', '49');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('42', '10', 'False', '0', '50');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('43', '8', 'False', '0', '51');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('44', '9', 'False', '0', '52');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('45', '16', 'False', '0', '53');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('46', '125', 'False', '0', '54');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('47', '36', 'False', '0', '55');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('48', '49', 'False', '0', '56');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('49', '64', 'False', '0', '57');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('50', '81', 'False', '0', '58');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('51', '100', 'False', '0', '59');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('52', '121', 'False', '0', '60');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('53', '2', 'False', '0', '61');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('54', '3', 'False', '0', '62');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('55', '4', 'False', '0', '63');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('56', '5', 'False', '0', '64');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('57', '6', 'False', '0', '65');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('58', '7', 'False', '0', '66');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('59', '8', 'False', '0', '67');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('60', '9', 'False', '0', '68');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('61', '10', 'False', '0', '69');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('62', '11', 'False', '0', '70');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('68', 'Sčítání', 'False', '0', '71');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('69', 'Násobení', 'False', '0', '71');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('70', 'Závorky', 'True', '0', '71');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('71', 'Odčítání', 'False', '0', '71');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('72', 'Dělení', 'False', '0', '71');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('73', 'Sčítání a odčítání', 'True', '0', '72');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('74', 'Mocniny a odmocniny', 'False', '0', '72');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('75', 'Násobení a dělení', 'False', '0', '72');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('76', 'Závorky', 'False', '0', '72');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('77', 'Zcela vpravo', 'False', '0', '72');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('78', 'Sčítání a odčítání', 'False', '0', '73');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('79', 'Mocniny a odmocniny', 'True', '0', '73');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('80', 'Násobení a dělení', 'False', '0', '73');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('81', 'Na dalším vyhodnocování nezáleží', 'False', '0', '73');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('82', 'Závorky jako poslední', 'False', '0', '73');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('83', '4', 'True', '0', '74');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('84', '21', 'False', '0', '75');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('85', '16', 'True', '0', '76');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('86', '-1', 'True', '0', '77');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('87', '-1', 'True', '0', '78');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('88', 'Ano', 'True', '0', '81');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('89', 'Ne', 'False', '0', '81');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('90', 'Někdy', 'False', '0', '81');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('91', 'Záleží na číslech', 'False', '0', '81');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('92', 'Záleží na operátoru', 'False', '0', '81');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('93', 'Ano', 'True', '0', '82');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('94', 'Ne', 'False', '0', '82');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('95', 'Někdy', 'False', '0', '82');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('96', 'Záleží na číslech', 'False', '0', '82');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('97', 'Záleží na operátoru', 'False', '0', '82');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('98', 'Ano', 'False', '0', '83');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('99', 'Ne', 'True', '0', '83');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('100', 'Někdy', 'False', '0', '83');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('101', 'Záleží na číslech', 'False', '0', '83');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('102', 'Záleží na operátoru', 'False', '0', '83');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('103', 'Ano', 'False', '0', '84');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('104', 'Ne', 'True', '0', '84');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('105', 'Někdy', 'False', '0', '84');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('106', 'Záleží na číslech', 'False', '0', '84');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('107', 'Záleží na operátoru', 'False', '0', '84');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('108', 'Sčítání', 'True', '0', '85');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('109', 'Odčítání', 'False', '0', '85');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('110', 'Dělení', 'False', '0', '85');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('111', 'Mocniny', 'False', '0', '85');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('112', 'Žádná z uvedených', 'False', '0', '85');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('113', 'Násobení', 'False', '0', '86');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('114', 'Sčítání', 'False', '0', '86');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('115', 'Odčítání', 'True', '0', '86');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('116', 'Žádná z uvedených', 'False', '0', '86');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('117', 'Všechny uvedené', 'False', '0', '86');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('118', 'Asociativita', 'False', '0', '87');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('119', 'Distributivita', 'False', '0', '87');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('120', 'Komutativita', 'True', '0', '87');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('121', 'Identita', 'False', '0', '87');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('122', 'Inverzita', 'False', '0', '87');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('123', 'a + (b + c) = (a + b) + c', 'False', '0', '88');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('124', 'a + b = b + a', 'True', '0', '88');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('125', 'a ⋅ (b + c) = a ⋅ b + a ⋅ c', 'False', '0', '88');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('126', 'a - b = b - a', 'False', '0', '88');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('127', 'a / b = b / a', 'False', '0', '88');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('128', 'a ⋅ (b ⋅ c) = (a ⋅ b) ⋅ c', 'False', '0', '89');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('129', 'a ⋅ b = b ⋅ a', 'True', '0', '89');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('130', 'a + b = b + a', 'False', '0', '89');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('131', 'a - b = b - a', 'False', '0', '89');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('132', 'a / b = b / a', 'False', '0', '89');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('133', 'a + b = b + a', 'False', '0', '90');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('134', 'a ⋅ b = b ⋅ a', 'False', '0', '90');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('135', 'a - b = b - a', 'True', '0', '90');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('136', 'a + (b + c) = (a + b) + c', 'False', '0', '90');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('137', 'a / b = b / a', 'False', '0', '90');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('138', 'Ano', 'True', '0', '91');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('139', 'Ne', 'False', '0', '91');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('140', 'Jen pro kladná čísla', 'False', '0', '91');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('141', 'Jen pro záporná čísla', 'False', '0', '91');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('142', 'Jen pro nuly', 'False', '0', '91');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('143', 'Ano', 'True', '0', '92');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('144', 'Ne', 'False', '0', '92');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('145', 'Jen pro kladná čísla', 'False', '0', '92');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('146', 'Jen pro záporná čísla', 'False', '0', '92');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('147', 'Jen pro nuly', 'False', '0', '92');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('148', 'Ano', 'False', '0', '93');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('149', 'Ne', 'True', '0', '93');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('150', 'Jen pro kladná čísla', 'False', '0', '93');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('151', 'Jen pro záporná čísla', 'False', '0', '93');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('152', 'Jen pro nuly', 'False', '0', '93');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('153', 'Ano', 'False', '0', '94');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('154', 'Ne', 'True', '0', '94');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('155', 'Jen pro kladná čísla', 'False', '0', '94');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('156', 'Jen pro záporná čísla', 'False', '0', '94');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('157', 'Jen pro nuly', 'False', '0', '94');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('158', 'Mocnina', 'False', '0', '95');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('159', 'Odmocnina', 'False', '0', '95');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('160', 'Odčítání', 'False', '0', '95');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('161', 'Dělení', 'False', '0', '95');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('162', 'Sčítání a násobení', 'True', '0', '95');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('163', 'Sčítání', 'False', '0', '96');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('164', 'Násobení', 'False', '0', '96');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('165', 'Odčítání', 'True', '0', '96');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('166', 'Všechny jsou asociativní', 'False', '0', '96');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('167', 'Všechny nejsou asociativní', 'False', '0', '96');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('168', 'Komutativita', 'False', '0', '97');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('169', 'Asociativita', 'True', '0', '97');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('170', 'Distributivita', 'False', '0', '97');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('171', 'Identita', 'False', '0', '97');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('172', 'Invertibilita', 'False', '0', '97');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('173', '(a + b) + c = a + (b + c)', 'True', '0', '98');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('174', 'a + b = b + a', 'False', '0', '98');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('175', 'a ⋅ (b + c) = a ⋅ b + a ⋅ c', 'False', '0', '98');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('176', 'a + 0 = a', 'False', '0', '98');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('177', 'a - b = -(b - a)', 'False', '0', '98');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('178', '(a ⋅ b) ⋅ c = a ⋅ (b ⋅ c)', 'True', '0', '99');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('179', 'a ⋅ b = b ⋅ a', 'False', '0', '99');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('180', 'a ⋅ (b + c) = a ⋅ b + a ⋅ c', 'False', '0', '99');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('181', 'a ⋅ 1 = a', 'False', '0', '99');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('182', 'a / b = 1 / (b / a)', 'False', '0', '99');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('183', '(a + b) + c = a + (b + c)', 'False', '0', '100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('184', '(a ⋅ b) ⋅ c = a ⋅ (b ⋅ c)', 'False', '0', '100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('185', '(a - b) - c = a - (b - c)', 'True', '0', '100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('186', '(a + b) + c = c + (a + b)', 'False', '0', '100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('187', '(a ⋅ b) ⋅ c = c ⋅ (a ⋅ b)', 'False', '0', '100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('188', 'Ano', 'True', '0', '101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('189', 'Ne', 'False', '0', '101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('190', 'Jen pro kladná čísla', 'False', '0', '101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('191', 'Jen pro záporná čísla', 'False', '0', '101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('192', 'Jen pro nuly', 'False', '0', '101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('193', 'Ano', 'True', '0', '102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('194', 'Ne', 'False', '0', '102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('195', 'Jen pro kladná čísla', 'False', '0', '102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('196', 'Jen pro záporná čísla', 'False', '0', '102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('197', 'Jen pro nuly', 'False', '0', '102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('198', 'Ano', 'False', '0', '103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('199', 'Ne', 'True', '0', '103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('200', 'Jen pro kladná čísla', 'False', '0', '103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('201', 'Jen pro záporná čísla', 'False', '0', '103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('202', 'Jen pro nuly', 'False', '0', '103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('203', 'Ano', 'False', '0', '104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('204', 'Ne', 'True', '0', '104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('205', 'Jen pro kladná čísla', 'False', '0', '104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('206', 'Jen pro záporná čísla', 'False', '0', '104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('207', 'Jen pro nuly', 'False', '0', '104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('208', 'Násobení vzhledem k sčítání, ale ne odčítání', 'False', '0', '105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('209', 'Násobení vzhledem k odčítání, ale ne sčítání', 'False', '0', '105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('210', 'Sčítání vzhledem k násobení', 'False', '0', '105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('211', 'Odčítání vzhledem k násobení', 'False', '0', '105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('212', 'Násobení vzhledem k sčítání a odčítání', 'True', '0', '105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('213', 'Násobení vzhledem k sčítání', 'False', '0', '106');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('214', 'Násobení vzhledem k odčítání', 'False', '0', '106');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('215', 'Sčítání a odčítání vzhledem k násobení', 'True', '0', '106');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('216', 'Násobení vzhledem k sčítání a odčítání', 'False', '0', '106');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('217', 'Distributivní není žádná z operací', 'False', '0', '106');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('218', 'Komutativita', 'False', '0', '107');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('219', 'Asociativita', 'False', '0', '107');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('220', 'Distributivita', 'True', '0', '107');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('221', 'Identita', 'False', '0', '107');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('222', 'Invertibilita', 'False', '0', '107');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('223', 'a ⋅ (b + c) = a ⋅ b + a ⋅ c', 'True', '0', '108');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('224', 'a + b = b + a', 'False', '0', '108');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('225', '(a + b) + c = a + (b + c)', 'False', '0', '108');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('226', 'a ⋅ 1 = a', 'False', '0', '108');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('227', 'a - b = -(b - a)', 'False', '0', '108');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('228', 'a ⋅ (b - c) = a ⋅ b - a ⋅ c', 'True', '0', '109');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('229', 'a ⋅ b = b ⋅ a', 'False', '0', '109');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('230', '(a ⋅ b) ⋅ c = a ⋅ (b ⋅ c)', 'False', '0', '109');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('231', 'a ⋅ 1 = a', 'False', '0', '109');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('232', 'a / b = 1 / (b / a)', 'False', '0', '109');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('233', 'a ⋅ (b + c) = a ⋅ b + a ⋅ c', 'False', '0', '110');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('234', 'a ⋅ (b - c) = a ⋅ b - a ⋅ c', 'False', '0', '110');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('235', '(a + b) / c = a / c + b / c', 'False', '0', '110');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('236', '(a - b) / c = a / c - b / c', 'False', '0', '110');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('237', '(a ⋅ b) + c = a ⋅ (b + c)', 'True', '0', '110');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('336', 'Asociativní vlastnost', 'False', '0', '171');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('337', 'Komutativní vlastnost', 'True', '0', '171');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('338', 'Distributivní vlastnost', 'False', '0', '171');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('339', 'Identitní vlastnost', 'False', '0', '171');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('340', 'Inverzní vlastnost', 'False', '0', '171');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('341', '3 + 5 = 5 + 3', 'True', '0', '172');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('342', '3 + 5 = 8', 'False', '0', '172');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('343', '3 + (5 + 2) = (3 + 5) + 2', 'False', '0', '172');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('344', '3 + 0 = 3', 'False', '0', '172');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('345', '3 + (-3) = 0', 'False', '0', '172');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('346', 'Asociativní vlastnost', 'True', '0', '173');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('347', 'Komutativní vlastnost', 'False', '0', '173');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('348', 'Distributivní vlastnost', 'False', '0', '173');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('349', 'Identitní vlastnost', 'False', '0', '173');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('350', 'Inverzní vlastnost', 'False', '0', '173');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('358', '3 + 5 = 5 + 3', 'False', '0', '174');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('359', '3 + 5 = 8', 'False', '0', '174');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('360', '3 + (5 + 2) = (3 + 5) + 2', 'True', '0', '174');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('361', '3 + 0 = 3', 'False', '0', '174');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('362', '3 + (-3) = 0', 'False', '0', '174');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('393', 'Která vlastnost násobení říká, že pořadí činitelů nemění výsledek?', 'False', '0', '191');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('394', '', 'False', '0', '191');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('395', 'Asociativní vlastnost', 'False', '0', '191');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('396', 'Komutativní vlastnost', 'True', '0', '191');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('397', 'Distributivní vlastnost', 'False', '0', '191');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('398', 'Identitní vlastnost', 'False', '0', '191');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('399', 'Inverzní vlastnost', 'False', '0', '191');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('400', '3 ⋅ 5 = 5 ⋅ 3', 'True', '0', '192');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('401', '3 ⋅ 5 = 15', 'False', '0', '192');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('402', '3 ⋅ (5 ⋅ 2) = (3 ⋅ 5) ⋅ 2', 'False', '0', '192');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('403', '3 ⋅ 1 = 3', 'False', '0', '192');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('404', '3 ⋅ 1/3 = 1', 'False', '0', '192');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('405', 'Asociativní vlastnost', 'True', '0', '193');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('406', 'Komutativní vlastnost', 'False', '0', '193');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('407', 'Distributivní vlastnost', 'False', '0', '193');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('408', 'Identitní vlastnost', 'False', '0', '193');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('409', 'Inverzní vlastnost', 'False', '0', '193');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('410', '3 ⋅ 5 = 5 ⋅ 3', 'False', '0', '194');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('411', '3 ⋅ 5 = 15', 'False', '0', '194');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('412', '3 ⋅ (5 ⋅ 2) = (3 ⋅ 5) ⋅ 2', 'True', '0', '194');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('413', '3 ⋅ 1 = 3', 'False', '0', '194');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('414', '3 ⋅ 1/3 = 1', 'False', '0', '194');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('500', 'sin(2α) = sin²(α) + cos²(α) ', 'False', '0', '311');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('501', 'sin(2α) = 2sin(α)cos(α)', 'True', '0', '311');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('502', 'sin(2α) = cos²(α) - sin²(α)', 'False', '0', '311');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('503', 'sin(2α) = 2tan(α) / (1 - tan²(α))', 'False', '0', '311');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('504', 'sin(2α) = (cot²(α) - 1) / 2cot(α)', 'False', '0', '311');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('505', 'cos(2α) = sin²(α) + cos²(α) ', 'False', '0', '312');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('506', 'cos(2α) = 2sin(α)cos(α)', 'False', '0', '312');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('507', 'cos(2α) = cos²(α) - sin²(α)', 'True', '0', '312');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('508', 'cos(2α) = 2tan(α) / (1 - tan²(α))', 'False', '0', '312');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('509', 'cos(2α) = (cot²(α) - 1) / 2cot(α)', 'False', '0', '312');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('510', 'tan(2α) = sin²(α) + cos²(α) ', 'False', '0', '313');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('511', 'tan(2α) = 2sin(α)cos(α)', 'False', '0', '313');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('512', 'tan(2α) = cos²(α) - sin²(α)', 'False', '0', '313');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('513', 'tan(2α) = 2tan(α) / (1 - tan²(α))', 'True', '0', '313');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('514', 'tan(2α) = (cot²(α) - 1) / 2cot(α)', 'False', '0', '313');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('516', 'sin(α ± β) = sin²(α) ∓ cos²(β) ', 'False', '0', '301');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('517', 'sin(α ± β) = sin(α)cos(β) ± cos(α)sin(β)', 'True', '0', '301');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('518', 'sin(α ± β) = cos(α)cos(β) ∓ sin(α)sin(β)', 'False', '0', '301');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('519', 'sin(α ± β) = (tan(α) ± tan(β)) / (1 ∓ tan(α)tan(β))', 'False', '0', '301');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('520', 'sin(α ± β) = (cot(α)cot(β) ∓ 1) / (cot(α) ± cot(β))', 'False', '0', '301');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('521', 'cos(α ± β) = sin²(α) ∓ cos²(β)', 'False', '0', '302');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('522', 'cos(α ± β) = sin(α)cos(β) ± cos(α)sin(β)', 'False', '0', '302');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('523', 'cos(α ± β) = cos(α)cos(β) ∓ sin(α)sin(β)', 'True', '0', '302');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('524', 'cos(α ± β) = (tan(α) ± tan(β)) / (1 ∓ tan(α)tan(β))', 'False', '0', '302');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('525', 'cos(α ± β) = (cot(α)cot(β) ∓ 1) / (cot(α) ± cot(β))', 'False', '0', '302');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('527', 'tan(α ± β) = sin²(α) ∓ cos²(β)', 'False', '0', '303');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('528', 'tan(α ± β) = sin(α)cos(β) ± cos(α)sin(β)', 'False', '0', '303');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('529', 'tan(α ± β) = cos(α)cos(β) ∓ sin(α)sin(β)', 'False', '0', '303');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('530', 'tan(α ± β) = (tan(α) ± tan(β)) / (1 ∓ tan(α)tan(β))', 'True', '0', '303');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('531', 'tan(α ± β) = (cot(α)cot(β) ∓ 1) / (cot(α) ± cot(β))', 'False', '0', '303');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('532', 'cot(α ± β) = sin²(α) ∓ cos²(β)', 'False', '0', '304');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('533', 'cot(α ± β) = sin(α)cos(β) ± cos(α)sin(β)', 'False', '0', '304');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('534', 'cot(α ± β) = cos(α)cos(β) ∓ sin(α)sin(β)', 'False', '0', '304');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('535', 'cot(α ± β) = (tan(α) ± tan(β)) / (1 ∓ tan(α)tan(β))', 'False', '0', '304');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('536', 'cot(α ± β) = (cot(α)cot(β) ∓ 1) / (cot(α) ± cot(β))', 'True', '0', '304');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('537', 'cot(2α) = sin²(α) + cos²(α)', 'False', '0', '314');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('538', 'cot(2α) = 2sin(α)cos(α)', 'False', '0', '314');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('539', 'cot(2α) = cos²(α) - sin²(α)', 'False', '0', '314');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('540', 'cot(2α) = 2tan(α) / (1 - tan²(α))', 'False', '0', '314');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('541', 'cot(2α) = (cot²(α) - 1) / 2cot(α)', 'True', '0', '314');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('542', 'sin(α/2) = √[(1 + cos²(α)) / 2cos(α)]', 'False', '0', '321');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('543', 'sin(α/2) = √[(1 - cos(α)) / 2]', 'True', '0', '321');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('544', 'sin(α/2) = √[(1 + cos(α)) / 2]', 'False', '0', '321');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('545', 'sin(α/2) = √[(1 - cos(α)) / (1 + cos(α)]', 'False', '0', '321');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('546', 'sin(α/2) = √[(1 + cos(α)) / (1 - cos(α)]', 'False', '0', '321');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('547', 'cos(α/2) = √[(1 + cos²(α)) / 2cos(α)]', 'False', '0', '322');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('548', 'cos(α/2) = √[(1 - cos(α)) / 2]', 'False', '0', '322');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('549', 'cos(α/2) = √[(1 + cos(α)) / 2]', 'True', '0', '322');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('550', 'cos(α/2) = √[(1 - cos(α)) / (1 + cos(α)]', 'False', '0', '322');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('551', 'cos(α/2) = √[(1 + cos(α)) / (1 - cos(α)]', 'False', '0', '322');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('552', 'tan(α/2) = √[(1 + cos²(α)) / 2cos(α)]', 'False', '0', '323');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('553', 'tan(α/2) = √[(1 - cos(α)) / 2]', 'False', '0', '323');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('554', 'tan(α/2) = √[(1 + cos(α)) / 2]', 'False', '0', '323');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('555', 'tan(α/2) = √[(1 - cos(α)) / (1 + cos(α)]', 'True', '0', '323');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('556', 'tan(α/2) = √[(1 + cos(α)) / (1 - cos(α)]', 'False', '0', '323');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('557', 'cot(α/2) = √[(1 + cos²(α)) / 2cos(α)]', 'False', '0', '324');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('558', 'cot(α/2) = √[(1 - cos(α)) / 2]', 'False', '0', '324');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('559', 'cot(α/2) = √[(1 + cos(α)) / 2]', 'False', '0', '324');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('560', 'cot(α/2) = √[(1 - cos(α)) / (1 + cos(α)]', 'False', '0', '324');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('561', 'cot(α/2) = √[(1 + cos(α)) / (1 - cos(α)]', 'True', '0', '324');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('562', 'sin(α)sin(β) = 1/2 [cos(α - β) - cos(α + β)]', 'True', '0', '341');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('563', 'sin(α)sin(β) = 1/2 [cos(α + β) + cos(α - β)]', 'False', '0', '341');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('564', 'sin(α)sin(β) = 1/2 [sin(α + β) + sin(α - β)]', 'False', '0', '341');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('565', 'sin(α)sin(β) = (tan(α) + tan(β)) / (cot(α) + cot(β))', 'False', '0', '341');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('566', 'sin(α)sin(β) = (cot(α) + cot(β)) / (tan(α) + tan(β))', 'False', '0', '341');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('567', 'sin(α)sin(β) = (tan(α) + cot(β)) / (cot(α) + tan(β))', 'False', '0', '341');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('568', 'cos(α)cos(β) = 1/2 [cos(α - β) - cos(α + β)]', 'False', '0', '342');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('569', 'cos(α)cos(β) = 1/2 [cos(α + β) + cos(α - β)]', 'True', '0', '342');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('570', 'cos(α)cos(β) = 1/2 [sin(α + β) + sin(α - β)]', 'False', '0', '342');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('571', 'cos(α)cos(β) = (tan(α) + tan(β)) / (cot(α) + cot(β))', 'False', '0', '342');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('572', 'cos(α)cos(β) = (cot(α) + cot(β)) / (tan(α) + tan(β))', 'False', '0', '342');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('573', 'cos(α)cos(β) = (tan(α) + cot(β)) / (cot(α) + tan(β))', 'False', '0', '342');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('574', 'sin(α)cos(β) = 1/2 [cos(α - β) - cos(α + β)]', 'False', '0', '343');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('575', 'sin(α)cos(β) = 1/2 [cos(α + β) + cos(α - β)]', 'False', '0', '343');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('576', 'sin(α)cos(β) = 1/2 [sin(α + β) + sin(α - β)]', 'True', '0', '343');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('577', 'sin(α)cos(β) = (tan(α) + tan(β)) / (cot(α) + cot(β))', 'False', '0', '343');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('578', 'sin(α)cos(β) = (cot(α) + cot(β)) / (tan(α) + tan(β))', 'False', '0', '343');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('579', 'sin(α)cos(β) = (tan(α) + cot(β)) / (cot(α) + tan(β))', 'False', '0', '343');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('580', 'tan(α)tan(β) = 1/2 [cos(α - β) - cos(α + β)]', 'False', '0', '344');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('581', 'tan(α)tan(β) = 1/2 [cos(α + β) + cos(α - β)]', 'False', '0', '344');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('582', 'tan(α)tan(β) = 1/2 [sin(α + β) + sin(α - β)]', 'False', '0', '344');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('583', 'tan(α)tan(β) = (tan(α) + tan(β)) / (cot(α) + cot(β))', 'True', '0', '344');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('584', 'tan(α)tan(β) = (cot(α) + cot(β)) / (tan(α) + tan(β))', 'False', '0', '344');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('585', 'tan(α)tan(β) = (tan(α) + cot(β)) / (cot(α) + tan(β))', 'False', '0', '344');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('586', 'cot(α)cot(β) = 1/2 [cos(α - β) - cos(α + β)]', 'False', '0', '345');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('587', 'cot(α)cot(β) = 1/2 [cos(α + β) + cos(α - β)]', 'False', '0', '345');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('588', 'cot(α)cot(β) = 1/2 [sin(α + β) + sin(α - β)]', 'False', '0', '345');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('589', 'cot(α)cot(β) = (tan(α) + tan(β)) / (cot(α) + cot(β))', 'False', '0', '345');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('590', 'cot(α)cot(β) = (cot(α) + cot(β)) / (tan(α) + tan(β))', 'True', '0', '345');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('591', 'cot(α)cot(β) = (tan(α) + cot(β)) / (cot(α) + tan(β))', 'False', '0', '345');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('592', 'tan(α)cot(β) = 1/2 [cos(α - β) - cos(α + β)]', 'False', '0', '346');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('593', 'tan(α)cot(β) = 1/2 [cos(α + β) + cos(α - β)]', 'False', '0', '346');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('594', 'tan(α)cot(β) = 1/2 [sin(α + β) + sin(α - β)]', 'False', '0', '346');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('595', 'tan(α)cot(β) = (tan(α) + tan(β)) / (cot(α) + cot(β))', 'False', '0', '346');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('596', 'tan(α)cot(β) = (cot(α) + cot(β)) / (tan(α) + tan(β))', 'False', '0', '346');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('597', 'tan(α)cot(β) = (tan(α) + cot(β)) / (cot(α) + tan(β))', 'True', '0', '346');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('598', 'přilehlé strany ', 'False', '1', '241');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('599', 'protilehlé strany', 'True', '1', '241');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('600', 'přepony ', 'False', '1', '241');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('601', 'přilehlé strany ', 'False', '2', '241');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('602', 'protilehlé strany', 'False', '2', '241');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('603', 'přepony ', 'True', '2', '241');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('604', 'sin(α) = přepona / protilehlá strana', 'False', '0', '242');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('605', 'sin(α) = přepona / přilehlá strana', 'False', '0', '242');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('606', 'sin(α) = protilehlá strana / přepona', 'True', '0', '242');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('607', 'sin(α) = přilehlá strana / přepona', 'False', '0', '242');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('608', 'sin(α) = protilehlá strana / přilehlá strana', 'False', '0', '242');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('609', 'sin(α) = přilehlá strana / protilehlá strana', 'False', '0', '242');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('610', 'sin(α) = 5/3', 'False', '0', '243');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('611', 'sin(α) = 5/4', 'False', '0', '243');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('612', 'sin(α) = 3/5', 'True', '0', '243');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('613', 'sin(α) = 4/5', 'False', '0', '243');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('614', 'sin(α) = 3/4', 'False', '0', '243');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('615', 'sin(α) = 4/3', 'False', '0', '243');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('616', 'přilehlé strany ', 'True', '1', '251');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('617', 'protilehlé strany', 'False', '1', '251');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('618', 'přepony ', 'False', '1', '251');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('619', 'přilehlé strany ', 'False', '2', '251');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('620', 'protilehlé strany', 'False', '2', '251');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('621', 'přepony ', 'True', '2', '251');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('622', 'cos(α) = přepona / protilehlá strana', 'False', '0', '252');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('623', 'cos(α) = přepona / přilehlá strana', 'False', '0', '252');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('624', 'cos(α) = protilehlá strana / přepona', 'False', '0', '252');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('625', 'cos(α) = přilehlá strana / přepona', 'True', '0', '252');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('626', 'cos(α) = protilehlá strana / přilehlá strana', 'False', '0', '252');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('627', 'cos(α) = přilehlá strana / protilehlá strana', 'False', '0', '252');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('628', 'cos(α) = 5/3', 'False', '0', '253');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('629', 'cos(α) = 5/4', 'False', '0', '253');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('630', 'cos(α) = 3/5', 'False', '0', '253');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('631', 'cos(α) = 4/5', 'True', '0', '253');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('632', 'cos(α) = 3/4', 'False', '0', '253');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('633', 'cos(α) = 4/3', 'False', '0', '253');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('634', 'přilehlé strany ', 'False', '1', '261');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('635', 'protilehlé strany', 'True', '1', '261');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('636', 'přepony ', 'False', '1', '261');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('637', 'přilehlé strany ', 'True', '2', '261');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('638', 'protilehlé strany', 'False', '2', '261');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('639', 'přepony ', 'False', '2', '261');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('640', 'tan(α) = přepona / protilehlá strana', 'False', '0', '262');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('641', 'tan(α) = přepona / přilehlá strana', 'False', '0', '262');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('642', 'tan(α) = protilehlá strana / přepona', 'False', '0', '262');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('643', 'tan(α) = přilehlá strana / přepona', 'False', '0', '262');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('644', 'tan(α) = protilehlá strana / přilehlá strana', 'True', '0', '262');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('645', 'tan(α) = přilehlá strana / protilehlá strana', 'False', '0', '262');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('646', 'tan(α) = 5/3', 'False', '0', '263');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('647', 'tan(α) = 5/4', 'False', '0', '263');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('648', 'tan(α) = 3/5', 'False', '0', '263');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('649', 'cos(α) = 4/5', 'False', '0', '263');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('650', 'tan(α) = 3/4', 'True', '0', '263');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('651', 'tan(α) = 4/3', 'False', '0', '263');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('652', 'přilehlé strany ', 'True', '1', '271');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('653', 'protilehlé strany', 'False', '1', '271');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('654', 'přepony ', 'False', '1', '271');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('655', 'přilehlé strany ', 'True', '2', '271');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('656', 'protilehlé strany', 'False', '2', '271');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('657', 'přepony ', 'False', '2', '271');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('658', 'cot(α) = přepona / protilehlá strana', 'False', '0', '272');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('659', 'cot(α) = přepona / přilehlá strana', 'False', '0', '272');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('660', 'cot(α) = protilehlá strana / přepona', 'False', '0', '272');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('661', 'cot(α) = přilehlá strana / přepona', 'False', '0', '272');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('662', 'cot(α) = protilehlá strana / přilehlá strana', 'False', '0', '272');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('663', 'cot(α) = přilehlá strana / protilehlá strana', 'True', '0', '272');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('664', 'cot(α) = 5/3', 'False', '0', '273');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('665', 'cot(α) = 5/4', 'False', '0', '273');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('666', 'cot(α) = 3/5', 'False', '0', '273');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('667', 'cot(α) = 4/5', 'False', '0', '273');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('668', 'cot(α) = 3/4', 'False', '0', '273');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('669', 'cot(α) = 4/3', 'True', '0', '273');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('670', 'sin(α) = tan(α) + cot(α)', 'False', '0', '281');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('671', 'sin(α) = tan(α) / cot(α)', 'False', '0', '281');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('672', 'sin(α) = cot(α) / tan(α)', 'False', '0', '281');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('673', 'sin(α) = √[1 - cos²(α)]', 'True', '0', '281');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('674', 'sin(α)= 1 / cos(α)', 'False', '0', '281');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('675', 'cos(α) = tan(α) - cot(α)', 'False', '0', '282');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('676', 'cos(α) = tan(α) / cot(α)', 'False', '0', '282');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('677', 'cos(α) = cot(α) / tan(α)', 'False', '0', '282');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('678', 'cos(α) = √[1 - sin²(α)]', 'True', '0', '282');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('679', 'cos(α)= 1 / sin(α)', 'False', '0', '282');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('680', 'tan(α) = sin(α) + cos(α)', 'False', '0', '283');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('681', 'tan(α) = sin(α) / cos(α)', 'True', '0', '283');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('682', 'tan(α) = cos(α) / sin(α)', 'False', '0', '283');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('683', 'tan(α) = √[1 - cos²(α)]', 'False', '0', '283');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('684', 'tan(α)= √[1 / cot(α)]', 'False', '0', '283');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('685', 'cot(α) = sin(α) - cos(α)', 'False', '0', '284');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('686', 'cot(α) = sin(α) / cos(α)', 'False', '0', '284');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('687', 'cot(α) = cos(α) / sin(α)', 'True', '0', '284');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('688', 'cot(α) = √[1 - sin²(α)]', 'False', '0', '284');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('689', 'cot(α)= √[1 / tan(α)]', 'False', '0', '284');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('690', 'sin(α) = √[1 - cos²(α)]', 'False', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('691', 'cos(α) = √[1 - sin²(α)]', 'False', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('692', 'tan(α) = sin(α) / cos(α)', 'False', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('693', 'cot(α) = cos(α) / sin(α)', 'False', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('694', 'tan(α)= 1 / cot(α)', 'False', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('695', 'cot(α)= 1 / tan(α)', 'False', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('696', 'Všechny jsou správně.', 'True', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('697', 'Všechny jsou špatně.', 'False', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('698', 'Mocniny a odmocniny', 'False', '1', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('699', 'Sčítání a odčítání', 'False', '1', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('700', 'Násobení a dělení', 'False', '1', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('701', 'Závorky', 'True', '1', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('702', 'Mocniny a odmocniny', 'True', '2', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('703', 'Sčítání a odčítání', 'False', '2', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('704', 'Násobení a dělení', 'False', '2', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('705', 'Závorky', 'False', '2', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('706', 'Mocniny a odmocniny', 'False', '3', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('707', 'Sčítání a odčítání', 'False', '3', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('708', 'Násobení a dělení', 'True', '3', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('709', 'Závorky', 'False', '3', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('710', 'Mocniny a odmocniny', 'False', '4', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('711', 'Sčítání a odčítání', 'True', '4', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('712', 'Násobení a dělení', 'False', '4', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('713', 'Závorky', 'False', '4', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('714', 'Věda o měření úhlů a jejich aplikacích.', 'True', '0', '231');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('715', 'Věda o měření objemů.', 'False', '0', '231');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('716', 'Věda o měření hmotnosti.', 'False', '0', '231');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('717', 'Věda o měření času.', 'False', '0', '231');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('718', 'Věda o měření teploty.', 'False', '0', '231');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('720', 'Logaritmus.', 'False', '0', '232');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('721', 'Exponenciální funkce.', 'False', '0', '232');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('722', 'Sinus.', 'True', '0', '232');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('723', 'Kvadratická funkce.', 'False', '0', '232');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('724', 'Lineární funkce.', 'False', '0', '232');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('725', 'Logaritmus.', 'False', '0', '233');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('726', 'Exponenciální funkce.', 'False', '0', '233');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('727', 'Kosinus.', 'True', '0', '233');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('728', 'Kvadratická funkce.', 'False', '0', '233');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('729', 'Lineární funkce.', 'False', '0', '233');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('730', 'Logaritmus.', 'False', '0', '234');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('731', 'Exponenciální funkce.', 'False', '0', '234');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('732', 'Tangens.', 'True', '0', '234');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('733', 'Kvadratická funkce.', 'False', '0', '234');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('734', 'Lineární funkce.', 'False', '0', '234');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('735', 'Logaritmus.', 'False', '0', '235');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('736', 'Exponenciální funkce.', 'False', '0', '235');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('737', 'Kotangens.', 'True', '0', '235');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('738', 'Kvadratická funkce.', 'False', '0', '235');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('739', 'Lineární funkce.', 'False', '0', '235');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('740', 'Sinus.', 'False', '0', '236');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('741', 'Kosinus.', 'False', '0', '236');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('742', 'Tangens.', 'False', '0', '236');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('743', 'Kotangens.', 'False', '0', '236');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('744', 'Logaritmus.', 'True', '0', '236');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('746', '0', 'True', '1', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('747', '1/2', 'False', '1', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('748', '(√2)/2', 'False', '1', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('749', '(√3)/2', 'False', '1', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('750', '1', 'False', '1', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('751', '1', 'True', '2', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('752', '(√3)/2', 'False', '2', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('753', '(√2)/2', 'False', '2', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('754', '1/2', 'False', '2', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('755', '0', 'False', '2', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('756', '0', 'True', '3', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('757', '(√3)/3', 'False', '3', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('758', '1', 'False', '3', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('759', '√3', 'False', '3', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('760', 'nedef.', 'False', '3', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('761', 'nedef.', 'True', '4', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('762', '√3', 'False', '4', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('763', '1', 'False', '4', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('764', '(√3)/3', 'False', '4', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('765', '0', 'False', '4', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('766', '0', 'False', '1', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('767', '1/2', 'True', '1', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('768', '(√2)/2', 'False', '1', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('769', '(√3)/2', 'False', '1', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('770', '1', 'False', '1', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('771', '1', 'False', '2', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('772', '(√3)/2', 'True', '2', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('773', '(√2)/2', 'False', '2', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('774', '1/2', 'False', '2', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('775', '0', 'False', '2', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('776', '0', 'False', '3', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('777', '(√3)/3', 'True', '3', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('778', '1', 'False', '3', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('779', '√3', 'False', '3', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('780', 'nedef.', 'False', '3', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('781', 'nedef.', 'False', '4', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('782', '√3', 'True', '4', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('783', '1', 'False', '4', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('784', '(√3)/3', 'False', '4', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('785', '0', 'False', '4', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('786', '0', 'False', '1', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('787', '1/2', 'False', '1', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('788', '(√2)/2', 'True', '1', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('789', '(√3)/2', 'False', '1', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('790', '1', 'False', '1', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('791', '1', 'False', '2', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('792', '(√3)/2', 'False', '2', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('793', '(√2)/2', 'True', '2', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('794', '1/2', 'False', '2', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('795', '0', 'False', '2', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('796', '0', 'False', '3', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('797', '(√3)/3', 'False', '3', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('798', '1', 'True', '3', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('799', '√3', 'False', '3', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('800', 'nedef.', 'False', '3', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('801', 'nedef.', 'False', '4', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('802', '√3', 'False', '4', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('803', '1', 'True', '4', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('804', '(√3)/3', 'False', '4', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('805', '0', 'False', '4', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('806', '0', 'False', '1', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('807', '1/2', 'False', '1', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('808', '(√2)/2', 'False', '1', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('809', '(√3)/2', 'True', '1', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('810', '1', 'False', '1', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('811', '1', 'False', '2', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('812', '(√3)/2', 'False', '2', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('813', '(√2)/2', 'False', '2', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('814', '1/2', 'True', '2', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('815', '0', 'False', '2', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('816', '0', 'False', '3', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('817', '(√3)/3', 'False', '3', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('818', '1', 'False', '3', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('819', '√3', 'True', '3', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('820', 'nedef.', 'False', '3', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('821', 'nedef.', 'False', '4', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('822', '√3', 'False', '4', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('823', '1', 'False', '4', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('824', '(√3)/3', 'True', '4', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('825', '0', 'False', '4', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('826', '0', 'False', '1', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('827', '1/2', 'False', '1', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('828', '(√2)/2', 'False', '1', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('829', '(√3)/2', 'False', '1', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('830', '1', 'True', '1', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('831', '1', 'False', '2', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('832', '(√3)/2', 'False', '2', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('833', '(√2)/2', 'False', '2', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('834', '1/2', 'False', '2', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('835', '0', 'True', '2', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('836', '0', 'False', '3', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('837', '(√3)/3', 'False', '3', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('838', '1', 'False', '3', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('839', '√3', 'False', '3', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('840', 'nedef.', 'True', '3', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('841', 'nedef.', 'False', '4', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('842', '√3', 'False', '4', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('843', '1', 'False', '4', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('844', '(√3)/3', 'False', '4', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('845', '0', 'True', '4', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('851', 'Ano, vždy', 'False', '0', '143');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('852', 'Ne', 'False', '0', '143');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('853', 'Ano, vzhledem ke sčítání a odčítání (zprava)', 'True', '0', '143');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('854', 'Ano, vzhledem ke sčítání a odčítání (zleva)', 'False', '0', '143');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('855', 'Ano, vzhledem ke mocnění a odmocnění', 'False', '0', '143');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('856', 'Ano, vždy', 'False', '0', '160');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('857', 'Ne', 'False', '0', '160');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('858', 'Ano, vzhledem ke sčítání a odčítání (zprava)', 'False', '0', '160');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('859', 'Ano, vzhledem ke sčítání a odčítání (zleva)', 'False', '0', '160');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('860', 'Ano, vzhledem k násobení a dělení (zprava)', 'False', '0', '160');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('861', 'Ano, vzhledem k násobení a dělení (zleva)', 'False', '0', '160');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('862', 'Ano, vždy', 'False', '0', '163');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('863', 'Ne', 'False', '0', '163');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('864', 'Ano, vzhledem ke sčítání a odčítání', 'False', '0', '163');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('865', 'Ano, vzhledem k násobení a dělení', 'True', '0', '163');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('866', 'Ano, vzhledem k mocnění', 'False', '0', '163');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1001', 'Yes', 'True', '0', '1000');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1002', 'No', 'False', '0', '1000');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1003', 'parenthesis', 'True', '0', '1001');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1004', 'curly brackets', 'False', '0', '1001');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1005', 'spaces', 'False', '0', '1001');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1006', 'whole program', 'True', '1', '1006');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1007', 'alternative part', 'False', '1', '1006');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1008', 'int', 'True', '2', '1006');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1009', 'string', 'False', '2', '1006');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1010', 'returned value', 'True', '3', '1006');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1011', 'clear screen', 'False', '3', '1006');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1012', 'clear input buffer', 'False', '3', '1006');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1013', 'True', 'True', '0', '1007');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1014', 'False', 'False', '0', '1007');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1015', 'file with function declaration and/or some definition in C/C++ language.', 'True', '0', '1002');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1016', 'file with a part of function body or main function body.', 'False', '0', '1002');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1017', 'file containing the first line of C/C++ source code.', 'False', '0', '1002');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1018', 'file containing any part of source code.', 'False', '0', '1002');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1019', '#include &lt;filename&gt;', 'True', '0', '1003');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1020', '#using &lt;filename&gt;', 'False', '0', '1003');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1021', '#include "filename"', 'False', '0', '1003');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1022', '!copy filename', 'False', '0', '1003');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1023', '#include "filename"', 'True', '0', '1004');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1024', '#define "filename"', 'False', '0', '1004');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1025', '#use "filename"', 'False', '0', '1004');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1026', '#include &lt;filename&gt;', 'False', '0', '1004');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1027', 'True', 'True', '0', '1008');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1028', 'False', 'False', '0', '1008');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1029', '#include &lt;iostream&gt;', 'True', '0', '1009');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1030', '#include &lt;stdio&gt;', 'False', '0', '1009');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1031', '#include "inputoutput"', 'False', '0', '1009');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1032', '#input "iostream"', 'False', '0', '1009');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1033', 'Certain place in computer memory.', 'True', '0', '1010');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1034', 'Letter representing some real number.', 'False', '0', '1010');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1035', 'Number of program steps.', 'False', '0', '1010');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1036', '24', 'True', '0', '1005');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1037', 'represents the address of variable in memory.', 'True', '0', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1038', 'represents the value of variable.', 'False', '0', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1039', 'represents number of possible values.', 'False', '0', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1046', 'cin &gt;&gt; A &gt;&gt; B;', 'True', '1', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1047', 'cin &gt;&gt; A &gt;&gt; cin &gt;&gt; B;', 'False', '1', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1048', 'cin &lt;&lt; A &lt;&lt; B;', 'False', '1', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1049', 'cout &lt;&lt; "Contents "&lt;&lt; A*B &lt;&lt; ", perimeter " &lt;&lt; (A+B)*2 &lt;&lt;"."&lt;&lt;endl;', 'True', '2', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1050', 'cout &gt;&gt; "Contents "&gt;&gt; A*B &gt;&gt; ", perimeter " &gt;&gt; (A+B)*2 &gt;&gt;"."&gt;&gt;endl;', 'False', '2', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1051', 'cout &gt;&gt; "Contents " cout &gt;&gt; A*B &lt;&lt; cout &gt;&gt; ", perimeter " cout &gt;&gt; (A+B)*2 cout &gt;&gt; "." &lt;&lt; endl;', 'False', '2', '1012');

-- -------------------------------------------------------------------------
-- QUESTION
-- -------------------------------------------------------------------------
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1', 'Zvoleno téma Matematika.<br>Chceš pokračovat?', '1', '0', '0', '1');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('11', 'Vypočtěte 5 + 3 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('12', 'Vypočtěte 12 + 7 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('13', 'Vypočtěte 20 + 15 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('14', 'Vypočtěte 8 + 6 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('15', 'Vypočtěte 14 + 9 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('16', 'Vypočtěte 25 + 10 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('17', 'Vypočtěte 30 + 20 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('18', 'Vypočtěte 7 + 5 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('19', 'Vypočtěte 18 + 4 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('20', 'Vypočtěte 11 + 11 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('21', 'Vypočtěte 10 - 3 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('22', 'Vypočtěte 15 - 7 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('23', 'Vypočtěte 25 - 10 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('24', 'Vypočtěte 18 - 6 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('25', 'Vypočtěte 20 - 9 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('26', 'Vypočtěte 30 - 15 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('27', 'Vypočtěte 50 - 20 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('28', 'Vypočtěte 12 - 5 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('29', 'Vypočtěte 22 - 4 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('30', 'Vypočtěte 22 - 11 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('31', 'Vypočtěte 5 * 3 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('32', 'Vypočtěte 12 * 7 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('33', 'Vypočtěte 20 * 15 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('34', 'Vypočtěte 8 * 6 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('35', 'Vypočtěte 14 * 9 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('36', 'Vypočtěte 25 * 10 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('37', 'Vypočtěte 30 * 20 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('38', 'Vypočtěte 7 * 5 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('39', 'Vypočtěte 18 * 4 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('40', 'Vypočtěte 11 * 11 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('41', 'Vypočtěte 10 / 2 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('42', 'Vypočtěte 15 / 3 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('43', 'Vypočtěte 25 / 5 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('44', 'Vypočtěte 18 / 6 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('45', 'Vypočtěte 20 / 4 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('46', 'Vypočtěte 30 / 10 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('47', 'Vypočtěte 50 / 25 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('48', 'Vypočtěte 12 / 4 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('49', 'Vypočtěte 22 / 2 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('50', 'Vypočtěte 100 / 10 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('51', 'Vypočtěte 2 ^ 3 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('52', 'Vypočtěte 3 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('53', 'Vypočtěte 4 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('54', 'Vypočtěte 5 ^ 3 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('55', 'Vypočtěte 6 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('56', 'Vypočtěte 7 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('57', 'Vypočtěte 8 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('58', 'Vypočtěte 9 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('59', 'Vypočtěte 10 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('60', 'Vypočtěte 11 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('61', 'Vypočtěte √4 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('62', 'Vypočtěte √9 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('63', 'Vypočtěte √16 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('64', 'Vypočtěte √25 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('65', 'Vypočtěte √36 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('66', 'Vypočtěte √49 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('67', 'Vypočtěte √64 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('68', 'Vypočtěte √81 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('69', 'Vypočtěte √100 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('70', 'Vypočtěte √121 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('71', 'Jakou operaci vyhodnocujeme jako první v matematickém výrazu?', '1', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('72', 'Jakou operaci vyhodnocujeme jako poslední v matematickém výrazu?', '1', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('73', 'Jakou operaci vyhodnocujeme po závorkách?', '1', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('74', 'Vyřešte výraz: 8 / 4 × 2² - 4 = ...', '0', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('75', 'Vyřešte výraz: 4 / 2 × 3² - 1 = ...', '0', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('76', 'Vyřešte výraz:  (8 / 2) × (4 - 2)² = ...', '0', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('77', 'Vyřešte výraz: 9 / 3 × (2 - 1)² - 4 = ...', '0', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('78', 'Vyřešte výraz:  5 × 6 / 2 - 8 ²/ 4 = ...', '0', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('79', 'Seřaďte podle pořadí vyhodnocování: [[1]] [[2]] [[3]] [[4]]', '2', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('81', 'Je operace sčítání komutativní?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('82', 'Je operace násobení komutativní?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('83', 'Je operace odčítání komutativní?', '1', '1', '0', '13');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('84', 'Je operace dělení komutativní?', '1', '1', '0', '15');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('85', 'Která z následujících operací je komutativní?', '1', '1', '0', '9');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('86', 'Která z následujících operací <b>není</b> komutativní?', '1', '1', '0', '9');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('87', 'Pokud je a × b = b × a, jaká vlastnost je zde použita?', '1', '1', '0', '9');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('88', 'Který z následujících výrazů ukazuje komutativitu sčítání?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('89', 'Který z následujících výrazů ukazuje komutativitu násobení?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('90', 'Který z následujících výrazů není komutativní?', '1', '1', '0', '9');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('91', 'Je operace sčítání asociativní?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('92', 'Je operace násobení asociativní?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('93', 'Je operace odčítání asociativní?', '1', '1', '0', '13');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('94', 'Je operace dělení asociativní?', '1', '1', '0', '15');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('95', 'Která z následujících operací je asociativní?', '1', '1', '0', '10');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('96', 'Která z následujících operací <b>není</b> asociativní?', '1', '1', '0', '10');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('97', 'Pokud (a + b) + c = a + (b + c), jaká vlastnost je zde použita?', '1', '1', '0', '10');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('98', 'Který z následujících výrazů ukazuje asociativitu sčítání?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('99', 'Který z následujících výrazů ukazuje asociativitu násobení?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('100', 'Který z následujících výrazů není asociativní?', '1', '1', '0', '10');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('101', 'Je operace násobení distributivní vzhledem k sčítání?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('102', 'Je operace násobení distributivní vzhledem k odčítání?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('103', 'Je operace sčítání distributivní vzhledem k násobení?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('104', 'Je operace odčítání distributivní vzhledem k násobení?', '1', '1', '0', '13');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('105', 'Která z následujících operací je distributivní?', '1', '1', '0', '11');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('106', 'Která z následujících operací <b>není</b> distributivní?', '1', '1', '0', '11');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('107', 'Pokud a \cdot (b + c) = a \cdot b + a \cdot c, jaká vlastnost je zde použita?', '1', '1', '0', '11');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('108', 'Který z následujících výrazů ukazuje distributivitu násobení vzhledem k sčítání?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('109', 'Který z následujících výrazů ukazuje distributivitu násobení vzhledem k odčítání?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('110', 'Který z následujících výrazů není distributivní?', '1', '1', '0', '11');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('143', 'Je operace dělení distributivní?', '1', '0', '0', '15');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('158', 'Je operace mocnina komutativní?', '1', '0', '0', '16');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('159', 'Je operace mocnina asociativní?', '1', '0', '0', '16');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('160', 'Je operace mocnina distributivní?', '1', '0', '0', '16');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('161', 'Je operace odmocnina komutativní?', '1', '0', '0', '17');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('162', 'Je operace odmocnina asociativní?', '1', '0', '0', '17');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('163', 'Je operace odmocnina distributivní?', '1', '0', '0', '17');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('171', 'Která vlastnost sčítání říká, že pořadí sčítanců nemění výsledek?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('172', 'Který z následujících výrazů je příkladem komutativní vlastnosti sčítání?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('173', 'Která vlastnost sčítání říká, že způsob seskupení sčítanců nemění výsledek?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('174', 'Který z následujících výrazů je příkladem asociativní vlastnosti sčítání?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('191', 'Která vlastnost násobení říká, že pořadí činitelů nemění výsledek?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('192', 'Který z následujících výrazů je příkladem komutativní vlastnosti násobení?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('193', 'Která vlastnost násobení říká, že způsob seskupení činitelů nemění výsledek?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('194', 'Který z následujících výrazů je příkladem asociativní vlastnosti násobení?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('231', 'Co je goniometrie?', '1', '1', '0', '18');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('232', 'Která z následujících funkcí je základní goniometrická funkce?', '1', '1', '0', '18');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('233', 'Která z následujících funkcí je základní goniometrická funkce?', '1', '1', '0', '18');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('234', 'Která z následujících funkcí je základní goniometrická funkce?', '1', '1', '0', '18');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('235', 'Která z následujících funkcí je základní goniometrická funkce?', '1', '1', '0', '18');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('236', 'Která z následujících funkcí <b>není</b> základní goniometrická funkce?', '1', '1', '0', '18');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('241', 'Doplň: V pravoúhlém trojúhelníku je <b>sinus</b> úhlu poměr délky [[1]] k délce [[2]].', '2', '1', '0', '19');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('242', 'Jak se počítá sin(α)?', '1', '1', '0', '19');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('243', 'Máme pravoúhlý trojúhelník s přeponou délky 5, přilehlou stanou délky 4 a protilehlou stranou délky 3.<br>Jaký je <b>sinus</b> úhlu?', '1', '1', '0', '19');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('251', 'Doplň: V pravoúhlém trojúhelníku je <b>kosinus</b> úhlu poměr délky [[1]] k délce [[2]].', '2', '1', '0', '20');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('252', 'Jak se počítá cos(α)?', '1', '1', '0', '20');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('253', 'Máme pravoúhlý trojúhelník s přeponou délky 5, přilehlou stanou délky 4 a protilehlou stranou délky 3.<br>Jaký je <b>kosinus</b> úhlu?', '1', '1', '0', '20');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('261', 'Doplň: V pravoúhlém trojúhelníku je <b>tangens</b> úhlu poměr délky [[1]] k délce [[2]].', '2', '1', '0', '21');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('262', 'Jak se počítá tan(α)?', '1', '1', '0', '21');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('263', 'Máme pravoúhlý trojúhelník s přeponou délky 5, přilehlou stanou délky 4 a protilehlou stranou délky 3.<br>Jaký je <b>tangens</b> úhlu?', '1', '1', '0', '21');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('271', 'Doplň: V pravoúhlém trojúhelníku je <b>kotangens</b> úhlu poměr délky [[1]] k délce [[2]].', '2', '1', '0', '22');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('272', 'Jak se počítá cot(α)?', '1', '1', '0', '22');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('273', 'Máme pravoúhlý trojúhelník s přeponou délky 5, přilehlou stanou délky 4 a protilehlou stranou délky 3.<br>Jaký je <b>kotangens</b> úhlu?', '1', '1', '0', '22');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('281', 'Jak se počítá sin(α)?', '1', '1', '0', '23');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('282', 'Jak se počítá cos(α)?', '1', '1', '0', '23');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('283', 'Jak se počítá tan(α)?', '1', '1', '0', '23');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('284', 'Jak se počítá cot(α)?', '1', '1', '0', '23');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('285', 'Který vzorec neplatí?', '1', '1', '0', '23');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('301', 'Jaký je vzorec pro sin(α ± β)?', '1', '1', '0', '24');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('302', 'Jaký je vzorec pro cos(α ± β)?', '1', '1', '0', '24');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('303', 'Jaký je vzorec pro tan(α ± β)?', '1', '1', '0', '24');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('304', 'Jaký je vzorec pro cot(α ± β)?', '1', '1', '0', '24');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('311', 'Jaký je vzorec pro sin(2α)?', '1', '1', '0', '25');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('312', 'Jaký je vzorec pro cos(2α)?', '1', '1', '0', '25');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('313', 'Jaký je vzorec pro tan(2α)?', '1', '1', '0', '25');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('314', 'Jaký je vzorec pro cot(2α)?', '1', '1', '0', '25');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('321', 'Jaký je vzorec pro sin(α/2)?', '1', '1', '0', '26');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('322', 'Jaký je vzorec pro cos(α/2)?', '1', '1', '0', '26');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('323', 'Jaký je vzorec pro tan(α/2)?', '1', '1', '0', '26');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('324', 'Jaký je vzorec pro cot(α/2)?', '1', '1', '0', '26');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('341', 'Jaký je vzorec pro sin(α)sin(β)?', '1', '1', '0', '27');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('342', 'Jaký je vzorec pro cos(α)cos(β)?', '1', '1', '0', '27');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('343', 'Jaký je vzorec pro sin(α)cos(β)?', '1', '1', '0', '27');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('344', 'Jaký je vzorec pro tan(α)tan(β)?', '1', '1', '0', '27');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('345', 'Jaký je vzorec pro cot(α)cot(β)?', '1', '1', '0', '27');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('346', 'Jaký je vzorec pro tan(α)cot(β)?', '1', '1', '0', '27');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('351', 'Urči hodnoty goniometrikých funkcí pro α = 0:<br>sin(α) = [[1]] cos(α) = [[2]] tan(α) = [[3]] cot(α) = [[4]]', '2', '1', '0', '28');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('352', 'Urči hodnoty goniometrikých funkcí pro α = π/6:<br>sin(α) = [[1]] cos(α) = [[2]] tan(α) = [[3]] cot(α) = [[4]]', '2', '1', '0', '28');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('353', 'Urči hodnoty goniometrikých funkcí pro α = π/4:<br>sin(α) = [[1]] cos(α) = [[2]] tan(α) = [[3]] cot(α) = [[4]]', '2', '1', '0', '28');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('354', 'Urči hodnoty goniometrikých funkcí pro α = π/3:<br>sin(α) = [[1]] cos(α) = [[2]] tan(α) = [[3]] cot(α) = [[4]]', '2', '1', '0', '28');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('355', 'Urči hodnoty goniometrikých funkcí pro α = π/2:<br>sin(α) = [[1]] cos(α) = [[2]] tan(α) = [[3]] cot(α) = [[4]]', '2', '1', '0', '28');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1000', 'Programming  topic selected.<br>Do you want to continue?', '1', '0', '0', '101');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1001', 'Parameters of the main function are enclosed by:', '0', '1', '0', '103');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1002', 'The header file is:', '0', '1', '0', '104');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1003', 'The header file to come with compiler or operating system is used to write:', '0', '1', '0', '104');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1004', 'The header file written by programmer is used to write', '0', '1', '0', '104');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1005', 'Assume the following variable declarations:
   <font face=''code''>double A, B = 0;
   float C, D=1.2E-2;</font>
How much total memory do these variables take?', '3', '2', '0', '110');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1006', 'The main function represents [[1]] of C-program. Its declaration consists of [[2]] type, identifier "main", parameters and body. The body of main function contains statement for [[3]].', '2', '2', '0', '103');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1007', 'The body of main function is enclosed by parenthesis.', '0', '1', '0', '103');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1008', 'Header files have two types: system and programmer made.', '0', '1', '0', '104');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1009', 'For input/output operations in C++ we use:', '0', '1', '0', '106');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1010', 'What is a variable in programming language?', '0', '1', '0', '108');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1011', 'Variable identifier in programming language', '0', '1', '0', '110');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1012', 'We want to read two values of A and B. These values represent the sides of the rectangle. We should write to output the contents and perimeter of this rectangle. Fill in appropriate parts into following code: #include <iostream>
using namespace std;
int main(){
   float A, B;
   [[1]]
   [[2]]
   return 0;
}', '0', '0', '0', '107');

-- -------------------------------------------------------------------------
-- LINKS
-- -------------------------------------------------------------------------
INSERT INTO public.link (id, actual_node, next_node) VALUES ('1', '1', '2');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('2', '1', '3');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('3', '1', '4');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('4', '1', '5');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('5', '2', '6');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('6', '3', '6');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('7', '4', '6');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('8', '5', '6');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('9', '6', '7');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('10', '6', '8');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('11', '7', '8');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('12', '8', '9');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('13', '8', '10');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('14', '8', '11');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('15', '9', '12');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('16', '9', '13');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('17', '9', '14');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('18', '9', '15');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('19', '10', '12');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('20', '10', '13');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('21', '10', '14');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('22', '11', '14');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('23', '11', '15');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('24', '12', '16');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('25', '13', '16');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('26', '14', '16');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('27', '15', '16');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('28', '16', '17');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('29', '16', '18');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('30', '17', '18');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('31', '18', '19');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('32', '18', '20');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('33', '18', '21');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('34', '18', '22');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('35', '19', '23');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('36', '20', '23');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('37', '21', '23');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('38', '22', '23');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('39', '23', '24');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('40', '24', '28');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('41', '25', '28');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('42', '26', '28');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('43', '27', '28');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('44', '28', '29');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('101', '101', '103');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('102', '103', '104');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('103', '104', '105');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('104', '105', '106');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('105', '106', '107');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('106', '107', '108');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('107', '108', '109');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('108', '109', '110');

-- -------------------------------------------------------------------------
-- TOPIC
-- -------------------------------------------------------------------------
INSERT INTO public.topic (id, name, first_node) VALUES ('1', 'Matematika', '1');
INSERT INTO public.topic (id, name, first_node) VALUES ('2', 'Programming', '101');


