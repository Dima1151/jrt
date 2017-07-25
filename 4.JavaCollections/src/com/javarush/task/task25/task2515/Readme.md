taskKey="com.javarush.task.task25.task2515.big06"

#### Space (7)

Теперь займемся классом Canvas.
Он у нас будет содержать матрицу, куда мы будем рисовать.
У матрицы есть ширина и высота.
А еще будем в ней хранить не числа (int), а символы (char).

Надо:
* Добавить в класс две переменные width и height;
* Добавить в класс переменную matrix (char[][]);
* Добавь геттеры для них;
* В конструкторе проинициализируй матрицу.
***


#### Space (6)

Но и это еще не все.
Классу BaseObject нужны еще методы.
Пока это будут пустые методы draw() и move().
Классы-наследники должны будут переопределить их у себя и реализовать необходимую функциональность.

Еще добавь метод die() - объект умирает (isAlive=false)

А еще нам нужно будет определять попала бомба в корабль или ракета в НЛО.
Это будем делать так:
Создадим специальный метод: public boolean isIntersect(BaseObject o)
Он будет определять - "пересеклись" объекты или нет. Если пересеклись - возвращать true, если нет - false.

Т.к. объекты мы условно считаем кругами, то предлагаю такую формулу взаимодействия:
eсли центр круга одного объекта попал в круг другого, то будем считать, что они столкнулись.
Или еще проще:
дистанция_между_объектами < max (радиус_первого_объекта, радиус_второго_объекта).
***


### Space (5)

Теперь перейдем к классу BaseObject.
Я хочу сделать несколько предложений.

Во-первых. Для простоты, считать все объекты у нас в космосе круглыми.
Нет, отрисовывать их мы будем фигурными, как и раньше.
А вот при расчетах их взаимодействия исходить из того, что они круглые.
Так - гораздо проще.

Во-вторых. Пусть координаты объектов и радиус будут вещественными числами.
Это придаст плавность движениям и точность всем вычислениям.
А при отрисовке мы будем их округлять.

Надо:
1.  Добавь в класс BaseObject переменные x(double), y (double), radius (double), геттеры и сеттеры для них.
2.  Добавить логическую переменную isAlive (жив объект или уже нет).
3.  Добавить геттер (isAlive()-метод для isAlive-переменной).
4.  Добавить конструктор BaseObject(double x, double y, double radius).
4.  Проследить, чтобы в конструкторе isAlive устанавливался в true (мертворожденные нам ни к чему).
6.  Надо пройтись по всем классам-наследникам и поправить у них конструкторы.

>Если вы пользуетесь Intellij IDEA - Alt+Insert вам в помощь.
***


#### Space (4)

Чего не хватает классу Space?
Правильно - методов run() и draw().
run управляет всей логикой игры, если ты помнишь.
А draw отвечает за отрисовку очередного "кадра".

А еще нам пригодится метод sleep(int ms).
Создай их.
***


#### Space (3)

Для чего нам нужен класс Space?
Чтобы хранить в себе все объекты и управлять их взаимодействием.
А какие параметры должны у него быть?
width (ширина), height (высота).
А еще?
* ship (космический корабль),
* список для хранения всех НЛО - ufos (ArrayList<Ufo>),
* список для хранения всех ракет - rockets (ArrayList<Rocket>),
* список для хранения всех бомб - bombs (ArrayList<Bomb>).

Задание:
Добавь все эти переменные к классу Space.
Инициализируй коллекции.
И не забудь добавить переменным getter'ы, а для ship еще и setter!

А что должен содержать конструктор?
Достаточно будет width и height.
***


#### Space (2)

У нас будут бомбы и ракеты.
Значит нам нужны классы Bomb(бомба) и Rocket(ракета).
Создай их.

У наших объектов будет много общего.
Они будут перемещаться по космосу и отрисовываться.
Значит у них у всех будут координаты и размер.
А еще методы move() - для перемещения и draw() для отрисовки.

Есть интересное предложение: давай введем один базовый класс для всех объектов.
Пусть это будет класс BaseObject.
А классы Ufo, SpaceShip, Rocket, Bomb от него наследуются.
Создай абстрактный класс BaseObject и добавь его родителем к классам Ufo, SpaceShip, Rocket, Bomb.

Еще нам понадобится класс Canvas.
Он будет ответственным за "отрисовку" объектов.
С его помощью они будут отрисовывать себя.
Вернее даже на нем.
Создай и этот класс.
***


#### Space (1)

Давай напишем новую компьютерную игрушку.
У нас будет космический корабль, который стреляет ракетами в НЛО.
А НЛО в свою очередь сбрасывает на корабль бомбы.
Ну и, конечно, всё дело происходит в космосе.

Нам понадобятся классы: Space(космос), SpaceShip(космический корабль) и Ufo(НЛО).
Создай классы: Space, SpaceShip, Ufo.
Добавь метод main в класс Space.
***