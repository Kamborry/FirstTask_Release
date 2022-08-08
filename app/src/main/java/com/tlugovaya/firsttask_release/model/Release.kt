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
        ageRating = "18+",
        genres = listOf(
            "триллер"
        ),
        premiere = "2022-07-21",
        countries = listOf(
            "Италия",
            "Франция"
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/1080x1920/upload/movie_posters/0/8/6/8365680/741248381505.jpg",
        videoThumbnailUrl = "https://img04.rl0.ru/afisha/904x508q85i/s1.afisha.ru/mediastorage/cf/a8/c6e7f27d3f6041ac907cb876a8cf.jpg",
        duration = 86L,
        directors = listOf(
            "Дарио Ардженто"
        ),
        cast = listOf(
            "Иления Пасторелли",
            "Азия Ардженто",
            "Андреа Герпелли",
            "Марио Пиррелло",
            "Мария Розария Руссо"
        ),
        story = "В день полного солнечного затмения Рим превращается в арену жестоких убийств" +
                "— маньяк начинает выслеживать и убивать молодых эскортниц. Его очередной добычей" +
                " едва не становится красавица Диана. Спасаясь от преследования, она попадает " +
                "в автоаварию, в результате чего теряет зрение. Придя в себя и пережив потрясение," +
                " Диана пытается приспособиться к жизни во тьме, но серийный убийца " +
                "следует за ней по пятам, вынуждая пребывать в состоянии постоянного ужаса.",
        screenShorts = listOf(
            "https://www.film.ru/sites/default/files/images/1-14(13).jpg",
            "https://www.film.ru/sites/default/files/styles/epsa_1024x450/public/50226068-2050724.jpg",
            "https://www.film.ru/sites/default/files/images/2-14(9).jpg"
        )
    ),
    Release(
        id = "2",
        title = "Главный герой",
        ageRating = "16+",
        genres = listOf(
            "фантастика",
            "боевик",
            "комедия",
            "мелодрама"
        ),
        premiere = "2021-08-12",
        countries = listOf(
            "США"
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/canvas/800x1200/upload/movie_posters/4/9/2/8356294/1d005924fddff94a8871d2102df5662c.jpg",
        videoThumbnailUrl = "https://s.afisha.ru/mediastorage/e1/f0/4f684d0fd8fb4a1f8ab81bbaf0e1.jpg",
        duration = 115L,
        directors = listOf(
            "Шон Леви"
        ),
        cast = listOf(
            "Райан Рейнольдс",
            "Джоди Комер",
            "Лил Рел Ховери",
            "Джо Кири",
            "Уткарш Амбудкар"
        ),
        story = "Парень по имени Парень счастлив. Он живет в лучшем в мире городе Городе, " +
                "работает на лучшей в мире работе в Банке и дружит с охранником по имени" +
                " Приятель. И его совершенно не волнует, что Банк грабят по нескольку раз" +
                " на дню, а улицы Города напоминают зону военных действий. Единственное, " +
                "чего Парню не хватает для полного счастья — идеальной девушки, " +
                "к которой у него имеется точный список требований. И вот однажды он видит " +
                "на улице красотку, точь-в-точь как в его мечтах. Эта встреча изменит не " +
                "только нашего главного героя, но и перевернёт весь известный ему мир.",
        screenShorts = listOf(
            "https://vgtimes.ru/uploads/posts/2021-08/1629019821_3.jpg",
            "https://img02.rl0.ru/afisha/730x-/daily.afisha.ru/uploads/images/e/65/e65e4005a4dc3856c17c41de0b6c251c.jpg",
            "https://www.kinobusiness.com/upload/iblock/fb0/Glavniy-Geroy_Movie-still_12_novyy-razmer.jpg"

        )
    ),
    Release(
        id = "3",
        title = "Юморист",
        ageRating = "16+",
        genres = listOf(
            "драма",
            "биография"
        ),
        premiere = "2019-03-01",
        countries = listOf(
            "Россия",
            "Латвия",
            "Чехия"
        ),
        posterUrl = "https://s1.afisha.ru/mediastorage/23/14/43ce20e54daa457f9f4d9de21423.jpg",
        videoThumbnailUrl = "https://b1.filmpro.ru/c/566014.700xp.jpg",
        duration = 100L,
        directors = listOf(
            "Михаил Идов"
        ),
        cast = listOf(
            "Алексей Агранович",
            "Юрий Колокольников",
            "Алиса Хазанова",
            "Павел Ильин",
            "Артем Волобуев"
        ),
        story = "У эстрадного юмориста Бориса Аркадьева в жизни все хорошо: " +
                "счастливая семья, обожание миллионов, очередь поклонниц и " +
                "благосклонность властей. Но комику не дает покоя несвобода и внешняя, " +
                "и внутренняя: чем громче его успех на сцене, тем сильнее в нем " +
                "назревает протест. И вот уже самый смешной становится слишком опасным.",
        screenShorts = listOf(
            "https://www.kino-teatr.ru/art/5277/73674.jpg",
            "https://img05.rl0.ru/afisha/e1200x600i/daily.afisha.ru/uploads/images/e/3c/e3c57c6b74dd6e0b464569ab1d0e25c0.jpg",
            "https://www.kino-teatr.ru/art/5277/73666.jpg"
        )
    ),
    Release(
        id = "4",
        title = "Девятая",
        ageRating = "16+",
        genres = listOf(
            "детектив",
            "триллер",
            "криминал"
        ),
        premiere = "2019-11-07",
        countries = listOf(
            "Россия"
        ),
        posterUrl = "https://www.film.ru/sites/default/files/movies/posters/45780570-1122447.jpg",
        videoThumbnailUrl = "https://i.ytimg.com/vi/6CdM9JrcYRg/maxresdefault.jpg",
        duration = 99L,
        directors = listOf(
            "Николай Хомерики"
        ),
        cast = listOf(
            "Евгений Цыганов",
            "Дэйзи Хэд",
            "Дмитрий Лысенков",
            "Джонатан Солвей",
            "Юрий Колокольников"
        ),
        story = "Петербург конца XIX века охвачен массовым увлечением оккультными " +
                "науками и эзотерикой. Британка-медиум Оливия Рид приезжает в столицу " +
                "Российской империи с гастролями и собирает на своих публичных " +
                "спиритических сеансах толпы людей. В это время в городе происходит " +
                "серия загадочных убийств - изувеченные тела девушек находят в разных " +
                "концах города. Расследованием занимаются молодой полковник полиции " +
                "Ростов и его помощник Ганин. С каждой новой жертвой дело становится " +
                "всё запутаннее. Ростов решает обратиться к Оливии в надежде, что её " +
                "подлинная или мнимая способность вызывать духов погибших может помочь " +
                "выйти на след убийцы.",
        screenShorts = listOf(
            "https://s2.afisha.ru/mediastorage/32/df/cad8a78ddfc345e7bbb49048df32.jpg",
            "https://www.kino-teatr.ru/art/5503/77477.jpg",
            "https://api.kinoart.ru/storage/post/block/image/2327/image-d162398f4cfc1067fa2378acb71b53c2.jpg"
        )
    ),
    Release(
        id = "5",
        title = "Отчаянные дольщики",
        ageRating = "16+",
        genres = listOf(
            "комедия",
            "криминал"
        ),
        premiere = "2022-04-28",
        countries = listOf(
            "Россия"
        ),
        posterUrl = "https://kinobrest.by/uploads/events/56240pfp1.jpg",
        videoThumbnailUrl = "https://kuzbass85.ru/wp-content/uploads/2022/04/orig-5-2-scaled.jpg",
        duration = 90L,
        directors = listOf(
            "Илья Фарфель"
        ),
        cast = listOf(
            "Михаил Трухин",
            "Максим Лагашкин",
            "Екатерина Стулова",
            "Никита Кологривый",
            "Ольга Веникова"
        ),
        story = "Кто не мечтает о своей квартире, да ещё в центре города? Две заурядные" +
                " семейные пары — не исключение. Однако на пути к их мечте встаёт " +
                "ушлый застройщик, который взамен кровно нажитых денег даёт только " +
                "котлован для фундамента. Простые россияне не хотят мириться с несправедливостью " +
                "и совершенно случайно берут главу строительной компании в плен.",
        screenShorts = listOf(
            "https://www.kinonews.ru/insimgs/2022/shotimg/shotimg106296_2.jpg",
            "https://www.kino-teatr.ru/video/17887/start.jpg",
            "https://kuzbass85.ru/wp-content/uploads/2022/04/orig-5-2-scaled.jpg"
        )
    ),
    Release(
        id = "6",
        title = "Мстители. Война бесконечности",
        ageRating = "16+",
        genres = listOf(
            "фантастика",
            "боевик",
            "приключения"
        ),
        premiere = "2018-05-03",
        countries = listOf(
            "США"
        ),
        posterUrl = "https://s2.afisha.ru/mediastorage/23/24/c3ab453460c8483e8ca7fdd12423.jpg",
        videoThumbnailUrl = "https://b1.filmpro.ru/c/536675.700xp.jpg",
        duration = 149L,
        directors = listOf(
            "Энтони Руссо",
            "Джо Руссо"
        ),
        cast = listOf(
            "Роберт Дауни мл.",
            "Крис Хемсворт",
            "Марк Руффало",
            "Крис Эванс",
            "Скарлетт Йоханссон"
        ),
        story = "Пока Мстители и их союзники продолжают защищать мир от различных опасностей," +
                " с которыми не смог бы справиться один супергерой, новая угроза " +
                "возникает из космоса: Танос. Межгалактический тиран преследует цель " +
                "собрать все шесть Камней Бесконечности - артефакты невероятной силы, " +
                "с помощью которых можно менять реальность по своему желанию. Всё, с чем " +
                "Мстители сталкивались ранее, вело к этому моменту – судьба Земли никогда " +
                "ещё не была столь неопределённой.",
        screenShorts = listOf(
            "https://gamemag.ru/images/cache/News/News127955/72098b06b8-2_1390x600.jpg",
            "https://b1.filmpro.ru/c/536675.700xp.jpg",
            "https://www.interfax.ru/ftproot/textphotos/2018/05/03/mar700.jpg"
        )
    ),
    Release(
        id = "7",
        title = "Доктор Стрэндж",
        ageRating = "16+",
        genres = listOf(
            "фантастика",
            "фэнтези",
            "боевик",
            "приключения"
        ),
        premiere = "2016-10-31",
        countries = listOf(
            "США"
        ),
        posterUrl = "https://s1.afisha.ru/mediastorage/62/4d/32a990e368334a07a59ca3654d62.jpg",
        videoThumbnailUrl = "https://www.kinonews.ru/insimgs/2021/shotimg/shotimg104444_2.jpg",
        duration = 115L,
        directors = listOf(
            "Скотт Дерриксон"
        ),
        cast = listOf(
            "Бенедикт Камбербэтч",
            "Тильда Суинтон",
            "Мадс Миккельсен",
            "Чиветель Эджиофор",
            "Рэйчел МакАдамс"
        ),
        story = "Страшная автокатастрофа поставила крест на карьере успешного " +
                "нейрохирурга Доктора Стрэнджа. Отчаявшись, он отправляется в путешествие " +
                "в поисках исцеления и открывает в себе невероятные способности " +
                "к трансформации пространства и времени. Теперь он — связующее звено " +
                "между параллельными измерениями, а его миссия — защищать жителей Земли " +
                "и противодействовать злу, какое бы обличие оно ни принимало.",
        screenShorts = listOf(
            "https://avatars.mds.yandex.net/get-kinopoisk-post-img/1345014/4bb60f7e13bf877d13e1134f46d2b65f/960x540",
            "https://kogda-vykhodit.ru/wp-content/uploads/2019/09/doktor-strehndzh-2-film-kartinka.jpg",
            "https://www.kinonews.ru/insimgs/2021/shotimg/shotimg104444_2.jpg"
        )
    ),
    Release(
        id = "8",
        title = "Агент 007. Не время умирать",
        ageRating = "12+",
        genres = listOf(
            "боевик",
            "триллер",
            "приключения"
        ),
        premiere = "2021-10-07",
        countries = listOf(
            "Великобритания",
            "США"
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/canvas/800x1200/upload/movie_posters/3/0/8/8330803/2232b59f9bafb303d6f3bc2caa221d09.jpg",
        videoThumbnailUrl = "https://media.tatler.ru/photos/619765626d4d03405412e10d/master/w_1600%2Cc_limit/unnamed.jpg",
        duration = 163L,
        directors = listOf(
            "Кэри Дзёдзи Фукунага"
        ),
        cast = listOf(
            "Дэниэл Крэйг",
            "Рами Малек",
            "Леа Сейду",
            "Лашана Линч",
            "Бен Уишоу"
        ),
        story = "Джеймс Бонд оставил оперативную службу и наслаждается спокойной жизнью " +
                "на Ямайке. Все меняется, когда на острове появляется его старый друг " +
                "Феликс Лейтер из ЦРУ с просьбой о помощи. Миссия по спасению похищенного " +
                "ученого оказывается опаснее, чем предполагалось изначально. Бонд попадает " +
                "в ловушку таинственного злодея, вооруженного опасным биологическим оружием.",
        screenShorts = listOf(
            "https://s0.rbk.ru/v6_top_pics/ampresize/media/img/3/15/756330073027153.jpg",
            "https://www.kino-teatr.ru/art/6127/88743.jpg",
            "https://www.soyuz.ru/public/uploads/files/2/7448575/202010141121116c9f4bf1a1.jpg"
        )
    ),
    Release(
        id = "9",
        title = "Герой",
        ageRating = "12+",
        genres = listOf(
            "триллер",
            "комедия",
            "боевик",
            "криминал"
        ),
        premiere = "2019-09-26",
        countries = listOf(
            "Россия"
        ),
        posterUrl = "https://thumbs.dfs.ivi.ru/storage3/contents/a/0/bdf24ef9f368cdf1e10dbad541131f.jpg",
        videoThumbnailUrl = "https://i.ytimg.com/vi/HeybaSSdZps/maxresdefault.jpg",
        duration = 115L,
        directors = listOf(
            "Карен Оганесян"
        ),
        cast = listOf(
            "Александр Петров",
            "Владимир Машков",
            "Светлана Ходченкова",
            "Ян Алабушев",
            "Константин Лавроненко"
        ),
        story = "15 лет назад Андрей под руководством своего отца, полковника Родина, " +
                "прошел обучение в секретной спецшколе, где из подростков готовили агентов " +
                "Службы внешней разведки. Когда экспериментальный проект закрыли, Андрей " +
                "«сжёг мосты», остался в Европе и старался не вспоминать о прошлом. " +
                "Но однажды ему звонит отец, которого все считали погибшим. Тот сообщает, " +
                "что на Андрея открыта охота, но кто решил его уничтожить – неизвестно. " +
                "Спасаясь бегством, он находит Машу, с которой учился в спецшколе. " +
                "Андрею предстоит пройти через любовь и предательство и узнать об истинных " +
                "масштабах беспощадной шпионской игры, в которую он оказался втянут поневоле.",
        screenShorts = listOf(
            "https://s.afisha.ru/mediastorage/5b/70/b721e7725030476f93904541705b.jpg",
            "https://thumbs.dfs.ivi.ru/storage32/contents/2/c/2fa53ccf47b06cfc8f61c658cb97b7.jpg",
            "https://thumbs.dfs.ivi.ru/storage15/contents/5/1/29abcc7da5001b12dd2518e67a94f0.jpg"
        )
    ),
    Release(
        id = "10",
        title = "Соник в кино",
        ageRating = "6+",
        genres = listOf(
            "боевик",
            "комедия",
            "фантастика",
            "приключения"
        ),
        premiere = "2020-02-20",
        countries = listOf(
            "США",
            "Япония",
            "Канада"
        ),
        posterUrl = "https://avatars.mds.yandex.net/get-kinopoisk-image/1773646/121a74ee-64eb-4ae4-80b7-f36a9f806e20/x1000",
        videoThumbnailUrl = "https://tntmusic.ru/media/content/article/2022-03-15_10-03-47__34dc2630-a447-11ec-8770-cf8c9979ef09.jpg",
        duration = 99L,
        directors = listOf(
            "Джефф Фаулер"
        ),
        cast = listOf(
            "Джеймс Марсден",
            "Бен Шварц",
            "Наташа Ротуэлл",
            "Тика Самптер",
            "Нил Макдонаф"
        ),
        story = "Отвязный ярко-синий ёжик Соник из параллельного мира вместе с новообретённым " +
                "лучшим другом-человеком по имени Том знакомится со сложностями жизни " +
                "на Земле и противостоит злодейскому доктору Роботнику, который хочет " +
                "пленить ёжика и использовать его безграничные суперсилы для завоевания " +
                "мирового господства.",
        screenShorts = listOf(
            "https://www.film.ru/sites/default/files/images/Sonic-the-Hedgehog-03.jpg",
            "https://pluggedin.ru/images/1-bigTopImage_2022_04_06_16_46_57.jpeg",
            "https://cdn.lifehacker.ru/wp-content/uploads/2020/02/sonic-the-hedgehog-movie-review_1582024978.jpg"
        )
    ),
    Release(
        id = "11",
        title = "Побег из космоса",
        ageRating = "6+",
        genres = listOf(
            "мультфильм",
            "приключения",
            "фантастика",
            "боевик"
        ),
        premiere = "2022-07-07",
        countries = listOf(
            "Китай"
        ),
        posterUrl = "https://rossiakino.ru/upload/filmbase/posters/2563_mid_4727.jpg",
        videoThumbnailUrl = "https://www.film.ru/sites/default/files/styles/thumb_1024x450/public/movies/frames/50298979-2204619.jpg",
        duration = 100L,
        directors = listOf(
            "Линь Хуэйда"
        ),
        cast = listOf(
            "Чжан Бинцзюнь",
            "Чжан Вэй",
            "Тань Сяо",
            "Ли Ваньяо",
            "Чэн Цзиян"
        ),
        story = "Медведь Брэмбл всегда хотел стать героем. И однажды ему выпал шанс стать " +
                "не просто героем, а супергероем. Познакомившись в лесу с пришельцем Эви, " +
                "Брэмбл становится обладателем суперспособностей. Теперь он может реализовать " +
                "любое желание одной силой мысли. Высокоразвитый народ Эви покинул Землю " +
                "миллионы лет назад. И вот теперь Эви вернулся, чтобы передать новейшую " +
                "технологию землянам, а также в надежде найти давно покинутый древний город " +
                "и, может быть, свою семью. Однако следом за Эви из космоса прибывают пираты, " +
                "которые хотят захватить власть во Вселенной. Медведь Брэмбл и его пушистые " +
                "друзья должны помочь новому другу Эви и заодно спасти Вселенную.",
        screenShorts = listOf(
            "https://mediaserver.etobilet.ru/upload/movie/trailer/img/image_5194_7281.jpg",
            "https://www.film.ru/sites/default/files/styles/thumb_1024x450/public/movies/frames/50298979-2204613.jpg",
            "https://www.film.ru/sites/default/files/styles/thumb_1024x450/public/movies/frames/50298979-2204592.jpg"
        )
    ),
    Release(
        id = "12",
        title = "Ледниковый период. Погоня за яйцами",
        ageRating = "6+",
        genres = listOf(
            "мультфильм",
            "комедия",
            "короткометражка",
            "приключения"
        ),
        premiere = "2016-03-20",
        countries = listOf(
            "США"
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/1080x1920/upload/movie_posters/9/1/2/8360219/3ff0c315f854ba76548438e7df446874.jpeg",
        videoThumbnailUrl = "https://www.film.ru/sites/default/files/styles/thumb_1024x450/public/movies/posters/_imported/vX9YcP3JDr34pqjriTUkhWORxls.jpg",
        duration = 25L,
        directors = listOf(
            "Пол Стодольны",
            "Рикардо Кертис",
            "Стив Мартино"
        ),
        cast = listOf(
            "Рэй Романо",
            "Джон Легуизамо",
            "Дэнис Лири",
            "Тараджи П. Хенсон",
            "Куин Латифа"
        ),
        story = "Новый бизнес Сида по высиживанию яиц успешно развивается, но когда " +
                "подлый кролик–пират Сквинт крадет яйца, Мэнни, Диего и остальные " +
                "отправляются в бесстрашную спасательную операцию, которой суждено стать первой " +
                "в истории погоней за яйцами.",
        screenShorts = listOf(
            "https://www.film.ru/sites/default/files/styles/thumb_1024x450/public/movies/posters/_imported/GgxiciXz9K5ng5uZ9FKisf0Mu6.jpg",
            "https://thumbs.dfs.ivi.ru/storage39/contents/2/d/741415b662cc64ef49330f1993cffc.jpg",
            "https://wallpapershome.ru/images/pages/ico_h/10945.jpg"
        )
    ),
    Release(
        id = "13",
        title = "Как приручить дракона 3",
        ageRating = "6+",
        genres = listOf(
            "мультфильм",
            "фэнтези",
            "боевик",
            "драма"
        ),
        premiere = "2019-02-21",
        countries = listOf(
            "США",
            "Япония"
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/1080x1920/upload/movie_posters/0/2/5/8168520/959ee07b2de4328c6015a86bc4fc4ac9.jpg",
        videoThumbnailUrl = "https://img09.rl0.ru/afisha/e1200x600i/daily.afisha.ru/uploads/images/d/0d/d0dee1fb7cbcf49ea06d66048d4d733c.jpg",
        duration = 104L,
        directors = listOf(
            "Дин ДеБлуа"
        ),
        cast = listOf(
            "Джей Барушель",
            "Америка Феррера",
            "Ф. Мюррэй Абрахам",
            "Кейт Бланшетт",
            "Джерард Батлер"
        ),
        story = "Когда-то викинги жили в гармонии с драконами. В те времена они делили " +
                "радость, горе… и последние штаны. Казалось, что так будет всегда, но появление " +
                "загадочной Дневной Фурии изменило жизнь острова. И теперь Иккинг и Беззубик " +
                "столкнутся с безжалостным охотником на драконов, жаждущим уничтожить все, " +
                "что им дорого.",
        screenShorts = listOf(
            "https://pluggedin.ru/images/1-bigTopImage_2019_10_11_20_24_51.jpg",
            "https://mult.pw/uploads/posts/2019-01/1548581812_kak-priruchit-drakona-3-kristally.jpg",
            "https://s.afisha.ru/mediastorage/2a/48/8641c6424b9b4c0fbbac587f482a.jpg"
        )
    ),
    Release(
        id = "14",
        title = "Суперсемейка 2",
        ageRating = "6+",
        genres = listOf(
            "мультфильм",
            "фантастика",
            "боевик"
        ),
        premiere = "2018-06-14",
        countries = listOf(
            "США"
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/1080x1920/upload/movie_posters/8/8/4/8323488/48d7c8522d919bcce9c0cb690e6a5465.jpeg",
        videoThumbnailUrl = "https://b1.filmpro.ru/c/541512.700xp.jpg",
        duration = 118L,
        directors = listOf(
            "Брэд Бёрд"
        ),
        cast = listOf(
            "Крэйг Т. Нельсон",
            "Холли Хантер",
            "Сара Вауэлл",
            "Хак Милнер",
            "Кэтрин Кинер"
        ),
        story = "После событий первой части суперсемейка пользуется повышенным вниманием " +
                "со стороны журналистов. Неожиданно оказалось, что обаятельная Миссис " +
                "Исключительная гораздо лучше смотрится на экране телевизора, чем её муж. " +
                "Мистеру Исключительному все чаще приходится сидеть дома и приглядывать за детьми, " +
                "у каждого из которых есть свои причины быть недовольным собственными " +
                "суперспособностями. Однако семейным проблемам предстоит отступить на второй " +
                "план, когда окажется, что спокойствию Суперсемейки угрожает новый " +
                "могущественный враг.",
        screenShorts = listOf(
            "https://www.film.ru/sites/default/files/images/Incredibles-2-008.jpg",
            "https://www.film.ru/sites/default/files/images/Incredibles-2-002.jpg",
            "https://www.film.ru/sites/default/files/images/Incredibles-2-001.jpg"
        )
    ),
    Release(
        id = "15",
        title = "Фиксики. Большой секрет",
        ageRating = "6+",
        genres = listOf(
            "мультфильм",
            "приключения",
            "комедия"
        ),
        premiere = "2017-10-28",
        countries = listOf(
            "Россия"
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/1080x1920/upload/movie_posters/6/7/2/8325276/bccf069da377fbed31f20d64d5b411f5.jpeg",
        videoThumbnailUrl = "https://s5.afisha.ru/mediastorage/bd/23/500612361ad24d34ba54636823bd.jpg",
        duration = 80L,
        directors = listOf(
            "Василий Бедошвили",
            "Андрей Колпин",
            "Иван Пшонкин"
        ),
        cast = listOf(
            "Александр Пушной",
            "Дмитрий Назаров",
            "Лариса Брохман",
            "Яков Васильев",
            "Прохор Чеховской"
        ),
        story = "Фиксики – маленькие добрые человечки, которые живут в машинах и приборах " +
                "и заботятся о технике. Но люди не должны знать о фиксиках! Это " +
                "БОЛЬШОЙ СЕКРЕТ! Фиксики находят способ перемещаться по электрическим проводам. " +
                "Теперь они смогут мгновенно починить любой прибор, где бы он ни был! И тут " +
                "недоработанное изобретение попадает к озорнику Файеру. В руках маленького " +
                "фиксика оно становится причиной больших проблем. Искры, взрывы, разрушения, " +
                "взбесившаяся техника – город на грани катастрофы! Фиксикам почти чудом " +
                "удаётся её предотвратить. Но как сохранить их БОЛЬШОЙ СЕКРЕТ?!",
        screenShorts = listOf(
            "https://www.kinodisk.com/shots/K289_01.jpg",
            "https://cdn.bfm.ru/news/maindocumentphoto/2018/07/23/kinopoisk.jpg",
            "https://media.kg-portal.ru/images/fiksikibolshojsekret/fiksikibolshojsekret_12.jpg"
        )
    ),
    Release(
        id = "16",
        title = "Скажи ей",
        ageRating = "16+",
        genres = listOf(
            "драма"
        ),
        premiere = "2021-05-13",
        countries = listOf(
            "Россия"
        ),
        posterUrl = "https://s5.afisha.ru/mediastorage/a2/63/9abebeb141f7499f82fa5f4363a2.jpg",
        videoThumbnailUrl = "https://www.film.ru/sites/default/files/styles/thumb_1024x450/public/movies/frames/49608826-1221985.jpg",
        duration = 98L,
        directors = listOf(
            "Александр Молочников"
        ),
        cast = listOf(
            "Кай Гетц",
            "Артём Быстров",
            "Светлана Ходченкова",
            "Алексей Серебряков",
            "Ирина Розанова"
        ),
        story = "Как быть сыну, родители которого каждый день задают вопрос, кого он любит больше? " +
                "Маму или папу? Как быть маме, если она безумно любит сына, но обстоятельства " +
                "вынуждают отнять ребенка у его отца? Как быть папе, если его сына увозят " +
                "в Америку навсегда, а он не представляет своей жизни без него? Это история " +
                "о выборе. Родитель, решая за ребенка, чаще делает так, как удобно ему. " +
                "Ребенок соглашается, боясь причинить родителю боль, но пройдет время, " +
                "он созреет и в какой-то момент обязательно решит сам. Только родителю " +
                "от этого будет намного больнее.",
        screenShorts = listOf(
            "https://cdn-st1.rtr-vesti.ru/vh/pictures/xw/316/499/4.jpg",
            "https://www.kinonews.ru/insimgs/2021/trailer/trailer98692.jpg",
            "https://www.film.ru/sites/default/files/styles/thumb_1024x450/public/movies/frames/49608826-1221985.jpg"
        )
    ),
    Release(
        id = "17",
        title = "Яга. Кошмар темного леса",
        ageRating = "16+",
        genres = listOf(
            "ужасы",
            "фэнтези"
        ),
        premiere = "2020-02-27",
        countries = listOf(
            "Россия"
        ),
        posterUrl = "https://timashevsk.ru/userfiles/images/preview_image/preview_afisha_cfmp9zk3af1582700432.jpg",
        videoThumbnailUrl = "https://b1.filmpro.ru/c/815781.1200xp.jpg",
        duration = 97L,
        directors = listOf(
            "Святослав Подгаевский"
        ),
        cast = listOf(
            "Олег Чугунов",
            "Глафира Голубева",
            "Артём Жигулин",
            "Игорь Хрипунов",
            "Светлана Устинова"
        ),
        story = "Молодая семья переехала в новую квартиру на окраине города. " +
                "Нанятая ими для новорожденной дочери няня быстро вошла в доверие. " +
                "Однако старший сын Егор рассказывает о пугающем поведении женщины, " +
                "но родители ему не верят. Камеры наблюдения, установленные отцом " +
                "для успокоения, лишь подтверждают — всё в порядке. И вот однажды, " +
                "вернувшись домой, Егор не обнаруживает ни няни, ни маленькой сестры, " +
                "а родители пребывают в странном трансе и даже не помнят, что у них была дочь. " +
                "Тогда мальчик вместе с друзьями отправляется на поиски, " +
                "в ходе которых выяснится, что няня — древний славянский демон.",
        screenShorts = listOf(
            "https://qsfilms.com/wp-content/uploads/2020/01/2-1.jpg",
            "https://thumbs.dfs.ivi.ru/storage8/contents/c/4/d6476d1192b84e27fbe4a3f9db75f8.jpg",
            "https://cdn.shazoo.ru/323535_MwsiW2bfr7_5dgug9nizbc.jpg"
        )
    ),
    Release(
        id = "18",
        title = "Месть банши",
        ageRating = "18+",
        genres = listOf(
            "боевик",
            "триллер"
        ),
        premiere = "2022-07-14",
        countries = listOf(
            "США"
        ),
        posterUrl = "https://rb7.ru/system/movies/9323.jpg",
        videoThumbnailUrl = "https://www.film.ru/sites/default/files/styles/thumb_1024x450/public/movies/frames/50317476-2201853.jpg",
        duration = 88L,
        directors = listOf(
            "Джон Кейес"
        ),
        cast = listOf(
            "Джейми Кинг",
            "Антонио Бандерас",
            "Томми Флэнаган",
            "Ким ДеЛонги",
            "Кэтрин Дэвис"
        ),
        story = "",
        screenShorts = listOf(
            "https://www.film.ru/sites/default/files/styles/thumb_1024x450/public/movies/frames/50317476-2201841.jpg",
            "https://www.kino-teatr.ru/acter/album/48115/1270805.jpg",
            "https://www.vokrug.tv/pic/product/2/b/6/6/2b6698e4273beba61215ebb3c191575d.jpg"
        )
    ),
    Release(
        id = "19",
        title = "Анчартед: На картах не значится",
        ageRating = "12+",
        genres = listOf(
            "приключения",
            "боевик"
        ),
        premiere = "2022-02-10",
        countries = listOf(
            "США",
            "Испания"
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/canvas/800x1200/upload/movie_posters/9/4/9/8175949/ee89ae7cb1cc102e2067c96f5067fcf4.jpg",
        videoThumbnailUrl = "https://www.soyuz.ru/public/uploads/files/5/7478756/202202091716504a199e30fc.jpg",
        duration = 115L,
        directors = listOf(
            "Рубен Фляйшер"
        ),
        cast = listOf(
            "Том Холланд",
            "Марк Уолберг",
            "Антонио Бандерас",
            "София Али",
            "Тати Габриэль"
        ),
        story = "Нейтан Дрейк не видел старшего брата Сэма 15 лет, с тех пор как тот " +
                "сбежал из сиротского приюта. Парень работает барменом и промышляет " +
                "мелким воровством, когда на него выходит Виктор Салливан по прозвищу " +
                "Салли и предлагает отправиться на поиски давно потерянных сокровищ Магеллана. " +
                "Узнав, что Салли знаком с Сэмом, Нейтан соглашается на авантюру, " +
                "надеясь также отыскать и брата.",
        screenShorts = listOf(
            "https://cs12.pikabu.ru/post_img/big/2022/05/15/9/1652629687116135262.jpg",
            "https://cdn.lifehacker.ru/wp-content/uploads/2022/02/DF-04219_1644420013-scaled-e1644420038888-630x315.jpg",
            "https://media.kg-portal.ru/images/uncharted/uncharted_6.jpg"
        )
    ),
    Release(
        id = "20",
        title = "Веном 2",
        ageRating = "16+",
        genres = listOf(
            "фантастика",
            "боевик",
            "ужасы"
        ),
        premiere = "2021-09-30",
        countries = listOf(
            "США",
            "Китай"
        ),
        posterUrl = "https://static.kinoafisha.info/k/movie_posters/1080x1920/upload/movie_posters/3/9/3/8356393/fc2d7830149b85b72d63ae05bf7808f5.jpg",
        videoThumbnailUrl = "https://img01.rl0.ru/afisha/e1200x600i/daily.afisha.ru/uploads/images/7/af/7af3c62ada8ae67631b7f0f399030966.jpg",
        duration = 96L,
        directors = listOf(
            "Энди Серкис"
        ),
        cast = listOf(
            "Том Харди",
            "Вуди Харрельсон",
            "Мишель Уильямс",
            "Наоми Харрис",
            "Рейд Скотт"
        ),
        story = "Более чем через год после того как в него вселился инопланетный симбиот " +
                "Веном, журналист Эдди Брок пытается приспособиться к новой жизни " +
                "с суперспособностями и постоянным желанием Венома откусывать людям головы. " +
                "Брок пытается возродить свою карьеру и берет интервью у серийного убийцы " +
                "Клетуса Кэседи, а тот случайно становится хозяином симбиота Карнажа " +
                "и сбегает из тюрьмы прямо во время собственной казни.",
        screenShorts = listOf(
            "https://www.soyuz.ru/public/uploads/files/2/7406260/202004212052509b70c51e16.jpg",
            "https://mbr.com.ua/uploads/news/2021/05/11/d09a2552ae2ede8a0ba6675ba0791dab59bcdaa5.jpg",
            "https://moika78.ru/news2/2021/11/trejler-1024x433.jpg"
        )
    ),
    Release(
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
    now = getRandomReleases(7),
    premiere = getRandomReleases(7),
    kids = getRandomReleases(7),
    soon = getRandomReleases(7)
)