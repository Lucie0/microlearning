-- -------------------------------------------------------------------------
-- todo LESSON ---------------------------------------------------------------------------
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
.                                                                                   .<br>', '11', '1');
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
<b>3. Není distributivní. </b>
.                                                                                   .<br>', '12', '1');
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
<li><b>sin(α)</b> = protilehlá strana / přepona</li>
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
<li><b>cos(α)</b> = přilehlá strana / přepona</li>
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
<li><b>tg(α)</b> = protilehlá strana / přilehlá strana</li>
</ul>
nebo<br>
<ul>
<li><b>tan(α)</b> = protilehlá strana / přilehlá strana</li>
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
<li><b>cotg(α)</b> = přilehlá strana / protilehlá strana</li>
</ul>
nebo<br>
<ul>
<li><b>cot(α)</b> = přilehlá strana / protilehlá strana</li>
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
<li><b>tan(α ± β)</b> = (tan(α) ± tan(β))<br>           / (1 ∓ tan(α)tan(β))</li>
</ul>
<ul>
<li><b>cot(α ± β)</b> = (cot(α)cot(β) ∓ 1)<br>           / (cot(α) ± cot(β))</li>
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
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('28', 'Hodnoty goniometrických funkcí', '<br><font face=''code''>
        0°     30°     45°     60°     90°<br>
        0      π/6     π/4     π/3     π/2<br>
––––––––––––––––––––––––––––––––––––––––––<br>
sin     0      1/2    (√2)/2  (√3)/2    1<br>
cos     1    (√3)/2   (√2)/2   1/2      0<br>
tan     0    (√3)/3     1      √3       x<br>
cot     x      √3       1     (√3)/3    0<br>
</font>', '27', '1');
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
</div>', '0', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('102', '1.1.1 First source code', 'When you want to write your program in C you have to write so called &quot;main&quot; function.<br>
Functions in C/C++ are a pieces of code that have own name (indentificator) and body. Main function represents whole program, so it must be always written in source code.<br>
The general form of function is:<br>
<br><font face=''code''>data_type function_name (parameters) { body }</font><br><br>
So the main function may have following form:<br>
<br><font face=''code''><b>int</b> main() {<br>     <i>// here are statements of function body</i><br>    <b>return</b> 0;  <i>// so called return value of function</i><br> }</font><br><br>
The main function returns integer value, thus data type of function main is int.<br>', '1', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('103', '1.1.2 Header files', '<p>A header file is a file with extension .h which contains declarations and definitions to be shared between several source files. There are two types of header files: the files that the programmer writes and the files that comes with your compiler.</p>
<p>The use of header file is necessary in almost every program. One of the most useful header file which come with compiler (or operating system) is file with declaration of input/output operations.</p>
<p>You request to use a header file in your program by including it with the C preprocessing directive <b>#include</b>. The syntax of #include has following two forms:</p>
<br><font face=''code''>#include &lt;name&gt;</font><br><br>
This variant is for the system (compiler) files, and<br>
<br><font face=''code''>#include &quot;name&quot;</font><br><br>
for files written by programmer.<br>
Detailed information about preprocessing directives comes later in this course.<br>', '2', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('104', '1.2.1 Common simple input/output', 'Almost every program needs to input some values and output results. So we have to use appropriate commands for it.<br>
The input and output operations depend always on operation system environment. Every system and every situation is solved differently. But the programmer – the author of program – have no information about it. The source code of program must work on many systems and programmer have to write the same commands.<br>
So the input and output operations are encapsulated into functions which bodies are implemented according to operation system you actually use and their headers are always the same.<br>
Every programming language have some commands for the input and output operations, but every programming language have a different approach for it.<br>
We will discuss two approaches because of two different versions of C language: pure C and C++ versions.<br>', '3', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('105', '1.2.2 Standard library for simple input/output', 'In the C++ programming language, the C++ Standard Library is a collection of classes and functions, which are written in the core language and part of the C++ ISO Standard itself. The C++ Standard Library provides support for some language features and functions for everyday tasks such as finding the square root of a number or simple input/output.<br>
There are differences between C and C++ standard library. We prefer C++ approach, so we show C++ simple input/output and appropriate part of standard library for this.<br>
We need some input values and write output in almost every program. In very simple form we have statement for input: cin (it stands for &quot;console input&quot;), and statement for output: cout (i.e. &quot;console output&quot;).<br>
When we need mentioned commands, we have to include a standard library for this in following form:<br>
<br><font face=''code''>#include &lt;iostream&gt;</font><br><br>', '4', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('106', '1.2.3 Simple input and output in C++', 'As mentioned earlier, cin and cout are available for input and output. Their use is supplemented by a special operator &quot;&lt;&lt;&quot; and &quot;&gt;&gt;&quot;. Multiple items can be read or written with one cin command and one cout command. Small hint: Operator &quot;&gt;&gt;&quot; points from cin to the variable, operator &quot;&lt;&lt;&quot; points from variable or expression to cout. For example input to two variables:<br>
<br><font face=''code''>cin &gt;&gt; Var1 &gt;&gt; Var2;</font><br><br>
Output can be realized as a sequence of expressions:<br>
<br><font face=''code''>cout &lt;&lt; &quot;The value is &quot; &lt;&lt; Var1 + Var2*5 &lt;&lt; &quot;.&quot; &lt;&lt; endl;</font><br><br>
Note that cin, cout and endl (stands for &quot;end of line&quot;) are objects in namespace std. When we use them directly, we have to open this namespace via command:<br>
<br><font face=''code''><b>using namespace</b> std;</font><br><br>
If we did not specify this command, it would be necessary to write a space name for each element contained in it:<br>
<br><font face=''code''>std::cout &lt;&lt; &quot;The value is &quot; &lt;&lt; Var1 + Var2*5 &lt;&lt; &quot;.&quot; &lt;&lt; std::endl;</font><br><br>
Standard error output<br>
Just as we can write to the standard output (stream cout), we can write to the standard error output in the same way using the stream cerr. Everything else remains the same as cout. We will always use the standard error output if we want to convey some non-standard situation or auxiliary information to the user. We never mix these auxiliary messages with data, so we don''t write them to standard output! For example:<br>
<br><font face=''code''><b>double</b> a, b;<br> cin &gt;&gt; a &gt;&gt; b; <i>// input two non-zero numbers</i><br> <b>if</b> (a*b == 0) cerr &lt;&lt; &quot;invalid data!&quot; &lt;&lt; endl;  <i>// error!</i><br>    <b>else</b> <i>// valid data, output to stdout</i><br>       cout &lt;&lt; &quot;Contents of rectangle is &quot; &lt;&lt; a*b &lt;&lt; endl;</font><br><br>', '5', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('107', '2.1.1 What is a variable?', 'A variable is certain <b>place in computer memory</b>
which can hold some values. It''s different approach than in mathematics.<br>
What place does the memory variable occupy? This depends on its <b>data type</b>.
Data types will be discussed later in this course. <br>
If a variable occupies some space, we can insert certain <b>values</b>
into it.<br>
Each memory space has its address. In order not to remember the numeric form of the
address, these addresses are named, so we call it a <b>variable
identifier</b>. It represents the numeric form of the address.<br>
So each variable has its address (or name in form of identifier) and its value.<br>', '6', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('108', '2.1.2 Values of variable', 'Each variable can hold some values. Because the variable occupies certain space in the computer''s memory, which is composed as a sequence of bits, each value is machine-displayed as a sequence of zeros and ones.<br>
A sequence of ones and zeros can mean different values. The simplest interpretation is as a non-negative integer in the binary system.<br>
Suppose a variable occupies a space of two bytes. What values can be stored on this space?<br>
The minimum value is represented by all zeros and represents zero. The maximum value is formed by the ones themselves. Two bytes are 16 binary ones, which is a decimal number of 65,535. So a two-byte variable can hold a value between 0 and 65,535.<br>
Generally, a variable on a n-bit space can hold a maximum value of 2<sup>n</sup>-1.<br>', '7', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('109', '2.1.3 Variable declaration', 'Each variable you planned to use have to be <b>declared</b>. This means we have to tell the computer how the variable will be named and what data type it will be. According to the data type, the compiler creates the appropriate space for this variable in computer memory. The declaration must always precede the use of the variable.<br>
The declaration in C/C++ language is written as follows scheme:<br>
<br><font face=''code''>data_type variable_identifier;</font><br><br>
For example (<b>int</b> is identifier for integer data type):<br>
<br><font face=''code''><b>int</b> Count;</font><br><br>
Now we can use the variable Count which can hold some integer value.<br>
If we need more variables of the same type, we can use the notation where we specify a data type and a list of variables of this type divided by commas:<br>
<br><font face=''code''><b>int</b> suma, current_value, count;</font><br><br>
After the declaration, the value of the variable is undefined. If we want the variable to have its initial value along with the declaration, we can write it directly into the declaration statement. In one declaration statement, we can combine variables without and with an initial value. For example:<br>
<br><font face=''code''><b>int</b> suma=0, current_value, count=1;</font><br><br>
The variable current_value has undefined value, but suma has value zero and count has value 1.<br>', '8', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('110', '2.2.1 Constant and its declaration', 'Constant represents memory space. It is similar to variable. Compared to a variable, however, it has a value that cannot be changed. We assign this value when declaring a constant.<br>
Constant declaration looks like variable declaration but it is preceded by key word const and we always have to define its initial value:<br>
<br><font face=''code''><b>const int</b> WeekDays=7;</font><br><br>', '9', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('111', '3.1.1 What is data type?', 'The data type specifies the <b>allowable values</b> and <b>allowed operations</b> with these values. Data type can be <b>predefined</b> or <b>user defined</b>. Predefined data types are basic building blocks for user-defined types.<br>
In this lesson, we will deal with numeric data types and types for expressing character information.<br>
As mentioned above, a variable represents a place in computer memory. The data type tells us how to interpret this memory location and how we can process it. Thus, the variable is associated with the data type.<br>
', '10', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('112', '3.1.2 Numeric data types – integer', 'There are numeric data types for number processing. We start with integer data types. They are divided into two categories –&nbsp;<b>unsigned</b> (non-negative values only) and <b>signed </b>(both negative and positive values). They are listed in the following table:<br>
<br><b>Numeric data types – integer values</b><br>
<br><font face=''code''>
Type identifier<br>
Short type identifier<br>
Memory size<br>
Values range<br>
--------------------------------<br>
unsigned int<br>
unsigned<br>
4 B<br>
0 to 4,294,967,295<br>
…………………………..<br>
unsigned long int<br>
unsigned long<br>
4 B<br>
as above<br>
…………………………..<br>
unsigned long long int<br>
unsigned long long<br>
8 B<br>
0 to 18,446,744,073,709,551,615<br>
…………………………..<br>
unsigned short int<br>
unsigned short<br>
2 B<br>
0 to 65,535<br>
…………………………..<br>
unsigned char<br>
(none)<br>
1 B<br>
0 to 255<br>
…………………………..<br>
signed int<br>
int<br>
4 B<br>
–2,147,483,648 to 2,147,483,647<br>
…………………………..<br>
signed long int<br>
long<br>
4 B<br>
as above<br>
…………………………..<br>
signed short int<br>
short<br>
2 B<br>
–32,768 to 32,767<br>
…………………………..<br>
signed long long int<br>
long long<br>
8 B<br>
–9,223,372,036,854,775,808<br>
to 9,223,372,036,854,775,807<br>
…………………………..<br>
signed char<br>
char<br>
1 B<br>
–128 to 127<br>
…………………………..<br>
</font><br><br>', '11', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('113', '3.1.3 Data types for real numbers', 'A pair of integers is used to store real numbers: mantissa (M) and exponent (E). These data types are generally referred to as floating-point numbers.<br>
The number value is calculated as&nbsp;( M ⋅ 2^E.&nbsp;The number of bits of mantissa indicates the accuracy of the number, the number of bits of the exponent determines the size of the number. Accuracy is given as the number of significant digits. The number size is given in decimal order.<br>
In C/C++ language there are three floating-point data types:<br>
<br><b>Floating-point data types</b><br>
<br><font face=''code''>
Data         Memory    Accuracy   Size<br>
type         size [B]<br>
-----------------------------------------------<br>
float         4         6 digits   +/-1e+/-38<br>
double        8        15 digits   +/-1e+/-308<br>
long double  10        18 digits   +/-1e+/-4932<br>
</font><br><br>

<br> Note also that the long double type is often stored at 16B to align memory to blocks of 4B.<br>', '12', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('114', '3.1.4 Character data type', 'The char data type mentioned earlier is primary used to store&nbsp;<b>character values</b>. Characters are written into apostrophes, for example:<br>
<br><font face=''code''>''a'' ''7'' ''(''</font><br><br>
Each character is stored in the computer memory as an integer. The base character set (called ASCII – American Standard Code for Information Interchange) contains 128 characters with codes 0 through 127.&nbsp;The character code table determines which number each character is stored in.<br>
Character set is divided into two categories:&nbsp;<b>printable</b>&nbsp;(visible) characters (letters, digits, punctuation marks) and&nbsp;<b>control</b>&nbsp;characters. The control character is used to control the output devices, for example go to a new line, ring bell or backspace. The control character is written with a special sequence starting with a backslash.<br>
The control character can be written using its code in octal or hexadecimal, for some characters there are special sequences, see the following table.<br>
<br><b>Control characters</b><br>
<br><font face=''code''>
Acronym Code Written as       Name of the character<br>
-----------------------------------------------------<br>
NUL      0   ''\0''             null character<br>
EOT      4   ''\4'' ''\x4''       end of text file (Unix)<br>
BEL      7   ''\7'' ''\x7''       bell (ring bell)<br>
BS       8   ''\10'' ''\x8''      backspace<br>
HT       9   ''\11'' ''\x9'' ''\t'' horizontal tab<br>
LF      10   ''\12'' ''\xa'' ''\n'' line feed (new line)<br>
FF      12   ''\14'' ''\xc'' ''\f'' form feed (new page)<br>
CR      13   ''\15'' ''\xd'' ''\r'' carriage return<br>
ESC     27   ''\33'' ''\x1a''     escape<br>
-----------------------------------------------------<br>
</font><br><br>', '13', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('115', '3.1.5 User defined data type', 'The user can define his own data types, which can then be treated similarly to predefined ones. This can be very advantageous if, for example, we want to get rid of dependence on a particular type and we want to generalize the notation so that we can change the data type of the processed values by changing it in one place.<br>
The <b>typedef</b> keyword is used to define a new type, followed by a type definition and a new type identifier, such as:<br>
<br><font face=''code''><b>typedef unsigned int</b> Value_type;</font><br><br>
Then we can use this new type to declare variables:<br>
<br><font face=''code''>Value_type Current, Sum = 0, Max, Min;</font><br><br>
Then, in the algorithm for calculating the sum and extreme values from the input sequence, we can process unsigned integers once, sometimes they can be decimal numbers, just replace the Value_type definition.<br>', '14', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('116', '3.2.1 Data type conversion', 'The value stored in a particular memory location can be understood in different ways. So we sometimes need to tell the compiler that the value of a particular variable is to be processed differently than the data type of that variable.<br>
Sometimes, the compiler automatically executes this change itself. For example, if you insert an int variable value into a long long variable, the compiler automatically extends the int value to long long. This is called <b>implicit data conversion</b>.<br>
We can also specify <b>explicit type conversion</b>. It is written in two possible ways:<br>
<br><font face=''code''>type (expression)</font><br><br>
or if data type is written in more words:<br>
<br><font face=''code''>(type) expression</font><br><br>
Examples:<br>
<br><font face=''code''><b>char</b>(48 + digit)<br> (<b>long long</b>) sum</font><br><br>
If the resulting value does not fit in the converted type, this value is truncated. For example:<br>
<br><font face=''code''><b>int</b> A=1000000000;<br> <b>long long</b> B;<br> B=9*A; <i>// we multiply value A by a 9</font></i><br><br>
The result is 410065408, but right result may be 9000000000. To solve this mistake we need to write:<br>
<br><font face=''code''><b>int</b> A=1000000000; <br> <b>long long</b> B;<br> B=9*(<b>long long</b>)A;</font><br><br>', '15', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('117', '4.1.1 Expression', 'The expression prescribes some calculation. It is composed of operands and operators.<br>
The operand is constant value or variable. The operator may be sign for arithmetic operation, logical operation or other manipulation with values of various types. The operator may be a function too.<br>
Many expressions are written like in math, but there are differences.<br>
Expression examples (a – circle content, b – triangle perimeter, c – root of the quadratic equation):<br>
<br><font face=''code''>a)   Radius * Radius * 3.14<br> b)   sideA + sideB + sideC<br> c)   (-b + sqrt(b * b - 4 * a * c)) / (2 * a)</font><br><br>
Notes: Operators have their priorities (order of evaluation). Parentheses have the highest priority, they are used only round unlike in math. Operator for multiplication is written like &quot;*&quot;. The sqrt function (square root) is in the cmath library, and this library must be appended with the #include &lt;cmath&gt; command. Each function have their parameters in parentheses, parentheses must be written even if the function has no parameters. For exact value of the number Pi we can use the constant M_PI from cmath library. So the exact value of circle contents we obtain as Radius * Radius * M_PI.<br>', '16', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('118', '4.1.2 Assignment', 'Assignment is a special operator that works from right to left. On the right side it has an expression that is first calculated, and on the left side it has a variable into which the calculated expression value is inserted. Assignment operator has various shapes. The simplest is &quot;=&quot;, for example:<br>
<br><font face=''code''>Volume = SideA * SideB * Height;</font><br><br>
At the same time, the expression serves as a command that stores the calculated expression value in the specified variable. Therefore, it is more of an assignment statement, not an expression. The assignment statement is one of the simple commands and is one of the most widely used program elements.<br>
The assignment has various shapes. In short, we can write the fact that the value on the right side is added (or multiplied, etc.) to the variable on the left side along with the assignment. For example, we need to add a SideC value to the TotalLength variable. We can write:<br>
<br><font face=''code''>TotalLength = TotalLength + SideC;</font><br><br>
or also abbreviated<br>
<br><font face=''code''>TotalLength += SideC;</font><br><br>
Similar to the + = operator, we can use *=, /=, -=, %= etc.<br>', '17', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('119', '4.1.3 More about operators', 'Some operators are presented in following table:<br>
<br><b>Operators in C++</b><br>
<br><font face=''code''>
Syntax  Example   Operator<br>
------------------------------------------------<br>
+       a + b     Adding two numbers<br>
-       a - b     Subtracting two numbers<br>
*       a * b     Multiplying two numbers<br>
/       a / b     Dividing two numbers<br>
%       a % b     Modulo of the integer division<br>
&gt;      a &gt; b     Greater than<br>
&lt;      a &lt; b     Less than<br>
&gt;=     a &gt;= b    Greater and equal than<br>
&lt;=     a &lt;= b    Less and equal than<br>
==      a == b    Equal<br>
!=      a != b    Not equal<br>
and     a and b   Logical and (conjunction)<br>
&amp;&amp;     a &amp;&amp; b   Logical and (conjunction)<br>
or      a or b    Logical or (disjunction)<br>
&#124;&#124;      a &#124;&#124; b   Logical or (disjunction)<br>
!       !a       Negation<br>
=       a = b     Assignments<br>
------------------------------------------------<br>
</font><br><br>
<br> Operators can be divided into several groups. For example, additive operators are + and -, multiplicative are *, / and%, relational (used to compare values) are ==,! =,&gt;= etc. The operators differ in their priorities. Operators in the same group have the same priority and are evaluated from left to right in the expression. The higher the operator''s priority, the earlier it is calculated in the expression. You can change the priority of calculation by enclosing a part of the expression in parentheses.<br><br>
Examples:<br>
<br><font face=''code''><b>int</b> A = 10, B = 5, C = 4, result;<br> result = A + B * C; <i>// result is 30</i><br> result = (A + B) * C; <i>// result is 60</i><br> result = A + C / B;&nbsp; <i>// result is 10</i><br> result = (A + C) / B; <i>// result is 2</i><br> result = A * C / B; <i>// result is 8</i><br> result = (A * C) / B; <i>// result is 8 – the same as above</font></i><br><br>', '18', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('120', '4.1.4 Assignment as an expression', 'In the previous sections it was stated that the assignment is one of the operators. Therefore, the assignment statement is also an expression. The value of this expression is the value inserted into the variable on the left side of assignment. We can use this fact if we want to insert this value into another variable. For example:<br>
<br><font face=''code''><b>int</b> CountA, CountB, CountC, StartingValue = 1;<br> CountA = CountB = CountC = StartingValue;</font><br><br>
In this case, all three variables will have the same value that is equal to the contents of the StartingValue variable.<br>
The assignment operator is evaluated from <b>right to left</b>. This is different from many other operators, for example, the addition is evaluated from left to right. So the first operation is assigning StartingValue to the CountC variable. This value is then inserted into CountB variable (the same value as in CountC) and then is inserted into the CountA variable.<br>
Assignment operator can be used in any part of another expression. We will achieve a double effect: assigning a value to a variable and at the same time using that value in another part of the expression. Example: We want to calculate content and perimeter of a rectangle. Sides of the rectangle are in variables a and b. Initial values we can assign in the first expression and then use this values in second expression:<br>
<br><font face=''code''><b>int</b> a, b, content, perimeter;<br> content = (a = 3) * (b = 4);<br> perimeter = (a + b) * 2;</font><br><br>
This notation is not the best, because assigning initial values is lost inside the first expression and is slightly confusing, but illustrates the function of the assignment operator.<br>', '19', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('121', '4.1.5 Increments', 'Very frequently used operation is to add or subtract one. The so-called incremental operator serves to simplify the syntax of increasing or decreasing the value of variable.<br>
This operator is written as a two + or two – and it have two possibilities of use: as a postincrement (written after a variable) or as a preincrement (written before a variable).<br>
The postincrement works by first using the current value of the variable in the expression and then increasing it by one. Conversely, a preincrement first increases the value of the variable by one, and then the new value is only used in the expression. Examples:<br>
<br><font face=''code''><b>int</b> x = 10; y;<br> y = x++ * 5; <i>// y is 50 and new value of x is 11</i><br> y = ++x * 5; <i>// y is 60 and new value of x is 12</font></i><br><br>
Thus, increasing the value of variable X by one can be done in four ways:<br>
<br><font face=''code''>X = X + 1;  <i>// this is long :-(, </i><br>             <i>// but clear :-) and commonly used in other languages</i><br> X += 1;     <i>// the use of assignment operator</i><br> X++         <i>// postincrement</i><br> ++X         <i>// preincrement</font></i><br><br>', '20', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('122', '5.1.1 Formatted input/output in C language', 'We suppose that the
actual compiler is C++, so we have to link a library with standard C
input/output features. This library is named “cstdio”. The link to the header
file is written as:<br>
<br><font face=''code''>#include &lt;cstdio&gt;</font><br><br>
For input we may use the
function scanf. This function has first parameter which defines data type of
input values, and next parameters are memory adresses to store read values.<br>
For output exists
function printf. This function has first parameter which defines the shape of
output string, and next parameters define output values (variables or
expressions).<br>
Both functions have some
common types of format parameters. So we can define how may input value be read
and the same way we define how may be output value written.<br>
Some simple examples of
format parameters:<br>
<br><font face=''code''>
%d -- decimal integer value<br>
%f -- float value<br>
%s -- string (array of chars)<br>
%x -- hexadecimal integer value<br>
%c -- one character<br>
</font><br><br>
<br>
Some simple examples of read/write values:<br>
<br><font face=''code''>
scanf(&quot;%d&quot;, &amp;count);
/* one integer value is read to variable on address count Note that the address
of the variable is indicated by the &amp; */<br><br>
scanf(&quot;%f%s&quot;,
&amp;price, customer); /* one float value stored to price and some characters
stored to  variable named customer. Customer is array of characters and this is
direct address, so we needn''t the &amp; */<br><br>
printf(&quot;Total count
is %d.&quot;, count); /* integer value from variable count is written into
given sentence */<br><br>
printf(&quot;The customer
%s have to pay $%f.&quot;, customer, price); /* name of customer and price are
written in given sentence */<br><br>
</font><br><br>', '21', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('123', '5.1.2 Output in C-variant in more detail', 'The specifiers mentioned in the previous text (d, f, c, s, etc.) can be supplemented with four group of sub-specifiers in following order:<br>
<br><font face=''code''>%[flags][width][.precision][length]specifier&nbsp;</font><br><br>
Some of these sub-specifiers are listed in following tables:<br>
<br>
<b>Flags</b><br>
– … Left-justify within the given field width; Right justification is the default (see width sub-specifier).<br>
+ … Forces to preceed the result with a plus or minus sign (+ or -) even for positive numbers. By default, only negative numbers are preceded with a - sign.<br>
0 … Left-pads the number with zeroes (0) instead of spaces when padding is specified (see width sub-specifier). <br>
<br>
<b>Width</b><br>
(number) … Minimum number of characters to be printed. If the value to be printed is shorter than this number, the result is padded with blank spaces. The value is not truncated even if the result is larger.<br>
<br>
<b>Precision</b><br>
.number … <u>For integer specifiers (d, i, o, u, x, X):</u> precision specifies the minimum number of digits to be written. If the value to be written is shorter than this number, the result is padded with leading zeros. The value is not truncated even if the result is longer. A precision of 0 means that no character is written for the value 0.<br>
<u>For a, A, e, E, f and F specifiers:</u> this is the number of digits to be printed after the decimal point (by default, this is 6).<br>
<u>For g and G specifiers:</u> This is the maximum number of significant digits to be printed.<br>
<u>For s:</u> this is the maximum number of characters to be printed. By default all characters are printed until the ending null character is encountered.<br>
If the period is specified without an explicit value for precision, 0 is assumed.<br>
<br>
The length sub-specifier modifies the length of the data type. For example output value of type int may be written as signed char, short int, long int, long long int:<br>
<br>
<b>Length</b><br>
hh … writes integer as signed char<br>
h  … writes integer as short int<br>
l  … writes integer as long int<br>
ll … writes integer as long long int<br>
L  … writes double as long double<br>
<br>
Examples:<br>
<br><font face=''code''>
printf(&quot;%010d&quot;, 1977);  <i>// displays 000001977</i><br>
printf(&quot;%+5.2f&quot;, 3.1);  <i>// displays +3.10</i><br>
printf(&quot;%-10d%d&quot;, 1, 1); <i>// displays 1         1</i><br>
</font><br><br>', '22', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('124', '5.2.1 Input/output in C++ language variant', 'There is another approach to input and output values in C++ language. We have to first include a library with input/output operations called iostream:<br>
<br><font face=''code''>#include &lt;iostream&gt;</font><br><br>
The operations for input and output are stored into name space &quot;std&quot;, so we have to write &quot;std::&quot; as a prefix of operation name. More info about name spaces will be discussed later.<br>
For the simple input can be used statement in following form:<br>
<br><font face=''code''>std::cin &gt;&gt; variable;</font><br><br>
The name &quot;cin&quot; stands for &quot;console input&quot;. The value from standard input file is stored into variable according to data type of this variable. When we use multiple operators &quot;&gt;&gt;&quot;, we can input multiple values. This is the simplest form for common input.<br>
Example:<br>
<br><font face=''code''>std::cin &gt;&gt; first &gt;&gt; second;</font><br><br>
For the simple output can be used following statement:<br>
<br><font face=''code''>std::cout &lt;&lt; expression;</font><br><br>
where &quot;expression&quot; is variable or combination of variables and operators. The name &quot;cout&quot; stands for &quot;console output&quot;. Note that operator &quot;&lt;&lt;&quot; have certain priority and operators used into expression may have less priority. Then we have to enclose this expression into parentheses. To output multiple values can be write multiple operators &quot;&lt;&lt;&quot; and multiple expressions. Each expression is calculated first and then is written to output stream.<br>
Example:<br>
<br><font face=''code''>std::cout &lt;&lt; &quot;The result value is &quot; &lt;&lt; first * second &lt;&lt; &quot;.\n&quot;;</font><br><br>
Note the &quot;\n&quot; is control character for new line.<br>
The cout has some internal items accessible with dot notation, for example:<br>
precision(n) – sets the number of decimal positions of float numbers to n<br>
width(n) – sets size of next output expression to n characters.<br>
fill(c) – sets the character filled to output expression instead of spaces.<br>
Some of these formatting settings are usable via manipulators (see later).<br>', '23', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('125', '5.2.2 Output manipulators', 'So-called manipulators are used to adjust the output shape of the values displayed. Manipulators are written in the same way as output variables or expressions in the cout command. The following table shows some useful manipulators:<br>
<br>
<b>Manipulators for output</b><br>
endl … end of line<br>
dec … switches output of integers to decadic system (implicit) <br>
oct … switches output of integer to octal system<br>
hex … switches output of integer to hexadecimal system<br>
showpos … shows plus sign for positive numbers (with zero)<br>
noshowpos … switches off displaying plus sign for positive numbers<br>
left … left aligning<br>
right … right aligning<br>
internal … fill character is displayed between sign and value<br>
fixed … displays real numbers with a fixed position of the decimal point<br>
scientific … switches displaying of real numbers to scientific shape (with exponent)<br>
uppercase … all letters in numbers (hexadecimal or scientific) are in upper case<br>
nouppercase … all letters in numbers (hexadecimal or scientific) are in lower case<br>
setprecision(p) … sets the precision of real number to p <br>
setw(x) … sets the width of the next output to x characters<br>
setfill(c) … sets the fill character to c<br>
<br>
Manipulators setw, setfill and setprecision are implemented in header file iomanip, so we have to include them (#include <iomanip>).<br>
<br>
Some examples:<br>
<br><font face=''code''>
cout &lt;&lt; showpos &lt;&lt; 56;&nbsp; <i>// displays
+56</i><br>
cout &lt;&lt; setw(5)&lt;&lt;left&lt;&lt;-56;&nbsp; <i>// displays two spaces and
-56</i><br>
cout &lt;&lt; fixed &lt;&lt; setprecision(3) &lt;&lt; 3.141592;&nbsp; <i>//
displays 3.142</i><br>
cout &lt;&lt; scientific &lt;&lt; setprecision(2) &lt;&lt; 142; <i>// displays
1.42e+002</i><br>
cout &lt;&lt; setw(10) &lt;&lt; left &lt;&lt; setfill(''/'') &lt;&lt; fixed
&lt;&lt;setprecision(3) &lt;&lt; 3.115926; <i>// displays 3.142/////</i><br>
</font><br><br>
The settings you make in one output statement also apply to the following commands until you undo the settings. The exception is the setw manipulator, which applies only to the following expression.<br>', '24', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('126', '5.2.3 Input in C++ variant more detailed', 'The cin command with the &quot;&gt;&gt;&quot; operator assumes a simple input that omits the so-called white space characters (spaces, tabs, line breaks). This method is useful for entering numbers, individual characters, and some strings. Often, however, we need to work with input values somewhat differently, using other input stream tools.<br>
To enter individual characters without skipping the white space we can use the get method of input stream cin. Example:<br>
&nbsp;<br>
<br><font face=''code''><b>char</b> ch;<br> cin.get(ch);</font><br><br>
To modify behavior of input operations we can set the input stream with setf or unsetf. For example:<br>
<br><font face=''code''>cin.unsetf(ios::skipws);</font><br><br>
This flag sets/unsets skip of white space characters. Other flags for example are:<br>
boolalpha – reads (and writes) boolean values as a strings true/false instead of 1/0.<br>
showbase – write integer values preceded by their corresponding numeric base prefix.<br>
showpoint – write floating-point values including always the decimal point.<br>
showpos – write non-negative numerical values preceded by a plus sign (+).<br>
Notice that several manipulators have the same name as these flags (but as global functions instead).<br>
For reading strings (a character array, not a string type), the getline method is used in addition to the basic form. The getline method has two or three parameters:<br>
<br><font face=''code''><b>char</b> S[20];<br> cin.getline(S, 10); <i>// reads max. 9 characters plus \0 or to the end of line</font></i><br><br>
We can read to the given delimiter:<br>
<br><font face=''code''>cin.getline(S, 15, '':''); <br>   <i>// reads max. 15 characters or to the colon or to the end of line</font></i><br><br>
The last method is useful for reading strings from CSV files for example.<br>', '25', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('127', '6.1.1 Logical data type', 'A <b>bit</b> is the minimum amount of information that we can imagine, since it only stores either value 1 or 0, which represents either YES or NO, activated or deactivated, true or false, etc… that is: two possible states each one opposite to the other, without possibility of any shades. We are going to consider that the two possible values of a bit are 0 and 1.<br>
Several operations can be performed with bits, either in conjunction with other bits or themselves alone. These operations receive the name of boolean operations, a word that comes from the name of one of the mathematicians who contributed the more to this field: George Boole (1815–1864). There is a special data type named bool. Values of bool type are false and true. The value false is implemented as zero in computer memory, the value true is implemented as one (or any non-zero value). Boolean values are also called logical values and data type bool is also called logical data type.<br>
Basic operators with logical values are and, or, not, xor. The following table shows the results of operations with these operators.<br>
&nbsp;<br>
<br><b>Logical operations</b><br>
<br><font face=''code''>
  A     B     not A  A and B  A or B   A xor B<br>
----------------------------------------------<br>
false  false  true   false    false    false<br>
false  true   true   false    true     true<br>
true   false  false  false    true     true<br>
true   true   false  true     true     false<br>
</font><br><br>
<br>
Input and output of logical values<br>
For C language compatibility, both input and output logical values are represented by numeric values. A value of false is zero, and a value true is 1. We can change this behavior by setting stream format flag boolalpha. Then we can read string &quot;true&quot; or &quot;false&quot; as a logical value and write logical value in form of strings &quot;true&quot; or &quot;false&quot;.<br>', '26', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('128', '6.1.2 Logical expressions', 'A logical expression is similar to an arithmetic expression. It is composed with operands and operators. However, operators calculate the results in the form of a logical value. For example the expression<br>
<br><font face=''code''>(a <b>or</b> b) <b>and not</b> (c <b>and</b> d)</font><br><br>
is logical expression where a, b, c, d are operands (variables) and &quot;or&quot;, &quot;and&quot;, &quot;not&quot; are logical operators.<br>
Similar to the arithmetic expression, logical operators have their priorities. The logical expression is evaluated according to these priorities. The change of priority can be prescribed by brackets.<br>
All comparisons can be a part of a logical expression. For example, x == y is true when x and y are equal. Variables x and y may be any numbers, characters, strings and so on. Example:<br>
<br><font face=''code''>(x != 5) <b>and</b> (x &gt; 0)</font><br><br>
The expression value is true when x is positive, but not equal to five.<br>', '27', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('129', '7.1.1 Flow control and compound statement', 'A simple C++ statement is each of the individual instructions of a program, like the variable declarations and expressions seen in previous sections. They always end with a semicolon (;), and are executed in the same order in which they appear in a program.<br>
But programs are not limited to a linear sequence of statements. During its process, a program may repeat segments of code, or take decisions and bifurcate. For that purpose, C/C++ provides flow control statements that serve to specify what has to be done by our program, when, and under which circumstances.<br>
Many of the flow control statements explained in this section require a generic (sub)statement as part of its syntax. This statement may either be a simple C/C++ statement, such as a single instruction, terminated with a semicolon, or a compound statement. A compound statement is a group of statements (each of them terminated by its own semicolon), but all grouped together in a block, enclosed in curly braces: {}:<br>
<br><font face=''code''>{ statement1; statement2; statement3; } </font><br><br>
The entire block is considered a single statement (composed itself of multiple substatements). Whenever a generic statement is part of the syntax of a flow control statement, this can either be a simple statement or a compound statement.<br>', '28', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('130', '7.1.2 Program branching – &quot;if&quot; statement', '<b>Condition</b><br>
A condition is any boolean expression. We say that the condition is fulfilled if the value of this expression is true. Otherwise, the condition is not met. The condition is used as a part of some flow control statements.<br>
<br>
<b>Flow control – branching</b><br>
The &quot;if&quot; statement can only execute a command if a condition is met or other statement if a condition is not met. The syntax of this statement is:<br>
<br><font face=''code''><b>if</b> (condition) statement1; <b>else</b> statement2;</font><br><br>
Note the condition is enclosed to parenthesis. Both statement1 and statement2 can be simple statement or compound statement. Words &quot;if&quot; and &quot;else&quot; are key words, Keywords cannot be used in other way than in their defined meaning. Therefore, they will be highlighted in bold to distinguish them from other parts.<br>
We can use an incomplete if statement that omits the part that starts with else. In this case, nothing is done if the condition is not met.<br>', '29', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('131', '7.1.3 More than 2 branches', 'Sometimes it is necessary to branch a program to more than two branches. To do this, we can use the if statement within a branch of another if statement.<br>
For example, we need to determine whether a numeric variable X is positive, negative, or zero. We can write:<br>
<br><font face=''code''><b>if</b> (X == 0) cout &lt;&lt; &quot;X is zero&quot; &lt;&lt; endl;<br> <b>else</b> <i>// variable X is positive, or negative – we have to test it:</i><br>    <b>if</b> (X &lt; 0) cout &lt;&lt; &quot;X is negative&quot; &lt;&lt; endl;<br>    <b>else</b> cout &lt;&lt; &quot;X is positive&quot; &lt;&lt; endl;</font><br><br>
In the same way, we can branch to even more branches. We can write additional if statements.<br>
In order to see in the source text which branch belongs to which command, we use indentation.<br>', '30', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('132', '8.1.1 Ternary operator', 'If the result of the branching is only the calculation of an expression, it is possible to use a rather simple writing instead of the if statement.<br>
For example, we need to calculate fares based on distance traveled. From 0 to 19 km is paid 1 €, over 20 km is paid 2 €. We can write the calculation with the if statement:<br>
<br><font face=''code''><b>if</b> (Distance &lt; 20) Fare = 1;<br> <b>else</b> Fare = 2;</font><br><br>
We can write the same with a conditional expression:<br>
<br><font face=''code''>Distance &lt; 20 ? Fare = 1 : Fare = 2;</font><br><br>
or even more briefly<br>
<br><font face=''code''>Fare = Distance &lt; 20 ? 1 : 2;</font><br><br>
Operator &quot;?&quot; and &quot;:&quot; is often called ternary operator – it have three operands: condition, first expression and second expression.<br>', '31', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('133', '9.1.1 Switch statement', 'In some cases, branching into multiple branches can be written with the switch command. This command tests the value of an integer or enumerated expression, and then decides which branch the program control moves to.<br>
Syntax of switch command is:<br>
<br><font face=''code''><b>switch</b> (expression)<br> {<br>    <b>case</b> value1 : statement1; <b>break</b>;<br>    <b>case</b> value2 : statement2; <b>break</b>;<br>       etc.<br>    <b>case</b> valueN : statementN; <b>break</b>;<br>    <b>default</b>: statement;<br> }</font><br><br>
The break statement always terminates execution of the entire switch statement. If we do not specify a break, the switch statement continues to execute the next branch, even if it is a branch whose value does not match the evaluated expression. The default branch is executed if neither value matches the enumerated expression. The default branch may not be written.<br>
The break statement will also be discussed later.<br>', '32', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('134', '10.1.1 About loops', 'Program cycles or loops form the basis of almost all programs. Most algorithms are based on cyclic value processing. All loops can be divided into several parts: conditional loops, counted loops. Conditional loops are further divided into loops with a condition at the beginning, a condition at the end, and a condition in the middle. So we have four types of loops. First, we deal with conditional cycles.<br>
What is a loop exactly?<br>
A loop is a few commands to be executed repeatedly, but not forever. We must always determine when commands are to be again repeated, and when the repetition is to end. For conditional loops, the point at which the repetition ends is determined by fulfill a condition. For counted loops, the number of repetitions is determined in advance.<br>
So conditional loop have a condition, i.e. logical expression that controls the repetition. A poorly determined condition may cause the loop to be performed forever (looping) or not at all. A looping is a serious bug in program construction.<br>
', '33', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('135', '10.1.2 Conditional loop', 'A conditional loop have following common structure:<br>
&nbsp;&nbsp;▪&nbsp;&nbsp; start of loop<br>
&nbsp;&nbsp;▪&nbsp;&nbsp; loop body (commands to be repeated)<br>
&nbsp;&nbsp;▪&nbsp;&nbsp; end of loop<br>
The loop control condition can be placed at the beginning, in the cycle body, or at the end. The loop with a control condition at the beginning have this syntax:<br>
<br><font face=''code''><b>while</b> (condition) command</font><br><br>
The keyword while determines a start of the loop. Note the condition is always enclosed in parentheses. The loop body contains one statement only, but this statement may be a compound statement which is composed with many other statements enclosed by brackets. The end of this loop is composed as an end of body command.<br>
Example:<br>
<br><font face=''code''><b>while</b> (Current &gt; 0) {<br>    Count++;<br>    cin &gt;&gt; Current;<br> }</font><br><br>
The most important thing is to build the condition correctly. There must be at least one statement in the body of the cycle that affects the condition value. In this example, it is the cin command – inserts a value from the input into the Current variable and then controls the the loop pass.<br>
If the loop has a condition at the beginning, it is necessary to prepare everything before the loop so that the condition can be evaluated before the loop starts. So we need to input first value of Current before the loop:<br>
<br><font face=''code''>cin &gt;&gt; Current;<br> <b>while</b> (Current &gt; 0) {<br>    Count++;<br>    cin &gt;&gt; Current;<br> }</font><br><br>', '34', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('136', '10.1.3 Input sequence', 'Often we need to process the numbers entered from the input. There are several ways that a job is given:<br>
(1)&nbsp;&nbsp; We know which value is the last; this last value may be part of the data, or it may be a breakpoint (stop value) that we can''t process with other values.<br>
(2)&nbsp;&nbsp; We don''t know their number, nor do we know which value is the last.<br>
(3)&nbsp;&nbsp; We know the quantity of input numbers.<br>
Each of these cases has a somewhat different loop design that is able to read and process the entered numbers.<br>
We start with the simplest situation, that is, when we know the last number that is not a part of the data and shouldn''t be processed together with the data.<br>', '35', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('137', '10.1.4 Conditional loop do-while', 'The conditional do-while loop has a condition at the end. This means that the loop body will always run at least once. The syntax is as follows:<br>
<br><font face=''code''><b>do</b> statements<br> <b>while</b> (condition);</font><br><br>
If we need more than one statement in the loop body, we use a compound statement. Example:<br>
The user has to enter an integer value between zero and 20. If he enters the wrong number, he will be repeatedly prompted to enter the correct value.<br>
<br><font face=''code''><b>int</b> Value;<br> <b>do</b> {<br>    cout &lt;&lt; &quot;Please, insert any number between 0 and 20: &quot;;<br>    cin &gt;&gt; Value;<br> } <b>while</b> ((Value &lt;0) <b>or</b> (Value &gt; 20));</font><br><br>
When this loop is over, we are sure that the Value variable has the correct value.<br>', '36', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('138', '10.1.5 The use of do-while loop', 'Now we can return to the numeric input options. We will now deal with the case that we know the last value that is part of the data and should be processed with the data. For this case, a conditional loop of the do-while type is best suited.<br>
Example: Suppose a sequence of real values is prepared at the input and the last value is 42. We have to determine how many values are on the input.<br>
<br><font face=''code''><b>float</b> Value;  <i>// variable for input value</i><br> <b>int</b> TotalCount = 0; <i>// variable for total count of input values</i><br> <b>do</b> {<br>    cin &gt;&gt; Value;   <i>// we read one value</i><br>    TotalCount++;  <i>// counter of values is increased</i><br> } <b>while</b> (Value != 42);  <i>// when input value is not 42, we continue in the loop</font></i><br><br>
Note that the end condition expresses the situation where the loop body is to be repeated again.<br>
We can use this algorithm also if the end value does not belong to the data, but its processing does not affect the result. For example: Input contains integer values, last value is zero. We have to find out the sum of the numbers. In this case, the addition of the numbers with the ending zero does not affect the result.<br>', '37', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('139', '11.1.1 The &quot;for&quot; loop', 'The &quot;for&quot; loop is intended for cases where we know the number of times a loop is repetitive. It is a complement to a conditional loop that is performed by meeting a condition.<br>
The syntax of for loop:<br>
<br><font face=''code''><b>for</b> (initialization; condition; control) statement;</font><br><br>
There are three expressions in brackets that determine how the loop body is executed. The loop execution is usually controlled by the value of a numeric variable, which is called a loop control variable.<br>
The first expression specifies the initial setting. Usually, the initial value of the control variable is set here. This expression is always calculated only once before the loop starts. We can also use there the declaration of a control variable that will only function inside the loop body, and will automatically deleted when the loop ends.<br>
The second expression is always evaluated before each execution of the loop body. It is a condition whose fulfillment allows the execution of the loop body. If this condition isn''t met, the loop is terminated.<br>
The third expression is used to update the value of the control variable. We can add or remove one or any other value.<br>
Simple example: We want to display numbers from 10 to 20:<br>
<br><font face=''code''><b>for</b> (<b>int</b> CV = 10; CV &lt;= 20; CV++) cout &lt;&lt; CV &lt;&lt; endl;</font><br><br>
We can omit the initialization expression if the initialization was performed earlier:<br>
<br><font face=''code''><b>int</b> CV = 10;<br> <b>for</b> ( ; CV &lt;= 20; CV++) cout &lt;&lt; CV &lt;&lt; endl;</font><br><br>
If we omit the second expression, the loop will be executed forever (infinite loop). In that case, there is no point in mentioning the third expression.<br>
The loop body can contain only one command. If we need more commands, we use a compound statement.<br>', '38', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('140', '11.1.2 The for and the while loop', 'Looking at the three expressions that need to be written in the for-loop bracket, it is basically the same thing we would have to do with the while loop. So what is the difference between using a for and while loop? If we want to write pure code, we will use the for loop just if we know in advance how many times it will be repeated. In all other cases, we use the while loop. <br>
The for loop can be easily rewritten to a while loop. For example the followin loop:<br>
<br><font face=''code''><b>for</b> (<b>int</b> i = 10; i &lt;= 100; i+=3) {<br>    cin &gt;&gt; current;<br>    sum += current;<br>    cout &lt;&lt; &quot;We processed &quot; &lt;&lt; i &lt;&lt; &quot; values.&quot;&lt;&lt; endl;<br> }</font><br><br>
can be rewritten to:<br>
<br><font face=''code''>{<b>int</b> í = 10;<br> <b>while</b> (i &lt;=100) {<br>    cin &gt;&gt; current;<br>    sum += current;<br>    cout &lt;&lt; &quot;We processed &quot; &lt;&lt; i &lt;&lt; &quot;values.&quot;&lt;&lt; endl;<br>    i+=3;<br> }}</font><br><br>
Therefore, the for loop may seem unnecessary. Its benefit is that in the case of a known number of repetitions, we have all three essential elements of the loop (initialization, repetition condition, modification of the control variable) in one place in the parentheses.<br>
Similarly, you can rewrite a while loop to a for loop. For example, to read a sequence of numbers ending with -1 and summing up the values, we can write:<br>
<br><font face=''code''>cin &gt;&gt; cur;<br> <b>while</b> (cur != -1) {<br>    sum += cur;<br>    cin &gt;&gt; cur;<br> }</font><br><br>
And in case of foor loop we write:<br>
<br><font face=''code''><b>for</b> (cin &gt;&gt; cur; cur != -1; cin &gt;&gt; cur) sum += cur;</font><br><br>
We strongly warn against various dirty tricks, such as modifying the control variable inside the for loop. For example:<br>
<br><font face=''code''><b>for</b> (char X = ''A''; X &lt;= ''Z''; X ++) {<br>    cout &lt;&lt; &quot;We processed character: &quot; &lt;&lt; X &lt;&lt; endl;<br>    if (X == ''P'') X += 5;<br> }</font><br><br>
Looking at the beginning of the loop, we see the repetition for all the characters of the uppercase alphabet, but 5 characters are skipped inside the loop.<br>', '39', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('141', '12.1.1 The break command', 'The <b>break</b> command allows you to end the loop. This means that anywhere within the loop body, it is possible to jump behind the loop and avoid further repetitions.<br>
The <b>break</b> statement has already been mentioned by the switch statement. Its meaning was the same – to terminate the command and jump beyond its end.<br>
The <b>break</b> command is one of the program jump commands. The principles of good programming practice do not allow the jump command because it always interferes with the clarity of the program.<br>
Thus, the break statement should be always avoided. It is usually seen as a dirty trick. It presents potential bugs and makes looping unclear. If we write a conditional loop, it should be clear from its condition when the loop works and when exactly it will stop repeating. Similarly, for the for loop, we should determine how many times the loop body is repeated from the notation in parentheses. In both cases, the existence of a break statement in the loop body completely disrupts this information.<br>
Example:<br>
Suppose we are to sum up the sequence of the input values ending with zero. However, it may happen that the sum exceeds 10,000, in which case we should stop reading and addition. We can use &quot;dirty trick&quot; with break command:<br>
<br><font face=''code''><b>int</b> Sum = 0, Value;<br> cin &gt;&gt; Value;<br> <b>while</b> (Value != 0) {<br>    Sum += Value;<br>    <b>if</b> (Sum &gt;= 10000) <b>break</b>;<br>    cin &gt;&gt; Value;<br> }</font><br><br>
However, we can also write the correct loop condition and avoid the annoying break statement:<br>
<br><font face=''code''><b>int</b> Sum = 0, Value;<br> cin &gt;&gt; Value;<br> <b>while</b> (Value != 0 <b>and</b> Sum &lt;= 10000) {<br>    Sum += Value;<br>    cin &gt;&gt; Value;<br> }</font><br><br>', '40', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('142', '12.1.2 The continue statement', 'The <b>continue</b> command causes the loop body to end and jump to a new loop. Similar to undesirable use of the <b>break</b> statement, the continue statement is equally undesirable. <br>
Example: We should sum the values of the input numbers ending with zero. However, if there are 10 between the numbers, we should not include it in the sum.<br>
<br><font face=''code''>int Cur, Sum = 0;<br> cin &gt;&gt; Cur;<br> while (Cur != 0) {<br>    if (Cur == 10) {cin &gt;&gt; Cur; continue;} <i>// jump to next cycle</i><br>    Sum += Cur;<br>    cin &gt;&gt; Cur;<br> }</font><br><br>
The loop body is divided into two parts by the continue statement. The part before the <b>continue</b> statement is always executed, while the part after the <b>continue</b> statement is executed only if the condition is not met. This can cause unwanted effects because the loop body commands are not executed in the same number of times.<br>
The continue statement can always be avoided by using a more understandable structure, such as:<br>
<br><font face=''code''><b>int</b> Cur, Sum = 0;<br> cin &gt;&gt; Cur;<br> <b>while</b> (Cur != 0) {<br>    <b>if</b> (Cur != 10) Sum += Cur;<br>    cin &gt;&gt; Cur;<br> }</font><br><br>', '41', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('143', '13.1.1 Subroutines', 'Each program consists of smaller parts called subroutines. Subroutines are defined as a logically integrated parts of a program that have a clearly defined activity and communicate with the environment in a known manner. For example, the subroutine is log function or main function.<br>
Subroutines can be logically divided into functions and procedures. A function is a subroutine that returns a value and that is processed further. A procedure is a subroutine that does not result in a single value, but the result is a processed algorithm.<br>
In C / C ++ language, procedures and functions are technically defined in the same way, differing only in expressing the output value. It is often said that there are only functions.<br>
In addition to the procedures and functions that are already done and can only be used, the programmer can create his own. The definition of own function is as follows:<br>
<br><font face=''code''>&lt;type&gt; &lt;identifier&gt; (&lt;parameters&gt;) { &lt;body&gt; }</font><br><br>
The type is any data type except array (see later). The identifier is a name of function. Parameters are given in parentheses, these are the variables that the function communicates with the environment. The curly brackets list the commands that prescribe what a function / procedure does.<br>
The function data type determines the type of value that the function calculates and returns. It''s called a return value. If we want to define a procedure, we will use a special type of void.<br>
There is a special return statement inside the function body. This command terminates the function and defines the return value. A function that returns a value must have that statement. A procedure that does not return a value does not contain a return statement. A return statement is similar to a break statement that forcibly terminates a cycle. The return statement forcibly terminates the execution of function statements. For the sake of clarity and clarity of the function body, the return statement should always be written as the last command in the function body.<br>
Small example: We will declare a function which returns a less value from its two parameters:<br>
<br><font face=''code''><b>int</b> min(int a, b) {<br>    <b>if</b> (a &lt; b) <b>return</b> a;<br>    <b>else return</b> b;<br> }</font><br><br>
We see that the return value of the function is of the int type, the function is called min and has two parameters of type int: a and b. In the function body, it is determined which value of the two parameters is smaller, this value is then used as the output value using the return statement.<br>
If we want to use this feature, we''ll call it in any expression, such as:<br>
<br><font face=''code''><b>int</b> first, second;<br> cin &gt;&gt; first &gt;&gt; second;<br> cout &lt;&lt; &quot;The smaller value is: &quot; &lt;&lt; min(first, second) &lt;&lt; &quot;.&quot; &lt;&lt; endl;</font><br><br>', '42', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('144', '13.1.2 Subroutine parameters', 'The subroutine parameters can be imagined as variables to be used in the subprogram body for processing and calculation. These parameters are called formal parameters. When the subroutine is called up, the specific values with which the subroutine is to work are put in place. These parameters are called actual parameters.<br>
At the time of the subroutine call, the actual parameter values are copied to the formal parameter locations. This process is called a value call. If we change the value of a parameter within the subroutine body, the actual value does not change.<br>
If the function does not have any parameters, we must write empty parentheses in the definition. However, the parameters express the subroutine communication with the environment. So if we don''t specify any parameters, it''s suspicious because it''s not clear how the subroutine will communicate.<br>', '43', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('145', '13.1.3 Local and global variables', 'Suppose we have an integer variable X. Then we define a function in which we have the variable X again. Let''s look at the following code of whole program:<br>
<br><font face=''code''>#include &lt;iostream&gt;<br> <b>using namespace</b> std;<br> <b>int</b> MyFunc(<b>int</b> a, <b>int</b> b) {<br>   <b>int</b> X;<br>   <b>for</b> (X=1; X&lt;=b; X++) a *= b;<br>   <b>return</b> a;<br> }<br> <b>int</b> main() {<br>   <b>int</b> X=5;<br>   cout &lt;&lt; MyFunc(2, 3) &lt;&lt; endl;<br>   cout &lt;&lt; &quot;Variable X = &quot; &lt;&lt; X &lt;&lt; endl;<br>   <b>return</b> 0;<br> }</font><br><br>
What will appear on the output? The correct answer is:<br>
<br><font face=''code''>54<br> 5</font><br><br>
The value of 54 is the multiplication of 2 * 3 * 3 * 3. The value of 5 is the original value of the variable X that was declared in the main program. The variable X, which is declared inside the MyFunc function, is called local because it applies only within this function. Because it is named the same as the X variable that is declared in the main program, it covers it and the X variable from the main program becomes unavailable in MyFunc.<br>
The term local variable is called a variable that is defined in a given function. However, we can work with all the variables that are defined in the parent functions unless they have the same names as the local variables. Then we call such variables global.<br>', '44', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('146', '13.1.4 Function main', 'Among all subroutines, the main function plays a special role. It represents the main program, that is, what is run after translation into machine code and what it communicates with the operating system. Like all other subroutines, the main function can communicate through parameters and return a value.<br>
What are the actual parameters of the main function and what does it return?<br>
After the program is translated, an executable code is created. This can be started by calling from the command line. Like other commands, a compiled program can accept parameters from the command line, ie, strings written on the command line after the executable file name.<br>
For this reason, main has two parameters: the first is integer and tells how many parameters have been specified from the command line. The second is a pointer to the strings (to be discussed later) and allows you to work with the values of each parameter from the command line. Example:<br>
<br><font face=''code''><b>int</b> main (<b>int</b> NumPar, char** ArrayPar) {<br>    cout &lt;&lt; &quot;This program was executed with &quot; <br>         &lt;&lt; NumPar &lt;&lt; &quot; parameters.&quot; &lt;&lt; endl;<br>    <b>return</b> 0;<br> }</font><br><br>
After compilation and execution from the command line, the program writes out how many parameters were specified at the command line startup. We can work with the values of individual parameters using a string array (to be discussed later).<br>
The return value of the main function returns to the operating system and can process this value. The value is stored in an environment variable named &quot;$?&quot;. It is normal that the output value 0 indicates a successful execution of the program, the nonzero value indicates various error states (e.g., no file found, division by zero, etc.).<br>', '45', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('147', '13.1.5 Forward subroutine definition', 'A subprogram can be defined in two places. This is called forward definition. First, the header is specified and then any time later, the subroutine body is added to the repeated header. For example, we need this property to call subroutines: the subroutine A calls the subroutine B and the subroutine B in turn calls the subroutine A.<br>
The second situation where we use the forward definition is to insert a subroutine into another subroutine. For example, we have a function to calculate the integral of a real function F. We define this function inside a function for calculating the integral, see example:<br>
<br><font face=''code''><b>float</b> Integral(<b>float</b> A, <b>float</b> B){  <i>// function for calculate the integral</i><br>    <b>float</b> result, X;<br>    <b>float</b> F(<b>float</b> X);  <i>// integrand; forward definition</i><br>    result = (F(A) + F(B)) / 2;<br>    <b>for</b> (X=A; X&lt;=B; X+=0.01) result += F(X);<br>    result *= 0.01;<br>    <b>return</b> result;<br> }<br> <b>float</b> F(<b>float</b> X){  <i>// definition of body of forwarded function</i><br>    <b>return</b> 2 * sin(X - M_PI * 0.33) + 1.271;<br> }</font><br><br>', '46', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('148', '14.1.1 Why array? How array?', 'Why array?<br>
We often need to process several (many) values of the same data type. To do this, we need the appropriate number of variables. However, it would be very inconvenient if we had to declare and process the entire set of variables separately. Therefore, we can make one variable with multiple folders. Such a variable with multiple folders of the same type is called an array. Individual components are distinguished by serial numbers, which we call indexes.<br>
The indexes always start with zero, so for example a ten-component array has indexes of 0 to 9.<br>
How array?<br>
If we want to declare a field, we use the same method as when declaring a simple variable, just add the required number of folders to the square brackets. For example, a five-element array of Payments composed of integer folders will be declared:<br>
<br><font face=''code''><b>int</b> Payments[5];</font><br><br>
We get an array whose components will have indexes 0 through 4.<br>
Similar to simple variables, you can insert an initial value directly into a field when declaring it. However, it is necessary to use a slightly different syntax here. Values inserted into individual folders must be written in a list enclosed in curly braces separated by commas, for example:<br>
<br><font face=''code''><b>int</b> Payments[5] = {100, 80, 300, 250, 140};</font><br><br>', '47', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('149', '14.1.2 The use of an array', 'If we want to work with a variable, we write its identifier. If we want to work with individual array components, we write the index of the component to the array identifier in square brackets. An index can also be entered in the form of an expression that is first calculated and then used to access that folder. Suppose declaration of Payments array:<br>
<br><font face=''code''><b>int</b> Payments[5];</font><br><br>
Examples:<br>
<br><font face=''code''>Payments[3] = 100;<br> <b>int</b> m = 0;<br> Payments[m+3] = Payments[m+2] - 5;</font><br><br>
Very often, all field components are handled, and the for loop command fits perfectly. For example, a listing of all field components together with their indexes can be written:<br>
<br><font face=''code''><b>for</b> (<b>int</b> i=0; i&lt;5; i++) cout &lt;&lt; i &lt;&lt; &quot;: &quot;&lt;&lt; Payments[i] &lt;&lt; endl;</font><br><br>
Note that the variable i passes through the indexes from zero to 4. When declaring the array, we specify the number of folders, which is always 1 greater than the value of the last index.<br>', '48', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('150', '14.1.3 Array data type', 'It is very advantageous to use an array if we create its data type in advance. We can then simplify some manipulations, such as declaring totally identical arrays at different locations or passing such arrays as subroutine parameters.<br>
As mentioned earlier, it is possible to define custom data types using the typedef keyword. In the case of an array data type definition, it is necessary to add a number of array items into the type definition, for example:<br>
<br><font face=''code''><b>typedef float</b> Enterprises [10];</font><br><br>
We get a data type that we can use to declare multiple identical arrays:<br>
<br><font face=''code''>Enterprises Salaries, Profits = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};</font><br><br>', '49', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('151', '14.1.4 Index checking', 'Indexes are used to access array folders. Arrays can always be indexed from zero. When declare an array, the number of entries M is specified. If you use an index outside of 0 to M to access the array entry, the compiler does not check that the index does not belong to that array. Therefore, it is always necessary to check whether the index is correct or not.<br>
If we access an array item outside the specified range, we can read the contents of the memory that is behind the allocated array. But we can also modify this memory, which can lead to very tricky and unexpected errors, which only occur under certain circumstances and are very difficult to find.<br>
', '50', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('152', '14.1.5 Size of an array', 'The sizeof function is used to determine the size of a variable in the computer''s memory. If we want to determine the size of the array, we can use this function. If we want to find out how many components an array has, we have to divide the result by the size of one component. In this case, it is advantageous if user data types are defined for both the array and its components.<br>
For example:<br>
<br><font face=''code''>  <b>typedef int</b> Value;<br>   <b>typedef</b> Value TValues[15];</font><br><br>
Then we can write:<br>
<br><font face=''code''>  cout &lt;&lt; &quot;Number of items is &quot;&lt;&lt; sizeof(TValues) / sizeof(Value) &lt;&lt; endl;</font><br><br>', '51', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('153', '14.1.6 Enumerated data type', 'The enumeration type (enum) is a subset of an integer type. Its values are named identifiers, so each value can be very clearly understood in the program. For example, while an integer 5 used in a condition or an expression does not give an idea, if we write Friday instead of 5, it is clear that it is the day of the week.<br>
Definition of enum data type:<br>
<br><font face=''code''>typedef enum {<br>     Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;<br> } TWeek;</font><br><br>
The values are automatically numbered from zero. However, we can assign an arbitrary number to each value, so values don''t have to go in the order in which they are written. For example:<br>
<br><font face=''code''>typedef enum {<br>    red = 0xFF0000,<br>    green = 0x00FF00,<br>    blue = 0x0000FF,<br>    white = 0xFFFFFF,<br>    black = 0x000000;<br> } TRGBColors;</font><br><br>
Enum type values cannot be read from standard input and identifiers are not output. By output is displayed only their integer representation.<br>
Because the enum type is a subset of an integer type, it can also be used for array indexing.<br>', '52', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('154', '15.1.1 An array as an item', 'C / C ++ knows only one-dimensional arrays. However, the array component can be an array too, then you can get multidimensional arrays. The declaration is:<br>
<br><font face=''code''><b>double</b> Matrix[10][12];</font><br><br>
This gives you 12-item array where each item has ten int-type items. Note that adding an next index will create an array of items that consist of the previous array.<br>
We can do it in another way that is more flexible and clearer. We will use type definitions and constant definitions (the constants will be mentioned later):<br>
<br><font face=''code''><b>const int</b> NumCols = 10;  <i>// number of columns</i><br> <b>const int</b> NumRows = 12; <i>// number of rows</i><br> <b>typedef double</b> TRow [NumCols];  <br>     <i>// type definition of the row of matrix as an array of double</i><br> <b>typedef</b> TRow TMatrix [NumRows];  <br>     <i>// type definition of whole matrix as an array of rows</i><br> TMatrix Matrix;  <i>// declaration of matrix variable</font></i><br><br>
In this shape, we can change the size of a matrix at any time by simply changing constants, which is very flexible. The constants can be further used whenever we refer to the dimensions of a matrix (reading elements, listing elements).<br>', '53', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('155', '16.1.1 Strings', 'Typical programs contain two categories of data – numbers and character strings. These elements then build other structures. Numeric data types have already been discussed, now we look at character strings.<br>The character string is implemented in most languages as a kind of array whose components are individual characters. The data type for characters has already been specified – this is char (unsigned char).<br>Like numeric value arrays, we can construct an array of character values:<br>
<br><font face=''code''>
<b>char</b> Name[35];<br>
</font><br>
This will give you an array of up to 35 characters, with each character you can manipulate using the appropriate index.<br>
However, a string is not exactly the same as a character array, but is different in several respects. Each character string must have its current length specified. If we have a Name variable that can store up to 35 characters, we would work with unoccupied folders when saving a specific name less than 35 positions. Therefore, the end of the string is indicated by a special zero character. Strings of this type are called null-terminated. Therefore, when determining the length of a string, we always have to assume that there is one extra character.<br>In order not to determine exactly how many items the character array has, we can make a declaration when the number of items is determined by the value entered:<br>
<br><font face=''code''>
<b>char</b> Address[] = "Rodeo Drive, Holywood";<br>
</font>', '54', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('156', '16.1.2 Char array and operations', 'To work with a character array, there are operations stored in the standard string.h library. If we want to use this library in C++ language, it is available under the name cstring, so we can write<br>
<br><font face=''code''>#include &lt;cstring&gt;</font><br><br><b>Functions</b><br>
&nbsp;&nbsp;▪&nbsp;&nbsp; strlen(s) – integer function for determination of length of string s (i.e. the number of characters without end null character);<br>
&nbsp;&nbsp;▪&nbsp;&nbsp; strcpy(dest, source) – function copies string source into string dest;<br>
&nbsp;&nbsp;▪&nbsp;&nbsp; strchr(str, ch) – this function searches character ch in string str and returns pointer to first position of character ch. If the character is not found, this function returns NULL; <br>
&nbsp;&nbsp;▪&nbsp;&nbsp; strstr(str, substr) – this function searches substring substr in string str. The result is similar to strstr function;<br>
&nbsp;&nbsp;▪&nbsp;&nbsp; strcmp(s1, s2) – integer function compares strings s1 and s2. The result of this function is negative number if s1&lt;s2, result 0 is returned if s1==s2 and positive number otherwise.<br>', '55', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('157', '16.1.3 Strings in C++', 'An array of characters still has an array behaviour, so we can''t simply do a number of useful operations. For example, we have the following code:<br>
<br><font face=''code''><b>char</b> Name[20];<br> Name = &quot;Smith&quot;; <i>// an error will be reported here</font></i><br><br>
We get an error because the Name variable is of type char [20] and we try to assign a value of type const char [6] on the right side of assignment.<br>
Therefore, C++ language has a std library that implements the string data type. So code:<br>
<br><font face=''code''>std::string Name;<br> Name = &quot;Smith&quot;;</font><br><br>
implements variable Name which can be processed both as an array of characters and as a while string. If we use the using namespace std construction, which we normally do for standard input and output, we don''t have to write std::string, but just a string.<br>', '56', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('158', '16.1.4 Data type string and operations', 'The string data type available in C ++ is created somewhat differently, it is implemented as an object. The objects will be discussed later, at this point we will show the operations that can be performed with the string type.<br>
Because the string data type is an object, the operations are stored &quot;inside&quot; it and are available through the variable name and period. Thus, syntax is completely different from the operations that were shown at the character array.<br>
Suppose the following declaration:<br>
<br><font face=''code''>string SomeChars;</font><br><br>
We can then use these operations:<br>
&nbsp;&nbsp;▪&nbsp;&nbsp; SomeChars = &quot;any string&quot; – assigning of any constant value into string variable;<br>
&nbsp;&nbsp;▪&nbsp;&nbsp; SomeChars.length() – the length of string<br>
&nbsp;&nbsp;▪&nbsp;&nbsp; Concatenation with a &quot;+&quot; operator, for example: SomeChars = &quot;Paul&quot; + &quot; &quot; + &quot;Smith&quot;;<br>
&nbsp;&nbsp;▪&nbsp;&nbsp; SomeChars.clear() – deleting all characters from string variable<br>
&nbsp;&nbsp;▪&nbsp;&nbsp; SomeChars.find(&quot;Sm&quot;) – find a position of string &quot;Sm&quot; in variable SomeChars. If the substring is not found, the result of this function is number greater than maximum number of characters (i.e. value greater than length()).<br>
&nbsp;&nbsp;▪&nbsp;&nbsp; SomeChars.substr(3, 5) – a substring from index 3 and of length 5. In our case this will return substring &quot;l Smi&quot;.<br>', '57', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('159', '17.1.1 Data type struct', 'Data type struct is a collection of items. Each item may be of different type. This structure wrappes its items and may be as one variable.<br>
Common shape of structure definition is:<br>
<br><font face=''code''><b>struct</b> {<br>    type item1;<br>    type item2;<br>    …<br> } identifier;</font><br><br>
For example:<br>
<br><font face=''code''><b>struct</b> {<br>    string FullName;<br>    <b>int</b> Salary;<br>    <b>float</b> Weight;<br> } MyPerson;</font><br><br>
To manipulate with items we use the dot convention:<br>
<br><font face=''code''>MyPerson.FullName = &quot;James Bond&quot;;<br> MyPerson.Salary = 1000000;<br> MyPerson.Weight = 75;</font><br><br>
It is very useful that two structures of the same type can be assigned to each other, unlike arrays. Therefore, it is useful to create a data type of the appropriate structure first and then declare variables of this type:<br>
<br><font face=''code''><b>typedef</b> <b>struct</b> {<br>    string FullName;<br>    <b>int</b> Salary;<br>    <b>float</b> Weight;<br> } TPerson;</font><br><br>
<br><font face=''code''>TPerson MyPerson, Brother, MyTeacher, MyWife; <i>// four variables</i><br> MyPerson.FullName = &quot;Jean Gabin&quot;; MyPerson.Salary = 60000;<br> MyPerson.Weight = 90; <i>// insert some values to items</i><br> Brother = MyPerson; <i>// Brother got the same values as MyPerson</i><br> Brother.FullName = &quot;Paul Gabin&quot;;</font><br><br>', '58', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('160', '17.1.2 Array of structures', 'The basic motivation for using a structure is to concentrate several different items into one variable. If we build array from such records, we can move entire records instead of individual items as needed, for example, when we need to swap itemis in sorting or searching.<br>
To create an array with records we use known process. We need for example an array of engines:<br>
<br><font face=''code''><b>typedef struct</b> {string Series; <b>int</b> Weight; <b>int</b> Distance;} TEngine;<br> <b>const int</b> MaxNumOfEngines = 75;<br> <b>typedef</b> TEngine WholeDepot[MaxNumOfEngines];</font><br><br>
Example of engine array usage: Suppose the array is filled with values and the total number of engines is in the ActualNumOfEngines variable. Put the engine with the smallest weight into the Shunting variable:<br>
<br><font face=''code''>TEngine Shunting; <b>int</b> ActualNumOfEngines = 58;<br> <b>int</b> MinW=0;<br> <b>for</b> (<b>int</b> i=1; i&lt;ActualNumOfEngines; i++)<br>    <b>if</b> (WholeDepot[i].Weight&lt;WholeDepot[MinW].Weight) MinW = i;<br> Shunting = WholeDepot[MinW];</font><br><br>', '59', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('161', '17.1.3 Bit array', 'Structure items can have one more meaning - they can be used to determine what space to display. It is advisable that the sequence of items forms integral bytes. The number of bits on which the item is to be displayed is written per colon for each item. For example, have the following definitions:<br>
<br><font face=''code''>  <b>typedef enum</b> {woman, man} TSex;<br>   <b>typedef enum</b> {nonsmoker, smoker} TSmoker;<br>   <b>typedef enum</b> {student, teacher} TRole;<br>   <b>typedef enum</b> {driver, nodriver} TDriving;</font><br><br>
Now we will create a structure that will contain some data, but will store it in a minimal space:<br>
<br><font face=''code''>  <b>typedef struct</b> {<br>     TSex Sex:1;<br>     TSmoker Smokes: 1;<br>     TRole Role: 1;<br>     TDriving Driver: 1;<br>     int NumChild: 4;<br>   } TPerson;</font><br><br>
This structure takes up only 8 bits in memory, ie one byte, and 5 information is stored on it. So we can easily work with the individual bits of the respective byte, for example:<br>
<br><font face=''code''>  TPerson MyWife; <i>// one byte of memory</i><br>   MyWife.Sex=woman;<br>   MyWife.Smokes=smoker;<br>   MyWife.Role=teacher;<br>   MyWife.Driver=driver;<br>   MyWife.NumChild=2;</font><br><br>', '60', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('162', '18.1.1 The union – principle', 'The union data type is very similar to the structure (struct data type), the difference is in the way the items are stored in memory. For the struct type, items are placed one after the other in the order they were written in the type definition. For union, all items are located starting with the same memory address, that is, they share the same memory space. What good is this way for? We assume that we always need only one option for real data. The rest of items, therefore, does not take up unnecessary memory. Type definition is like the struct definition, but the keyword struct is replaced by keyword union:<br>
<br><font face=''code''><b>typedef union</b> {<br>    <b>int</b> intnumber;<br>    <b>double</b> realnumber;<br>    <b>char</b> txt[7];<br> } TNumbers;</font><br><br>
For example, we need to store locomotive parameters. For each type of locomotive, however, we need something different – for the steam locomotive the heating surface of the boiler, for the diesel locomotive the number of engine cylinders and for the electric locomotive the voltage in the power system. For example, if we have an array of such records, each field entry may contain a record of another locomotive type, but unused items will not occupy any additional space. Lets define such structure:<br>
<br><font face=''code''><b>typedef enum</b> {steam, diesel, electric} TTypeLok;<br> <b>typedef union</b> {<b>single</b> Boiler; <br>     <b>int</b> Cylinders; <br>     string PowerType;<br> } TLokParam;<br> <b>typedef struct</b> {string Label;<br>     <b>float</b> Weight;<br>     TTypeLok Traction;<br>     TLokParam LocoPar;<br> } TLocomotive;<br> <b>const int</b> MaxNumLoco = 150;<br> <b>typedef</b> TLocomotive TDepot[MaxNumLoco];</font><br><br>
Note that we have placed locomotive-bound traction parameters in a structure where there are other components common to all types, as well as a component that lists the locomotive type. This folder is called the distinguishing folder because it can be used to tell which of the union folders is valid. Typically, the distinguishing component is defined as an enumeration or an integer.<br>', '61', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('163', '19.1.1 Pointer', 'The pointer represents the address in the computer''s memory. It is used for many purposes and to manage pointers is one of the basic skills in writing programs.<br>
The pointer definition is very simple – the asterisk character is given before the variable name.<br>
Pointer declaration example:<br>
<br><font face=''code''><b>int</b> *ptrint;</font><br><br>
We can also define a new pointer type. Note that the asterisk is written after data type, for example<br>
<br><font face=''code''><b>typedef float</b> *tdataptr;</font><br><br>
Pointers allow you to work with addresses in memory, which in some cases is very important for optimizing memory usage and optimizing data access.<br>', '62', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('164', '19.1.2 Operations with pointers', 'The pointer (address) of variable itself is not useful, but is important to use this address to access the variable located at that address. If P is a variable of type pointer, then *P allows you to work with a variable whose address is in P.<br>
How to get a variable address?<br>
1. The address of the variable in memory is automatically assigned by the compiler when declaring the variable. We do not normally need this address because we work directly with the variable through its identifier. The variable is created at the time of declaration and expires with the end of the block in which it is declared. The address of such a variable can be obtained by the unary operator &amp; written before the variable identifier. The operator &amp; will be discussed later, see the Reference. This is the first way to get an address. For example:<br>
<br><font face=''code''><b>float</b> MyData;  <i>// the address of MyData was given by the compiler</i><br> <b>float</b> *AddrData; <i>// pointer to float data type</i><br> AddrData = &amp;MyData;  <i>// address of MyData is stored to pointer AddrData</i><br> *AddrData = 4.5;  <i>// store data to variable of address of MyData;</i><br> cout &lt;&lt; MyData &lt;&lt; endl; <i>// will be displayed 4.5</font></i><br><br>
2. The second way to get an address is quite different. In the previous case, we worked with the address assigned by the compiler at the usual variable declaration. We can use this variable throughout the block in which it is declared. However, if we no longer need it, we cannot release it from our memory. The second option is a system where memory is allocated only when the variable is needed and can be released at any time. These are dynamic memory allocation and dynamic variables. For dynamic variables, a completely different memory space is used than for non-dynamic variables. Typically, this block has a much larger size than the memory block for the declared variables. So it is natural that we try to place the data in dynamic variables.<br>
The dynamic variable address assignment is made by the new operator:<br>
<br><font face=''code''><b>float</b> *AddrData;  <i>// declaration of dynamic variable</i><br> AddrData = <b>new float</b>; <i>// memory allocation and assignment of new address</i><br> *AddrData = 18.78; <i>// the use of dynamic variable</font></i><br><br>
When allocating memory, we can also assign an initial value:<br>
<br><font face=''code''>AddrData = <b>new float</b>(18.78);</font><br><br>
We can allocate memory for the array. At the time of allocation, we can specify the required number of field items:<br>
<br><font face=''code''><b>typedef int</b> TMyData;  <i>// data type of array items</i><br> TMyData *ActValues;  <i>// pointer to array item</i><br> ActValues = <b>new</b> TMyData[52];  <i>// allocation of array with 52 items</font></i><br><br>
3. We can assign an address constant. We have only one constant for pointers of all types. This constant is NULL and represents an empty pointer (pointer which points nowhere). We''ll use this pointer wherever we want to provide an empty address that we can test.<br>
<br><font face=''code''>AddrData = NULL;</font><br><br>', '63', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('165', '19.1.3 Deallocating of memory', 'The delete operator is used to free memory and remove the dynamic variable.<br>
<br><font face=''code''><b>delete</b> AddrData;<br> <b>delete</b> [] ActValues;</font><br><br>
To remove array from memory, you have to write brackets after keyword <b>delete</b>.<br>
After deallocating of memory is recommended to assign free pointer with constant NULL. We can then simply detect that this pointer is no longer valid.<br>
Deallocating of memory is very important operation. When the memory is released, we can allocate the same space in next step of program. <br>
Because the process of allocating and freeing memory is random, it is possible that the free blocks are still shrinking in memory. If we do not release a variable but lose a pointer to it, the block will become inaccessible but will remain in memory and cannot be released. This situation is called a memory leak.<br>
Typical error:<br>
<br><font face=''code''><b>int</b> *p;<br> p = <b>new int</b>;<br> <i>// … using p …</i><br> p = <b>new int</b>; <i>// old address is replaced by new one!</font></i><br><br>
The old address is no longer accessible and first allocated block remains in a memory.<br>', '64', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('166', '19.1.4 Dynamic data structures', 'We will discuss the relationship between the array and the dynamic variables later, now we will look at structures that are not dependent on how many elements we need, but we can always only create as many as we are currently processing. The basic structure is a linear one-way dynamic list.<br>
The list element is a dynamic variable that contains two items – data and a pointer to another such value:<br>
<br><font face=''code''><b>struct</b> Node {<br>    <b>float</b> Data;<br>    Node *Next;<br> };</font><br><br>
If we want to insert data into such a structure, we create an instance in memory and then insert the necessary values into individual items:<br>
<br><font face=''code''><b>typedef</b> Node* NodePtr;  <i>// data type for pointer to Node</i><br> NodePtr FirstNode;<br> FirstNode = <b>new</b> NodePtr;<br> cin &gt;&gt; (*FirstNode).Data;  <i>// data from input is inserted to the structure</i><br> (*FirstNode).Next = NULL;  <i>// next node doesn''t exists</font></i><br><br>
To access structure items, we need both an asterisk to dereference the pointer and a period that selects the appropriate item. However, the asterisk does not have enough priority to be associated with dereference, so it must be in conjunction with the variable name in brackets (* FirstNode) .Data. This syntax can be simplified by a special operator &quot;-&gt;&quot; to the form FirstNode-&gt; Data.<br>
Suppose we have one node with data inserted after previous commands. Now we want to make the second node and connect it to the first. There are two ways to do this: to link the second node after the first node, or the second node to link the first node.<br>
We create a new node. For this we need a second pointer because we must not lose the address of the first node.<br>
<br><font face=''code''>NodePtr AuxPtr;<br> AuxPtr = <b>new</b> NodePtr;<br> cin &gt;&gt; (*AuxPtr).Data;  <i>// insert new data from input to the new structure</i><br> (*AuxPtr).Next = FirstNode;  <i>// old node is linked to new node</i><br> FirstNode = AuxPtr;  <i>// the list have two nodes: the new node is as first and old as second</font></i><br><br>
If we repeat these steps, we will gradually get the new nodes to the top of the list and get the data in reverse order.<br>
To link the second node after the first we can write:<br>
<br><font face=''code''>(*FirstNode).Next = AuxPtr;</font><br><br>
Suppose we already have several nodes in the list and want to add a new node to the end:<br>
<br><font face=''code''>AuxPtr = FirstNode;<br> <b>while</b> ((*AuxPtr).Next!=Null) AuxPtr=(*AuxPtr).Next;  <i>// to find the end</i><br> (*AuxPtr).Next = <b>new</b> NodePtr;  <i>// create a new node and link to the last one</i><br> AuxPtr = (*AuxPtr).Next;  <i>// AuxPtr points the new node</i><br> cin &gt;&gt; (*AuxPtr).Data;  <i>// new data from input to the new node</i><br> (*AuxPtr).Next = NULL;  <i>// this is the end of list</font></i><br><br>
If we add new nodes to the list, the list acts as a stack. If we add to the end, we get the list as a queue.<br>', '65', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('167', '19.1.5 Pointer void*', 'The pointers we used were associated with the dynamic variable data type. So, if you needed to allocate memory, the compiler knew exactly how much memory to allocate and how it would work with dynamic variable.<br>
A special data type is void, it is an empty type. When we make a pointer to void, the compiler does not know what variable it will be, but knows that it is a pointer. We call this pointer a general pointer.<br>
For example, we can create a linear list whose data component can be anything – we make it as a general pointer. We can then use such a list for any data or we can store something else on each node.<br>
If we are working with a dynamic variable that is referenced by a general pointer, we must type cast the data with the appropriate data type, giving the compiler the necessary information to perform the operation.<br>
We use for example general linear list:<br>
<br><font face=''code''><b>typedef struct</b> Node {<br>      <b>void</b> *Data;<br>      Node *Next;<br> } Node;<br> <b>typedef</b> Node* NodePtr;<br> NodePtr Top;</font><br><br>
If we want to add a value to such a list, we will create a dynamic variable of any type, and then insert that pointer as data:<br>
<br><font face=''code''><b>float</b> *CurData = <b>new</b> float;<br> cin &gt;&gt; *CurData; <i>// dynamic variable with inserted number as a data</i><br> Top = <b>new</b> NodePtr;<br> Top-&gt;Data = CurData; <i>// store pointer to node</font></i><br><br>
Note that each pointer can be converted to void* but not vice versa. The reverse conversion requires type casting. So if we get the original value from the list later, we have to write:<br>
<br><font face=''code''>CurData = (<b>float</b>*)Top-&gt;Data;</font><br><br>', '66', '2');
INSERT INTO public.lesson (id, name, content, ordinal_number, topic_id) VALUES ('168', 'FINISHED', '', '67', '2');

-- -------------------------------------------------------------------------
-- todo NODES
-- -------------------------------------------------------------------------
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('1', '0', '1', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('2', '1', '2', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('3', '1', '3', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('4', '1', '4', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('5', '1', '5', 'False', 'False', '1', '1');
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
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('102', '1', '102', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('103', '2', '103', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('104', '3', '104', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('105', '4', '105', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('106', '5', '106', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('107', '6', '107', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('108', '7', '108', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('109', '8', '109', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('110', '9', '110', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('111', '10', '111', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('112', '11', '112', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('113', '12', '113', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('114', '13', '114', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('115', '14', '115', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('116', '15', '116', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('117', '16', '117', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('118', '17', '118', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('119', '18', '119', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('120', '19', '120', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('121', '20', '121', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('122', '21', '122', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('123', '22', '123', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('124', '23', '124', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('125', '24', '125', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('126', '25', '126', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('127', '26', '127', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('128', '27', '128', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('129', '28', '129', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('130', '29', '130', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('131', '30', '131', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('132', '31', '132', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('133', '32', '133', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('134', '33', '134', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('135', '34', '135', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('136', '35', '136', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('137', '36', '137', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('138', '37', '138', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('139', '38', '139', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('140', '39', '140', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('141', '40', '141', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('142', '41', '142', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('143', '42', '143', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('144', '43', '144', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('145', '44', '145', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('146', '45', '146', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('147', '46', '147', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('148', '47', '148', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('149', '48', '149', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('150', '49', '150', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('151', '50', '151', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('152', '51', '152', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('153', '52', '153', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('154', '53', '154', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('155', '54', '155', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('156', '55', '156', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('157', '56', '157', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('158', '57', '158', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('159', '58', '159', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('160', '59', '160', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('161', '60', '161', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('162', '61', '162', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('163', '62', '163', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('164', '63', '164', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('165', '64', '165', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('166', '65', '166', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('167', '66', '167', 'False', 'False', '1', '1');
INSERT INTO public.node (id, level, lesson_id, walk_through, successfully_completed, level_depth, question_depth) VALUES ('168', '100', '168', 'False', 'False', '1', '1');

-- -------------------------------------------------------------------------
-- TODO QUESTIONS
-- -------------------------------------------------------------------------
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1', '&nbsp;●&nbsp;Zvoleno téma Matematika.<br>Chceš pokračovat?', '1', '0', '0', '1');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('11', '&nbsp;●&nbsp;Vypočtěte 5 + 3 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('12', '&nbsp;●&nbsp;Vypočtěte 12 + 7 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('13', '&nbsp;●&nbsp;Vypočtěte 20 + 15 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('14', '&nbsp;●&nbsp;Vypočtěte 8 + 6 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('15', '&nbsp;●&nbsp;Vypočtěte 14 + 9 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('16', '&nbsp;●&nbsp;Vypočtěte 25 + 10 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('17', '&nbsp;●&nbsp;Vypočtěte 30 + 20 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('18', '&nbsp;●&nbsp;Vypočtěte 7 + 5 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('19', '&nbsp;●&nbsp;Vypočtěte 18 + 4 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('20', '&nbsp;●&nbsp;Vypočtěte 11 + 11 = ...', '0', '1', '0', '2');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('21', '&nbsp;●&nbsp;Vypočtěte 10 - 3 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('22', '&nbsp;●&nbsp;Vypočtěte 15 - 7 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('23', '&nbsp;●&nbsp;Vypočtěte 25 - 10 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('24', '&nbsp;●&nbsp;Vypočtěte 18 - 6 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('25', '&nbsp;●&nbsp;Vypočtěte 20 - 9 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('26', '&nbsp;●&nbsp;Vypočtěte 30 - 15 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('27', '&nbsp;●&nbsp;Vypočtěte 50 - 20 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('28', '&nbsp;●&nbsp;Vypočtěte 12 - 5 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('29', '&nbsp;●&nbsp;Vypočtěte 22 - 4 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('30', '&nbsp;●&nbsp;Vypočtěte 22 - 11 = ...', '0', '1', '0', '3');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('31', '&nbsp;●&nbsp;Vypočtěte 5 * 3 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('32', '&nbsp;●&nbsp;Vypočtěte 12 * 7 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('33', '&nbsp;●&nbsp;Vypočtěte 20 * 15 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('34', '&nbsp;●&nbsp;Vypočtěte 8 * 6 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('35', '&nbsp;●&nbsp;Vypočtěte 14 * 9 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('36', '&nbsp;●&nbsp;Vypočtěte 25 * 10 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('37', '&nbsp;●&nbsp;Vypočtěte 30 * 20 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('38', '&nbsp;●&nbsp;Vypočtěte 7 * 5 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('39', '&nbsp;●&nbsp;Vypočtěte 18 * 4 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('40', '&nbsp;●&nbsp;Vypočtěte 11 * 11 = ...', '0', '1', '0', '4');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('41', '&nbsp;●&nbsp;Vypočtěte 10 / 2 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('42', '&nbsp;●&nbsp;Vypočtěte 15 / 3 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('43', '&nbsp;●&nbsp;Vypočtěte 25 / 5 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('44', '&nbsp;●&nbsp;Vypočtěte 18 / 6 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('45', '&nbsp;●&nbsp;Vypočtěte 20 / 4 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('46', '&nbsp;●&nbsp;Vypočtěte 30 / 10 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('47', '&nbsp;●&nbsp;Vypočtěte 50 / 25 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('48', '&nbsp;●&nbsp;Vypočtěte 12 / 4 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('49', '&nbsp;●&nbsp;Vypočtěte 22 / 2 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('50', '&nbsp;●&nbsp;Vypočtěte 100 / 10 = ...', '0', '1', '0', '5');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('51', '&nbsp;●&nbsp;Vypočtěte 2 ^ 3 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('52', '&nbsp;●&nbsp;Vypočtěte 3 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('53', '&nbsp;●&nbsp;Vypočtěte 4 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('54', '&nbsp;●&nbsp;Vypočtěte 5 ^ 3 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('55', '&nbsp;●&nbsp;Vypočtěte 6 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('56', '&nbsp;●&nbsp;Vypočtěte 7 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('57', '&nbsp;●&nbsp;Vypočtěte 8 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('58', '&nbsp;●&nbsp;Vypočtěte 9 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('59', '&nbsp;●&nbsp;Vypočtěte 10 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('60', '&nbsp;●&nbsp;Vypočtěte 11 ^ 2 = ...', '0', '1', '0', '6');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('61', '&nbsp;●&nbsp;Vypočtěte √4 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('62', '&nbsp;●&nbsp;Vypočtěte √9 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('63', '&nbsp;●&nbsp;Vypočtěte √16 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('64', '&nbsp;●&nbsp;Vypočtěte √25 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('65', '&nbsp;●&nbsp;Vypočtěte √36 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('66', '&nbsp;●&nbsp;Vypočtěte √49 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('67', '&nbsp;●&nbsp;Vypočtěte √64 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('68', '&nbsp;●&nbsp;Vypočtěte √81 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('69', '&nbsp;●&nbsp;Vypočtěte √100 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('70', '&nbsp;●&nbsp;Vypočtěte √121 = ...', '0', '1', '0', '7');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('71', '&nbsp;●&nbsp;Jakou operaci vyhodnocujeme jako první v matematickém výrazu?', '1', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('72', '&nbsp;●&nbsp;Jakou operaci vyhodnocujeme jako poslední v matematickém výrazu?', '1', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('73', '&nbsp;●&nbsp;Jakou operaci vyhodnocujeme po závorkách?', '1', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('74', '&nbsp;●&nbsp;Vyřešte výraz: 8 / 4 × 2² - 4 = ...', '0', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('75', '&nbsp;●&nbsp;Vyřešte výraz: 4 / 2 × 3² - 1 = ...', '0', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('76', '&nbsp;●&nbsp;Vyřešte výraz:  (8 / 2) × (4 - 2)² = ...', '0', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('77', '&nbsp;●&nbsp;Vyřešte výraz: 9 / 3 × (2 - 1)² - 4 = ...', '0', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('78', '&nbsp;●&nbsp;Vyřešte výraz:  5 × 6 / 2 - 8 ²/ 4 = ...', '0', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('79', '&nbsp;●&nbsp;Seřaďte podle pořadí vyhodnocování: [[1]] [[2]] [[3]] [[4]]', '2', '1', '0', '8');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('81', '&nbsp;●&nbsp;Je operace sčítání komutativní?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('82', '&nbsp;●&nbsp;Je operace násobení komutativní?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('83', '&nbsp;●&nbsp;Je operace odčítání komutativní?', '1', '1', '0', '13');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('84', '&nbsp;●&nbsp;Je operace dělení komutativní?', '1', '1', '0', '15');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('85', '&nbsp;●&nbsp;Která z následujících operací je komutativní?', '1', '1', '0', '9');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('86', '&nbsp;●&nbsp;Která z následujících operací <b>není</b> komutativní?', '1', '1', '0', '9');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('87', '&nbsp;●&nbsp;Pokud platí a ⋅ b = b ⋅ a, jaká vlastnost je zde použita?', '1', '1', '0', '9');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('88', '&nbsp;●&nbsp;Který z následujících výrazů ukazuje komutativitu sčítání?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('89', '&nbsp;●&nbsp;Který z následujících výrazů ukazuje komutativitu násobení?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('90', '&nbsp;●&nbsp;Který z následujících výrazů <b>není</b> komutativní?', '1', '1', '0', '9');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('91', '&nbsp;●&nbsp;Je operace sčítání asociativní?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('92', '&nbsp;●&nbsp;Je operace násobení asociativní?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('93', '&nbsp;●&nbsp;Je operace odčítání asociativní?', '1', '1', '0', '13');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('94', '&nbsp;●&nbsp;Je operace dělení asociativní?', '1', '1', '0', '15');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('95', '&nbsp;●&nbsp;Která z následujících operací je asociativní?', '1', '1', '0', '10');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('96', '&nbsp;●&nbsp;Která z následujících operací <b>není</b> asociativní?', '1', '1', '0', '10');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('97', '&nbsp;●&nbsp;Pokud platí (a + b) + c = a + (b + c), jaká vlastnost je zde použita?', '1', '1', '0', '10');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('98', '&nbsp;●&nbsp;Který z následujících výrazů ukazuje asociativitu sčítání?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('99', '&nbsp;●&nbsp;Který z následujících výrazů ukazuje asociativitu násobení?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('100', '&nbsp;●&nbsp;Který z následujících výrazů <b>není</b> asociativní?', '1', '1', '0', '10');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('101', '&nbsp;●&nbsp;Je operace násobení distributivní vzhledem k sčítání?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('102', '&nbsp;●&nbsp;Je operace násobení distributivní vzhledem k odčítání?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('103', '&nbsp;●&nbsp;Je operace sčítání distributivní vzhledem k násobení?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('104', '&nbsp;●&nbsp;Je operace odčítání distributivní vzhledem k násobení?', '1', '1', '0', '13');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('105', '&nbsp;●&nbsp;Která z následujících operací je distributivní?', '1', '1', '0', '11');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('106', '&nbsp;●&nbsp;Která z následujících operací <b>není</b> distributivní?', '1', '1', '0', '11');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('107', '&nbsp;●&nbsp;Pokud platí a ⋅ (b + c) = a ⋅ b + a ⋅ c, jaká vlastnost je zde použita?', '1', '1', '0', '11');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('108', '&nbsp;●&nbsp;Který z následujících výrazů ukazuje distributivitu násobení vzhledem k sčítání?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('109', '&nbsp;●&nbsp;Který z následujících výrazů ukazuje distributivitu násobení vzhledem k odčítání?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('110', '&nbsp;●&nbsp;Který z následujících výrazů <b>není</b> distributivní?', '1', '1', '0', '11');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('143', '&nbsp;●&nbsp;Je operace dělení distributivní?', '1', '0', '0', '15');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('158', '&nbsp;●&nbsp;Je operace mocnina komutativní?', '1', '0', '0', '16');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('159', '&nbsp;●&nbsp;Je operace mocnina asociativní?', '1', '0', '0', '16');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('160', '&nbsp;●&nbsp;Je operace mocnina distributivní?', '1', '0', '0', '16');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('161', '&nbsp;●&nbsp;Je operace odmocnina komutativní?', '1', '0', '0', '17');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('162', '&nbsp;●&nbsp;Je operace odmocnina asociativní?', '1', '0', '0', '17');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('163', '&nbsp;●&nbsp;Je operace odmocnina distributivní?', '1', '0', '0', '17');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('171', '&nbsp;●&nbsp;Která vlastnost sčítání říká, že pořadí sčítanců nemění výsledek?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('172', '&nbsp;●&nbsp;Který z následujících výrazů je příkladem komutativní vlastnosti sčítání?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('173', '&nbsp;●&nbsp;Která vlastnost sčítání říká, že způsob seskupení sčítanců nemění výsledek?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('174', '&nbsp;●&nbsp;Který z následujících výrazů je příkladem asociativní vlastnosti sčítání?', '1', '1', '0', '12');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('191', '&nbsp;●&nbsp;Která vlastnost násobení říká, že pořadí činitelů nemění výsledek?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('192', '&nbsp;●&nbsp;Který z následujících výrazů je příkladem komutativní vlastnosti násobení?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('193', '&nbsp;●&nbsp;Která vlastnost násobení říká, že způsob seskupení činitelů nemění výsledek?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('194', '&nbsp;●&nbsp;Který z následujících výrazů je příkladem asociativní vlastnosti násobení?', '1', '1', '0', '14');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('231', '&nbsp;●&nbsp;Co je goniometrie?', '1', '1', '0', '18');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('232', '&nbsp;●&nbsp;Která z následujících funkcí je základní goniometrická funkce?', '1', '1', '0', '18');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('233', '&nbsp;●&nbsp;Která z následujících funkcí je základní goniometrická funkce?', '1', '1', '0', '18');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('234', '&nbsp;●&nbsp;Která z následujících funkcí je základní goniometrická funkce?', '1', '1', '0', '18');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('235', '&nbsp;●&nbsp;Která z následujících funkcí je základní goniometrická funkce?', '1', '1', '0', '18');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('236', '&nbsp;●&nbsp;Která z následujících funkcí <b>není</b> základní goniometrická funkce?', '1', '1', '0', '18');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('241', '&nbsp;●&nbsp;Doplň: V pravoúhlém trojúhelníku je <b>sinus</b> úhlu poměr délky [[1]] k délce [[2]].', '2', '1', '0', '19');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('242', '&nbsp;●&nbsp;Jak se počítá sin(α)?', '1', '1', '0', '19');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('243', '&nbsp;●&nbsp;Máme pravoúhlý trojúhelník s přeponou délky 5, přilehlou stanou délky 4 a protilehlou stranou délky 3.<br>Jaký je <b>sinus</b> úhlu?', '1', '1', '0', '19');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('251', '&nbsp;●&nbsp;Doplň: V pravoúhlém trojúhelníku je <b>kosinus</b> úhlu poměr délky [[1]] k délce [[2]].', '2', '1', '0', '20');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('252', '&nbsp;●&nbsp;Jak se počítá cos(α)?', '1', '1', '0', '20');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('253', '&nbsp;●&nbsp;Máme pravoúhlý trojúhelník s přeponou délky 5, přilehlou stanou délky 4 a protilehlou stranou délky 3.<br>Jaký je <b>kosinus</b> úhlu?', '1', '1', '0', '20');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('261', '&nbsp;●&nbsp;Doplň: V pravoúhlém trojúhelníku je <b>tangens</b> úhlu poměr délky [[1]] k délce [[2]].', '2', '1', '0', '21');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('262', '&nbsp;●&nbsp;Jak se počítá tan(α)?', '1', '1', '0', '21');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('263', '&nbsp;●&nbsp;Máme pravoúhlý trojúhelník s přeponou délky 5, přilehlou stanou délky 4 a protilehlou stranou délky 3.<br>Jaký je <b>tangens</b> úhlu?', '1', '1', '0', '21');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('271', '&nbsp;●&nbsp;Doplň: V pravoúhlém trojúhelníku je <b>kotangens</b> úhlu poměr délky [[1]] k délce [[2]].', '2', '1', '0', '22');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('272', '&nbsp;●&nbsp;Jak se počítá cot(α)?', '1', '1', '0', '22');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('273', '&nbsp;●&nbsp;Máme pravoúhlý trojúhelník s přeponou délky 5, přilehlou stanou délky 4 a protilehlou stranou délky 3.<br>Jaký je <b>kotangens</b> úhlu?', '1', '1', '0', '22');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('281', '&nbsp;●&nbsp;Jak se počítá sin(α)?', '1', '1', '0', '23');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('282', '&nbsp;●&nbsp;Jak se počítá cos(α)?', '1', '1', '0', '23');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('283', '&nbsp;●&nbsp;Jak se počítá tan(α)?', '1', '1', '0', '23');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('284', '&nbsp;●&nbsp;Jak se počítá cot(α)?', '1', '1', '0', '23');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('285', '&nbsp;●&nbsp;Který vzorec neplatí?', '1', '1', '0', '23');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('301', '&nbsp;●&nbsp;Jaký je vzorec pro sin(α ± β)?', '1', '1', '0', '24');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('302', '&nbsp;●&nbsp;Jaký je vzorec pro cos(α ± β)?', '1', '1', '0', '24');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('303', '&nbsp;●&nbsp;Jaký je vzorec pro tan(α ± β)?', '1', '1', '0', '24');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('304', '&nbsp;●&nbsp;Jaký je vzorec pro cot(α ± β)?', '1', '1', '0', '24');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('311', '&nbsp;●&nbsp;Jaký je vzorec pro sin(2α)?', '1', '1', '0', '25');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('312', '&nbsp;●&nbsp;Jaký je vzorec pro cos(2α)?', '1', '1', '0', '25');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('313', '&nbsp;●&nbsp;Jaký je vzorec pro tan(2α)?', '1', '1', '0', '25');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('314', '&nbsp;●&nbsp;Jaký je vzorec pro cot(2α)?', '1', '1', '0', '25');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('321', '&nbsp;●&nbsp;Jaký je vzorec pro sin(α/2)?', '1', '1', '0', '26');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('322', '&nbsp;●&nbsp;Jaký je vzorec pro cos(α/2)?', '1', '1', '0', '26');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('323', '&nbsp;●&nbsp;Jaký je vzorec pro tan(α/2)?', '1', '1', '0', '26');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('324', '&nbsp;●&nbsp;Jaký je vzorec pro cot(α/2)?', '1', '1', '0', '26');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('341', '&nbsp;●&nbsp;Jaký je vzorec pro sin(α)sin(β)?', '1', '1', '0', '27');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('342', '&nbsp;●&nbsp;Jaký je vzorec pro cos(α)cos(β)?', '1', '1', '0', '27');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('343', '&nbsp;●&nbsp;Jaký je vzorec pro sin(α)cos(β)?', '1', '1', '0', '27');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('344', '&nbsp;●&nbsp;Jaký je vzorec pro tan(α)tan(β)?', '1', '1', '0', '27');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('345', '&nbsp;●&nbsp;Jaký je vzorec pro cot(α)cot(β)?', '1', '1', '0', '27');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('346', '&nbsp;●&nbsp;Jaký je vzorec pro tan(α)cot(β)?', '1', '1', '0', '27');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('351', '&nbsp;●&nbsp;Urči hodnoty goniometrických funkcí pro α = 0:<br>sin(α) = [[1]] cos(α) = [[2]] tan(α) = [[3]] cot(α) = [[4]]', '2', '1', '0', '28');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('352', '&nbsp;●&nbsp;Urči hodnoty goniometrických funkcí pro α = π/6:<br>sin(α) = [[1]] cos(α) = [[2]] tan(α) = [[3]] cot(α) = [[4]]', '2', '1', '0', '28');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('353', '&nbsp;●&nbsp;Urči hodnoty goniometrických funkcí pro α = π/4:<br>sin(α) = [[1]] cos(α) = [[2]] tan(α) = [[3]] cot(α) = [[4]]', '2', '1', '0', '28');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('354', '&nbsp;●&nbsp;Urči hodnoty goniometrických funkcí pro α = π/3:<br>sin(α) = [[1]] cos(α) = [[2]] tan(α) = [[3]] cot(α) = [[4]]', '2', '1', '0', '28');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('355', '&nbsp;●&nbsp;Urči hodnoty goniometrických funkcí pro α = π/2:<br>sin(α) = [[1]] cos(α) = [[2]] tan(α) = [[3]] cot(α) = [[4]]', '2', '1', '0', '28');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1000', '&nbsp;●&nbsp;Programming  topic selected.<br>Do you want to continue?', '1', '0', '0', '101');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1001', '&nbsp;●&nbsp;<b>The main function</b><br>
The main function represents [[1]] of C-program. Its declaration consists of [[2]] type, identifier &quot;main&quot;, parameters and body. The body of main function contains statement for [[3]].<br>
', '2', '1', '1', '102');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1002', '&nbsp;●&nbsp;<b>Body of the main function</b><br>
The body of main function is enclosed by parenthesis.<br>
', '1', '1', '2', '102');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1003', '&nbsp;●&nbsp;<b>Parameters of the main function</b><br>
Parameters of the main function are enclosed by:<br>
', '1', '1', '3', '102');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1004', '&nbsp;●&nbsp;<b>Header files</b><br>
The header file is<br>
', '1', '1', '4', '103');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1005', '&nbsp;●&nbsp;<b>Type of header files</b><br>
Header files have two types: system and programmer made.<br>
', '1', '1', '5', '103');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1006', '&nbsp;●&nbsp;<b>The use of system header file</b><br>
The header file to come with compiler or operating system is used to write:<br>
', '1', '1', '6', '103');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1007', '&nbsp;●&nbsp;<b>The user defined header files</b><br>
The header file written by programmer is used to write<br>
', '1', '1', '7', '103');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1008', '&nbsp;●&nbsp;<b>Standard library</b><br>
For input/output operations in C++ we use:<br>
', '1', '1', '8', '105');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1009', '&nbsp;●&nbsp;<b>Simple input and output</b><br>
We want to read two values of A and B. These values represent the sides of the rectangle. We should write to output the contents and perimeter of this rectangle. Fill in appropriate parts into following code:<br>
<br><font face=''code''>#include &lt;iostream&gt;<br> <b>using namespace</b> std;<br> <b>int</b> main(){<br>    float A, B;<br>    ❶<br>    ❷<br>    <b>return</b> 0;<br> }</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]', '2', '1', '9', '106');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1010', '&nbsp;●&nbsp;<b>Variable value (Calculated question)</b><br>
What is the maximum integer decimal value of a variable occupying <b>N</b> bits in computer memory?<br>(Write the formula in C/C++ syntax without spaces.)<br>
pow(2,N)-1<br>', '0', '1', '10', '108');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1011', '&nbsp;●&nbsp;<b>Variable declaration (drag and drop)</b><br>
We want to declare two variables: Side and Radius. Data type is float. The variable Radius should have initial value 10. Fill the appropriate pieces of code:<br>
<br><font face=''code''>❶ Side, ❷;</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]', '2', '1', '11', '109');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1012', '&nbsp;●&nbsp;<b>Constant declaration (drag and drop)</b><br>
We want to declare a constant that contains the number of minutes per day. Fill in the appropriate pieces of code:<br>
<br><font face=''code''>❶ ❷ ❸ ❹;</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]
Substitute ❹ for [[4]]', '2', '1', '12', '110');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1013', '&nbsp;●&nbsp;<b>Numeric data types for integer values (matching question)</b><br>
Match appropriate data type name and its value range.<br>
unsigned char [[1]]<br>
unsigned short int [[2]] <br>
signed char [[3]]<br>
 signed short int [[4]]<br>', '2', '1', '13', '112');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1014', '&nbsp;●&nbsp;<b>Data types for real numbers</b><br>
We have three data types for real numbers in C/C++ language:<br>
', '1', '1', '14', '113');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1015', '&nbsp;●&nbsp;<b>Floating-point data types (matching question)</b><br>
Match the appropriate values:<br>
float – [[1]]<br>
double – [[2]]<br>
long double – [[3]]<br><br>', '2', '1', '15', '113');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1016', '&nbsp;●&nbsp;<b>How much memory does it take? (numerical question)</b><br>
Assume the following variable declarations:<br>
<br><font face=''code''><b>double</b> A, B = 0;<br> <b>float</b> C, D=1.2E-2;</font><br><br>
How much total memory do these variables take?<br>', '0', '1', '16', '113');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1017', '&nbsp;●&nbsp;<b>Match control characters (matching question)</b><br>
Match the appropriate values.<br>
LF – [[1]]<br>
form feed – [[2]]<br>
CR – [[3]]<br>
BEL – [[4]]<br>', '2', '1', '17', '114');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1018', '&nbsp;●&nbsp;<b>Control characters (matching question)</b><br>
Match the appropriate values:<br>
Control character for the new line – [[1]]<br>
When you want to beep you send character – [[2]]<br>
Control character for tab mark is – [[3]]<br>', '2', '1', '18', '114');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1019', '&nbsp;●&nbsp;<b>Data type conversion</b><br>
Suppose a variable X of the type short int with a value of 300. What do we get if we convert to an unsigned char?<br>
', '1', '1', '19', '116');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1020', '&nbsp;●&nbsp;<b>Expression</b><br>
Suppose we have the variable Radius with radius of sphere. We want to calculate the volume of the sphere, <br>
V = 4/3π r³<br>
Which expression will make the correct calculation?<br>', '1', '1', '20', '117');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1021', '&nbsp;●&nbsp;<b>Simple assignment</b><br>
Suppose the code:<br>
<br><font face=''code''><b>int</b> V, a = 10, b = 5, c = 9;<br> V = (a += 2) * (b -=3) * (c /= 3);<br> cout &lt;&lt; &quot;Volume = &quot;&lt;&lt; V &lt;&lt; endl;</font><br><br>
What result will we see on the screen?<br>', '1', '1', '21', '118');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1022', '&nbsp;●&nbsp;<b>Operators</b><br>
We need to calculate the following formula:<br>
y = y ⋅ 1/{i ⋅ (i-1)}<br>
Which of the following statements counts the value of this formula?<br>', '1', '1', '22', '119');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1023', '&nbsp;●&nbsp;<b>Celsius and Fahrenheit</b><br>
We need to recalculate the Celsius temperature to Fahrenheit. We know that<br>
F = 9⋅C/5+32<br>
where C is Celsius temperature. Which of following expressions correctly counts the Fahrenheit temperature?<br>', '1', '1', '23', '119');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1024', '&nbsp;●&nbsp;<b>Assignment in expression</b><br>
The engine of a particular car has 4 cylinders. What is the volume of ten such cars? The input values are the radius and height of one cylinder. Add the correct parts to the code.<br>
&nbsp;<br>
<br><font face=''code''>#include &lt;iostream&gt;<br> #include &lt;cmath&gt;<br> <b>using namespace</b> std;<br> <b>int</b> main(){<br>   float radius, height, volume;<br>   cin &gt;&gt; ❶ &gt;&gt; height;<br>   cout &lt;&lt; &quot;Volume of given cylinder is &quot; &lt;&lt;<br>      (❷) &lt;&lt; endl;<br>   cout &lt;&lt; &quot;Volume of four such cylinders is &quot; &lt;&lt; (❸) &lt;&lt; endl;<br>   cout &lt;&lt; &quot;Volume of cylinders of ten cars with the same engine is &quot;&lt;&lt;<br>      ❹ &lt;&lt; endl;<br>   <b>return</b> 0;<br> }</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]
Substitute ❹ for [[4]]', '2', '1', '24', '120');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1025', '&nbsp;●&nbsp;<b>Preincrement and postincrement</b><br>
Suppose this part of code:<br>
<br><font face=''code''><b>int</b> a = 6, b = 12, c = 4;<br>    cout &lt;&lt; a++ + --b * c++ &lt;&lt; endl;</font><br><br>
What will appear on the screen?<br>', '1', '1', '25', '121');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1026', '&nbsp;●&nbsp;<b>Input C-variant</b><br>
The following program reads two integer values and stores it into two variables MeasureA and MeasureB. <br>
<br><font face=''code''>#include ❶ <br>
<b>int</b> main(){<br>
  <b>int</b> MeasureA, ❷;<br>
  scanf(&quot;❸&quot;, ❹, ❷);<br>
  ❺ 0;<br>
}</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]
Substitute ❹ for [[4]]
Substitute ❺ for [[5]]', '2', '1', '26', '122');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1027', '&nbsp;●&nbsp;<b>Output in C-variant</b><br>
Suppose the following piece of code:<br>
<br><font face=''code''><b>int</b> A=10, B=3, C=14;<br>
printf(&quot;Values are %d.%d, more than %d times\nand %c is name of first variable.&quot;, B, A, 65);</font><br><br>
Which output exactly corresponds with previous code?<br>', '1', '1', '27', '122');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1028', '&nbsp;●&nbsp;<b>Output in C-variant</b><br>
Suppose we have three values stored in variables float A, int B, and unsigned char C. We need following shape of output:<br>
<br><font face=''code''>The return count of negative numbers is 00014.<br>
Minimal number with sign was: -796.85000 and its category was: Q.</font><br><br>
Fill the following statement with appropriate format specifiers and sub-specifiers:<br>
<br><font face=''code''>printf(❶, B, A, C);</font><br><br>
<br>
Substitute ❶ for [[1]]', '2', '1', '28', '123');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1029', '&nbsp;●&nbsp;<b>Input/output in the C++ variant</b><br>
<br><font face=''code''>#include &lt;❶&gt;<br> int main(){<br>   int lengthA, lengthB;<br>   cout ❷ &quot;Enter two side of the rectangle, please:\n&quot;;<br>   ❸;<br>   ❹ &quot;The contents of this rectangle is &quot; ❺;<br>   return 0;<br> }</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]
Substitute ❹ for [[4]]
Substitute ❺ for [[5]]', '2', '1', '29', '124');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1030', '&nbsp;●&nbsp;<b>Manipulators in output statement</b><br>
Suppose we calculate volume of sphere. We want to display them below each other, aligning them to 10 positions on the right, as is shown on following schema:<br>
<br><font face=''code''>Radius of sphere:     2.752 cm,<br> Volume of sphere:    65.478 cm3</font><br><br>
Which code displays exactly this shape of output?<br>', '1', '1', '30', '125');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1031', '&nbsp;●&nbsp;<b>Formatted input</b><br>
Two characters are on the input. Find out what categories these characters include (white characters, letters, numbers, punctuation). Add the corresponding parts to the following code.<br>
<br><font face=''code''><b>char</b> a, b;<br> ❶<br> <b>if</b> (❷) cout &lt;&lt; &quot;a is white character&quot;&lt;&lt; endl;<br>   <b>else if</b> (a&gt;=''0'' <b>and</b> a&lt;=''9'') cout &lt;&lt; &quot;a is digit&quot;&lt;&lt;endl;<br>       <b>else if</b> ((a&gt;=''A'' <b>and</b> a&lt;=''Z'') <b>or</b> (a&gt;=''a'' <b>and</b> a&lt;=''z''))<br>           cout &lt;&lt; &quot;a is letter&quot; &lt;&lt; endl;<br>           else cout &lt;&lt; &quot;a is punctuation&quot; &lt;&lt; endl;<br> <b>if</b> (❸) cout &lt;&lt; &quot;b is white character&quot;&lt;&lt; endl;<br>   <b>else if</b> (b&gt;=''0'' <b>and</b> b&lt;=''9'') cout &lt;&lt; &quot;b is digit&quot;&lt;&lt;endl;<br>       <b>else if</b> ((b&gt;=''A'' <b>and</b> b&lt;=''Z'') <b>or</b> (b&gt;=''a'' <b>and</b> b&lt;=''z''))<br>           cout &lt;&lt; &quot;b is letter&quot; &lt;&lt; endl;<br>           <b>else</b> cout &lt;&lt; &quot;b is punctuation&quot; &lt;&lt; endl;</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '31', '126');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1032', '&nbsp;●&nbsp;<b>Logical expression</b><br>
Suppose we have a declaration:<br>
<br><font face=''code''><b>bool</b> first=false, second=true;</font><br><br>
What value will the following expression have:<br>
<br><font face=''code''><b>not</b> ((first <b>xor</b> second) <b>and</b> (first <b>or</b> second))</font><br><br>', '1', '1', '32', '128');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1033', '&nbsp;●&nbsp;<b>Logical expression</b><br>
Suppose the value of variable Salary is between 1000 and 3000 € inclusive. Which of the following expressions will be true if Salary meets that condition?<br>
', '1', '1', '33', '128');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1034', '&nbsp;●&nbsp;<b>Logical expression</b><br>
We need to find out if the variable Number have odd non-negative value. Which of the following terms is true with the specified criterion?<br>
', '1', '1', '34', '128');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1035', '&nbsp;●&nbsp;<b>Logical values output</b><br>
Suppose the following code:<br>
<br><font face=''code''><b>char</b> one, two;<br> cin &gt;&gt; one &gt;&gt; two;<br> cout &lt;&lt; (((one == ''a'') <b>or</b> (one == ''e'')) <b>and</b> ((two == ''x'') <b>or</b> (two == ''s''))) &lt;&lt; endl;</font><br><br>
For which inputs will the output be 1?<br>', '1', '1', '35', '128');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1036', '&nbsp;●&nbsp;<b>Conditional statement</b><br>
Select the command that displays variable Count only if it is even.<br>
', '1', '1', '36', '130');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1037', '&nbsp;●&nbsp;<b>Conditional statement</b><br>
A student will receive a 1000 € yearly scholarship if his or her average is better than 1.2. Write a message about the scholarship of student. Fill in the corresponding section to the following code.<br>
<br><font face=''code''>❶ Average;<br>
❷ Average;<br>
<b>if</b> ❸ cout &lt;&lt; &quot;This student receive €1000&quot;;<br>
   <b>else</b> cout &lt;&lt; &quot;This student receive no scholarship.&quot;;</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '37', '130');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1038', '&nbsp;●&nbsp;<b>Conditional statement</b><br>
Suppose a variable Measure with value 5. Will the following statement write a message &quot;Insufficient value&quot;?<br>
<br><font face=''code''><b>if</b> ((Measure &gt; 0) <b>and</b> (Measure % 2 == 1) <b>and</b> (Measure &lt;=10))<br>   cout &lt;&lt; &quot;Measure is OK&quot;;<br> <b>else</b> cout &quot;Insufficient value&quot;;</font><br><br>', '1', '1', '38', '130');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1039', '&nbsp;●&nbsp;<b>Compound statements</b><br>
Suppose the following code:<br>
<br><font face=''code''><b>int</b> Sum = 0, Current;<br> cin &gt;&gt; Current;<br> <b>if</b> (Current % 5 == 0)<br>    Sum += Current;<br>    Current++;<br> cout &lt;&lt; &quot;Sum is: &quot; &lt;&lt; Sum &lt;&lt; &quot;, Current is: &quot; &lt;&lt; Current &lt;&lt; endl;</font><br><br>
Input value was 11. What appears on the screen when we launch this code?<br>', '1', '1', '39', '130');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1040', '&nbsp;●&nbsp;<b>Conditional statement</b><br>
Select a command that detects a larger value from the two specified integer variables Number1 and Number2.<br>
', '1', '1', '40', '131');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1041', '&nbsp;●&nbsp;<b>More than two branches</b><br>
Assume a variable Distance which contains a distance of two stops on railway. We need to calculate fares when we know that up to 10 km is paid € 1, from 10 to 20 km 2 €, from 20 to 40 km 3 € and from 40 to 100 km 5 €. For distances of over 100 km, € 3 per 100 km is charged.<br>
', '1', '1', '41', '131');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1042', '&nbsp;●&nbsp;<b>Multiple branches</b><br>
The worker worked X hours. Norma is 40 hours. The worker receives a basic salary of €300 for meeting the standard. For a 20% overrun, he will receive a €50 bonus, but salary is reduced by a €100 for normas non-compliance. Calculate the salary of a worker who has worked for X hours. Fill in following code the appropriate pieces:<br>
<br><font face=''code''><b>if</b> (❶) cout &lt;&lt; &quot;Salary is ❷&quot;;<br>   <b>else if</b> (❸) cout &lt;&lt; &quot;Salary is €300&quot;;<br>     <b>else</b> cout &lt;&lt; &quot;Salary is €350&quot;;</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '42', '131');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1043', '&nbsp;●&nbsp;<b>Multiple branches</b><br>
The teacher works especially with very good students on the one hand, and with very weak students on the other. The student is graded A to E. The teacher therefore needs to know if the student is very good (A or B) or weak (he has an E). Fill in the corresponding section to the following code.<br>
<br><font face=''code''>❶ Grade;<br> cin &gt;&gt; Grade;<br> <b>if</b> ❷ cout &lt;&lt; &quot;Excellent student&quot;;<br>   <b>else if</b> ❸ cout &lt;&lt; &quot;Weak student&quot;;</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '43', '131');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1044', '&nbsp;●&nbsp;<b>Ternary operator</b><br>
We have two pieces of code:<br>
First:<br>
<br><font face=''code''><b>if</b> (SideA &lt;= SideB) SideA *= 2;<br> <b>else</b> SideB *= 2;</font><br><br>
Second:<br>
<br><font face=''code''>SideA = SideA &lt;= SideB ? SideA * 2 : SideB * 2;</font><br><br>
Do both codes the same thing?<br>', '1', '1', '44', '132');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1045', '&nbsp;●&nbsp;<b>Ternary operator</b><br>
We need to insert a square content or a square perimeter into the X variable, according to whichever amount is greater. The square side is in the Side variable. Select correct code that does this.<br>
', '1', '1', '45', '132');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1046', '&nbsp;●&nbsp;<b>Ternary operator</b><br>
We need to add one to the Count variable value if the Current variable is negative. Fill in the free spaces with the appropriate code:<br>
<br><font face=''code''>❶ ? ❷:❸;</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '46', '132');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1047', '&nbsp;●&nbsp;<b>If statement and ternary operator</b><br>
Suppose the following code:<br>
<br><font face=''code''><b>if</b> (Sum &gt; 1000) { Count ++; Sum -= Current; }<br> <b>else</b> {Count --; Sum += Current;}</font><br><br>
Which of pieces of code does exactly the same action?<br>', '1', '1', '47', '132');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1048', '&nbsp;●&nbsp;<b>Ternary operator and if statement</b><br>
Rewrite the following code using the if statement:<br>
<br><font face=''code''>Speed += Lap &lt; 100 ? CurSpeed : ;<br> Lap += Lap &lt; 100 ? 1 : 0;</font><br><br>', '1', '1', '48', '132');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1049', '&nbsp;●&nbsp;<b>Expression evaluation</b><br>
When calculating the arithmetic expression, we have to check whether the input values allow the calculation to be performed. Calculate the value of the expression \( \log_{10} \frac{a^2-\sqrt{b}}{a-b} \). Input values are a and b.<br>
Fill in following code the appropriate pieces:<br>
<br><font face=''code''><b>float</b> a, b, result;<br> cin &gt;&gt; a &gt;&gt; b;<br> <b>if</b> ❶ { <br>    result = ❷;<br>    <b>if</b> ❸ {<br>       result = log10(result);<br>       cout &lt;&lt; &quot;The result is: &quot;&lt;&lt;result&lt;&lt;endl;<br>    }<br>    <b>else</b> cout &lt;&lt; &quot;The expression cannot be evaluated.&quot;&lt;&lt;endl;}<br> <b>else</b> cout &lt;&lt; &quot;The expression cannot be evaluated.&quot;&lt;&lt;endl;</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '49', '132');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1050', '&nbsp;●&nbsp;<b>Equation</b><br>
Determine whether the entered numbers x and y satisfy the equation<br>
y = 34/(x+12)<br>
<br><font face=''code''><b>float</b> x, y, fraction;<br> string Message;<br> cin &gt;&gt; x &gt;&gt; y;<br> <b>if</b> (x + 12 != 0) <br>    Message = *** ? &quot;Numbers are satisfying the equation. &quot; : <br>          &quot;Numbers aren''t satisfying the equation.&quot;;<br>    <b>else</b> Message = &quot;The fraction cannot be evaluated.&quot;;<br> cout &lt;&lt; Message &lt;&lt; endl;</font><br><br>
Choose the right part of the code that needs to be replaced by three stars.<br>', '1', '1', '50', '132');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1051', '&nbsp;●&nbsp;<b>The switch command</b><br>
Suppose the following code:<br>
<br><font face=''code''><b>char</b> MyCharacter;<br> cin &gt;&gt; MyCharacter;<br> <b>switch</b> (MyCharacter) {<br>   <b>case</b> ''a'': cout &lt;&lt; MyCharacter;<br>   <b>case</b> ''e'': cout &lt;&lt; MyCharacter;<br>   <b>case</b> ''i'': cout &lt;&lt; MyCharacter;<br>   <b>case</b> ''o'': cout &lt;&lt; MyCharacter;<br>   <b>case</b> ''u'': cout &lt;&lt; MyCharacter;<br>   <b>case</b> ''y'': cout &lt;&lt; MyCharacter;<br>   <b>default</b>: cout &lt;&lt; &quot;+any consonant.&quot;<br> }</font><br><br>
The &quot;e&quot; character was entered. What will be displayed on screen after this code is executed?<br>', '1', '1', '51', '133');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1052', '&nbsp;●&nbsp;<b>The switch command</b><br>
Example: we need to quantify integer powers to the fifth degree. Variable Base contains powered value, variable Power contains the required power of variable Base. We use the switch command. Which listing resolves the specified task?<br>
', '1', '1', '52', '133');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1053', '&nbsp;●&nbsp;<b>The switch command</b><br>
We have two variables: Op1 and Op2. We want to process some arithmetical operations depending on variable Choice which contains one character specified the operation: ''+'' for addition, ''-'' for subtraction, ''*'' for multiplication, or ''/'' for division. Fill in following code the appropriate pieces:<br>
<br><font face=''code''><b>int</b> Op1=24, Op2=8;<br> <b>char</b> Choice;<br> cin &gt;&gt; Choice;<br> <b>switch</b> ❶ {<br>   <b>case</b> ''+'': cout &lt;&lt; &quot;Result is: &quot;&lt;&lt; ❷<br>   <b>case</b> ''-'': cout &lt;&lt; &quot;Result is: &quot;&lt;&lt; Op1 - Op2 &lt;&lt; endl; <b>break</b>;<br>   <b>case</b> ''*'': cout &lt;&lt; &quot;Result is: &quot;&lt;&lt; Op1 * Op2 &lt;&lt; endl; <b>break</b>;<br>   <b>case</b> ❸<br>   <b>default</b>: cout &lt;&lt; &quot;Unresolved operation.&quot; &lt;&lt; endl;<br> }</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '53', '133');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1054', '&nbsp;●&nbsp;<b>Which character?</b><br>
One character is entered from the input. You need to decide whether it''s a vowel, a consonant, or a different character (not a letter). Fill in appropriate pieces of code:<br>
<br><font face=''code''><b>char</b> Character;<br> cout &lt;&lt; &quot;Enter any character: &quot;;<br> cin &gt;&gt; Character;<br> Character = toupper(Character);  // converts letter to upper case<br> <b>if</b> ❶ <br>   <b>switch</b> ❷ {<br>    <b>case</b> ''A'':<br>    <b>case</b> ''E'':<br>    <b>case</b> ''I'':<br>    <b>case</b> ''O'':<br>    <b>case</b> ''U'':<br>    <b>case</b> ''Y'': cout &lt;&lt; &quot;The ''&quot;&lt;&lt;Character&lt;&lt;&quot;'' was a vowel.&quot;&lt;&lt;endl; <b>break</b>;<br>    <b>default</b>: ❸<br>    } <b>else</b> ❹</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]
Substitute ❹ for [[4]]', '2', '1', '54', '133');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1055', '&nbsp;●&nbsp;<b>Conditional loop</b><br>
Let''s have the following loop:<br>
&nbsp;<br>
<br><font face=''code''><b>int</b> Count = 100;<br> <b>while</b> (Count &gt; 50)<br>    cout &lt;&lt; &quot;Lap No. &quot; &lt;&lt; Count-- &lt;&lt; endl;</font><br><br>
Is the loop condition built correctly to avoid an endless loop?<br>', '1', '1', '55', '135');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1056', '&nbsp;●&nbsp;<b>Conditional loop</b><br>
There are a sequence of numbers on input, representing the prices of goods sold in one day. The last number in input sequence is zero. We have to find out the total price of the goods sold. Fill in the correct parts to the following code:<br>
<br><font face=''code''><b>int</b> Price, Sum = 0;<br> cin &gt;&gt; Price;<br> <b>while</b> ❶ {<br>    ❷<br>    ❸<br> }<br> cout &lt;&lt; &quot;Total price is &quot; &lt;&lt; Sum &lt;&lt; endl;</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '56', '136');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1057', '&nbsp;●&nbsp;<b>Conditional loop</b><br>
Let''s assume that prepared input values represent the number of students in each exam during actual semester. We know that there were exceptionally many students in the last exam – 48. We have to find out how many exam tests were done in this semester in total. Fill in the appropriate pieces of code:<br>
<br><font face=''code''><b>int</b> Exam, Total = 0;<br> // Exam - number of students in one exam;<br> // Total - Total exam tests<br> <b>do</b> {<br>    ❶<br>    ❷<br> } <b>while</b> ❸<br> cout &lt;&lt; &quot;Total exam tests executed: &quot; &lt;&lt; Total &lt;&lt; endl;</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '57', '138');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1058', '&nbsp;●&nbsp;<b>Appropriate end value</b><br>
Suppose a client has invested € 10,000 in a money fund and this is valued at a percentage each month. The input values are those recovery percentages (for example, 1.5, 0.7, 2.1, etc.). We have to calculate what amount the client will have after evaluating with all the percentages given. Determine what ENDVALUE can be used so that its processing does not affect the calculation result according to the following algorithm:<br>
<br><font face=''code''><b>float</b> Amount = 10000; Percentage;<br> <b>do</b> {<br>    cin &gt;&gt; Percentage;<br>    Amount += Amount * Percentage / 100;<br> } <b>while</b> (Percentage != ENDVALUE);<br> cout &lt;&lt; &quot;The client has at the end this total amount: € &quot; &lt;&lt; Amount &lt;&lt; endl;</font><br><br>', '1', '1', '58', '138');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1059', '&nbsp;●&nbsp;<b>Conditional loop</b><br>
Input values represent daily revenue from product sales in euros. The last number is zero and this is a sentinel only. Find out what was the biggest revenue in the input data. Fill in appropriate pieces of code:<br>
<br><font face=''code''><b>float</b> Revenue, MaxRevenue;<br> ❶<br> <b>while</b> ❷ {<br>    ❸<br>    cin &gt;&gt; Revenue;<br> }<br> cout &lt;&lt; &quot;The biggest revenue was &quot; &lt;&lt; MaxRevenue &lt;&lt; &quot; €.&quot; &lt;&lt; endl;</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '59', '138');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1060', '&nbsp;●&nbsp;<b>How many values?</b><br>
Suppose the following code:<br>
<br><font face=''code''><b>int</b> Value, Sum = 0;<br> <b>for</b> (<b>int</b> C = 1; C &lt; 5; C++) <br>   {cin &gt;&gt; Value; Sum += Value;}<br> cout &lt;&lt; Sum &lt;&lt; endl;</font><br><br>
Numbers 1 3 5 7 9 11 13 15 were entered when running this program. What was the output value?<br>', '1', '1', '60', '139');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1061', '&nbsp;●&nbsp;<b>The for loop</b><br>
Suppose we need to calculate a factorial of an input number N. The input number is non-negative. Which code solves this task?<br>
', '1', '1', '61', '140');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1062', '&nbsp;●&nbsp;<b>The for loop</b><br>
Suppose we have a function<br>
y = (3 - x)/(x^2-2x+1)<br>
 We need to list a table of functional values for x going from 1 to 2 with a step of 0.05. Fill in matching pieces to the following code.<br>
<br><font face=''code''><b>float</b> denom;<br> <b>for</b> (❶){<br>    denom = ❷;<br>    cout &lt;&lt; x &lt;&lt; &quot;   &quot; &lt;&lt; ❸ &lt;&lt; endl;<br> }</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '62', '140');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1063', '&nbsp;●&nbsp;<b>While – for</b><br>
Rewrite the following while loop to the equivalent for loop (choose the right equivalent):<br>
<br><font face=''code''><b>int</b> result = 1, coef = 1; cin &gt;&gt; inp;<br> <b>while</b> (coef &lt;= inp) {<br>    result *= coef;<br>    coef ++;<br> }</font><br><br>', '1', '1', '63', '140');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1064', '&nbsp;●&nbsp;<b>The break abandonment</b><br>
Suppose we want to calculate the factorial of a given number N. We have allocated an int variable for the result. However, it is possible that during the calculation it is found that the result exceeds the capabilities of this variable. The first variant of the program is based on the factorial calculation using the for loop. We add the option to terminate the calculation if the result variable is going to overflow (it is over circa 400 million).<br>
<br><font face=''code''><b>int</b> N, result = 1;<br> cin &gt;&gt; N;<br> <b>for</b> (<b>int</b> i = 2; i&lt;=N; i++) {<br>    <b>if</b> (result &gt; 400000000) <b>break</b>;<br>    result *= i;<br> }</font><br><br>
Rewrite the code without using the break command.<br>', '1', '1', '64', '141');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1065', '&nbsp;●&nbsp;<b>The use of continue statement</b><br>
Suppose the following code:<br>
<br><font face=''code''><b>int</b> Value, Func;<br> <b>bool</b> Test;<br> <b>for</b> (Value = 0; Value &lt;= 100; Value ++){<br>    Test = Value % 10 == 0;<br>    <b>if</b> (Test) <b>continue</b>;<br>    Func = Value * Value - 2 * Value + 1;<br>    cout &lt;&lt; Value &lt;&lt; &quot;   &quot; &lt;&lt; Func &lt;&lt; endl;<br> }</font><br><br>
How many lines are displayed on the output?<br>', '1', '1', '65', '142');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1066', '&nbsp;●&nbsp;<b>To avoid the continue statement</b><br>
Suppose the code:<br>
<br><font face=''code''><b>int</b> Value, Func;<br> <b>bool</b> Test;<br> <b>for</b> (Value = 0; Value &lt;= 100; Value ++){<br>    Test = Value % 10 == 0;<br>    <b>if</b> (Test) <b>continue</b>;<br>    Func = Value * Value - 2 * Value + 1;<br>    cout &lt;&lt; Value &lt;&lt; &quot;   &quot; &lt;&lt; Func &lt;&lt; endl;<br> }</font><br><br>
How can we rewrite this code to perform an identical action but not include the continue?<br>
<br><font face=''code''><b>int</b> Value, Func;<br> <b>for</b> (Value = 0; Value &lt;= 100; Value ++){<br>    <b>if</b> (Value % 10 != 0) <br>       cout &lt;&lt; Value &lt;&lt; &quot;   &quot; &lt;&lt; Value * Value - 2 * Value + 1 &lt;&lt; endl;<br> }</font><br><br>
<br><font face=''code''><b>int</b> Value, Func;<br> <b>bool</b> Test;<br> <b>for</b> (Value = 0; Value &lt;= 100; Value ++){<br>    Test = Value % 10 == 0;<br>    <b>if</b> (Test) {<br>      Func = Value * Value - 2 * Value + 1;<br>      cout &lt;&lt; Value &lt;&lt; &quot;   &quot; &lt;&lt; Func &lt;&lt; endl;<br>    }<br> }</font><br><br>
<br><font face=''code''><b>int</b> Value, Func;<br> <b>bool</b> Test;<br> <b>for</b> (Value = 0; Value &lt;= 100; Value ++){<br>    Test = Value % 10 == 0;<br>    <b>if</b> (!Test) Func = Value * Value - 2 * Value + 1;<br>    cout &lt;&lt; Value &lt;&lt; &quot;   &quot; &lt;&lt; Func &lt;&lt; endl;<br> }</font><br><br>
<br><font face=''code''><b>int</b> Value, Func;<br> <b>for</b> (Value = 0; Value &lt;= 100; Value ++){<br>    <b>if</b> (Value % 10 == 0) <br>       { Func = Value * Value - 2 * Value + 1;<br>         cout &lt;&lt; Value &lt;&lt; &quot;   &quot; &lt;&lt; Func &lt;&lt; endl;<br>       }<br> }</font><br><br>', '1', '1', '66', '142');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1067', '&nbsp;●&nbsp;<b>The subroutine definition</b><br>
Function definition for calculating cylinder volume with radius R and height V. Fill in the corresponding part to the following code:<br>
<br><font face=''code''>❶ Volume ❷<br>    ❸</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '67', '143');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1068', '&nbsp;●&nbsp;<b>Procedure</b><br>
Suppose we want to do a subroutine that lists a small multiplication table. Fill in the appropriate pieces into following code:<br>
&nbsp;<br>
<br><font face=''code''>❶ Multi❷ {<br>   <b>for</b> (<b>int</b> x=1; x&lt;=10; x++) {<br>      <b>for</b> (<b>int</b> y=1; y&lt;=10; y++) cout &lt;&lt; setw(6) &lt;&lt; x*y;<br>      ❸<br>   }<br> }</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '68', '144');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1069', '&nbsp;●&nbsp;<b>Local/global</b><br>
Suppose the following code:<br>
<br><font face=''code''><b>int</b> a = 1;<br> <b>float</b> RealFunc(<b>int</b> a) {<br>   <b>return</b> a * 0.01;<br> }<br> <b>int</b> main() {<br>   <b>int</b> a = 10;<br>   cout &lt;&lt; RealFunc(a) &lt;&lt; endl;<br>   <b>return</b> 0;<br> }</font><br><br>
What will appear on output?<br>', '1', '1', '69', '145');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1070', '&nbsp;●&nbsp;<b>The main function</b><br>
We have to create a program that decides what it will do according to the number of parameters from the command line. However, if no parameters are specified, it outputs output code 4 as the result, otherwise it will have output code 0. Fill in the corresponding part to the following code:<br>
<br><font face=''code''>❶ main ❷ {<br>   <b>if</b> ❸ {<br>      ProcessProgram(Params);<br>      <b>return</b> 0;<br>   } ❹<br> }</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]
Substitute ❹ for [[4]]', '2', '1', '70', '146');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1071', '&nbsp;●&nbsp;<b>The array declaration</b><br>
Choose from the following options to declare a field to store your business''s monthly turnovers.<br>', '1', '1', '71', '148');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1072', '&nbsp;●&nbsp;<b>What we see?</b><br>
Suppose the following code:<br>
<br><font face=''code''><b>char</b> Vowels[6] = {''a'', ''e'', ''i'', ''o'', ''u'', ''y''};<br> cout &lt;&lt; Vowels[3] &lt;&lt; endl;</font><br><br>
Does the character &quot;i&quot; appear on the screen (without quotes)?<br>', '1', '1', '72', '149');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1073', '&nbsp;●&nbsp;<b>Display array</b><br>
Suppose we have a daily close stock price array for the last working week. In the following code, complete the sections so that the prices will be read from standard input and then will be correctly displayed for each day.<br>
<br><font face=''code''>#include &lt;iostream&gt;<br> <b>using namespace</b> std;<br> <b>int</b> main(){<br>    ❶; <br>    <b>int</b> Day;<br>    ❷ cin &gt;&gt; Stock[Day-1];<br>    ❸ <br>       cout &lt;&lt; &quot;Day No. &quot; &lt;&lt; Day+1 &lt;&lt; &quot;: The price is &quot; &lt;&lt; Stock[Day] &lt;&lt; endl;<br>    <b>return</b> 0;<br> }</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '73', '149');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1074', '&nbsp;●&nbsp;<b>Sum of profits</b><br>
Task: Suppose the input values consist of pairs of data: enterprise number and profit for goods sold. The company has ten enterprises, the enterprise numbers are from 1 to 10. Write down the total profits of all enterprises from all input data.<br>
The program is:<br>
<br><font face=''code''>#include &lt;iostream&gt;<br> <b>using namespace</b> std;<br> <b>int</b> main(){<br>    //    ... HERE IS MISSING CODE ...<br>[[1]]<br>    <b>int</b> Num; int Profit;<br>    <b>while</b> (cin&gt;&gt;Num&gt;&gt;Profit) Profits[Num-1]+=Profit;<br>    <b>for</b> (Num=0; Num&lt;10; Num++) <br>       cout &lt;&lt; Num+1 &lt;&lt; &quot;: &quot; &lt;&lt; Profits[Num] &lt;&lt; endl;<br>    <b>return</b> 0;<br> }</font><br><br>
Select the appropriate missing part of code.<br>', '2', '1', '74', '150');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1075', '&nbsp;●&nbsp;<b>Correct index</b><br>
Suppose we want to insert values read from standard input into the array. We don''t know how many values are on the input. Is the following code correct?<br>
<br><font face=''code''><b>typedef float</b> Values[100];<br> <b>int</b> Num=0;<br> <b>while</b> (cin&gt;&gt;Values[Num]) Num++;</font><br><br>', '1', '1', '75', '151');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1076', '&nbsp;●&nbsp;<b>Number of components</b><br>
How many items does the Values array have when we know that sizeof (Values) = 64 and the array component is double data type?<br>
', '1', '1', '76', '152');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1077', '&nbsp;●&nbsp;<b>Enum as an index</b><br>
Suppose that the input is a sequence of pairs of values - the price of the car sold and its color. Output the sum of the car prices for each color. Select the correct part of the code in the following program.<br>
<br><font face=''code''>   <b>typedef enum</b> {black, red, green, blue, <br>        yellow, magenta, cyan, white, silver} TColor;<br> <br>    // select the appropriate part of code HERE<br>[[1]] <br>    TCars Sales;<br>    <b>int</b> Price, NumColor;<br>    <b>for</b> (<b>int</b> i=black; i&lt;=silver; i++) Sales[i]=0;<br>    <b>while</b> (cin &gt;&gt; NumColor &gt;&gt; Price) {<br>      <b>if</b> (NumColor &gt;= black and NumColor &lt;=silver)<br>         Sales[NumColor]+=Price;<br>    }<br>    cout &lt;&lt; &quot;Overview of sold cars by color:&quot; &lt;&lt; endl;<br>    <b>for</b> (<b>int</b> i=black; i&lt;=silver; i++)<br>       cout &lt;&lt; setw(10) &lt;&lt; left &lt;&lt; ColorNames[i] <br>       &lt;&lt; setw(10)&lt;&lt;right&lt;&lt;Sales[i] &lt;&lt; endl;</font><br><br>', '2', '1', '77', '153');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1078', '&nbsp;●&nbsp;<b>Matrix reading</b><br>
Assume that the input contains 57 real values. Create a matrix of 3 rows of 19 values and enter the input numbers. Then write the matrix to standard output so that the numbers are arranged in rows. Add the corresponding parts to the following code.<br>
<br><font face=''code''><b>const int</b> Items = 19;<br> <b>const int</b> Rows = 3;<br> ❶<br> TMatice Mat;<br> <b>for</b> (<b>int</b> I=0; I&lt;Rows; I++)<br>      ❷<br> <b>for</b> (<b>int</b> I=0; I&lt;Rows; I++){ <br>      ❸<br>      <b>for</b> (<b>int</b> J=0; J&lt;Items; J++) cout &lt;&lt; Mat[I][J] &lt;&lt; &quot;  &quot;;<br>      cout &lt;&lt; endl;<br> }</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '78', '154');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1079', '&nbsp;●&nbsp;<b>Sum of matrices</b><br>
Suppose we have two matrices of equal dimensions and they are filled with integers. The TMyMatrix data type has been defined, and the matrix dimensions are given by the NumRows and NumCols constants. Choose from the following code options that sum these two matrices.<br>
', '1', '1', '79', '154');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1080', '&nbsp;●&nbsp;<b>Matrix transpose</b><br>
In the following code, complete the correct parts to transpose the square matrix.<br>
<br><font face=''code''><b>const int</b> Order = 10;<br> ❶<br> QMatrix Mat; <b>double</b> aux;<br> <b>for</b> (<b>int</b> x=0; x&lt;Order; x++)<br> <b>for</b> (<b>int</b> y=0; y&lt;Order; y++) cin &gt;&gt; Mat[x][y];<br> <b>for</b> (<b>int</b> i=0; i&lt;Order; i++){<br> ❷ <br>    ❸<br> <b>for</b> (<b>int</b> I=0; I&lt;Order; I++){ cout &lt;&lt; &quot;Row: &quot; &lt;&lt; I+1 &lt;&lt; &quot;: &quot;;<br> <b>for</b> (<b>int</b> J=0; J&lt;Order; J++) cout &lt;&lt; Mat[I][J] &lt;&lt; &quot;  &quot;;<br> cout &lt;&lt; endl;}</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '80', '154');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1081', '&nbsp;●&nbsp;<b>Employees</b><br>
Task: Suppose there is a sequence of pairs of numbers on the input: the department number (1 to 7) and the salary of a worker of that department. List average salaries for individual departments.<br>
From the following options, select the part of the code that belongs to the following program:<br>
<br><font face=''code''>#include &lt;iostream&gt;<br> <b>using namespace</b> std;<br> <b>int</b> main(){<br>   <b>typedef int</b> TDept[2];<br>   <b>typedef</b> TDept TFactory[7];<br>   TFactory OurFact;<br>   <b>int</b> Num, Salary;<br>   <b>for</b> (Num=0; Num&lt;7; Num++){<br>       OurFact[Num][0]=OurFact[Num][1]=0;<br>   }<br>   <b>while</b> (cin&gt;&gt;Num&gt;&gt;Salary){<br>       OurFact[Num-1][0]++;<br>       OurFact[Num-1][1]+=Salary;<br>   }<br>   // SELECTED PART OF CODE BELONGS HERE<br>[[1]]<br>   <b>return</b> 0;<br> }</font><br><br>', '2', '1', '81', '154');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1082', '&nbsp;●&nbsp;<b>Length of string</b><br>
Assume a Description variable with the following definition:<br>
<br><font face=''code''><b>char</b> Description[] = &quot;This is sum of values.&quot;;</font><br><br>
The number of components of this variable will be 23. True or false?<br>', '1', '1', '82', '155');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1083', '&nbsp;●&nbsp;<b>String and characters</b><br>
Suppose we have a string variable to store the ISBN. What value will this variable have after performing the following code?<br>
<br><font face=''code''>char ISBN[14] = &quot;9887074283225&quot;;<br> ISBN[1] = ''7''; ISBN[3] = ''8''; ISBN[11] = ''1'';</font><br><br>', '1', '1', '83', '155');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1084', '&nbsp;●&nbsp;<b>String and termination</b><br>
Suppose we have a string variable to store the ISBN. What will be displayed after processing the following code?<br>
<br><font face=''code''><b>char</b> ISBN[18] = &quot;978-80-7428-321-5&quot;;<br> ISBN[3] = \0; ISBN[6] = ''/''; ISBN[11] = ''/''; ISBN[15]=''/'';</font><br><br>', '1', '1', '84', '155');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1085', '&nbsp;●&nbsp;<b>String operation</b><br>
Assume that in the standard input is a name and surname (on each line separately). Put them in one string variable, write down the total number of characters and write only the last name from the variable. Add the appropriate parts to the following code.<br>
<br><font face=''code''><b>char</b> Name[35], Surname[40], FullName[75];<br> cin &gt;&gt; Name &gt;&gt; Surname;<br> strcpy(FullName, Name);<br> ❶<br> cout &lt;&lt; &quot;The length is &quot;&lt;&lt;❷&lt;&lt; endl;<br> cout &lt;&lt; &quot;The surname is: &quot;&lt;&lt; ❸ &lt;&lt; endl;</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '85', '156');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1086', '&nbsp;●&nbsp;<b>String and manipulation</b><br>
Assume that in the standard input is a name and surname (on each line separately). Put them in one string variable, write down the total number of characters and write only the last name from the variable. Add the appropriate parts to the following code.<br>
<br><font face=''code''>string Name, Surname, FullName;<br> cin &gt;&gt; Name &gt;&gt; Surname;<br> ❶<br> cout &lt;&lt; &quot;The length is &quot;&lt;&lt;❷&lt;&lt; endl;<br> cout &lt;&lt; &quot;The surname is: &quot;&lt;&lt; ❸ &lt;&lt; endl;</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '86', '158');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1087', '&nbsp;●&nbsp;<b>Struct definition</b><br>
Suppose the following code:<br>
<br><font face=''code''><b>struct</b> {<b>int</b> IdMat; <b>float</b> Length;<br>    string Description;} StoreItem;<br> StoreItem GreenCanvas;</font><br><br>
Is declaration of variable GreenCanvas correct?<br>', '1', '1', '87', '159');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1088', '&nbsp;●&nbsp;<b>Array of struct example</b><br>
Define a person''s record array (name, height in centimetres, weight in kilogrammes). Fill this field with data read from the input and display the name of person with the smallest BMI (Body Mass Index = weight in kilogrammes / square of height in metres). Add the corresponding section to the following code.<br>
<br><font face=''code''>❶<br> <b>float</b> BMI(TPerson P){<br>    <b>float</b> h = <b>float</b> (P.Height);<br>    <b>return</b> P.Weight / (h/100)*(h/100));<br> }<br> <b>const int</b> MaxNumOfPerson = 100;<br> <b>typedef</b> TPerson TDepartment [MaxNumOfPerson];<br> TDepartment OurDept;<br> <b>int</b> ActNum=0, MinBMI = 0;<br> <b>while</b> (cin ❷) {<br>     <b>if</b> (❸) MinBMI = ActNum;<br>     ActNum++;<br> }<br> cout &lt;&lt; &quot;Min. BMI has &quot; &lt;&lt; OurDept[MinBMI].Name &lt;&lt; endl;<br> <br> </font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]', '2', '1', '88', '160');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1089', '&nbsp;●&nbsp;<b>The space for struct</b><br>
Assume the following structure:<br>
<br><font face=''code''><b>typedef struct</b> {<br>    <b>bool</b> readonly: 1;<br>    <b>bool</b> system: 1;<br>    <b>bool</b> hidden: 1;<br>    <b>bool</b> archive: 1;<br>    <b>bool</b> directory: 1;<br>    <b>bool</b> shared: 1;<br> } TFileAttrib;<br> TFileAttrib MyFile;</font><br><br>
Will the size of the MyFile variable be greater than one byte?<br>', '1', '1', '89', '161');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1090', '&nbsp;●&nbsp;<b>Typecast with union</b><br>
Suppose the following union structure:<br>
<br><font face=''code''><b>typedef union</b> {<br>    <b>int</b> anynumber;<br>    <b>char</b> bytes[4];<br> } TTwo;<br> TTwo MyVariable;</font><br><br>
Next, suppose that an integer is stored in memory so that the most significant byte is the first. We use defined structure to display the values of individual bytes that make up an integer in memory:<br>
<br><font face=''code''>cin &gt;&gt; MyVariable.anynumber;<br> <b>for</b> (<b>int</b> i=0; i&lt;4; i++) cout &lt;&lt; (<b>int</b>)MyVariable.bytes[i]&lt;&lt;&quot; &quot;;</font><br><br>
After entering a certain number was displayed:<br>
&nbsp;<br>
<br><font face=''code''>0 1 0 0</font><br><br>
What number has been entered?<br>', '1', '1', '90', '162');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1091', '&nbsp;●&nbsp;<b>Locomotives</b><br>
Suppose that exists structure TDepot we defined above:<br>
<br><font face=''code''><b>typedef enum</b> {steam, diesel, electric} TTypeLok;<br> <b>typedef union</b> {<b>single</b> Boiler; <br>     <b>int</b> Cylinders; <br>     string PowerType;<br> } TLokParam;<br> <b>typedef struct</b> {string Label;<br>     <b>float</b> Weight;<br>     TTypeLok Traction;<br>     TLokParam LocoPar;<br> } TLocomotive;<br> <b>const int</b> MaxNumLoco = 150;<br> <b>typedef</b> TLocomotive TDepot[MaxNumLoco];</font><br><br>
and exists variable Manchester of this type:<br>
<br><font face=''code''>TDepot Manchester;</font><br><br>
Next suppose that variable Manchester is filled with data about 88 locomotives. The task is to display all steam locomotives with weight above 80 tons and all diesel locomotives with number of cylinders less than 16. Select the appropriate parts in following code:<br>
<br><font face=''code''><b>const int</b> NumLoco = 88;<br> cout &lt;&lt; &quot;Steam locomotives with weight above 80 tons:&quot;&lt;&lt;endl;<br> <b>for</b> (<b>int</b> L=0; L&lt;NumLoco; L++)<br>    <b>if</b> (❶) <br>      cout &lt;&lt; ❷&lt;&lt;endl;<br> cout &lt;&lt; &quot;Selected diesel locomotives: &quot;&lt;&lt;endl;<br> <b>for</b> (<b>int</b> L=0; L&lt;NumLoco; L++)<br>    <b>if</b> (❸)<br>      cout &lt;&lt; ❹ &lt;&lt; endl;</font><br><br>
<br>
Substitute ❶ for [[1]]
Substitute ❷ for [[2]]
Substitute ❸ for [[3]]
Substitute ❹ for [[4]]', '2', '1', '91', '162');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1092', '&nbsp;●&nbsp;<b>Reversing of sequence</b><br>
Task: Input is a sequence of decimal numbers. The first input value is the number of numbers entered. Write the numbers to the output in reverse order. <br>
Choose from the parts offered here that belong to the following code:<br>
<br><font face=''code''>  <b>int</b> Num;<br>   cin &gt;&gt; Num;<br> <br> // choose one answer HERE:<br>[[1]] <br>   <b>for</b> (<b>int</b> i=0; i&lt;Num; i++) cin &gt;&gt; Values[i];<br>   <b>for</b> (<b>int</b> i=Num-1; i&gt;=0; i--) cout &lt;&lt; Values[i] &lt;&lt; endl;<br>   <b>delete</b> Values;</font><br><br>', '2', '1', '92', '164');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1093', '&nbsp;●&nbsp;<b>Reverse order 2</b><br>
Task: Input is a sequence of decimal numbers. The first input value is the number of numbers entered. Write the numbers to the output in reverse order. <br>
Choose from the parts offered here that belong to the following code:<br>
<br><font face=''code''>  <b>int</b> Num;<br>   cin &gt;&gt; Num;<br> <br> // choose one answer HERE:<br>[[1]] <br>   <b>for</b> (<b>int</b> i=0; i&lt;Num; i++) {AnyData[i] = <b>new float</b>; cin &gt;&gt; *AnyData[i];}<br>   <b>for</b> (<b>int</b> i=Num-1; i&gt;=0; i--) cout &lt;&lt; *AnyData[i] &lt;&lt; endl;<br>   <b>delete</b> [] AnyData;</font><br><br>', '2', '1', '93', '165');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1094', '&nbsp;●&nbsp;<b>Reverse order 3</b><br>
The input is a sequence of decimal numbers. Write them in reverse order. Use a dynamic list in the form of a stack.<br>
<br><font face=''code''>  <b>typedef struct</b> Node {<br>      <b>float</b> Data;<br>      Node *Next;<br>   } Node;<br>   <b>typedef</b> Node* Nodeptr;<br>   Nodeptr Top=NULL, Help;<br>   <b>float</b> curdata;<br>   <b>while</b> (cin&gt;&gt;curdata){<br> <br>      // select appropriate code HERE:<br>[[1]] <br>   }<br>   Help=Top;<br>   <b>while</b> (Help!=NULL){<br>     cout &lt;&lt; (*Help).Data &lt;&lt; endl;<br>     Help=(*Help).Next;<br>   }</font><br><br>', '2', '1', '94', '166');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1095', '&nbsp;●&nbsp;<b>Above average</b><br>
Input data consists of a sequence of real numbers. List those that are above average. Choose the appropriate part of following code:<br>
<br><font face=''code''>  <b>typedef struct</b> Node {<br>      <b>float</b> Data;<br>      Node *Next;<br>   } Node;<br>   <b>typedef</b> Node* Nodeptr;<br>   Nodeptr Top=NULL, Tail=NULL, Aux;<br>   <b>float</b> curdata, Sum=0;<br>   <b>int</b> Count=0;<br>   <b>while</b> (cin&gt;&gt;curdata){<br>      Sum+=curdata; Count++;<br> <br> // select appropriate code HERE:<br>[[1]] <br>      Tail-&gt;Data=curdata;<br>      Tail-&gt;Next=NULL;<br>   }<br>   curdata = Sum / Count;<br>   Aux=Top;<br>   <b>while</b> (Aux!=NULL){<br>     <b>if</b> (Aux-&gt;Data &gt; curdata) cout &lt;&lt; Aux-&gt;Data  &lt;&lt; endl;<br>     Aux=Aux-&gt;Next;<br>   }</font><br><br>', '2', '1', '95', '166');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1096', '&nbsp;●&nbsp;<b>Above average 2</b><br>
Input data consists of a sequence of real numbers. List those that are above average. Use the linear list with general pointers to data. Choose the appropriate part of following code:<br>
<br><font face=''code''>  <b>typedef struct</b> Node {<br>      <b>void</b> *Data;<br>      Node *Next;<br>   } Node;<br>   <b>typedef</b> Node* Nodeptr;<br>   Nodeptr Top=NULL, Tail=NULL, Aux;<br>   <b>float</b> *curdata, Sum=0, Average;<br>   <b>int</b> Count=0; curdata = <b>new</b> float;<br>   <b>while</b> (cin&gt;&gt;*curdata){<br>      Sum+=*curdata; Count++;<br>      <b>if</b> (Top==NULL) {<br>         Top = <b>new</b> Node;<br>         Tail = Top;<br>      } <b>else</b> {<br>         Tail-&gt;Next = <b>new</b> Node;<br>         Tail = Tail-&gt;Next;<br>      }<br>      Tail-&gt;Data=curdata;<br>      Tail-&gt;Next=NULL;<br>      curdata = <b>new</b> float;<br>   }<br>   Average = Sum / Count;<br>   Aux=Top;<br>   <b>while</b> (Aux!=NULL){<br> <br> // enter appropriate code HERE:<br>[[1]] <br>     <b>if</b> (*curdata &gt; Average) cout &lt;&lt; *curdata  &lt;&lt; endl;<br>     Aux=Aux-&gt;Next;<br>   }</font><br><br>', '2', '1', '96', '167');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1097', '&nbsp;●&nbsp;*What does a data type define?', '1', '1', '0', '111');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1098', '&nbsp;●&nbsp;*Which keyword is used to define a new user-defined data type?', '1', '1', '0', '115');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1099', '&nbsp;●&nbsp;*How is the boolean value true typically implemented in computer memory?', '1', '1', '0', '127');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1100', '&nbsp;●&nbsp;*What is a simple C++ statement?', '1', '1', '0', '129');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1101', '&nbsp;●&nbsp;*What is the purpose of a loop in programming?', '1', '1', '0', '134');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1102', '&nbsp;●&nbsp;*Where is the condition placed in a do-while loop?', '1', '1', '0', '137');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1103', '&nbsp;●&nbsp;*Which statement about forward definition is correct?', '1', '1', '0', '147');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1104', '&nbsp;●&nbsp;*Which statement is true about std::string?', '1', '1', '0', '157');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1105', '&nbsp;●&nbsp;*Which symbol is used to declare a pointer in C++?', '1', '1', '0', '163');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1106', '&nbsp;●&nbsp;<b>Variables</b><br>What is a variable in programming language?', '0', '0', '0', '107');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1107', '&nbsp;●&nbsp;<b>Variable identifier</b><br>Variable identifier in programming language', '0', '0', '0', '107');
INSERT INTO public.question (id, q_text, question_type, points, ordinal_number, lesson_id) VALUES ('1108', '&nbsp;●&nbsp;*What depends on the operating system?', '0', '0', '0', '104');

-- -------------------------------------------------------------------------
-- todo OPTION
-- -------------------------------------------------------------------------
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1', '*Ano', 'True', '0', '1');
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
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('38', '3', 'True', '0', '46');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('39', '2', 'True', '0', '47');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('40', '3', 'True', '0', '48');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('41', '11', 'True', '0', '49');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('42', '10', 'True', '0', '50');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('43', '8', 'True', '0', '51');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('44', '9', 'True', '0', '52');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('45', '16', 'True', '0', '53');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('46', '125', 'True', '0', '54');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('47', '36', 'True', '0', '55');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('48', '49', 'True', '0', '56');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('49', '64', 'True', '0', '57');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('50', '81', 'True', '0', '58');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('51', '100', 'True', '0', '59');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('52', '121', 'True', '0', '60');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('53', '2', 'True', '0', '61');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('54', '3', 'True', '0', '62');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('55', '4', 'True', '0', '63');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('56', '5', 'True', '0', '64');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('57', '6', 'True', '0', '65');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('58', '7', 'True', '0', '66');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('59', '8', 'True', '0', '67');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('60', '9', 'True', '0', '68');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('61', '10', 'True', '0', '69');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('62', '11', 'True', '0', '70');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('68', 'Sčítání', 'False', '0', '71');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('69', 'Násobení', 'False', '0', '71');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('70', '*Závorky', 'True', '0', '71');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('71', 'Odčítání', 'False', '0', '71');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('72', 'Dělení', 'False', '0', '71');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('73', '*Sčítání a odčítání', 'True', '0', '72');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('74', 'Mocniny a odmocniny', 'False', '0', '72');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('75', 'Násobení a dělení', 'False', '0', '72');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('76', 'Závorky', 'False', '0', '72');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('77', 'Zcela vpravo', 'False', '0', '72');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('78', 'Sčítání a odčítání', 'False', '0', '73');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('79', '*Mocniny a odmocniny', 'True', '0', '73');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('80', 'Násobení a dělení', 'False', '0', '73');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('81', 'Na dalším vyhodnocování nezáleží', 'False', '0', '73');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('82', 'Závorky jako poslední', 'False', '0', '73');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('83', '4', 'True', '0', '74');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('84', '21', 'True', '0', '75');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('85', '16', 'True', '0', '76');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('86', '-1', 'True', '0', '77');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('87', '-1', 'True', '0', '78');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('88', '*Ano', 'True', '0', '81');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('89', 'Ne', 'False', '0', '81');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('90', 'Někdy', 'False', '0', '81');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('91', 'Záleží na číslech', 'False', '0', '81');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('92', 'Záleží na operátoru', 'False', '0', '81');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('93', '*Ano', 'True', '0', '82');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('94', 'Ne', 'False', '0', '82');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('95', 'Někdy', 'False', '0', '82');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('96', 'Záleží na číslech', 'False', '0', '82');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('97', 'Záleží na operátoru', 'False', '0', '82');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('98', 'Ano', 'False', '0', '83');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('99', '*Ne', 'True', '0', '83');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('100', 'Někdy', 'False', '0', '83');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('101', 'Záleží na číslech', 'False', '0', '83');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('102', 'Záleží na operátoru', 'False', '0', '83');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('103', 'Ano', 'False', '0', '84');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('104', '*Ne', 'True', '0', '84');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('105', 'Někdy', 'False', '0', '84');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('106', 'Záleží na číslech', 'False', '0', '84');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('107', 'Záleží na operátoru', 'False', '0', '84');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('108', '*Sčítání', 'True', '0', '85');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('109', 'Odčítání', 'False', '0', '85');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('110', 'Dělení', 'False', '0', '85');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('111', 'Mocniny', 'False', '0', '85');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('112', 'Žádná z uvedených', 'False', '0', '85');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('113', 'Násobení', 'False', '0', '86');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('114', 'Sčítání', 'False', '0', '86');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('115', '*Odčítání', 'True', '0', '86');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('116', 'Žádná z uvedených', 'False', '0', '86');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('117', 'Všechny uvedené', 'False', '0', '86');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('118', 'Asociativita', 'False', '0', '87');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('119', 'Distributivita', 'False', '0', '87');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('120', '*Komutativita', 'True', '0', '87');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('121', 'Identita', 'False', '0', '87');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('122', 'Inverzita', 'False', '0', '87');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('123', 'a + (b + c) = (a + b) + c', 'False', '0', '88');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('124', '*a + b = b + a', 'True', '0', '88');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('125', 'a ⋅ (b + c) = a ⋅ b + a ⋅ c', 'False', '0', '88');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('126', 'a - b = b - a', 'False', '0', '88');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('127', 'a / b = b / a', 'False', '0', '88');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('128', 'a ⋅ (b ⋅ c) = (a ⋅ b) ⋅ c', 'False', '0', '89');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('129', '*a ⋅ b = b ⋅ a', 'True', '0', '89');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('130', 'a + b = b + a', 'False', '0', '89');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('131', 'a - b = b - a', 'False', '0', '89');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('132', 'a / b = b / a', 'False', '0', '89');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('133', 'a + b = b + a', 'False', '0', '90');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('134', 'a ⋅ b = b ⋅ a', 'False', '0', '90');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('135', '*a - b = b - a', 'True', '0', '90');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('136', 'a + (b + c) = (a + b) + c', 'False', '0', '90');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('137', 'a / b = b / a', 'False', '0', '90');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('138', '*Ano', 'True', '0', '91');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('139', 'Ne', 'False', '0', '91');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('140', 'Jen pro kladná čísla', 'False', '0', '91');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('141', 'Jen pro záporná čísla', 'False', '0', '91');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('142', 'Jen pro nuly', 'False', '0', '91');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('143', '*Ano', 'True', '0', '92');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('144', 'Ne', 'False', '0', '92');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('145', 'Jen pro kladná čísla', 'False', '0', '92');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('146', 'Jen pro záporná čísla', 'False', '0', '92');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('147', 'Jen pro nuly', 'False', '0', '92');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('148', 'Ano', 'False', '0', '93');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('149', '*Ne', 'True', '0', '93');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('150', 'Jen pro kladná čísla', 'False', '0', '93');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('151', 'Jen pro záporná čísla', 'False', '0', '93');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('152', 'Jen pro nuly', 'False', '0', '93');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('153', 'Ano', 'False', '0', '94');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('154', '*Ne', 'True', '0', '94');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('155', 'Jen pro kladná čísla', 'False', '0', '94');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('156', 'Jen pro záporná čísla', 'False', '0', '94');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('157', 'Jen pro nuly', 'False', '0', '94');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('158', 'Mocnina', 'False', '0', '95');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('159', 'Odmocnina', 'False', '0', '95');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('160', 'Odčítání', 'False', '0', '95');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('161', 'Dělení', 'False', '0', '95');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('162', '*Sčítání a násobení', 'True', '0', '95');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('163', 'Sčítání', 'False', '0', '96');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('164', 'Násobení', 'False', '0', '96');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('165', '*Odčítání', 'True', '0', '96');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('166', 'Všechny jsou asociativní', 'False', '0', '96');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('167', 'Všechny nejsou asociativní', 'False', '0', '96');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('168', 'Komutativita', 'False', '0', '97');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('169', '*Asociativita', 'True', '0', '97');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('170', 'Distributivita', 'False', '0', '97');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('171', 'Identita', 'False', '0', '97');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('172', 'Invertibilita', 'False', '0', '97');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('173', '*(a + b) + c = a + (b + c)', 'True', '0', '98');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('174', 'a + b = b + a', 'False', '0', '98');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('175', 'a ⋅ (b + c) = a ⋅ b + a ⋅ c', 'False', '0', '98');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('176', 'a + 0 = a', 'False', '0', '98');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('177', 'a - b = -(b - a)', 'False', '0', '98');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('178', '*(a ⋅ b) ⋅ c = a ⋅ (b ⋅ c)', 'True', '0', '99');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('179', 'a ⋅ b = b ⋅ a', 'False', '0', '99');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('180', 'a ⋅ (b + c) = a ⋅ b + a ⋅ c', 'False', '0', '99');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('181', 'a ⋅ 1 = a', 'False', '0', '99');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('182', 'a / b = 1 / (b / a)', 'False', '0', '99');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('183', '(a + b) + c = a + (b + c)', 'False', '0', '100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('184', '(a ⋅ b) ⋅ c = a ⋅ (b ⋅ c)', 'False', '0', '100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('185', '*(a - b) - c = a - (b - c)', 'True', '0', '100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('186', '(a + b) + c = c + (a + b)', 'False', '0', '100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('187', '(a ⋅ b) ⋅ c = c ⋅ (a ⋅ b)', 'False', '0', '100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('188', '*Ano', 'True', '0', '101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('189', 'Ne', 'False', '0', '101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('190', 'Jen pro kladná čísla', 'False', '0', '101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('191', 'Jen pro záporná čísla', 'False', '0', '101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('192', 'Jen pro nuly', 'False', '0', '101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('193', '*Ano', 'True', '0', '102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('194', 'Ne', 'False', '0', '102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('195', 'Jen pro kladná čísla', 'False', '0', '102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('196', 'Jen pro záporná čísla', 'False', '0', '102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('197', 'Jen pro nuly', 'False', '0', '102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('198', 'Ano', 'False', '0', '103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('199', '*Ne', 'True', '0', '103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('200', 'Jen pro kladná čísla', 'False', '0', '103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('201', 'Jen pro záporná čísla', 'False', '0', '103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('202', 'Jen pro nuly', 'False', '0', '103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('203', 'Ano', 'False', '0', '104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('204', '*Ne', 'True', '0', '104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('205', 'Jen pro kladná čísla', 'False', '0', '104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('206', 'Jen pro záporná čísla', 'False', '0', '104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('207', 'Jen pro nuly', 'False', '0', '104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('208', 'Násobení vzhledem k sčítání, ale ne odčítání', 'False', '0', '105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('209', 'Násobení vzhledem k odčítání, ale ne sčítání', 'False', '0', '105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('210', 'Sčítání vzhledem k násobení', 'False', '0', '105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('211', 'Odčítání vzhledem k násobení', 'False', '0', '105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('212', '*Násobení vzhledem k sčítání a odčítání', 'True', '0', '105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('213', 'Násobení vzhledem k sčítání', 'False', '0', '106');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('214', 'Násobení vzhledem k odčítání', 'False', '0', '106');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('215', '*Sčítání a odčítání vzhledem k násobení', 'True', '0', '106');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('216', 'Násobení vzhledem k sčítání a odčítání', 'False', '0', '106');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('217', 'Distributivní není žádná z operací', 'False', '0', '106');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('218', 'Komutativita', 'False', '0', '107');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('219', 'Asociativita', 'False', '0', '107');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('220', '*Distributivita', 'True', '0', '107');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('221', 'Identita', 'False', '0', '107');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('222', 'Invertibilita', 'False', '0', '107');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('223', '*a ⋅ (b + c) = a ⋅ b + a ⋅ c', 'True', '0', '108');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('224', 'a + b = b + a', 'False', '0', '108');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('225', '(a + b) + c = a + (b + c)', 'False', '0', '108');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('226', 'a ⋅ 1 = a', 'False', '0', '108');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('227', 'a - b = -(b - a)', 'False', '0', '108');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('228', '*a ⋅ (b - c) = a ⋅ b - a ⋅ c', 'True', '0', '109');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('229', 'a ⋅ b = b ⋅ a', 'False', '0', '109');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('230', '(a ⋅ b) ⋅ c = a ⋅ (b ⋅ c)', 'False', '0', '109');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('231', 'a ⋅ 1 = a', 'False', '0', '109');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('232', 'a / b = 1 / (b / a)', 'False', '0', '109');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('233', 'a ⋅ (b + c) = a ⋅ b + a ⋅ c', 'False', '0', '110');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('234', 'a ⋅ (b - c) = a ⋅ b - a ⋅ c', 'False', '0', '110');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('235', '(a + b) / c = a / c + b / c', 'False', '0', '110');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('236', '(a - b) / c = a / c - b / c', 'False', '0', '110');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('237', '*(a ⋅ b) + c = a ⋅ (b + c)', 'True', '0', '110');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('336', 'Asociativní vlastnost', 'False', '0', '171');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('337', '*Komutativní vlastnost', 'True', '0', '171');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('338', 'Distributivní vlastnost', 'False', '0', '171');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('339', 'Identitní vlastnost', 'False', '0', '171');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('340', 'Inverzní vlastnost', 'False', '0', '171');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('341', '*3 + 5 = 5 + 3', 'True', '0', '172');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('342', '3 + 5 = 8', 'False', '0', '172');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('343', '3 + (5 + 2) = (3 + 5) + 2', 'False', '0', '172');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('344', '3 + 0 = 3', 'False', '0', '172');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('345', '3 + (-3) = 0', 'False', '0', '172');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('346', '*Asociativní vlastnost', 'True', '0', '173');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('347', 'Komutativní vlastnost', 'False', '0', '173');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('348', 'Distributivní vlastnost', 'False', '0', '173');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('349', 'Identitní vlastnost', 'False', '0', '173');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('350', 'Inverzní vlastnost', 'False', '0', '173');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('358', '3 + 5 = 5 + 3', 'False', '0', '174');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('359', '3 + 5 = 8', 'False', '0', '174');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('360', '*3 + (5 + 2) = (3 + 5) + 2', 'True', '0', '174');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('361', '3 + 0 = 3', 'False', '0', '174');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('362', '3 + (-3) = 0', 'False', '0', '174');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('393', 'Asociativní vlastnost', 'False', '0', '191');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('394', '*Komutativní vlastnost', 'True', '0', '191');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('395', 'Distributivní vlastnost', 'False', '0', '191');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('396', 'Identitní vlastnost', 'False', '0', '191');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('397', 'Inverzní vlastnost', 'False', '0', '191');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('400', '*3 ⋅ 5 = 5 ⋅ 3', 'True', '0', '192');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('401', '3 ⋅ 5 = 15', 'False', '0', '192');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('402', '3 ⋅ (5 ⋅ 2) = (3 ⋅ 5) ⋅ 2', 'False', '0', '192');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('403', '3 ⋅ 1 = 3', 'False', '0', '192');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('404', '3 ⋅ 1/3 = 1', 'False', '0', '192');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('405', '*Asociativní vlastnost', 'True', '0', '193');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('406', 'Komutativní vlastnost', 'False', '0', '193');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('407', 'Distributivní vlastnost', 'False', '0', '193');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('408', 'Identitní vlastnost', 'False', '0', '193');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('409', 'Inverzní vlastnost', 'False', '0', '193');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('410', '3 ⋅ 5 = 5 ⋅ 3', 'False', '0', '194');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('411', '3 ⋅ 5 = 15', 'False', '0', '194');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('412', '*3 ⋅ (5 ⋅ 2) = (3 ⋅ 5) ⋅ 2', 'True', '0', '194');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('413', '3 ⋅ 1 = 3', 'False', '0', '194');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('414', '3 ⋅ 1/3 = 1', 'False', '0', '194');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('500', 'sin(2α) = sin²(α) + cos²(α) ', 'False', '0', '311');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('501', '*sin(2α) = 2sin(α)cos(α)', 'True', '0', '311');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('502', 'sin(2α) = cos²(α) - sin²(α)', 'False', '0', '311');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('503', 'sin(2α) = 2tan(α) / (1 - tan²(α))', 'False', '0', '311');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('504', 'sin(2α) = (cot²(α) - 1) / 2cot(α)', 'False', '0', '311');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('505', 'cos(2α) = sin²(α) + cos²(α) ', 'False', '0', '312');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('506', 'cos(2α) = 2sin(α)cos(α)', 'False', '0', '312');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('507', '*cos(2α) = cos²(α) - sin²(α)', 'True', '0', '312');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('508', 'cos(2α) = 2tan(α) / (1 - tan²(α))', 'False', '0', '312');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('509', 'cos(2α) = (cot²(α) - 1) / 2cot(α)', 'False', '0', '312');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('510', 'tan(2α) = sin²(α) + cos²(α) ', 'False', '0', '313');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('511', 'tan(2α) = 2sin(α)cos(α)', 'False', '0', '313');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('512', 'tan(2α) = cos²(α) - sin²(α)', 'False', '0', '313');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('513', '*tan(2α) = 2tan(α) / (1 - tan²(α))', 'True', '0', '313');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('514', 'tan(2α) = (cot²(α) - 1) / 2cot(α)', 'False', '0', '313');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('516', 'sin(α ± β) = sin²(α) ∓ cos²(β) ', 'False', '0', '301');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('517', '*sin(α ± β) = sin(α)cos(β) ± cos(α)sin(β)', 'True', '0', '301');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('518', 'sin(α ± β) = cos(α)cos(β) ∓ sin(α)sin(β)', 'False', '0', '301');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('519', 'sin(α ± β) = (tan(α) ± tan(β)) / (1 ∓ tan(α)tan(β))', 'False', '0', '301');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('520', 'sin(α ± β) = (cot(α)cot(β) ∓ 1) / (cot(α) ± cot(β))', 'False', '0', '301');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('521', 'cos(α ± β) = sin²(α) ∓ cos²(β)', 'False', '0', '302');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('522', 'cos(α ± β) = sin(α)cos(β) ± cos(α)sin(β)', 'False', '0', '302');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('523', '*cos(α ± β) = cos(α)cos(β) ∓ sin(α)sin(β)', 'True', '0', '302');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('524', 'cos(α ± β) = (tan(α) ± tan(β)) / (1 ∓ tan(α)tan(β))', 'False', '0', '302');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('525', 'cos(α ± β) = (cot(α)cot(β) ∓ 1) / (cot(α) ± cot(β))', 'False', '0', '302');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('527', 'tan(α ± β) = sin²(α) ∓ cos²(β)', 'False', '0', '303');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('528', 'tan(α ± β) = sin(α)cos(β) ± cos(α)sin(β)', 'False', '0', '303');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('529', 'tan(α ± β) = cos(α)cos(β) ∓ sin(α)sin(β)', 'False', '0', '303');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('530', '*tan(α ± β) = (tan(α) ± tan(β)) / (1 ∓ tan(α)tan(β))', 'True', '0', '303');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('531', 'tan(α ± β) = (cot(α)cot(β) ∓ 1) / (cot(α) ± cot(β))', 'False', '0', '303');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('532', 'cot(α ± β) = sin²(α) ∓ cos²(β)', 'False', '0', '304');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('533', 'cot(α ± β) = sin(α)cos(β) ± cos(α)sin(β)', 'False', '0', '304');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('534', 'cot(α ± β) = cos(α)cos(β) ∓ sin(α)sin(β)', 'False', '0', '304');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('535', 'cot(α ± β) = (tan(α) ± tan(β)) / (1 ∓ tan(α)tan(β))', 'False', '0', '304');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('536', '*cot(α ± β) = (cot(α)cot(β) ∓ 1) / (cot(α) ± cot(β))', 'True', '0', '304');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('537', 'cot(2α) = sin²(α) + cos²(α)', 'False', '0', '314');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('538', 'cot(2α) = 2sin(α)cos(α)', 'False', '0', '314');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('539', 'cot(2α) = cos²(α) - sin²(α)', 'False', '0', '314');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('540', 'cot(2α) = 2tan(α) / (1 - tan²(α))', 'False', '0', '314');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('541', '*cot(2α) = (cot²(α) - 1) / 2cot(α)', 'True', '0', '314');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('542', 'sin(α/2) = √[(1 + cos²(α)) / 2cos(α)]', 'False', '0', '321');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('543', '*sin(α/2) = √[(1 - cos(α)) / 2]', 'True', '0', '321');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('544', 'sin(α/2) = √[(1 + cos(α)) / 2]', 'False', '0', '321');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('545', 'sin(α/2) = √[(1 - cos(α)) / (1 + cos(α)]', 'False', '0', '321');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('546', 'sin(α/2) = √[(1 + cos(α)) / (1 - cos(α)]', 'False', '0', '321');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('547', 'cos(α/2) = √[(1 + cos²(α)) / 2cos(α)]', 'False', '0', '322');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('548', 'cos(α/2) = √[(1 - cos(α)) / 2]', 'False', '0', '322');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('549', '*cos(α/2) = √[(1 + cos(α)) / 2]', 'True', '0', '322');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('550', 'cos(α/2) = √[(1 - cos(α)) / (1 + cos(α)]', 'False', '0', '322');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('551', 'cos(α/2) = √[(1 + cos(α)) / (1 - cos(α)]', 'False', '0', '322');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('552', 'tan(α/2) = √[(1 + cos²(α)) / 2cos(α)]', 'False', '0', '323');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('553', 'tan(α/2) = √[(1 - cos(α)) / 2]', 'False', '0', '323');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('554', 'tan(α/2) = √[(1 + cos(α)) / 2]', 'False', '0', '323');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('555', '*tan(α/2) = √[(1 - cos(α)) / (1 + cos(α)]', 'True', '0', '323');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('556', 'tan(α/2) = √[(1 + cos(α)) / (1 - cos(α)]', 'False', '0', '323');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('557', 'cot(α/2) = √[(1 + cos²(α)) / 2cos(α)]', 'False', '0', '324');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('558', 'cot(α/2) = √[(1 - cos(α)) / 2]', 'False', '0', '324');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('559', 'cot(α/2) = √[(1 + cos(α)) / 2]', 'False', '0', '324');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('560', 'cot(α/2) = √[(1 - cos(α)) / (1 + cos(α)]', 'False', '0', '324');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('561', '*cot(α/2) = √[(1 + cos(α)) / (1 - cos(α)]', 'True', '0', '324');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('562', '*sin(α)sin(β) = 1/2 [cos(α - β) - cos(α + β)]', 'True', '0', '341');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('563', 'sin(α)sin(β) = 1/2 [cos(α + β) + cos(α - β)]', 'False', '0', '341');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('564', 'sin(α)sin(β) = 1/2 [sin(α + β) + sin(α - β)]', 'False', '0', '341');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('565', 'sin(α)sin(β) = (tan(α) + tan(β)) / (cot(α) + cot(β))', 'False', '0', '341');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('566', 'sin(α)sin(β) = (cot(α) + cot(β)) / (tan(α) + tan(β))', 'False', '0', '341');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('567', 'sin(α)sin(β) = (tan(α) + cot(β)) / (cot(α) + tan(β))', 'False', '0', '341');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('568', 'cos(α)cos(β) = 1/2 [cos(α - β) - cos(α + β)]', 'False', '0', '342');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('569', '*cos(α)cos(β) = 1/2 [cos(α + β) + cos(α - β)]', 'True', '0', '342');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('570', 'cos(α)cos(β) = 1/2 [sin(α + β) + sin(α - β)]', 'False', '0', '342');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('571', 'cos(α)cos(β) = (tan(α) + tan(β)) / (cot(α) + cot(β))', 'False', '0', '342');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('572', 'cos(α)cos(β) = (cot(α) + cot(β)) / (tan(α) + tan(β))', 'False', '0', '342');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('573', 'cos(α)cos(β) = (tan(α) + cot(β)) / (cot(α) + tan(β))', 'False', '0', '342');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('574', 'sin(α)cos(β) = 1/2 [cos(α - β) - cos(α + β)]', 'False', '0', '343');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('575', 'sin(α)cos(β) = 1/2 [cos(α + β) + cos(α - β)]', 'False', '0', '343');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('576', '*sin(α)cos(β) = 1/2 [sin(α + β) + sin(α - β)]', 'True', '0', '343');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('577', 'sin(α)cos(β) = (tan(α) + tan(β)) / (cot(α) + cot(β))', 'False', '0', '343');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('578', 'sin(α)cos(β) = (cot(α) + cot(β)) / (tan(α) + tan(β))', 'False', '0', '343');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('579', 'sin(α)cos(β) = (tan(α) + cot(β)) / (cot(α) + tan(β))', 'False', '0', '343');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('580', 'tan(α)tan(β) = 1/2 [cos(α - β) - cos(α + β)]', 'False', '0', '344');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('581', 'tan(α)tan(β) = 1/2 [cos(α + β) + cos(α - β)]', 'False', '0', '344');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('582', 'tan(α)tan(β) = 1/2 [sin(α + β) + sin(α - β)]', 'False', '0', '344');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('583', '*tan(α)tan(β) = (tan(α) + tan(β)) / (cot(α) + cot(β))', 'True', '0', '344');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('584', 'tan(α)tan(β) = (cot(α) + cot(β)) / (tan(α) + tan(β))', 'False', '0', '344');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('585', 'tan(α)tan(β) = (tan(α) + cot(β)) / (cot(α) + tan(β))', 'False', '0', '344');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('586', 'cot(α)cot(β) = 1/2 [cos(α - β) - cos(α + β)]', 'False', '0', '345');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('587', 'cot(α)cot(β) = 1/2 [cos(α + β) + cos(α - β)]', 'False', '0', '345');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('588', 'cot(α)cot(β) = 1/2 [sin(α + β) + sin(α - β)]', 'False', '0', '345');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('589', 'cot(α)cot(β) = (tan(α) + tan(β)) / (cot(α) + cot(β))', 'False', '0', '345');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('590', '*cot(α)cot(β) = (cot(α) + cot(β)) / (tan(α) + tan(β))', 'True', '0', '345');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('591', 'cot(α)cot(β) = (tan(α) + cot(β)) / (cot(α) + tan(β))', 'False', '0', '345');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('592', 'tan(α)cot(β) = 1/2 [cos(α - β) - cos(α + β)]', 'False', '0', '346');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('593', 'tan(α)cot(β) = 1/2 [cos(α + β) + cos(α - β)]', 'False', '0', '346');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('594', 'tan(α)cot(β) = 1/2 [sin(α + β) + sin(α - β)]', 'False', '0', '346');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('595', 'tan(α)cot(β) = (tan(α) + tan(β)) / (cot(α) + cot(β))', 'False', '0', '346');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('596', 'tan(α)cot(β) = (cot(α) + cot(β)) / (tan(α) + tan(β))', 'False', '0', '346');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('597', '*tan(α)cot(β) = (tan(α) + cot(β)) / (cot(α) + tan(β))', 'True', '0', '346');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('598', 'přilehlé strany ', 'False', '1', '241');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('599', '*protilehlé strany', 'True', '1', '241');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('600', 'přepony ', 'False', '1', '241');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('601', 'přilehlé strany ', 'False', '2', '241');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('602', 'protilehlé strany', 'False', '2', '241');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('603', '*přepony ', 'True', '2', '241');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('604', 'sin(α) = přepona / protilehlá strana', 'False', '0', '242');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('605', 'sin(α) = přepona / přilehlá strana', 'False', '0', '242');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('606', '*sin(α) = protilehlá strana / přepona', 'True', '0', '242');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('607', 'sin(α) = přilehlá strana / přepona', 'False', '0', '242');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('608', 'sin(α) = protilehlá strana / přilehlá strana', 'False', '0', '242');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('609', 'sin(α) = přilehlá strana / protilehlá strana', 'False', '0', '242');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('610', 'sin(α) = 5/3', 'False', '0', '243');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('611', 'sin(α) = 5/4', 'False', '0', '243');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('612', '*sin(α) = 3/5', 'True', '0', '243');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('613', 'sin(α) = 4/5', 'False', '0', '243');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('614', 'sin(α) = 3/4', 'False', '0', '243');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('615', 'sin(α) = 4/3', 'False', '0', '243');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('616', '*přilehlé strany ', 'True', '1', '251');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('617', 'protilehlé strany', 'False', '1', '251');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('618', 'přepony ', 'False', '1', '251');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('619', 'přilehlé strany ', 'False', '2', '251');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('620', 'protilehlé strany', 'False', '2', '251');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('621', '*přepony ', 'True', '2', '251');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('622', 'cos(α) = přepona / protilehlá strana', 'False', '0', '252');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('623', 'cos(α) = přepona / přilehlá strana', 'False', '0', '252');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('624', 'cos(α) = protilehlá strana / přepona', 'False', '0', '252');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('625', '*cos(α) = přilehlá strana / přepona', 'True', '0', '252');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('626', 'cos(α) = protilehlá strana / přilehlá strana', 'False', '0', '252');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('627', 'cos(α) = přilehlá strana / protilehlá strana', 'False', '0', '252');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('628', 'cos(α) = 5/3', 'False', '0', '253');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('629', 'cos(α) = 5/4', 'False', '0', '253');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('630', 'cos(α) = 3/5', 'False', '0', '253');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('631', '*cos(α) = 4/5', 'True', '0', '253');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('632', 'cos(α) = 3/4', 'False', '0', '253');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('633', 'cos(α) = 4/3', 'False', '0', '253');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('634', 'přilehlé strany ', 'False', '1', '261');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('635', '*protilehlé strany', 'True', '1', '261');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('636', 'přepony ', 'False', '1', '261');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('637', '*přilehlé strany ', 'True', '2', '261');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('638', 'protilehlé strany', 'False', '2', '261');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('639', 'přepony ', 'False', '2', '261');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('640', 'tan(α) = přepona / protilehlá strana', 'False', '0', '262');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('641', 'tan(α) = přepona / přilehlá strana', 'False', '0', '262');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('642', 'tan(α) = protilehlá strana / přepona', 'False', '0', '262');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('643', 'tan(α) = přilehlá strana / přepona', 'False', '0', '262');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('644', '*tan(α) = protilehlá strana / přilehlá strana', 'True', '0', '262');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('645', 'tan(α) = přilehlá strana / protilehlá strana', 'False', '0', '262');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('646', 'tan(α) = 5/3', 'False', '0', '263');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('647', 'tan(α) = 5/4', 'False', '0', '263');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('648', 'tan(α) = 3/5', 'False', '0', '263');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('649', 'cos(α) = 4/5', 'False', '0', '263');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('650', '*tan(α) = 3/4', 'True', '0', '263');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('651', 'tan(α) = 4/3', 'False', '0', '263');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('652', '*přilehlé strany ', 'True', '1', '271');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('653', 'protilehlé strany', 'False', '1', '271');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('654', 'přepony ', 'False', '1', '271');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('655', '*přilehlé strany ', 'True', '2', '271');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('656', 'protilehlé strany', 'False', '2', '271');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('657', 'přepony ', 'False', '2', '271');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('658', 'cot(α) = přepona / protilehlá strana', 'False', '0', '272');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('659', 'cot(α) = přepona / přilehlá strana', 'False', '0', '272');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('660', 'cot(α) = protilehlá strana / přepona', 'False', '0', '272');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('661', 'cot(α) = přilehlá strana / přepona', 'False', '0', '272');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('662', 'cot(α) = protilehlá strana / přilehlá strana', 'False', '0', '272');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('663', '*cot(α) = přilehlá strana / protilehlá strana', 'True', '0', '272');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('664', 'cot(α) = 5/3', 'False', '0', '273');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('665', 'cot(α) = 5/4', 'False', '0', '273');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('666', 'cot(α) = 3/5', 'False', '0', '273');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('667', 'cot(α) = 4/5', 'False', '0', '273');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('668', 'cot(α) = 3/4', 'False', '0', '273');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('669', '*cot(α) = 4/3', 'True', '0', '273');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('670', 'sin(α) = tan(α) + cot(α)', 'False', '0', '281');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('671', 'sin(α) = tan(α) / cot(α)', 'False', '0', '281');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('672', 'sin(α) = cot(α) / tan(α)', 'False', '0', '281');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('673', '*sin(α) = √[1 - cos²(α)]', 'True', '0', '281');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('674', 'sin(α)= 1 / cos(α)', 'False', '0', '281');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('675', 'cos(α) = tan(α) - cot(α)', 'False', '0', '282');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('676', 'cos(α) = tan(α) / cot(α)', 'False', '0', '282');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('677', 'cos(α) = cot(α) / tan(α)', 'False', '0', '282');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('678', '*cos(α) = √[1 - sin²(α)]', 'True', '0', '282');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('679', 'cos(α)= 1 / sin(α)', 'False', '0', '282');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('680', 'tan(α) = sin(α) + cos(α)', 'False', '0', '283');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('681', '*tan(α) = sin(α) / cos(α)', 'True', '0', '283');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('682', 'tan(α) = cos(α) / sin(α)', 'False', '0', '283');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('683', 'tan(α) = √[1 - cos²(α)]', 'False', '0', '283');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('684', 'tan(α)= √[1 / cot(α)]', 'False', '0', '283');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('685', 'cot(α) = sin(α) - cos(α)', 'False', '0', '284');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('686', 'cot(α) = sin(α) / cos(α)', 'False', '0', '284');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('687', '*cot(α) = cos(α) / sin(α)', 'True', '0', '284');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('688', 'cot(α) = √[1 - sin²(α)]', 'False', '0', '284');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('689', 'cot(α)= √[1 / tan(α)]', 'False', '0', '284');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('690', 'sin(α) = √[1 - cos²(α)]', 'False', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('691', 'cos(α) = √[1 - sin²(α)]', 'False', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('692', 'tan(α) = sin(α) / cos(α)', 'False', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('693', 'cot(α) = cos(α) / sin(α)', 'False', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('694', 'tan(α)= 1 / cot(α)', 'False', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('695', 'cot(α)= 1 / tan(α)', 'False', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('696', '*Všechny jsou správně.', 'True', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('697', 'Všechny jsou špatně.', 'False', '0', '285');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('698', 'Mocniny a odmocniny', 'False', '1', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('699', 'Sčítání a odčítání', 'False', '1', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('700', 'Násobení a dělení', 'False', '1', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('701', '*Závorky', 'True', '1', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('702', '*Mocniny a odmocniny', 'True', '2', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('703', 'Sčítání a odčítání', 'False', '2', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('704', 'Násobení a dělení', 'False', '2', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('705', 'Závorky', 'False', '2', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('706', 'Mocniny a odmocniny', 'False', '3', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('707', 'Sčítání a odčítání', 'False', '3', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('708', '*Násobení a dělení', 'True', '3', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('709', 'Závorky', 'False', '3', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('710', 'Mocniny a odmocniny', 'False', '4', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('711', '*Sčítání a odčítání', 'True', '4', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('712', 'Násobení a dělení', 'False', '4', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('713', 'Závorky', 'False', '4', '79');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('714', '*Věda o měření úhlů a jejich aplikacích.', 'True', '0', '231');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('715', 'Věda o měření objemů.', 'False', '0', '231');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('716', 'Věda o měření hmotnosti.', 'False', '0', '231');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('717', 'Věda o měření času.', 'False', '0', '231');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('718', 'Věda o měření teploty.', 'False', '0', '231');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('720', 'Logaritmus.', 'False', '0', '232');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('721', 'Exponenciální funkce.', 'False', '0', '232');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('722', '*Sinus.', 'True', '0', '232');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('723', 'Kvadratická funkce.', 'False', '0', '232');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('724', 'Lineární funkce.', 'False', '0', '232');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('725', 'Logaritmus.', 'False', '0', '233');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('726', 'Exponenciální funkce.', 'False', '0', '233');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('727', '*Kosinus.', 'True', '0', '233');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('728', 'Kvadratická funkce.', 'False', '0', '233');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('729', 'Lineární funkce.', 'False', '0', '233');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('730', 'Logaritmus.', 'False', '0', '234');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('731', 'Exponenciální funkce.', 'False', '0', '234');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('732', '*Tangens.', 'True', '0', '234');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('733', 'Kvadratická funkce.', 'False', '0', '234');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('734', 'Lineární funkce.', 'False', '0', '234');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('735', 'Logaritmus.', 'False', '0', '235');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('736', 'Exponenciální funkce.', 'False', '0', '235');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('737', '*Kotangens.', 'True', '0', '235');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('738', 'Kvadratická funkce.', 'False', '0', '235');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('739', 'Lineární funkce.', 'False', '0', '235');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('740', 'Sinus.', 'False', '0', '236');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('741', 'Kosinus.', 'False', '0', '236');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('742', 'Tangens.', 'False', '0', '236');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('743', 'Kotangens.', 'False', '0', '236');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('744', '*Logaritmus.', 'True', '0', '236');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('746', '*0', 'True', '1', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('747', '1/2', 'False', '1', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('748', '(√2)/2', 'False', '1', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('749', '(√3)/2', 'False', '1', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('750', '1', 'False', '1', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('751', '*1', 'True', '2', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('752', '(√3)/2', 'False', '2', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('753', '(√2)/2', 'False', '2', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('754', '1/2', 'False', '2', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('755', '0', 'False', '2', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('756', '*0', 'True', '3', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('757', '(√3)/3', 'False', '3', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('758', '1', 'False', '3', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('759', '√3', 'False', '3', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('760', 'nedef.', 'False', '3', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('761', '*nedef.', 'True', '4', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('762', '√3', 'False', '4', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('763', '1', 'False', '4', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('764', '(√3)/3', 'False', '4', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('765', '0', 'False', '4', '351');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('766', '0', 'False', '1', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('767', '*1/2', 'True', '1', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('768', '(√2)/2', 'False', '1', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('769', '(√3)/2', 'False', '1', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('770', '1', 'False', '1', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('771', '1', 'False', '2', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('772', '*(√3)/2', 'True', '2', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('773', '(√2)/2', 'False', '2', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('774', '1/2', 'False', '2', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('775', '0', 'False', '2', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('776', '0', 'False', '3', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('777', '*(√3)/3', 'True', '3', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('778', '1', 'False', '3', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('779', '√3', 'False', '3', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('780', 'nedef.', 'False', '3', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('781', 'nedef.', 'False', '4', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('782', '*√3', 'True', '4', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('783', '1', 'False', '4', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('784', '(√3)/3', 'False', '4', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('785', '0', 'False', '4', '352');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('786', '0', 'False', '1', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('787', '1/2', 'False', '1', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('788', '*(√2)/2', 'True', '1', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('789', '(√3)/2', 'False', '1', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('790', '1', 'False', '1', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('791', '1', 'False', '2', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('792', '(√3)/2', 'False', '2', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('793', '*(√2)/2', 'True', '2', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('794', '1/2', 'False', '2', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('795', '0', 'False', '2', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('796', '0', 'False', '3', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('797', '(√3)/3', 'False', '3', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('798', '*1', 'True', '3', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('799', '√3', 'False', '3', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('800', 'nedef.', 'False', '3', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('801', 'nedef.', 'False', '4', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('802', '√3', 'False', '4', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('803', '*1', 'True', '4', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('804', '(√3)/3', 'False', '4', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('805', '0', 'False', '4', '353');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('806', '0', 'False', '1', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('807', '1/2', 'False', '1', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('808', '(√2)/2', 'False', '1', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('809', '*(√3)/2', 'True', '1', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('810', '1', 'False', '1', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('811', '1', 'False', '2', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('812', '(√3)/2', 'False', '2', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('813', '(√2)/2', 'False', '2', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('814', '*1/2', 'True', '2', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('815', '0', 'False', '2', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('816', '0', 'False', '3', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('817', '(√3)/3', 'False', '3', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('818', '1', 'False', '3', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('819', '*√3', 'True', '3', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('820', 'nedef.', 'False', '3', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('821', 'nedef.', 'False', '4', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('822', '√3', 'False', '4', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('823', '1', 'False', '4', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('824', '*(√3)/3', 'True', '4', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('825', '0', 'False', '4', '354');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('826', '0', 'False', '1', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('827', '1/2', 'False', '1', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('828', '(√2)/2', 'False', '1', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('829', '(√3)/2', 'False', '1', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('830', '*1', 'True', '1', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('831', '1', 'False', '2', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('832', '(√3)/2', 'False', '2', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('833', '(√2)/2', 'False', '2', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('834', '1/2', 'False', '2', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('835', '*0', 'True', '2', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('836', '0', 'False', '3', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('837', '(√3)/3', 'False', '3', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('838', '1', 'False', '3', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('839', '√3', 'False', '3', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('840', '*nedef.', 'True', '3', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('841', 'nedef.', 'False', '4', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('842', '√3', 'False', '4', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('843', '1', 'False', '4', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('844', '(√3)/3', 'False', '4', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('845', '*0', 'True', '4', '355');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('851', 'Ano, vždy', 'False', '0', '143');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('852', 'Ne', 'False', '0', '143');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('853', '*Ano, vzhledem ke sčítání a odčítání (zprava)', 'True', '0', '143');
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
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('865', '*Ano, vzhledem k násobení a dělení', 'True', '0', '163');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('866', 'Ano, vzhledem k mocnění', 'False', '0', '163');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1001', '*whole program', 'True', '1', '1001');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1002', 'alternative part', 'False', '1', '1001');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1003', '*int', 'True', '2', '1001');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1004', 'string', 'False', '2', '1001');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1005', '*returned value', 'True', '3', '1001');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1006', 'clear screen', 'False', '3', '1001');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1007', 'clear input buffer', 'False', '3', '1001');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1008', 'Yes', 'False', '0', '1002');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1009', '*No', 'True', '0', '1002');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1010', '*parenthesis.', 'True', '0', '1003');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1011', 'curly brackets.', 'False', '0', '1003');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1012', 'spaces.', 'False', '0', '1003');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1013', '*file with function declaration and/or some definition in C/C++ language.', 'True', '0', '1004');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1014', 'file with a part of function body or main function body.', 'False', '0', '1004');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1015', 'file containing the first line of C/C++ source code.', 'False', '0', '1004');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1016', 'file containing any part of source code.', 'False', '0', '1004');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1017', '*Yes', 'True', '0', '1005');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1018', 'No', 'False', '0', '1005');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1019', '*#include <filename>', 'True', '0', '1006');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1020', '#using <filename>', 'False', '0', '1006');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1021', '#include "filename"', 'False', '0', '1006');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1022', '!copy filename', 'False', '0', '1006');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1023', '*#include "filename"', 'True', '0', '1007');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1024', '#define "filename"', 'False', '0', '1007');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1025', '#use "filename"', 'False', '0', '1007');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1026', '#include <filename>', 'False', '0', '1007');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1027', '*#include <iostream>', 'True', '0', '1008');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1028', '#include <stdio>', 'False', '0', '1008');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1029', '#include "inputoutput"', 'False', '0', '1008');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1030', '#input "iostream"', 'False', '0', '1008');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1031', '*cin >> A >> B;', 'True', '1', '1009');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1032', 'cin >> A >> cin >> B;', 'False', '1', '1009');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1033', 'cin << A << B;', 'False', '1', '1009');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1034', '*cout << "Contents "<< A*B << ", perimeter " << (A+B)*2 <<"."<<endl;', 'True', '2', '1009');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1035', 'cout >> "Contents ">> A*B >> ", perimeter " >> (A+B)*2 >>".">>endl;', 'False', '2', '1009');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1036', 'cout >> "Contents " cout >> A*B << cout >> ", perimeter " cout >> (A+B)*2 cout >> "." << endl;', 'False', '2', '1009');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1037', '*float, double, long double.', 'True', '0', '1014');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1038', 'single, double, extended.', 'False', '0', '1014');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1039', 'real, comp, decimal.', 'False', '0', '1014');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1046', 'numeric, float, extended.', 'False', '0', '1014');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1047', '24', 'True', '0', '1016');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1049', '*44 (or character '','')', 'True', '0', '1019');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1050', '300 (or char ''ň'')', 'False', '0', '1019');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1051', '255', 'False', '0', '1019');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1052', '344 (or two characters "ň,"', 'False', '0', '1019');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1053', '*y *= x/(i*(i-1))', 'True', '0', '1022');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1054', 'y += y*x/i/(i-1)', 'False', '0', '1022');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1055', 'y = y*x*1/i*(i-1)', 'False', '0', '1022');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1056', 'y *= y*x /(i*i-1)', 'False', '0', '1022');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1057', '*F = 9*C/5+32;', 'True', '0', '1023');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1058', 'F = 9C/5+32;', 'False', '0', '1023');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1059', 'F = 9/5/C+32;', 'False', '0', '1023');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1060', 'F = 9C/(5+32);', 'False', '0', '1023');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1061', '*radius', 'True', '1', '1024');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1062', 'volume', 'False', '1', '1024');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1063', 'height', 'False', '1', '1024');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1064', '*volume = radius * radius * M_PI * height', 'True', '2', '1024');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1065', 'radius *= M_PI * height', 'False', '2', '1024');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1066', 'volume * M_PI * radius', 'False', '2', '1024');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1067', '*volume *= 4', 'True', '3', '1024');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1068', '4 * radius * radius * height', 'False', '3', '1024');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1069', 'volume * 4', 'False', '3', '1024');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1070', '*volume * 10', 'True', '4', '1024');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1071', 'radius * radius * 10 * M_PI', 'False', '4', '1024');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1072', 'volume += 10', 'False', '4', '1024');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1073', '*50', 'True', '0', '1025');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1074', '80', 'False', '0', '1025');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1075', '72', 'False', '0', '1025');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1076', '95', 'False', '0', '1025');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1077', '*<cstdio>', 'True', '1', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1078', 'MeasureB', 'False', '1', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1079', '%d%d', 'False', '1', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1080', 'MeasureA', 'False', '1', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1081', 'return', 'False', '1', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1082', 'integer', 'False', '1', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1083', '%2d%2f', 'False', '1', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1084', '*Values are 3.14, more than 10 times
and A is name of first variable.', 'True', '0', '1027');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1085', 'Values are 10.3, more than 14 times
and 65 is name of first variable.', 'False', '0', '1027');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1086', 'Values are 10 and 3, more than 14 timesnand A is name of first variable.', 'False', '0', '1027');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1087', 'Values are 14, more than 30 times and 65 is name of first variable.', 'False', '0', '1027');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1088', '*"The return count of negative numbers is %05d.\nMinimal number with sign was: %+10.5f and its category was: %c."', 'True', '1', '1028');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1089', '"The return count of negative numbers is %50x. Minimal number with sign was: %-5.5d and its category was: %hh."', 'False', '1', '1028');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1090', '"The return count of negative numbers is \n%5d. Minimal number with sign was: %3.5o and its category was: %C."', 'False', '1', '1028');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1091', '"The return count of \nnegative \nnumbers is %d. Minimal \nnumber with sign was: %10f and its category was: %HH."', 'False', '1', '1028');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1092', '*cout << "Radius of sphere: " << setw(10)
       <<setprecision(3)<<fixed<<right<<radius <<" cm," << endl;
 cout << "Volume of sphere: " << setw(10)<<volume << " cm3"<<endl;', 'True', '0', '1030');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1093', 'cout << "Radius of sphere: " << radius:setw(10):3
       <<right << " cm," << endl;
 cout << "Volume of sphere: " << volume:setw(10):3 << " cm3"<<endl;', 'False', '0', '1030');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1094', 'cout << "Radius of sphere: " << nouppercase
        <<setprecision(3)<<floated<< leftspaces <<radius << " cm," << endl;
  cout << "Volume of sphere: " << leftspaces <<volume << " cm3"<<endl;', 'False', '0', '1030');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1095', 'cout << "Radius of sphere: " << width(10)
        <<precision:3<<fixed<<right << radius << " cm," << endl;
  cout << "Volume of sphere: " << width(10) << volume << " cm3"<<endl;', 'False', '0', '1030');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1096', '*cin.get(a); cin.get(b);', 'True', '1', '1031');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1097', 'cin >> get(a); cin >> get(b);', 'False', '1', '1031');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1098', 'cin >> a >> b;', 'False', '1', '1031');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1099', '*a<='' ''', 'True', '2', '1031');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1100', 'a=='' ''', 'False', '2', '1031');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1101', 'a=='' '' or a==''tab''', 'False', '2', '1031');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1102', '*b<='' ''', 'True', '3', '1031');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1103', 'b=='' ''', 'False', '3', '1031');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1104', 'b=='' '' or b==''tab''', 'False', '3', '1031');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1105', 'true', 'False', '0', '1032');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1106', '*false', 'True', '0', '1032');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1107', '*(Salary >= 1000) and (Salary <= 3000)', 'True', '0', '1033');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1108', '(Salary = 1000) or (Salary = 3000)', 'False', '0', '1033');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1109', '(Salary <= 1000) xor (Salary >= 3000)', 'False', '0', '1033');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1110', '(Salary >= 1000 and <= 3000)', 'False', '0', '1033');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1111', '*(Number >=0) and (Number % 2 == 1)', 'True', '0', '1034');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1112', 'Number positive and Number odd', 'False', '0', '1034');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1113', '(Number !=0) or (Number % 2 != 0)', 'False', '0', '1034');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1114', 'Number between 0 and odd(100)', 'False', '0', '1034');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1115', '*axis', 'True', '0', '1035');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1116', 'especially', 'False', '0', '1035');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1117', 'average', 'False', '0', '1035');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1118', 'ethernet', 'False', '0', '1035');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1119', '*if (Count % 2 == 0) cout << Count << endl;', 'True', '0', '1036');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1120', 'if {Count % 2 == 0} (cout << Count << endl;)', 'False', '0', '1036');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1121', 'if (cout % 2 != 1) Count << cout << endl;', 'False', '0', '1036');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1122', 'if (Count == 2) {cout << Count << endl};', 'False', '0', '1036');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1123', '*float', 'True', '1', '1037');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1124', 'int', 'False', '1', '1037');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1125', 'bool', 'False', '1', '1037');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1126', 'unsigned long', 'False', '1', '1037');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1127', '*cin >>', 'True', '2', '1037');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1128', 'cin <<', 'False', '2', '1037');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1129', 'cout <<', 'False', '2', '1037');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1130', 'cout >>', 'False', '2', '1037');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1131', '*(Average < 1.2)', 'True', '3', '1037');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1132', '(Average == 1.2)', 'False', '3', '1037');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1133', '(Average > 1.2)', 'False', '3', '1037');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1134', '(1.2 < Average)', 'False', '3', '1037');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1135', 'true', 'False', '0', '1038');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1136', '*false', 'True', '0', '1038');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1137', '*Sum is: 0, Current is: 10', 'True', '0', '1039');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1138', 'Sum is: 11, Current is: 10', 'False', '0', '1039');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1139', 'Sum is: 0, Current is: 11', 'False', '0', '1039');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1140', 'Sum is: 11, Current is: 11', 'False', '0', '1039');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1141', '*if  (Number1 > Number2) cout << "Number1 is greater than Number2" << endl;
 else if (Number1 < Number2) cout << "Number2 is greater than Number1" << endl;', 'True', '0', '1040');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1142', 'if  (Number1 == Number2) else if (Number1 > Number2)
     cout << "Number1 is greater than Number2" << endl;
 else cout << "Number2 is greater than Number1" <<  endl;', 'False', '0', '1040');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1143', 'if  (Number1 < Number2) cout << "Number2 is greater than Number1" << endl;
 else if (Number1 != Number2) cout << "Number1 is greater than Number2" << endl;', 'False', '0', '1040');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1144', 'if  (Number1 == Number2) cout << "Number1 is greater than Number2" << endl;
 else if (Number1 > Number2) cout << "Number2 is greater than Number1" << endl;', 'False', '0', '1040');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1145', '*if (Distance < 10) cout << "Fare is 1 €";
 else if (Distance < 20) cout << "Fare is 2 €";
    else if (Distance < 40) cout << "Fare is 3 €";
       else if (Distance < 100) cout << "Fare is 5 €";
          else cout << "Fare is " << (((Distance / 100) + 1) * 3) << " €"', 'True', '0', '1041');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1146', 'if (Distance > 0) cout << "Fare is 1 €";
 else if (Distance >= 10) cout << "Fare is 2 €";
    else if (Distance >= 20) cout << "Fare is 3 €";
       else if (Distance >= 40) cout << "Fare is 5 €";
          else cout << "Fare is " << (((Distance / 100) + 1) * 3) << " €"', 'False', '0', '1041');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1147', 'if (Distance < 100) cout << "Fare is 5 €";
 else if (Distance < 40) cout << "Fare is 3 €";
    else if (Distance < 20) cout << "Fare is 2 €";
       else if (Distance < 10) cout << "Fare is 1 €";
          else cout << "Fare is " << (((Distance / 100) + 1) * 3) << " €"', 'False', '0', '1041');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1148', 'if (Distance <= 10) cout << "Fare is 1 €";
 else if (Distance <= 20) cout << "Fare is 2 €";
    else if (Distance <= 40) cout << "Fare is 3 €";
       else if (Distance <= 100) cout << "Fare is 5 €";
          else cout << "Fare is " << (((Distance / 100) + 1) * 3) << " €"', 'False', '0', '1041');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1149', '*X < 40', 'True', '1', '1042');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1150', 'X == 40', 'False', '1', '1042');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1151', 'X > 40', 'False', '1', '1042');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1152', '*€200', 'True', '2', '1042');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1153', '€300', 'False', '2', '1042');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1154', '€350', 'False', '2', '1042');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1155', '*X < 40*1.2', 'True', '3', '1042');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1156', 'X <= 40 * 20 %', 'False', '3', '1042');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1157', 'X * 0.8 < 40', 'False', '3', '1042');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1158', '*char', 'True', '1', '1043');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1159', 'int', 'False', '1', '1043');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1160', 'float', 'False', '1', '1043');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1161', '*(Grade == ''A'' or Grade == ''B'')', 'True', '2', '1043');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1162', '(Grade != ''C'' and Grade != ''D'')', 'False', '2', '1043');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1163', '(Grade >= ''A'')', 'False', '2', '1043');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1164', '*(Grade == ''E'')', 'True', '3', '1043');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1165', '(Grade < ''E'')', 'False', '3', '1043');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1166', '(Grade != ''E'')', 'False', '3', '1043');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1167', 'true', 'False', '0', '1044');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1168', '*false', 'True', '0', '1044');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1169', '*X = (Side * Side > 4 * Side) ? Side * Side : 4 * Side;', 'True', '0', '1045');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1170', 'X = Side * (Side > 4 ? Side : 4);', 'False', '0', '1045');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1171', 'X = (Side * Side < 4 * Side) ? Side * Side : 4 * Side;', 'False', '0', '1045');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1172', 'X = (Side * 2 < 4 * Side) ? 2 * Side : 4 * Side;', 'False', '0', '1045');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1173', '*Current < 0', 'True', '1', '1046');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1174', '-Current < 0', 'False', '1', '1046');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1175', '(Current >= 0', 'False', '1', '1046');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1176', '*Count++', 'True', '2', '1046');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1177', 'Count += 2', 'False', '2', '1046');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1178', 'Count = 1', 'False', '2', '1046');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1179', '*', 'True', '3', '1046');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1180', 'Count -=1', 'False', '3', '1046');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1181', 'Count != 1', 'False', '3', '1046');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1182', '*Count = Sum > 1000 ? Count + 1 : Count - 1;
Sum = Sum > 1000 ? Sum - Current : Sum + Current;', 'True', '0', '1047');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1183', 'Sum = Sum > 1000 ? Sum - Current : Sum + Current;
Count = Sum > 1000 ? Count + 1 : Count - 1;', 'False', '0', '1047');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1184', 'Count = Sum < 1000 ? Count ++ : Count --;
Sum = Sum < 1000 ? Sum - Current : Sum + Current;', 'False', '0', '1047');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1185', 'Sum += Sum > 1000 ? -Current : Current;
Count += Sum > 1000 ? 1 : -2;', 'False', '0', '1047');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1186', '*if (Lap < 100) { Speed += CurSpeed; Lap++; }', 'True', '0', '1048');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1187', 'if (Lap > 100) Lap--;
 if (Lap < 100) Speed = CurSpeed; else Speed = -CurSpeed;', 'False', '0', '1048');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1188', 'if (Lap < 100)
    Speed = Speed + CurSpeed;
    Lap = Lap + 1;', 'False', '0', '1048');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1189', 'if (Lap < 100) else {Speed += CurSpeed; Lap--;}', 'False', '0', '1048');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1190', '*((a - b != 0) and (b >=0))', 'True', '1', '1049');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1191', '(b >= 0) or (a == b)', 'False', '1', '1049');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1192', '((sqrt(b) >= 0) and (1 / (a - b) != 0))', 'False', '1', '1049');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1193', '*(a*a - sqrt(b)) / (a - b)', 'True', '2', '1049');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1194', 'log10((a*a - sqrt(b)) / (a - b))', 'False', '2', '1049');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1195', 'pow(a, 2) - sqrt(b) / a – b', 'False', '2', '1049');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1196', '*(result > 0)', 'True', '3', '1049');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1197', '(log10(result) != 0)', 'False', '3', '1049');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1198', 'result * log10 != 0', 'False', '3', '1049');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1199', '*(y == 34 / (x + 12))', 'True', '0', '1050');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1200', '(y * x - 12) == 34', 'False', '0', '1050');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1201', '(y == (34 / x + 12))', 'False', '0', '1050');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1202', '(x + 12 != 34 / y)', 'False', '0', '1050');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1203', '*eeeee+any consonant.', 'True', '0', '1051');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1204', 'e+any consonant.', 'False', '0', '1051');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1205', 'eiouy', 'False', '0', '1051');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1206', 'eiouy+any consonant.', 'False', '0', '1051');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1207', '*switch (Power){
   case 0: result = 1; break;
   case 1: result = Base; break;
   case 2: result = Base*Base; break;
   case 3: result = Base*Base*Base; break;
   case 4: result = Base*Base*Base*Base; break;
   case 5: result = Base*Base*Base*Base*Base; break;
   default: result = 0;
 }', 'True', '0', '1052');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1208', 'result = Base;
 switch (Power){
   default: result = 0; break;
   case 0: result = 1; break;
   case 5: result *= Base;
   case 4: result *= Base;
   case 3: result *= Base;
   case 2: result *= Base;
   case 1: ;
 }', 'False', '0', '1052');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1209', 'switch (Power){
   case 0: result = 1; break;
   case 5: result *= Base; break;
   case 4: result *= Base; break;
   case 3: result *= Base; break;
   case 2: result *= Base; break;
   case 1: ;
   default: result = 0;
 }', 'False', '0', '1052');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1210', 'result = Base;
 switch (Power){
   case 0: result += 1;
   case 1: result += Base;
   case 2: result += Base*Base;
   case 3: result += Base*Base*Base;
   case 4: result += Base*Base*Base*Base;
   case 5: result += Base*Base*Base*Base*Base;
   default: result += 0;
 }', 'False', '0', '1052');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1211', '*(Choice)', 'True', '1', '1053');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1212', 'Choice', 'False', '1', '1053');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1213', '(''Choice'')', 'False', '1', '1053');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1214', '*((Character >=''A'') and (Character <= ''Z''))', 'True', '1', '1054');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1215', '(''A'' <= Character <= ''Z'')', 'False', '1', '1054');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1216', '(Character is ''A'' to ''Z'')', 'False', '1', '1054');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1217', '*(Character)', 'True', '2', '1054');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1218', '(''A'' to ''Z'')', 'False', '2', '1054');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1219', 'Character', 'False', '2', '1054');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1220', '*cout << "The ''"<<Character<<"'' was a consonant." << endl;', 'True', '3', '1054');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1221', 'cout << "The ''"<<Character<<"'' wasn''t a letter." << endl;', 'False', '3', '1054');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1222', 'cout << "The ''"<<Character<<"'' was a digit."<< endl;', 'False', '3', '1054');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1223', '*cout << "The ''"<<Character<<"'' wasn''t a letter." << endl;', 'True', '4', '1054');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1224', 'cout << "The ''"<<Character<<"'' was a consonant."<< endl;', 'False', '4', '1054');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1225', 'cout << "The ''"<<Character<<"'' was a punctuation."<< endl;', 'False', '4', '1054');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1226', '*true', 'True', '0', '1055');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1227', 'false', 'False', '0', '1055');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1228', '*(Price != 0)', 'True', '1', '1056');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1229', '(Price == 0)', 'False', '1', '1056');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1230', '(Sum != 0)', 'False', '1', '1056');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1231', '*Sum += Price;', 'True', '2', '1056');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1232', 'Sum = Price;', 'False', '2', '1056');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1233', 'Price << Sum;', 'False', '2', '1056');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1234', '*cin >> Price;', 'True', '3', '1056');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1235', 'Price++', 'False', '3', '1056');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1236', 'cout << Sum;', 'False', '3', '1056');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1237', '*cin >> Exam;', 'True', '1', '1057');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1238', 'cin << Exam;', 'False', '1', '1057');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1239', 'cin >> Total;', 'False', '1', '1057');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1240', '*Total += Exam;', 'True', '2', '1057');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1241', 'Total ++;', 'False', '2', '1057');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1242', 'Exam += Total;', 'False', '2', '1057');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1243', '*(Exam != 48);', 'True', '3', '1057');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1244', '(Exam == 48);', 'False', '3', '1057');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1245', '(Total != 48);', 'False', '3', '1057');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1246', '*ENDVALUE is 0.0', 'True', '0', '1058');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1247', 'ENDVALUE is 100.0', 'False', '0', '1058');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1248', 'ENDVALUE is 1.0', 'False', '0', '1058');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1249', 'ENDVALUE is -1.0', 'False', '0', '1058');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1250', '*cin >> Revenue; MaxRevenue = Revenue;', 'True', '1', '1059');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1251', 'MaxRevenue = 99999; cin >> Revenue;', 'False', '1', '1059');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1252', 'cin >> MaxRevenue; Revenue = 0;', 'False', '1', '1059');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1253', '*(Revenue != 0)', 'True', '2', '1059');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1254', '(MaxRevenue > 0)', 'False', '2', '1059');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1255', '(MaxRevenue < Revenue)', 'False', '2', '1059');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1256', '*if (Revenue > MaxRevenue) MaxRevenue = Revenue;', 'True', '3', '1059');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1257', 'if (Revenue > MaxRevenue) Revenue = MaxRevenue;', 'False', '3', '1059');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1258', 'MaxRevenue = (MaxRevenue  > 0) ? Revenue: ;', 'False', '3', '1059');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1259', '*16', 'True', '0', '1060');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1260', '21', 'False', '0', '1060');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1261', '7', 'False', '0', '1060');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1262', '5', 'False', '0', '1060');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1263', '*int N, F = 1;
 cin >> N;
 for (int I = N; I > 1; I--) F *= I;', 'True', '0', '1061');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1264', 'int N, F = 0;
 cin >> N;
 for (int I = N; I >= 1; I--) F += I;', 'False', '0', '1061');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1265', 'int N, F = 1;
 cin >> N;
 for (int N = I; I < N; N--) F *= N;', 'False', '0', '1061');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1266', 'int I = 1, F = 0;
 for (cin >> N; I > 1; I--) F *= I;', 'False', '0', '1061');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1267', '*float x = 1; x <= 2; x += 0.05', 'True', '1', '1062');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1268', 'int x=1; x <= 2; x++', 'False', '1', '1062');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1269', 'float x == 1; x >= 2; x ++ 0.05', 'False', '1', '1062');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1270', '*x * x - 2 * x + 1', 'True', '2', '1062');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1271', 'x^2 - 2x +1', 'False', '2', '1062');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1272', '1 + x * 2 - x * x', 'False', '2', '1062');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1273', '*(denom != 0 ? (3 - x)/denom : "--")', 'True', '3', '1062');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1274', '(denom == 0 ? 3 - x / denom : 0)', 'False', '3', '1062');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1275', '(denom != 0 ? 3 / denom - x : denom)', 'False', '3', '1062');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1276', '*int result = 1; cin >> inp;
 for (int coef = 1; coef <= inp; coef ++) result *= coef;', 'True', '0', '1063');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1277', 'int coef = 1; cin >> inp;
 for (int result = 1; result <= inp; result ++) result *= coef;', 'False', '0', '1063');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1278', 'int result, coef; cin >> inp;
 for (coef = inp, result = 1; coef >= 1; coef --) result *= coef;', 'False', '0', '1063');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1279', 'int result = 1, coef; cin >> inp;
 for (coef = 1; coef >= 1; coef ++) result *= coef;', 'False', '0', '1063');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1280', '*int N, result = 1;
 cin >> N;
 for (int i = 2; i<=N and result < 400000000; i++) result *= i;', 'True', '0', '1064');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1281', 'int N, result = 1;
 cin >> N;
 for (int i = 2; (i>N or result < 400000000; i++) result *= i;', 'False', '0', '1064');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1282', 'int N, i, result;
 cin >> N;
 for (i = result = 1; result < 400000000; i++) result *= i;', 'False', '0', '1064');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1283', 'int N, i=2, result = 1;
 for (cin >> N; N<=400000000; i++) result *= i;', 'False', '0', '1064');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1284', '*90', 'True', '0', '1065');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1285', '101', 'False', '0', '1065');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1286', '100', 'False', '0', '1065');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1287', '91', 'False', '0', '1065');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1288', '*float', 'True', '1', '1067');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1289', 'int', 'False', '1', '1067');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1290', 'void', 'False', '1', '1067');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1291', '*(float R, V)', 'True', '2', '1067');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1292', '{float R; float V}', 'False', '2', '1067');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1293', '(int X, Y)', 'False', '2', '1067');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1294', '*{return R*R*M_PI * V;}', 'True', '3', '1067');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1295', 'Result = M_PI*R*R*V;', 'False', '3', '1067');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1296', 'Volume = R*R*M_PI*V;', 'False', '3', '1067');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1297', '*void', 'True', '1', '1068');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1298', 'int', 'False', '1', '1068');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1299', 'float', 'False', '1', '1068');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1300', '*()', 'True', '2', '1068');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1301', '(int x, y)', 'False', '2', '1068');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1302', '(int a, b)', 'False', '2', '1068');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1303', '*cout << endl;', 'True', '3', '1068');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1304', 'x=1; y=1;', 'False', '3', '1068');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1305', 'return x*y;', 'False', '3', '1068');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1306', '*0.1', 'True', '0', '1069');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1307', '0.01', 'False', '0', '1069');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1308', '1', 'False', '0', '1069');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1309', '10', 'False', '0', '1069');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1310', '*int', 'True', '1', '1070');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1311', 'void', 'False', '1', '1070');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1312', 'float', 'False', '1', '1070');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1313', '*(int Number, char** Params)', 'True', '2', '1070');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1314', '()', 'False', '2', '1070');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1315', '(int ParamCount, int Params)', 'False', '2', '1070');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1316', '*(Number>0)', 'True', '3', '1070');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1317', '(Params!=0)', 'False', '3', '1070');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1318', '(Params == 0)', 'False', '3', '1070');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1319', '*else return 4;', 'True', '4', '1070');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1320', ';', 'False', '4', '1070');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1321', 'else return Number;', 'False', '4', '1070');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1322', '*float Flow[12];', 'True', '0', '1071');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1323', 'signed char Flow[12];', 'False', '0', '1071');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1324', 'int Flow[11];', 'False', '0', '1071');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1325', 'double Flow{1,2,3,4,5,6,7,8,9,10,11,12};', 'False', '0', '1071');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1326', 'Yes', 'False', '0', '1072');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1327', '*No', 'True', '0', '1072');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1328', '*float Stock[5];', 'True', '1', '1073');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1329', 'int Stock[4];', 'False', '1', '1073');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1330', 'char Stock[Week];', 'False', '1', '1073');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1331', '*for (Day=1; Day<=5; Day++)', 'True', '2', '1073');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1332', 'for (Day=0; Day<=4; Day++)', 'False', '2', '1073');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1333', 'for (Day=0; Day<=5; Day++)', 'False', '2', '1073');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1334', '*for (Day=0; Day<5; Day++)', 'True', '3', '1073');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1335', 'for (Day=1; Day<=5; Day++)', 'False', '3', '1073');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1336', 'for (Day=0; Day<4; Day++)', 'False', '3', '1073');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1337', '*typedef int TProfits[10];
 TProfits Profits = {0,0,0,0,0,0,0,0,0,0};', 'True', '1', '1074');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1338', 'int Profits[11];', 'False', '1', '1074');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1339', 'typedef int Profits[10];
 Profits TProfits = {0,0,0,0,0,0,0,0,0,0};', 'False', '1', '1074');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1340', 'int TProfits[10] = {0,0,0,0,0,0,0,0,0,0};', 'False', '1', '1074');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1341', 'Yes', 'False', '0', '1075');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1342', '*No', 'True', '0', '1075');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1343', '*8', 'True', '0', '1076');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1344', '16', 'False', '0', '1076');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1345', '10', 'False', '0', '1076');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1346', '64', 'False', '0', '1076');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1347', '*typedef int TCars[silver+1];
    const string ColorNames[silver+1] = {"black", "red", "green", "blue",
        "yellow", "magenta", "cyan", "white", "silver"};', 'True', '1', '1077');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1348', 'typedef int TCars[silver];
    const string ColorNames[silver] = {"black", "red", "green", "blue",
        "yellow", "magenta", "cyan", "white", "silver"};', 'False', '1', '1077');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1349', 'typedef int TCars[7];
    const string ColorNames[7] = {"black", "red", "green", "blue",
        "yellow", "magenta", "cyan", "white", "silver"};', 'False', '1', '1077');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1350', 'typedef int TCars[silver];
    const string ColorNames[silver] = {''black'', ''red'', ''green'', ''blue'',
        ''yellow'', ''magenta'', ''cyan'', ''white'', ''silver''};', 'False', '1', '1077');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1351', '*typedef double TRow[Items]; typedef TRow TMatrix[Rows];', 'True', '1', '1078');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1352', 'typedef double TRow[Rows]; typedef TRow TMatrix[Items];', 'False', '1', '1078');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1353', 'typedef double TRow[Rows]; typedef double TMatrix[Items];', 'False', '1', '1078');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1354', '*for (int J=0; J<Items; J++) cin >> Mat[I][J];', 'True', '2', '1078');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1355', 'for (int J=0; J<Rows; J++) cin >> Mat[I][J];', 'False', '2', '1078');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1356', 'for (int I=0; I<Rows; I++) cin >> Mat[I][I];', 'False', '2', '1078');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1357', '*cout << "Row No.: " << I+1 << ": ";', 'True', '3', '1078');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1358', 'cout << Mat[I+1][J+1] << ": ";', 'False', '3', '1078');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1359', 'cout << I+1 << J+1 << " item";', 'False', '3', '1078');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1360', '*TMyMatrix MA, MB; int B=0, A;
 while (B<NumRows){A = 0;
 while (A<NumCols) {MA[B][A] += MB[B][A]; A++;}
 B++;}', 'True', '0', '1079');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1361', 'TMyMatrix MA, MB; int X, Y;
 for (X=0; X<NumCols; X++)
 for (Y=0; Y<NumRows; Y++) MA[X][Y] += MB[X][Y];', 'False', '0', '1079');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1362', 'TMyMatrix MA, MB; int A=0, B=0;
 while (B<NumRows)
 while (A<NumCols) MA[B][A] += MB[B][A];', 'False', '0', '1079');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1363', 'TMyMatrix MA, MB;
 for (int A=0; A<NumRows; A++)
 for (int B=0; B<NumCols; B++) MA[B][A] += MB[B][A];', 'False', '0', '1079');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1364', '*typedef double QMatrix[Order][Order];', 'True', '1', '1080');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1365', 'typedef double QMatrix[Order];', 'False', '1', '1080');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1366', 'typedef QMatrix[Order][Order] double;', 'False', '1', '1080');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1367', '*for (int j=i+1; j<Order; j++)', 'True', '2', '1080');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1368', 'for (int j=0; j<Order; j++)', 'False', '2', '1080');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1369', 'while (j<Order){j=0;', 'False', '2', '1080');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1370', '*{aux = Mat[i][j]; Mat[i][j] = Mat[j][i]; Mat[j][i] = aux;}', 'True', '3', '1080');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1371', 'Mat[i][j]=Mat[j][i]; j++;}', 'False', '3', '1080');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1372', 'Mat[i][j] = Mat[j][i]; Mat[j][i] = Mat[i][j];', 'False', '3', '1080');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1373', '*for (Num=0; Num<7; Num++)
     if (OurFact[Num][0]!=0)
       cout << "Dept. No. " << Num+1 << ", avg. salary: " <<
          OurFact[Num][1]/OurFact[Num][0] << endl;
     else cout << "No workers. " << endl;', 'True', '1', '1081');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1374', 'Num=0;
 while (Num<7){
     if (OurFact[Num][1]==0)
       cout << "Dept. No. " << Num+1 << ", avg. salary: " <<
          OurFact[Num][1]/OurFact[Num][0] << endl;
     else cout << "No workers. " << endl;
 }', 'False', '1', '1081');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1375', 'Num=0;
 while (Num<7){Num++;
     if (OurFact[Num][1]==0)
       cout << "Dept. No. " << Num << ", avg. salary: " <<
          OurFact[Num-1][0]/OurFact[Num-1][1] << endl;
     else cout << "No workers. " << endl;
 }', 'False', '1', '1081');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1376', 'for (Num=1; Num<=7; Num++)
     if (OurFact[Num][0]!=0)
       cout << "Dept. No. " << Num << ", avg. salary: " <<
          OurFact[Num][1]/OurFact[Num][0] << endl;
     else cout << "No workers. " << endl;', 'False', '1', '1081');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1377', '*true', 'True', '0', '1082');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1378', 'false', 'False', '0', '1082');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1379', '*9788074283215', 'True', '0', '1083');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1380', '9877874283221', 'False', '0', '1083');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1381', '7887074283125', 'False', '0', '1083');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1382', '1887074288275', 'False', '0', '1083');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1383', '*978', 'True', '0', '1084');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1384', '978\80/7428/321/5', 'False', '0', '1084');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1385', '978\80\7428\321\5', 'False', '0', '1084');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1386', '978\080\07428\0321\05', 'False', '0', '1084');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1387', '*strcat(FullName, " "); strcat(FullName, Surname);', 'True', '1', '1085');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1388', 'strcat(FullName, Surname); strcat(FullName, " ");', 'False', '1', '1085');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1389', 'strcat(FullName, strcat(" ", Surname));', 'False', '1', '1085');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1390', '*strlen(FullName)', 'True', '2', '1085');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1391', 'sizeof(FullName)', 'False', '2', '1085');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1392', 'length(FullName)', 'False', '2', '1085');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1393', '*strstr(FullName, strchr(Name, '' '')+1)', 'True', '3', '1085');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1394', 'strcpy(FullName, strstr(Name, '' '')+1)', 'False', '3', '1085');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1395', 'strcat(FullName, strcpy(Name, '' '')+1)', 'False', '3', '1085');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1396', '*FullName = Name + Surname;', 'True', '1', '1086');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1397', 'FullName += Name += Surname;', 'False', '1', '1086');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1398', 'Name + Surname = FullName;', 'False', '1', '1086');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1399', '*FullName.length()', 'True', '2', '1086');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1400', 'length(FullName)', 'False', '2', '1086');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1401', 'strlen(FullName)', 'False', '2', '1086');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1402', '*FullName.substr(FullName.find(" ")+1, FullName.length())', 'True', '3', '1086');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1403', 'substr(FullName, " ")', 'False', '3', '1086');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1404', 'substr(find(FullName, '' '')+1, 100)', 'False', '3', '1086');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1405', 'true', 'False', '0', '1087');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1406', '*false; No, the keyword "typedef" is missing.', 'True', '0', '1087');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1407', '*typedef struct {string Name; int Height; int Weight;} TPerson;', 'True', '1', '1088');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1408', 'typedef struct {int Name; string Height; float Weight;} TPerson;', 'False', '1', '1088');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1409', 'struct {char Name[45]; float Height; float Weight;} MyPerson;', 'False', '1', '1088');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1410', '*>> OurDept[ActNum].Name >> OurDept[ActNum].Height  >> OurDept[ActNum].Weight', 'True', '2', '1088');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1411', '>> OurDept[ActNum]', 'False', '2', '1088');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1412', '>> OurDept[ActNum].Name >> Height  >> Weight', 'False', '2', '1088');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1413', '*BMI(OurDept[ActNum]) < BMI(OurDept[MinBMI])', 'True', '3', '1088');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1414', 'BMI(Height, Weight) < BMI(MinBMI.Height, MinBmi.Weight)', 'False', '3', '1088');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1415', 'BMI(OurDept[ActNum].Height, OurDept[ActNum].Weight) < BMI(OurDept[MinBMI].Height, OurDept[MinBmi].Weight)', 'False', '3', '1088');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1416', 'true; 9 bit', 'False', '0', '1089');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1417', '*false; 6 bit', 'True', '0', '1089');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1418', '*256', 'True', '0', '1090');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1419', '100', 'False', '0', '1090');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1420', '1024', 'False', '0', '1090');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1421', '1', 'False', '0', '1090');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1422', '*Manchester[L].Traction==steam and Manchester[L].Weight>80', 'True', '1', '1091');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1423', 'Manchester[L].TTypeLok==steam and Manchester[L].Weight>80', 'False', '1', '1091');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1424', 'TDepot[L].Traction==steam and TDepot[L].Weight>80', 'False', '1', '1091');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1425', '*Manchester[L].Label << ", weight is  " << Manchester[L].Weight', 'True', '2', '1091');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1426', 'Manchester[L].TLocomotive.Label << ", weight is  " << Manchester[L].TLocomotive.Weight', 'False', '2', '1091');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1427', 'TDepot[L].TLocomotive.Label << ", weight is  " << TDepot[L].TLocomotive.Weight', 'False', '2', '1091');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1428', '*Manchester[L].Traction==diesel and Manchester[L].LocoPar.Cylinders<16', 'True', '3', '1091');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1429', 'Manchester[L].Traction==diesel and Manchester[L].Cylinders<16', 'False', '3', '1091');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1430', 'TDepot[L].Traction==diesel and TDepot[L].Cylinders<16', 'False', '3', '1091');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1431', '*Manchester[L].Label << ", num of cylinders is  " << Manchester[L].LocoPar.Cylinders', 'True', '4', '1091');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1432', 'Manchester[L].Label << ", num of cylinders is  " << Manchester[L].Cylinders', 'False', '4', '1091');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1433', 'TDepot[L].Label << ", num of cylinders is  " << TDepot[L].Cylinders', 'False', '4', '1091');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1434', '*float *Values;
   Values = new float[Num];', 'True', '1', '1092');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1435', 'float Values;
   Values = new float[Num];', 'False', '1', '1092');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1436', 'float *Values[Num];', 'False', '1', '1092');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1437', 'float Values = float [Num];', 'False', '1', '1092');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1438', '*float *AnyData[Num];', 'True', '1', '1093');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1439', 'float AnyData[Num];', 'False', '1', '1093');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1440', 'float *AnyData;', 'False', '1', '1093');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1441', 'float *AnyData = new float;', 'False', '1', '1093');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1442', '*Help = new Node;
 Help->Data=curdata;
 Help->Next=Top;
 Top=Help;', 'True', '1', '1094');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1443', 'Top = Help;
 Help = new Node;
 (*Help)->Data=curdata;
 (*Help)->Next=Top;', 'False', '1', '1094');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1444', 'while (Help->Next!=NULL) Help = Help->Next;
 Help = new Node;
 Help->Data = curdata;
 Help->Next = NULL;', 'False', '1', '1094');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1445', 'Top->Next = new Node;
 Help = Top->Next;
 Help->Data = curdata;
 Help->Next = NULL', 'False', '1', '1094');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1446', '*curdata = (float*)Aux->Data;', 'True', '1', '1096');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1447', 'curdata = Aux->Data;', 'False', '1', '1096');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1448', 'curdata = (float)Aux->Data;', 'False', '1', '1096');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1449', 'curdata = float*(Aux->Data);', 'False', '1', '1096');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1450', '*Yes', 'True', '0', '1000');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1451', 'No', 'False', '0', '1000');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1452', 'pow(2,N)-1', 'True', '0', '1010');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1453', '*float', 'True', '1', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1454', 'int', 'False', '1', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1455', 'char', 'False', '1', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1456', 'Radius=10', 'False', '1', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1457', 'Radius', 'False', '1', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1458', 'radius=10', 'False', '1', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1459', '10=Radius', 'False', '1', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1460', 'Side=0', 'False', '1', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1461', 'float', 'False', '2', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1462', 'int', 'False', '2', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1463', 'char', 'False', '2', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1464', '*Radius=10', 'True', '2', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1465', 'Radius', 'False', '2', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1466', 'radius=10', 'False', '2', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1467', '10=Radius', 'False', '2', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1468', 'Side=0', 'False', '2', '1011');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1469', '*const', 'True', '1', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1470', 'int', 'False', '1', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1471', 'MinPerDay', 'False', '1', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1472', '=1440', 'False', '1', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1473', 'float', 'False', '1', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1474', '=60', 'False', '1', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1475', 'var', 'False', '1', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1476', '=24', 'False', '1', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1477', '', 'False', '1', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1478', 'const', 'False', '2', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1479', '*int', 'True', '2', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1480', 'MinPerDay', 'False', '2', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1481', '=1440', 'False', '2', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1482', 'float', 'False', '2', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1483', '=60', 'False', '2', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1484', 'var', 'False', '2', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1485', '=24', 'False', '2', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1486', '', 'False', '2', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1487', 'const', 'False', '3', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1488', 'int', 'False', '3', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1489', '*MinPerDay', 'True', '3', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1490', '=1440', 'False', '3', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1491', 'float', 'False', '3', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1492', '=60', 'False', '3', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1493', 'var', 'False', '3', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1494', '=24', 'False', '3', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1495', '', 'False', '3', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1496', 'const', 'False', '4', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1497', 'int', 'False', '4', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1498', 'MinPerDay', 'False', '4', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1499', '*=1440', 'True', '4', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1500', 'float', 'False', '4', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1501', '=60', 'False', '4', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1502', 'var', 'False', '4', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1503', '=24', 'False', '4', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1504', '', 'False', '4', '1012');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1505', '*0 to 255', 'True', '1', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1506', '0 to 65,535', 'False', '1', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1507', '–128 to 127', 'False', '1', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1508', '–32,768 to 32,767', 'False', '1', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1509', '–256 to 255', 'False', '1', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1510', '–65,536 to 65,535', 'False', '1', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1511', '0 to 255', 'False', '2', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1512', '*0 to 65,535', 'True', '2', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1513', '–128 to 127', 'False', '2', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1514', '–32,768 to 32,767', 'False', '2', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1515', '–256 to 255', 'False', '2', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1516', '–65,536 to 65,535', 'False', '2', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1517', '0 to 255', 'False', '3', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1518', '0 to 65,535', 'False', '3', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1519', '*–128 to 127', 'True', '3', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1520', '–32,768 to 32,767', 'False', '3', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1521', '–256 to 255', 'False', '3', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1522', '–65,536 to 65,535', 'False', '3', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1523', '0 to 255', 'False', '4', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1524', '0 to 65,535', 'False', '4', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1525', '–128 to 127', 'False', '4', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1526', '*–32,768 to 32,767', 'True', '4', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1527', '–256 to 255', 'False', '4', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1528', '–65,536 to 65,535', 'False', '4', '1013');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1529', '*accuracy to 6 significant digits', 'True', '1', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1530', 'accuracy to 15 significant digits', 'False', '1', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1531', 'accuracy to 18 significant digits', 'False', '1', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1532', 'accuracy to 10 significant digits', 'False', '1', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1533', 'accuracy to 12 significant digits', 'False', '1', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1534', 'accuracy to 8 significant digits', 'False', '1', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1535', 'accuracy to 6 significant digits', 'False', '2', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1536', '*accuracy to 15 significant digits', 'True', '2', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1537', 'accuracy to 18 significant digits', 'False', '2', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1538', 'accuracy to 10 significant digits', 'False', '2', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1539', 'accuracy to 12 significant digits', 'False', '2', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1540', 'accuracy to 8 significant digits', 'False', '2', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1541', 'accuracy to 6 significant digits', 'False', '3', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1542', 'accuracy to 15 significant digits', 'False', '3', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1543', '*accuracy to 18 significant digits', 'True', '3', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1544', 'accuracy to 10 significant digits', 'False', '3', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1545', 'accuracy to 12 significant digits', 'False', '3', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1546', 'accuracy to 8 significant digits', 'False', '3', '1015');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1547', '*written as ''\n''', 'True', '1', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1548', 'written as ''\xc''', 'False', '1', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1549', 'written as ''\r''', 'False', '1', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1550', 'written as ''\7''', 'False', '1', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1551', 'written as ''\10''', 'False', '1', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1552', 'written as ''\xf''', 'False', '1', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1553', 'written as ''\n''', 'False', '2', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1554', '*written as ''\xc''', 'True', '2', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1555', 'written as ''\r''', 'False', '2', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1556', 'written as ''\7''', 'False', '2', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1557', 'written as ''\10''', 'False', '2', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1558', 'written as ''\xf''', 'False', '2', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1559', 'written as ''\n''', 'False', '3', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1560', 'written as ''\xc''', 'False', '3', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1561', '*written as ''\r''', 'True', '3', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1562', 'written as ''\7''', 'False', '3', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1563', 'written as ''\10''', 'False', '3', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1564', 'written as ''\xf''', 'False', '3', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1565', 'written as ''\n''', 'False', '4', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1566', 'written as ''\xc''', 'False', '4', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1567', 'written as ''\r''', 'False', '4', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1568', '*written as ''\7''', 'True', '4', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1569', 'written as ''\10''', 'False', '4', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1570', 'written as ''\xf''', 'False', '4', '1017');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1571', '*LF', 'True', '1', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1572', 'BEL', 'False', '1', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1573', 'HT', 'False', '1', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1574', 'BS', 'False', '1', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1575', 'EOT', 'False', '1', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1576', 'LF', 'False', '2', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1577', '*BEL', 'True', '2', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1578', 'HT', 'False', '2', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1579', 'BS', 'False', '2', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1580', 'EOT', 'False', '2', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1581', 'LF', 'False', '3', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1582', 'BEL', 'False', '3', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1583', '*HT', 'True', '3', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1584', 'BS', 'False', '3', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1585', 'EOT', 'False', '3', '1018');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1593', '*Radius*4*Radius/3*Radius*3.14', 'True', '0', '1020');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1594', '4/3M_PI Radius^3', 'False', '0', '1020');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1595', '4*3.14/Radius*3*Radius*Radius', 'False', '0', '1020');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1596', '4Radius*Radius*Radius/3M_PI', 'False', '0', '1020');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1597', '*Volume = 72', 'True', '0', '1021');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1598', 'Volume = 18', 'False', '0', '1021');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1599', 'Volume = 450', 'False', '0', '1021');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1600', 'Volume = 150', 'False', '0', '1021');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1601', '<cstdio>', 'False', '2', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1602', '*MeasureB', 'True', '2', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1603', '%d%d', 'False', '2', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1604', 'MeasureA', 'False', '2', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1605', 'return', 'False', '2', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1606', 'integer', 'False', '2', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1607', '%2d%2f', 'False', '2', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1608', '<cstdio>', 'False', '3', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1609', 'MeasureB', 'False', '3', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1610', '*%d%d', 'True', '3', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1611', 'MeasureA', 'False', '3', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1612', 'return', 'False', '3', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1613', 'integer', 'False', '3', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1614', '%2d%2f', 'False', '3', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1615', '<cstdio>', 'False', '4', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1616', 'MeasureB', 'False', '4', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1617', '%d%d', 'False', '4', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1618', '*MeasureA', 'True', '4', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1619', 'return', 'False', '4', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1620', 'integer', 'False', '4', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1621', '%2d%2f', 'False', '4', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1622', '<cstdio>', 'False', '5', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1623', 'MeasureB', 'False', '5', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1624', '%d%d', 'False', '5', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1625', 'MeasureA', 'False', '5', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1626', '*return', 'True', '5', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1627', 'integer', 'False', '5', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1628', '%2d%2f', 'False', '5', '1026');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1629', '*iostream', 'True', '1', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1630', '<<', 'False', '1', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1631', 'cin >> lengthA >> lengthB', 'False', '1', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1632', 'cout <<', 'False', '1', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1633', '<< lengthA * lengthB << ".\n"', 'False', '1', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1634', 'iolibrary', 'False', '1', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1635', '>>', 'False', '1', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1636', '->', 'False', '1', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1637', 'iostream', 'False', '2', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1638', '*<<', 'True', '2', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1639', 'cin >> lengthA >> lengthB', 'False', '2', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1640', 'cout <<', 'False', '2', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1641', '<< lengthA * lengthB << ".\n"', 'False', '2', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1642', 'iolibrary', 'False', '2', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1643', '>>', 'False', '2', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1644', '->', 'False', '2', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1645', 'iostream', 'False', '3', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1646', '<<', 'False', '3', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1647', '*cin >> lengthA >> lengthB', 'True', '3', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1648', 'cout <<', 'False', '3', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1649', '<< lengthA * lengthB << ".\n"', 'False', '3', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1650', 'iolibrary', 'False', '3', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1651', '>>', 'False', '3', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1652', '->', 'False', '3', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1653', 'iostream', 'False', '4', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1654', '<<', 'False', '4', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1655', 'cin >> lengthA >> lengthB', 'False', '4', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1656', '*cout <<', 'True', '4', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1657', '<< lengthA * lengthB << ".\n"', 'False', '4', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1658', 'iolibrary', 'False', '4', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1659', '>>', 'False', '4', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1660', '->', 'False', '4', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1661', 'iostream', 'False', '5', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1662', '<<', 'False', '5', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1663', 'cin >> lengthA >> lengthB', 'False', '5', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1664', 'cout <<', 'False', '5', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1665', '*<< lengthA * lengthB << ".\n"', 'True', '5', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1666', 'iolibrary', 'False', '5', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1667', '>>', 'False', '5', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1668', '->', 'False', '5', '1029');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1669', '*Op1 + Op2 << endl; break;', 'True', '2', '1053');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1670', 'Op1 += Op2 << endl;', 'False', '2', '1053');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1671', 'Op1 ++ Op2 << break;', 'False', '2', '1053');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1672', '*''/'': cout << "Result is: "<< (Op2 !=0 ? Op1 / Op2:0) << endl; break;', 'True', '3', '1053');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1673', '''/'': cout << "Result is: "<< Op1 / Op2 << endl; break;', 'False', '3', '1053');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1674', '''/'': cout << "Result is: " << Op1 % Op2 << endl; break;', 'False', '3', '1053');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1675', '*int Value, Func;
for (Value = 0; Value <= 100; Value ++){
   if (Value % 10 != 0)
      cout << Value << "   " << Value * Value - 2 *
Value + 1 << endl;
}
', 'True', '0', '1066');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1676', 'int Value, Func;
bool Test;
for (Value = 0; Value <= 100; Value ++){
   Test = Value % 10 == 0;
   if (Test) {
     Func = Value * Value - 2 * Value + 1;
     cout << Value << "   " << Func << endl;
   }
}
', 'False', '0', '1066');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1677', 'int Value, Func;
bool Test;
for (Value = 0; Value <= 100; Value ++){
   Test = Value % 10 == 0;
   if (!Test) Func = Value * Value - 2 * Value + 1;
   cout << Value << "   " << Func << endl;
}
', 'False', '0', '1066');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1678', 'int Value, Func;
for (Value = 0; Value <= 100; Value ++){
   if (Value % 10 == 0)
      { Func = Value * Value - 2 * Value + 1;
        cout << Value << "   " << Func << endl;
      }
}
', 'False', '0', '1066');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1679', 'Ano', 'False', '0', '158');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1680', '*Ne', 'True', '0', '158');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1681', 'Někdy', 'False', '0', '158');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1682', 'Záleží na číslech', 'False', '0', '158');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1683', 'Záleží na operátoru', 'False', '0', '158');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1684', 'Ano', 'False', '0', '161');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1685', '*Ne', 'True', '0', '161');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1686', 'Někdy', 'False', '0', '161');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1687', 'Záleží na číslech', 'False', '0', '161');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1688', 'Záleží na operátoru', 'False', '0', '161');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1689', 'Ano', 'False', '0', '159');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1690', '*Ne', 'True', '0', '159');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1691', 'Jen pro kladná čísla', 'False', '0', '159');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1692', 'Jen pro záporná čísla', 'False', '0', '159');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1693', 'Jen pro nuly', 'False', '0', '159');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1694', 'Ano', 'False', '0', '162');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1695', '*Ne', 'True', '0', '162');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1696', 'Jen pro kladná čísla', 'False', '0', '162');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1697', 'Jen pro záporná čísla', 'False', '0', '162');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1698', 'Jen pro nuly', 'False', '0', '162');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1699', 'The amount of memory a variable occupies', 'False', '0', '1097');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1700', 'How a variable can be processed', 'False', '0', '1097');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1701', 'The range of possible values for a variable', 'False', '0', '1097');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1702', '*All of the above', 'True', '0', '1097');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1703', 'None of the above', 'False', '0', '1097');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1704', 'define', 'False', '0', '1098');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1705', 'alias', 'False', '0', '1098');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1706', '*typedef', 'True', '0', '1098');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1707', 'struct', 'False', '0', '1098');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1708', 'enum', 'False', '0', '1098');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1709', 'As 0', 'False', '0', '1099');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1710', '*As 1 or any non-zero value', 'True', '0', '1099');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1711', 'As -1', 'False', '0', '1099');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1712', 'As a floating-point number', 'False', '0', '1099');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1713', 'As a character', 'False', '0', '1099');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1714', '*A single instruction that ends with a semicolon (;)', 'True', '0', '1100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1715', 'A large function that contains multiple blocks', 'False', '0', '1100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1716', 'A variable declaration inside an array', 'False', '0', '1100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1717', 'A loop that repeats infinitely', 'False', '0', '1100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1718', 'A multiline operation without semicolons', 'False', '0', '1100');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1719', '*To execute commands repeatedly', 'True', '0', '1101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1720', 'To prevent errors in a program', 'False', '0', '1101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1721', 'To store variables permanently', 'False', '0', '1101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1722', 'To process data in a single step', 'False', '0', '1101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1723', 'To remove conditional statements', 'False', '0', '1101');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1724', 'At the beginning of the loop', 'False', '0', '1102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1725', 'In the middle of the loop body', 'False', '0', '1102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1726', '*At the end of the loop', 'True', '0', '1102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1727', 'Inside an if statement', 'False', '0', '1102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1728', 'At the top of the program', 'False', '0', '1102');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1729', '*It allows defining a function before its full implementation', 'True', '0', '1103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1730', 'It prevents functions from calling each other', 'False', '0', '1103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1731', 'It forces all functions to be implemented at once', 'False', '0', '1103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1732', 'It removes the need for function prototypes', 'False', '0', '1103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1733', 'It limits function usage', 'False', '0', '1103');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1734', 'It behaves exactly like a character array', 'False', '0', '1104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1735', '*It allows dynamic string manipulation', 'True', '0', '1104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1736', 'It cannot store text', 'False', '0', '1104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1737', 'It must be initialized with a number', 'False', '0', '1104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1738', 'It replaces all integer variables', 'False', '0', '1104');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1739', ' &', 'False', '0', '1105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1740', '* *', 'True', '0', '1105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1741', ' #', 'False', '0', '1105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1742', ' @', 'False', '0', '1105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1743', ' $', 'False', '0', '1105');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1744', '* Aux = new Node;
 if (Top == NULL) {
     Top = Aux;
     Tail = Aux;
 } else {
     Tail->Next = Aux;
     Tail = Aux;
 }

', 'True', '0', '1095');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1745', ' if (Top == NULL) {
     Top = Tail;
 } else {
     Top->Next = Tail;
 }

', 'False', '0', '1095');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1746', ' Aux = new Node;
 if (Top == NULL) {
     Top = Aux;
 } else {
     Tail->Next = Aux;
 }
 Tail = Aux;

', 'False', '0', '1095');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1747', ' Aux = new Node;
 if (Tail == NULL) {
     Tail = Aux;
 } else {
     Top->Next = Aux;
 }
 Top = Aux;

', 'False', '0', '1095');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1748', '*Certain place in computer memory.', 'True', '0', '1106');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1749', ' Letter representing some real number.', 'False', '0', '1106');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1750', 'Number of program steps.', 'False', '0', '1106');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1751', '*represents the address of variable in memory.', 'True', '0', '1107');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1752', ' represents the value of variable.', 'False', '0', '1107');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1753', 'represents number of possible values.', 'False', '0', '1107');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1754', '*Input and output operations', 'True', '0', '1108');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1755', 'Syntax of the programming language', 'False', '0', '1108');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1756', 'Type of variables', 'False', '0', '1108');
INSERT INTO public.option (id, o_text, correct_answer, group_number, question_id) VALUES ('1757', 'Logic of the program', 'False', '0', '1108');

-- -------------------------------------------------------------------------
-- TODO LINKS
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
INSERT INTO public.link (id, actual_node, next_node) VALUES ('18', '10', '12');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('19', '10', '13');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('20', '10', '14');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('21', '11', '14');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('22', '11', '15');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('23', '12', '16');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('24', '13', '16');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('25', '14', '16');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('26', '15', '16');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('27', '16', '17');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('28', '16', '18');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('29', '17', '18');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('30', '18', '19');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('31', '18', '20');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('32', '18', '21');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('33', '18', '22');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('34', '19', '23');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('35', '20', '23');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('36', '21', '23');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('37', '22', '23');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('38', '23', '24');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('39', '23', '25');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('40', '23', '26');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('41', '23', '27');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('42', '24', '28');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('43', '25', '28');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('44', '26', '28');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('45', '27', '28');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('46', '28', '29');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('101', '101', '102');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('102', '102', '103');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('103', '103', '104');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('104', '104', '105');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('105', '105', '106');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('106', '106', '107');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('107', '107', '108');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('108', '108', '109');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('109', '109', '110');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('110', '110', '111');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('111', '111', '112');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('112', '112', '113');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('113', '113', '114');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('114', '114', '115');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('115', '115', '116');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('116', '116', '117');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('117', '117', '118');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('118', '118', '119');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('119', '119', '120');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('120', '120', '121');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('121', '121', '122');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('122', '122', '123');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('123', '123', '124');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('124', '124', '125');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('125', '125', '126');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('126', '126', '127');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('127', '127', '128');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('128', '128', '129');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('129', '129', '130');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('130', '130', '131');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('131', '131', '132');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('132', '132', '133');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('133', '133', '134');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('134', '134', '135');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('135', '135', '136');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('136', '136', '137');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('137', '137', '138');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('138', '138', '139');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('139', '139', '140');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('140', '140', '141');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('141', '141', '142');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('142', '142', '143');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('143', '143', '144');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('144', '144', '145');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('145', '145', '146');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('146', '146', '147');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('147', '147', '148');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('148', '148', '149');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('149', '149', '150');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('150', '150', '151');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('151', '151', '152');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('152', '152', '153');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('153', '153', '154');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('154', '154', '155');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('155', '155', '156');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('156', '156', '157');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('157', '157', '158');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('158', '158', '159');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('159', '159', '160');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('160', '160', '161');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('161', '161', '162');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('162', '162', '163');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('163', '163', '164');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('164', '164', '165');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('165', '165', '166');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('166', '166', '167');
INSERT INTO public.link (id, actual_node, next_node) VALUES ('167', '167', '168');

-- -------------------------------------------------------------------------
-- todo TOPIC
-- -------------------------------------------------------------------------
INSERT INTO public.topic (id, name, first_node) VALUES ('1', 'Matematika', '1');
INSERT INTO public.topic (id, name, first_node) VALUES ('2', 'Programming C, C++', '101');

