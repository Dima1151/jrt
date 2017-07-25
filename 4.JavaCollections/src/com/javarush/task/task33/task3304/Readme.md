taskKey="com.javarush.task.task33.task3304"

Конвертация из одного класса в другой используя JSON

НЕОБХОДИМО: подключенные библиотеки Jackson Core, Bind и Annotation версии 2.6.1

Два класса имеют одинаковые поля, но не имеют общий суперкласс. Пример, классы First и Second.
Реализовать логику метода convertOneToAnother, который должен возвращать объект класса resultClassObject,
значения полей которого равны значениям полей в объекте one.
Используй объект типа ObjectMapper.
Известно, что у классов есть JSON аннотация, у которой значение property равно имени класса в нижнем регистре.
На примере класса First, это className="first"
Классы First и Second не участвуют в тестировании, они предоставлены в качестве тестовых данных.


Требования:
1.	Метод convertOneToAnother должен возвращать объект класса resultClassObject значения полей которого равны значениям полей объекта one.
2.	В методе convertOneToAnother должен быть создан объект типа ObjectMapper.
3.	Метод convertOneToAnother должен быть статическим.
4.	Метод convertOneToAnother должен быть публичным.

