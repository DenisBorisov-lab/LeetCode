# Remove Nth Node From End of List

# Идея алгоритма

## Текущая структура данных:

![Untitled](Remove%20Nth%20Node%20From%20End%20of%20List%20502026d1bf97411396cb3a507b980b7e/Untitled.png)

## Задача:

Удалить второй элемент с конца

## Решение:

Вставим вспомогательную вершину 0

![Untitled](Remove%20Nth%20Node%20From%20End%20of%20List%20502026d1bf97411396cb3a507b980b7e/Untitled%201.png)

Теперь присвоим состоянию 0 переменные ***Fast*** и ***Slow***

![Untitled](Remove%20Nth%20Node%20From%20End%20of%20List%20502026d1bf97411396cb3a507b980b7e/Untitled%202.png)

Далее мы должны создать промежуток из ***n*** узлов между состояниями ***Slow*** и ***Fast***

![Untitled](Remove%20Nth%20Node%20From%20End%20of%20List%20502026d1bf97411396cb3a507b980b7e/Untitled%203.png)

Далее ***Slow*** и ***Fast*** мы должны двигать на следующий узел до тех пор пока ***Fast*** не перешагнёт последний элемент

![Untitled](Remove%20Nth%20Node%20From%20End%20of%20List%20502026d1bf97411396cb3a507b980b7e/Untitled%204.png)

В этот момент узлу 4 присваиваем ссылку на узел 5 и получаем заключительную последовательность

![Untitled](Remove%20Nth%20Node%20From%20End%20of%20List%20502026d1bf97411396cb3a507b980b7e/Untitled%205.png)

Далее возвращаем стартовый узел 1 и получаем ответ