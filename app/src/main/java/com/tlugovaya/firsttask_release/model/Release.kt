package com.tlugovaya.firsttask_release.model

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

private fun getAllReleases(): List<Release> = listOf(
    Release(
        id = "1",
        title = "Темные очки",
        ageRating = "",
        genres = listOf(
            "триллер"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/1080x1920/upload/movie_posters/0/8/6/8365680/741248381505.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "2",
        title = "Главный герой",
        ageRating = "",
        genres = listOf(
            "фантастика", "боевик", "комедия", "мелодрама"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/canvas/800x1200/upload/movie_posters/4/9/2/8356294/1d005924fddff94a8871d2102df5662c.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "3",
        title = "Юморист",
        ageRating = "",
        genres = listOf(
            "драма", "биография"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://s1.afisha.ru/mediastorage/23/14/43ce20e54daa457f9f4d9de21423.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "4",
        title = "Девятая",
        ageRating = "",
        genres = listOf(
            "детектив", "триллер", "криминал"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://www.film.ru/sites/default/files/movies/posters/45780570-1122447.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "5",
        title = "Отчаянные дольщики",
        ageRating = "",
        genres = listOf(
            "комедия", "криминал"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://kinobrest.by/uploads/events/56240pfp1.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "6",
        title = "Мстители. Война бесконечности",
        ageRating = "",
        genres = listOf(
            "фантастика", "боевик", "приключения"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://s2.afisha.ru/mediastorage/23/24/c3ab453460c8483e8ca7fdd12423.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "7",
        title = "Доктор Стрэндж",
        ageRating = "",
        genres = listOf(
            "фантастика", "фэнтези", "боевик", "приключения"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://s1.afisha.ru/mediastorage/62/4d/32a990e368334a07a59ca3654d62.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "8",
        title = "Агент 007. Не время умирать",
        ageRating = "",
        genres = listOf(
            "боевик", "триллер", "приключения"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/canvas/800x1200/upload/movie_posters/3/0/8/8330803/2232b59f9bafb303d6f3bc2caa221d09.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "9",
        title = "Герой",
        ageRating = "",
        genres = listOf(
            "триллер", "комедия", "боевик", "криминал"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://thumbs.dfs.ivi.ru/storage3/contents/a/0/bdf24ef9f368cdf1e10dbad541131f.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "10",
        title = "Соник в кино",
        ageRating = "",
        genres = listOf(
            "боевик", "комедия", "фантастика", "приключения"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1773646/121a74ee-64eb-4ae4-80b7-f36a9f806e20/x1000",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "11",
        title = "Побег из космоса",
        ageRating = "",
        genres = listOf(
            "мультфильм", "приключения", "фантастика", "боевик"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://rossiakino.ru/upload/filmbase/posters/2563_mid_4727.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "12",
        title = "Ледниковый период. Погоня за яйцами",
        ageRating = "",
        genres = listOf(
            "мультфильм", "комедия", "короткометражка", "приключения"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/1080x1920/upload/movie_posters/9/1/2/8360219/3ff0c315f854ba76548438e7df446874.jpeg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "13",
        title = "Как приручить дракона 3",
        ageRating = "",
        genres = listOf(
            "мультфильм", "фэнтези", "боевик", "драма"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/1080x1920/upload/movie_posters/0/2/5/8168520/959ee07b2de4328c6015a86bc4fc4ac9.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "14",
        title = "Суперсемейка 2",
        ageRating = "",
        genres = listOf(
            "мультфильм", "фантастика", "боевик"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/1080x1920/upload/movie_posters/8/8/4/8323488/48d7c8522d919bcce9c0cb690e6a5465.jpeg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "15",
        title = "Фиксики. Большой секрет",
        ageRating = "",
        genres = listOf(
            "мультфильм", "приключения", "комедия"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/1080x1920/upload/movie_posters/6/7/2/8325276/bccf069da377fbed31f20d64d5b411f5.jpeg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "16",
        title = "Скажи ей",
        ageRating = "",
        genres = listOf(
            "драма"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://s5.afisha.ru/mediastorage/a2/63/9abebeb141f7499f82fa5f4363a2.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "17",
        title = "Яга. Кошмар темного леса",
        ageRating = "",
        genres = listOf(
            "ужасы", "фэнтези"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://timashevsk.ru/userfiles/images/preview_image/preview_afisha_cfmp9zk3af1582700432.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "18",
        title = "Месть банши",
        ageRating = "",
        genres = listOf(
            "боевик", "триллер"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://rb7.ru/system/movies/9323.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "19",
        title = "Анчартед: На картах не значится",
        ageRating = "",
        genres = listOf(
            "приключения", "боевик"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/canvas/800x1200/upload/movie_posters/9/4/9/8175949/ee89ae7cb1cc102e2067c96f5067fcf4.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    ),
    Release(
        id = "20",
        title = "Веном 2",
        ageRating = "",
        genres = listOf(
            "фантастика", "боевик", "ужасы"
        ),
        premiere = "",
        countries = listOf(
            ""
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/1080x1920/upload/movie_posters/3/9/3/8356393/fc2d7830149b85b72d63ae05bf7808f5.jpg",
        videoThumbnailUrl = "",
        duration = 0L,
        directors = listOf(
            ""
        ),
        cast = listOf(
            "",
            "",
            ""
        ),
        story = null,
        screenShorts = listOf(
            "",
            "",
            ""
        )
    )
)

fun getRelease(id: String): Release? = getAllReleases().find { it.id == id }

fun getRandomReleases(count: Int): List<Release> = getAllReleases().shuffled().take(count)

fun getMockRepertory(): Repertory = Repertory(
    banners = listOf(
        Banner(
            imageUrl = "https://xage.ru/media/uploads/2017/01/kong_skull_island_00.jpg",
            link = null
        ),
        Banner(
            imageUrl = "https://xage.ru/media/uploads/2017/01/kong_skull_island.jpg",
            link = null
        ),
        Banner(
            imageUrl = "https://geekcity.ru/wp-content/uploads/2021/03/Juy2rU86_9c.jpg",
            link = null
        ),
        Banner(
            imageUrl = "https://horrorzone.ru/uploads/_pages2/70611/mini/glass-poster-14-750-300.jpg",
            link = null
        ),
        Banner(
            imageUrl = "https://www.film.ru/sites/default/files/images/11305437-977865.jpg",
            link = null
        ),
        Banner(
            imageUrl = "https://xage.ru/media/uploads/2017/05/pirates/pirates_01.jpg",
            link = null
        )
    ),
    now = getRandomReleases(5),
    premiere = getRandomReleases(5),
    kids = getRandomReleases(5),
    soon = getRandomReleases(5)
)

fun getMockRelease() = Release(
    id = "21",
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