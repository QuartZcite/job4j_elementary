package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if ((position == 1 | position == 2)) {
            if (position == 1) {
                System.out.println("Пусть бегут неуклюже,\n" +
                        "Пешеходы по лужам,\n" +
                        "А вода по асфальту рекой.\n" +
                        "И неясно прохожим,\n" +
                        "В этот день непогожий,\n" +
                        "Почему я весёлый такой.\n" +
                        "\n" +
                        "Я играю на гармошке,\n" +
                        "У прохожих на виду,\n" +
                        "К сожалению, день рожденья,\n" +
                        "Только раз в году.\n" +
                        "\n" +
                        "Прилетит вдруг волшебник,\n" +
                        "В голубом вертолёте,\n" +
                        "И бесплатно покажет кино,\n" +
                        "С днём рожденья поздравит,\n" +
                        "И, наверно, оставит,\n" +
                        "Мне в подарок пятьсот эскимо.\n" +
                        "\n" +
                        "Я играю на гармошке,\n" +
                        "У прохожих на виду,\n" +
                        "К сожалению, день рожденья,\n" +
                        "Только раз в году.");
            }
            if (position == 2) {
                System.out.println("Спят усталые игрушки, книжки спят.\n" +
                        "Одеяла и подушки ждут ребят.\n" +
                        "Даже сказка спать ложится,\n" +
                        "Чтобы ночью нам присниться.\n" +
                        "Ты ей пожелай:\n" +
                        "Баю-бай.\n" +
                        "\n" +
                        "Обязательно по дому в этот час\n" +
                        "Тихо-тихо ходит дрёма возле нас.\n" +
                        "За окошком всё темнее,\n" +
                        "Утро ночи мудренее.\n" +
                        "Глазки закрывай,\n" +
                        "Баю-бай.\n" +
                        "\n" +
                        "В сказке можно покататься на луне\n" +
                        "И по радуге промчаться на коне,\n" +
                        "Со слоненком подружиться\n" +
                        "И поймать перо Жар-птицы.\n" +
                        "Глазки закрывай,\n" +
                        "Баю-бай.\n" +
                        "\n" +
                        "Баю-бай, должны все люди ночью спать.\n" +
                        "Баю-баю, завтра будет день опять.\n" +
                        "За день мы устали очень,\n" +
                        "Скажем всем: \"Спокойной ночи!\"\n" +
                        "Глазки закрывай,\n" +
                        "Баю-бай.\n" +
                        "\n" +
                        "Спят усталые игрушки, книжки спят.\n" +
                        "Одеяла и подушки ждут ребят.\n" +
                        "Даже сказка спать ложится,\n" +
                        "Чтобы ночью нам присниться.\n" +
                        "Ты ей пожелай:\n" +
                        "Баю-бай.\n" +
                        "\n" +
                        "Обязательно по дому в этот час\n" +
                        "Источник teksty-pesenok.ru\n" +
                        "Тихо-тихо ходит дрёма возле нас.\n" +
                        "За окошком всё темнее,\n" +
                        "Утро ночи мудренее.\n" +
                        "Глазки закрывай,\n" +
                        "Баю-бай.\n" +
                        "\n" +
                        "В сказке можно покататься на луне\n" +
                        "И по радуге промчаться на коне,\n" +
                        "Со слоненком подружиться\n" +
                        "И поймать перо Жар-птицы.\n" +
                        "Глазки закрывай,\n" +
                        "Баю-бай.\n" +
                        "\n" +
                        "Баю-бай, должны все люди ночью спать.\n" +
                        "Баю-баю, завтра будет день опять.\n" +
                        "За день мы устали очень,\n" +
                        "Скажем всем: \"Спокойной ночи!\"\n" +
                        "Глазки закрывай,\n" +
                        "Баю-бай.");
            }
        }
        else {
            System.out.println("Песня не найдена \n");
        }
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(0);
        song.music(1);
        song.music(2);
    }

}

