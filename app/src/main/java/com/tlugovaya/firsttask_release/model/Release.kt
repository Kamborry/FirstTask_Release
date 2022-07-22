package com.tlugovaya.firsttask_release.model

import com.tlugovaya.firsttask_release.R
import org.threeten.bp.LocalDate
import org.threeten.bp.format.DateTimeFormatter

//todo Повторить экран релиза (кроме тулбара с картинкой, списка кадров и рейтинга)
// при клике на кнопку "поделиться", "купить билеты", "трейллер" отображать
// алерт диалоги с соотвествующим текстом
// Для отображения картинок использовать Glide/Picasso
// для получения данных - используй getMockRelease()
// Для работ с датами использовать ThreeTenAbp

data class Release(
    val id: String,
    val title: String,
    val ageRating: String,
    val genres: List<String>,
    val premiere: String,
    val countries: List<String>,
    val posterUrl: String?,
    val videoThumbnailUrl: String,
    //колличество минут, в ui отображать как 1 ч. 55 мин.
    val duration: Long?,
    val directors: List<String>,
    val cast: List<String>,
    val story: String?,
    val screenShorts: List<String>
)

data class Banner(
    val imageUrl: String,
    val link: String?
)

data class Repertory(
    val banners: List<Banner>,
    val now: List<Release>,
    val premiere: List<Release>,
    val kids: List<Release>,
    val soon: List<Release>
)

fun getMockRepertory() : Repertory = Repertory(
    banners = listOf(

    ),
    now = listOf(

    ),
    premiere = listOf(

    ),
    kids = listOf(

    ),
    soon = listOf(

    )
)

fun getMockRelease() = Release(
    id = "1",
    title = "Неоновый демон",
    ageRating = "18+",
    genres = listOf(
        "триллер", "ужасы"
    ),
    premiere = "2022-07-13",
    countries = listOf(
        "США"
    ),
    posterUrl = "https://s1ru1.kinoplan24.ru/767/6f32b2e2ffc8f4/7651.jpg?mode=fit&width=512&height=512",
    videoThumbnailUrl = "https://www.kinogallery.com/img/trailers/0780372001467030285.jpg",
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
            "конкурентки из ненависти и безумной зависти готовы выскочку съесть, как говорится, со всеми потрохами. И не только в переносном смысле....",
    screenShorts = listOf(
        "https://s.afisha.ru/mediastorage/a2/3a/08786972a4c74a07974ad8cf3aa2.jpg",
        "https://static.tildacdn.com/tild3861-6265-4762-b164-373731356238/_9_1.jpg",
        "https://static3.coolconnections.ru/images/8328/standard/hd/199d6256e1af31b9e0e270affa203080796a8248.jpg?1655478273"
    )
)