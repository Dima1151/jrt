taskKey="com.javarush.task.task33.task3311"

Странная ошибка

НЕОБХОДИМО: подключенные библиотеки Jackson Core, Bind и Annotation версии 2.6.1

В результате выполнения кода в методе main класса Solution возникает странная ошибка
при сериализации/десериализации в JSON. На экран должна быть выведена строка sampleJsonString,
а выводится не совсем она.

Разберись в чем проблема и исправь. Обрати внимание на класс RealBean.


Требования:
1.	Метод getAdditionalMap должен быть отмечен одной подходящей Jackson аннотацией.
2.	Сериализация элементов additionalMap в json должна происходить, как сериализация обычных полей класса.
3.	Десериализация элементов additionalMap из json должна происходить, как десериализация обычных полей класса.
4.	Метод main должен выводить данные на экран.

