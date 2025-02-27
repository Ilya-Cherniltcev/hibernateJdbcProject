###  Проект по теме: SQL, JDBC и Hibernate ###


### Функционал приложения ###
Приложение позволяет проверить гипотезу о том, что, при частом обращении к одним и тем же данным в БД, для ускорения работы лучше использовать БД типа NoSQL.

### Основные задачи: ###
Имеется реляционная БД MySQL с схемой (страна-город, язык по стране). 
И есть частый запрос города, который тормозит. 
Решение – вынести все данные, которые запрашиваются часто, в Redis (in memory storage типа ключ-значение).

**Реализация (шаги):**

- Настроить Докер 
- Запустить MySQL сервер как докер-контейнер.
- Развернуть дамп.
- Написать метод получения всех данных из MySQL.
- Написать метод трансформации данных (в Redis пишем только те данные, который запрашиваются часто).
- Запустить Redis сервер как докер-контейнер.
- Записать данные в Redis.
- Написать метод получение данных из Redis.
- Написать метод получение данных из MySQL.
- Сравнить скорость получения одних и тех же данных из MySQL и Redis.

### Итоги: ###

**Redis: 26 ms** 

**MySQL: 49 ms**

- Apple M1
- 8 GB
- macOS Sequoia 15.2

1. [ ] **Т.о. гипотеза подтвердилась))**