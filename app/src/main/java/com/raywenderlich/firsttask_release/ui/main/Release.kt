package com.raywenderlich.firsttask_release.ui.main

//todo Повторить экран релиза (кроме тулбара с картинкой, списка кадров и рейтинга)
// при клике на кнопку "поделиться", "купить билеты", "трейллер" отображать
// алерт диалоги с соотвествующим текстом
// для получения данных - используй getMockRelease()
// Для отображения картинок использовать Glide/Picasso
// Для работ с датами использовать ThreeTenAbp

data class Release(
    val title: String,
    val ageRating: String,
    val genres: List<String>,
    val premiere: String,
    val countries: List<String>,
    val posterUrl: String,
    val videoThumbnailUrl: String,
    //колличество минут, в ui отображать как 1 ч. 55 мин.
    val duration: Long,
    val directors: List<String>,
    val cast: List<String>,
    val story: String
)


fun getMockRelease() = Release(
    title = "Неоновый демон",
    ageRating = "18+",
    genres = listOf(
        "триллер", "ужасы"
    ),
    premiere = "2022-07-13",
    countries = listOf(
        "сша"
    ),
    posterUrl = "https://s1ru1.kinoplan24.ru/767/6f32b2e2ffc8f4/7651.jpg?mode=fit&width=512&height=512",
    videoThumbnailUrl = "https://s2ru1.kinoplan24.ru/497/3c80f82222e5cc/thumb.jpg",
    duration = 128L,
    directors = listOf(
        "Мартин Стюрд"
    ),
    cast = listOf(
        "Киану Ривз",
        "Эль Фаннинг",
        "Кристина Хендрикс"
    ),
    story = "Провинциалка Джесси, мечтающая стать супермоделью, едва окончив школу, отправляется покорять Лос-Анджелес. Через тернии (одна, без денег, " +
            "чужой город, дешевый мотель), но и через нужные знакомства, фотосессии, вечеринки – к звездам. И вот это сладкое слово «слава» становится былью для юной красавицы. " +
            "Но за стремительный карьерный взлет придется расплатиться – " +
            "конкурентки из ненависти и безумной зависти готовы выскочку съесть, как говорится, со всеми потрохами. И не только в переносном смысле...."
)