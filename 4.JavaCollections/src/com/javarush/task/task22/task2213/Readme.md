taskKey="com.javarush.task.task22.task2213.big06"

#### Тетрис(8)

Теперь создадим костяк класса Figure.
Этот класс будет описывать падающую фигурку.

Нам понадобятся ее координаты и форма.
За координаты будут отвечать две переменные x и y.
За форму — матрица. Двумерный массив 3×3, состоящий из единиц и нулей.
Единицей мы обозначаем что клетка есть, нулем — что она пустая.

Добавь в класс Figure два поля поля: x типа int, y типа int.
Еще добавь двумерный массив: matrix(матрица) типа int[][].
Там же добавь getter’ы для созданных переменных.
Добавь конструктор с тремя параметрами x, y, matrix.
***


#### Тетрис(7)

Нам понадобится еще 4 метода в классе Field:
1. print() — объект будет отрисовывать на экран свое текущее состояние;
2. removeFullLines() — будет удалять из матрицы полностью заполненные строки и сдвигать вышележащие строки вниз;
3. Integer getValue(int x, int y) — возвращает значение которое находится в матрице с координатами x и y;
4. void setValue(int x, int y, int value) — устанавливает переданное значение в ячейку массива (матрицы) с координатами x, y.
***


#### Тетрис(6)

Теперь перейдем к классу Field.
Он будет отвечать за хранение данных о текущих занятых и свободных клетках на поле игры.
Добавь в класс Field два поля поля: width (ширина) типа int, height(высота) типа int.
Так же нам понадобится матрица - двумерный массив: matrix(матрица) типа int[][];
Там же добавь getter'ы для созданных переменных.
Добавь конструктор с двумя параметрами width и height. И не забудь про матрицу.

ВАЖНО!
Двумерный массив можно представить как массив массивов или как прямоугольную матрицу.
При этом первой координатой в массиве у нас будет номер строки, а второй - столбца.
Другими словами ячейка с координатами x, y - это matrix[y][x].
***


#### Тетрис(5)

Теперь нужно создать объект самого Тетриса.
Добавь в класс Tetris статическое поле game типа Tetris.
Поле game НЕ должно быть приватным.

Затем в методе main создай объект типа Тетрис и сохрани его в эту переменную.
Затем добавь вызов метода run.
***


#### Тетрис(4)

Так же еще нам понадобится пара методов.
Добавь в класс Tetris методы run() и step():

run() будет отвечать за всю игру.
А step() - за один шаг в игре.

Тип возвращаемого значения void для обоих методов.

Тут и в будущем, если нет явных указаний с каким модификатором доступа создавать метод, то он должен быть публичным, а поле приватным.

>В общем случае, стоит руководствоваться правилом использования наиболее строгого(из возможных) модификатора доступа.
>Т.е. если логика системы предполагает обращения к методу извне класса, мы не сможем сделать такой метод приватным.
>Но также нет никаких причин указывать уровень доступа public для методов которые будут использованы только в рамках пакета.
>Поначалу это кажется несущественным, но на самом деле это один из основополагающих принципов ООП.
>Учись сразу делать правильно!
***


#### Тетрис(3)

Поле есть, фигура есть, а как их получить?

Добавь геттеры для полей field и figure.
***


#### Тетрис(2)

Отлично!
Теперь добавь в класс Tetris два поля: field типа Field и figure типа Figure.
***


#### Тетрис(1)

Давай напишем игру Тетрис!

Наш Тетрис будет состоять из двух вещей: поля из клеток и фигурки, которая падает.
Поэтому для начала создай три класса: Field(поле с клетками), Figure(фигура) и сам Tetris.

Также нам понадобится метод main в классе Tetris.
***