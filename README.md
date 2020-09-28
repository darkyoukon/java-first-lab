# Java first lab - OOP Confectionery
Лабораторна робота №1
1. Різні модифікатори доступу (public, private, крім package private) класів/методів/полів - наявні у всіх класах.
2. Присутня інкапсуляція - усі поля класів с закритим доступом.
3. Присутнє наслідування - класи Flour, Sugar успадковані від класу Confectionery; Marshmallow від Sugar, Biscuit від Flour.
4. Присутній поліморфізм - метод toString перевизначений у класах Order, Cocoa, Biscuit, метод getCalories абстрактного класу Confectionery перевизначений у класах Biscuit, Cocoa.
5. Присутній абстрактний клас - Confectionery.
6. Перераховування константних об’єктів - enum SugarType - поле класу Sugar, enum FlourType - поле класу Flour.
7. Вкладений (nested) клас - локальний вкладений клас Layer - у класі Biscuit (слої пирігу).
8. Асоціація класів -  у методі checkSugarSufficiency класу Order створюється клас Sugar, щоб перевірити тип цукру. 
9. Агрегація або композиція - масив типу Marshmallow у класі Cocoa та поле Sugar у тому ж класі.
10. Колекція - ArrayList'и у класах Order, Cocoa. Об'єкт Iterator - у методі checkSugarSufficiency класу Order.
