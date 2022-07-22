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
    //https://xage.ru/media/uploads/2017/01/kong_skull_island_00.jpg
    //https://xage.ru/media/uploads/2017/01/kong_skull_island.jpg
    //https://geekcity.ru/wp-content/uploads/2021/03/Juy2rU86_9c.jpg
    //https://horrorzone.ru/uploads/_pages2/70611/mini/glass-poster-14-750-300.jpg
    //https://www.film.ru/sites/default/files/images/11305437-977865.jpg
    //https://xage.ru/media/uploads/2017/05/pirates/pirates_01.jpg
    //https://xage.ru/media/uploads/2018/05/aiw/aiw_04.jpg
    //https://i.epscape.com/render/5af779aa58482862a4823396237ce2da.webp.jpg
    //https://www.film.ru/sites/default/files/images/DD1CrA-UIAAVqCf.jpg
    //https://sun9-20.userapi.com/impf/c824701/v824701349/16181e/y3m9vw82Lno.jpg?size=604x302&quality=96&sign=8a7ff1ea93f3939c491ed5f400debea5&type=album
    //https://horrorzone.ru/uploads/_pages3/82238/mini/0joker-poster-06-750-300.jpg
    //https://i0.wp.com/www.henneth-annun.ru/wp-content/uploads/2014/10/hobbit3_poster_horiz4.jpg?ssl=1
    //https://cdn-ksvod.kyivstar.ua/content/HLS/VOD/IMAGE2/62cab18d66348e185e343c74/IMAGE_3_1_2_XL.jpg
    //https://img.freepik.com/free-vector/horror-movie-banner_600765-180.jpg
    //https://i0.wp.com/www.henneth-annun.ru/wp-content/uploads/2014/10/hobbit3_poster_horiz1.jpg?ssl=1
    //https://cs8.pikabu.ru/post_img/2016/02/05/5/145465536319727727.jpg
    //https://sun9-84.userapi.com/s/v1/if1/iPftsA0NbyTA6zbnFFl4yJ8qPI85e8TOFpPNuq65oPjleIx_g2PxnU1Kt-oaBuV0xipQGh1u.jpg?size=604x201&quality=96&type=album
    //https://wikicomics.ru/uploads/posts/2017-11/1511348972_liga-2.jpg
    //https://thumbs.dfs.ivi.ru/storage26/contents/4/e/a222deddf3cb953989e957471fd0b8.jpg
    
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