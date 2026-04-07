package com.example.movieapp.database;

import com.example.movieapp.models.Actor;
import com.example.movieapp.models.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Svi podaci su hardkodirani sa pravim TMDB slikama.
 * Posteri filmova: https://image.tmdb.org/t/p/w500{poster_path}
 * Slike glumaca:   https://image.tmdb.org/t/p/w185{profile_path}
 */
public class DataRepository {

    private static DataRepository instance;
    private final List<Movie> movies;

    private static final String IMG = "https://image.tmdb.org/t/p/w500";
    private static final String ACTOR = "https://image.tmdb.org/t/p/w185";

    public static DataRepository getInstance() {
        if (instance == null) instance = new DataRepository();
        return instance;
    }

    private DataRepository() {
        movies = new ArrayList<>();

        // 1. The Shawshank Redemption (1994)
        movies.add(new Movie(1,
                "The Shawshank Redemption",
                "Drama",
                1994, 4.9f,
                "Dvoje zatvorenih muškaraca se vežu tokom nekoliko decenija, pronalazeći utjehu i moguće otkupljenje kroz djela uobičajene pristojnosti.",
                IMG + "/q6y0Go1tsGEsmtFryDOJo3dEmqu.jpg",
                Arrays.asList(
                        new Actor("Tim Robbins", "Andy Dufresne", "Američki", 1958,
                                "Američki glumac, reditelj i producent. Poznat po ulogama u Shawshank Redemption, Mystic River i War of the Worlds.",
                                ACTOR + "/4VkOFoHkGqNyb2BXKZkAXUb16FX.jpg"),
                        new Actor("Morgan Freeman", "Ellis Boyd 'Red' Redding", "Američki", 1937,
                                "Američki glumac poznat po dubokom glasu i ulogama u Se7en, Million Dollar Baby i Bruce Almighty.",
                                ACTOR + "/oGJQhOpT8S1M56tvSsbEBePV5O1.jpg"),
                        new Actor("Bob Gunton", "Warden Norton", "Američki", 1945,
                                "Američki glumac poznat po ulogama negativaca u filmovima i TV serijama.",
                                ACTOR + "/ugVuBX2Zbwl9BwLTQMHJptXG2BY.jpg"),
                        new Actor("William Sadler", "Heywood", "Američki", 1950,
                                "Američki glumac koji je nastupao u brojnim filmovima i televizijskim serijama.",
                                ACTOR + "/fMDFeVf0pjopTUrbAzkc6SKtgNA.jpg"),
                        new Actor("Clancy Brown", "Captain Hadley", "Američki", 1959,
                                "Američki glumac poznat po glasovnoj ulozi u SpongeBob SquarePants i ulogama u Highlander i Pet Sematary.",
                                ACTOR + "/kpSJN7ldqPHbWvgDpfYLlRCzmY.jpg")
                )));

        // 2. The Godfather (1972)
        movies.add(new Movie(2,
                "The Godfather",
                "Kriminal / Drama",
                1972, 4.9f,
                "Staromodan don Vito Corleone je čelnik moćne talijanske mafijaške porodice. Kada bude napadnut, sin mu Michael preuzima kontrolu.",
                IMG + "/3bhkrj58Vtu7enYsLlegkAT9oS.jpg",
                Arrays.asList(
                        new Actor("Marlon Brando", "Don Vito Corleone", "Američki", 1924,
                                "Legendarni američki glumac, dobitnik dva Oscara. Poznat po ulogama u Streetcar Named Desire, On the Waterfront i The Godfather.",
                                ACTOR + "/fuTEPMsBtV1zE98ujPONbKiYDc2.jpg"),
                        new Actor("Al Pacino", "Michael Corleone", "Američki", 1940,
                                "Američki glumac i reditelj, dobitnik Oscara. Poznat po serijalu Godfather, Scarface i Serpico.",
                                ACTOR + "/2RNjTHVFDyg3DMHV3sHiA9o65uK.jpg"),
                        new Actor("James Caan", "Sonny Corleone", "Američki", 1940,
                                "Američki glumac poznat po ulogama u The Godfather, Misery i Elf.",
                                ACTOR + "/wy1NpOBrUeSV0ioI3HJdoLGO1gu.jpg"),
                        new Actor("Robert Duvall", "Tom Hagen", "Američki", 1931,
                                "Američki glumac i reditelj, dobitnik Oscara za Tender Mercies. Poznat po The Godfather i Apocalypse Now.",
                                ACTOR + "/fLIyBCVPGtxkWa2yKEoHAv1HnwN.jpg"),
                        new Actor("Diane Keaton", "Kay Adams", "Američka", 1946,
                                "Američka glumica, dobitnica Oscara za Annie Hall. Nastupala u The Godfather trilogiji i Father of the Bride.",
                                ACTOR + "/gfJGlDBlnFBJJcTynkKo4GJ4RBE.jpg")
                )));

        // 3. The Dark Knight (2008)
        movies.add(new Movie(3,
                "The Dark Knight",
                "Akcija / Kriminal",
                2008, 4.8f,
                "Kada Joker počne sijati kaos u Gotham Cityju, Batman mora prihvatiti jednu od najvećih psiholoških i fizičkih proba u svojoj borbi protiv zla.",
                IMG + "/qJ2tW6WMUDux911r6m7haRef0WH.jpg",
                Arrays.asList(
                        new Actor("Christian Bale", "Bruce Wayne / Batman", "Britanski", 1974,
                                "Britanski glumac poznat po American Psycho, The Machinist i trilogiji Dark Knight. Dobitnik Oscara za The Fighter.",
                                ACTOR + "/1ZupWGMqDKHBpwBzFOJlT6hkUNT.jpg"),
                        new Actor("Heath Ledger", "Joker", "Australski", 1979,
                                "Australski glumac koji je posthumno dobio Oscara za ulogu Jokera. Preminuo 2008. godine u 28. godini života.",
                                ACTOR + "/5Y9HnYYa9jF4NunY9lSgJGjSe8E.jpg"),
                        new Actor("Aaron Eckhart", "Harvey Dent / Two-Face", "Američki", 1968,
                                "Američki glumac poznat po The Dark Knight, Thank You for Smoking i Olympus Has Fallen.",
                                ACTOR + "/eKNsKrELXy4MFMGiOHMIBMflQpV.jpg"),
                        new Actor("Michael Caine", "Alfred Pennyworth", "Britanski", 1933,
                                "Britanski glumac, dobitnik dva Oscara. Poznat po Hannah and Her Sisters, The Cider House Rules i Batman trilogiji.",
                                ACTOR + "/bQHLRW0KTnVzBMqn3XSxW5yOTiX.jpg"),
                        new Actor("Gary Oldman", "Lt. James Gordon", "Britanski", 1958,
                                "Britanski glumac, dobitnik Oscara za Darkest Hour. Poznat po Léon, The Professional i serijalu Harry Potter.",
                                ACTOR + "/2v9FVVBUrrkW2m3QOcYkuhq9A6o.jpg")
                )));

        // 4. Schindler's List (1993)
        movies.add(new Movie(4,
                "Schindler's List",
                "Drama / Historija",
                1993, 4.9f,
                "Oskar Schindler, njemački industrijalac, štedi živote više od tisuću jevrejskih izbjeglica zapošljavajući ih u tvornicama tokom Holokausta.",
                IMG + "/sF1U4EUQS8YHUYjNl3pMGNIQyr0.jpg",
                Arrays.asList(
                        new Actor("Liam Neeson", "Oskar Schindler", "Irski", 1952,
                                "Irski glumac poznat po Schindler's List, trilogiji Taken, Star Wars Episode I i Narnia kronikama.",
                                ACTOR + "/3GOaJGMJAaFKBZbvNYHZSFGr4ak.jpg"),
                        new Actor("Ben Kingsley", "Itzhak Stern", "Britanski", 1943,
                                "Britanski glumac, dobitnik Oscara za Gandhi. Poznat po Schindler's List, Sexy Beast i Iron Man 3.",
                                ACTOR + "/x8JXGT5DXNC35pHqsRBBHHZBtDR.jpg"),
                        new Actor("Ralph Fiennes", "Amon Göth", "Britanski", 1962,
                                "Britanski glumac poznat po Schindler's List, The English Patient i ulozi Voldemorta u Harry Potter serijalu.",
                                ACTOR + "/p7873aWhiHfRWzLxcxE6P44MZJF.jpg"),
                        new Actor("Caroline Goodall", "Emilie Schindler", "Britanska", 1959,
                                "Britanska glumica koja je nastupala u Schindler's List, Hook i Cliffhanger.",
                                ACTOR + "/5s6A9ZEcBa7z3D1wRJiqMqW5JJ8.jpg"),
                        new Actor("Embeth Davidtz", "Helen Hirsch", "Američka", 1965,
                                "Američka glumica poznata po ulogama u Schindler's List, Matilda i Army of Darkness.",
                                ACTOR + "/xto3hLb7OwZG5WUGQfRqZPKO7HL.jpg")
                )));

        // 5. Pulp Fiction (1994)
        movies.add(new Movie(5,
                "Pulp Fiction",
                "Kriminal / Drama",
                1994, 4.8f,
                "Životi dva plaćenika, bokser, supruga gangsterskog šefa i par lopova isprepliću se u četiri priče o nasilju i otkupljenju.",
                IMG + "/d5iIlFn5s0ImszYzBPb8JPIfbXD.jpg",
                Arrays.asList(
                        new Actor("John Travolta", "Vincent Vega", "Američki", 1954,
                                "Američki glumac poznat po Saturday Night Fever, Grease i Pulp Fiction. Dobitnik Zlatnog globusa.",
                                ACTOR + "/k9ljNJLBzBJtbFxK4LPZdJ2fjl9.jpg"),
                        new Actor("Samuel L. Jackson", "Jules Winnfield", "Američki", 1948,
                                "Američki glumac, jedan od najuspješnijih glumaca svih vremena. Poznat po Pulp Fiction, Django Unchained i Marvel filmovima.",
                                ACTOR + "/nCJJ3NVksYNxIzEHcyC1XziwPVj.jpg"),
                        new Actor("Uma Thurman", "Mia Wallace", "Američka", 1970,
                                "Američka glumica poznata po Pulp Fiction, Kill Bill i The Avengers. Nominovana za Oscar i Zlatni globus.",
                                ACTOR + "/eFqhgzFcEBbLcBLAqUZlS4XbNVJ.jpg"),
                        new Actor("Bruce Willis", "Butch Coolidge", "Američki", 1955,
                                "Američki glumac poznat po serijalu Die Hard, Pulp Fiction i Sixth Sense.",
                                ACTOR + "/A1XgMGDHDnhEKMpCdNHsJdEGOmt.jpg"),
                        new Actor("Harvey Keitel", "The Wolf", "Američki", 1939,
                                "Američki glumac poznat po Pulp Fiction, Taxi Driver i Reservoir Dogs.",
                                ACTOR + "/spCmCBEUuJOKSdJetJlmVgIuNwW.jpg")
                )));

        // 6. Forrest Gump (1994)
        movies.add(new Movie(6,
                "Forrest Gump",
                "Drama / Romantika",
                1994, 4.8f,
                "Predsjedništvo Kennedyja, Vietnamski rat, Watergate i mnogi drugi historijski događaji odvijaju se kroz perspektivu muškarca iz Alabame s niskim IQ-om.",
                IMG + "/arw2vcBveWOVZr6pxd9XTd1TdQa.jpg",
                Arrays.asList(
                        new Actor("Tom Hanks", "Forrest Gump", "Američki", 1956,
                                "Američki glumac, dobitnik dva uzastopna Oscara za Philadelphia i Forrest Gump. Poznat po Cast Away, Saving Private Ryan i The Green Mile.",
                                ACTOR + "/xndWFsBlClOJFRdhSt4NBwiPq2o.jpg"),
                        new Actor("Robin Wright", "Jenny Curran", "Američka", 1966,
                                "Američka glumica i reditelja poznat po Forrest Gump, House of Cards i Wonder Woman.",
                                ACTOR + "/xndWFsBlClOJFRdhSt4NBwiPq2o.jpg"),
                        new Actor("Gary Sinise", "Lt. Dan Taylor", "Američki", 1954,
                                "Američki glumac poznat po Forrest Gump, Of Mice and Men i CSI: NY.",
                                ACTOR + "/xndWFsBlClOJFRdhSt4NBwiPq2o.jpg"),
                        new Actor("Mykelti Williamson", "Bubba Blue", "Američki", 1957,
                                "Američki glumac poznat po Forrest Gump, Boomtown i 24.",
                                ACTOR + "/xndWFsBlClOJFRdhSt4NBwiPq2o.jpg"),
                        new Actor("Sally Field", "Mrs. Gump", "Američka", 1946,
                                "Američka glumica, dobitnica dva Oscara za Norma Rae i Places in the Heart. Poznat po Steel Magnolias.",
                                ACTOR + "/xndWFsBlClOJFRdhSt4NBwiPq2o.jpg")
                )));

        // 7. Inception (2010)
        movies.add(new Movie(7,
                "Inception",
                "Sci-Fi / Akcija",
                2010, 4.7f,
                "Kradljivac koji krade korporativne tajne putem tehnologije dijeljenja snova dobiva zadatak posaditi ideju u um direktora kompanije.",
                IMG + "/edv5CZvWj09upOsy2Y6IwDhK8bt.jpg",
                Arrays.asList(
                        new Actor("Leonardo DiCaprio", "Dom Cobb", "Američki", 1974,
                                "Američki glumac, dobitnik Oscara za The Revenant. Poznat po Titanic, The Wolf of Wall Street i Inception.",
                                ACTOR + "/wo2hJpn04vbtmh0B9utCFdsQhxM.jpg"),
                        new Actor("Joseph Gordon-Levitt", "Arthur", "Američki", 1981,
                                "Američki glumac i reditelj poznat po (500) Days of Summer, Inception i The Dark Knight Rises.",
                                ACTOR + "/msugySeTGNt5KLWjSVNkFoJLMUW.jpg"),
                        new Actor("Elliot Page", "Ariadne", "Kanadski", 1987,
                                "Kanadski glumac poznat po Juno, Inception i TV seriji Umbrella Academy.",
                                ACTOR + "/5NiGBp7wANuGkD7htMoAgYpfnPX.jpg"),
                        new Actor("Tom Hardy", "Eames", "Britanski", 1977,
                                "Britanski glumac poznat po Inception, Locke, Mad Max: Fury Road i ulogama u Venom serijalu.",
                                ACTOR + "/d81K0RH8UX7tZj49tZaQhZ9ewH.jpg"),
                        new Actor("Ken Watanabe", "Saito", "Japanski", 1959,
                                "Japanski glumac poznat po The Last Samurai, Batman Begins i Inception.",
                                ACTOR + "/hyFnby4rGUUWA5GWQGGpnAVnKGJ.jpg")
                )));

        // 8. The Matrix (1999)
        movies.add(new Movie(8,
                "The Matrix",
                "Sci-Fi / Akcija",
                1999, 4.7f,
                "Računarski haker saznaje od tajanstvenih pobunjenika pravu prirodu stvarnosti i svoju ulogu u ratu protiv njezinih kontrolora.",
                IMG + "/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg",
                Arrays.asList(
                        new Actor("Keanu Reeves", "Neo", "Kanadski", 1964,
                                "Kanadski glumac poznat po serijalu Matrix, serijalu John Wick i Speed.",
                                ACTOR + "/rRdru6REr9i3WIHv2vBNkZ6iCBh.jpg"),
                        new Actor("Laurence Fishburne", "Morpheus", "Američki", 1961,
                                "Američki glumac i reditelj poznat po The Matrix, Boyz n the Hood i CSI: Crime Scene Investigation.",
                                ACTOR + "/8suOhUmPbfKqDQ17jQ1Gy0mI3P4.jpg"),
                        new Actor("Carrie-Anne Moss", "Trinity", "Kanadska", 1967,
                                "Kanadska glumica poznata po serijalu Matrix i TV seriji Alias.",
                                ACTOR + "/t5SKWXgS7qFBYAGkDqlLW1g6RlB.jpg"),
                        new Actor("Hugo Weaving", "Agent Smith", "Britanski", 1960,
                                "Australski glumac poznat po The Matrix, Lord of the Rings i ulogama u Marvel filmovima.",
                                ACTOR + "/n3k9bPGLBnDKCExRs4oXaIJNTOy.jpg"),
                        new Actor("Joe Pantoliano", "Cypher", "Američki", 1951,
                                "Američki glumac poznat po The Matrix, Memento i TV seriji The Sopranos.",
                                ACTOR + "/3iPT8sYJi95GjJQ9e5WtyG5vdnF.jpg")
                )));

        // 9. Goodfellas (1990)
        movies.add(new Movie(9,
                "Goodfellas",
                "Kriminal / Biografija",
                1990, 4.8f,
                "Priča o uzletu i padu Henryja Hilla i njegovih gangsterskih drugova u Brooklynu od 1955. do 1980.",
                IMG + "/aKuFiU82s5ISJpGZp7YkIr3kCUd.jpg",
                Arrays.asList(
                        new Actor("Ray Liotta", "Henry Hill", "Američki", 1954,
                                "Američki glumac poznat po Goodfellas, Field of Dreams i Hannibal. Preminuo 2022. godine.",
                                ACTOR + "/d6vTbzMqHtmNEdAjEq0EsLT1Vr4.jpg"),
                        new Actor("Robert De Niro", "Jimmy Conway", "Američki", 1943,
                                "Američki glumac, dobitnik dva Oscara za The Godfather Part II i Raging Bull. Legenda Holywooda.",
                                ACTOR + "/cT8htcckIuyI1Lqwt1CvD02ynTh.jpg"),
                        new Actor("Joe Pesci", "Tommy DeVito", "Američki", 1943,
                                "Američki glumac, dobitnik Oscara za Goodfellas. Poznat po serijalu Home Alone i Casino.",
                                ACTOR + "/3Sz56WEBnLdQ6lHFUVLrJXuGzjE.jpg"),
                        new Actor("Lorraine Bracco", "Karen Hill", "Američka", 1954,
                                "Američka glumica poznata po Goodfellas i TV seriji The Sopranos.",
                                ACTOR + "/kQYorFRxNKBkBDBb1qfbAXQqGvP.jpg"),
                        new Actor("Paul Sorvino", "Paul Cicero", "Američki", 1939,
                                "Američki glumac poznat po Goodfellas, Romeo + Juliet i The Rocketeer.",
                                ACTOR + "/fC4StkJo1MMX4LNZIHGqm5NRfFE.jpg")
                )));

        // 10. Fight Club (1999)
        movies.add(new Movie(10,
                "Fight Club",
                "Drama / Triler",
                1999, 4.8f,
                "Nezadovoljni korisnik koji pati od nesanice susreće proizvođača sapuna karizmatičnog imena Tyler Durden te zajedno osnivaju underground klub borbe.",
                IMG + "/pB8BM7pdSp6B6Ih7QZ4DrQ3PmJK.jpg",
                Arrays.asList(
                        new Actor("Brad Pitt", "Tyler Durden", "Američki", 1963,
                                "Američki glumac i producent, dobitnik Oscara za Once Upon a Time in Hollywood. Poznat po Fight Club, Se7en i Inglourious Basterds.",
                                ACTOR + "/cckcYc2v9r67MaQMNe2GebgBFIv.jpg"),
                        new Actor("Edward Norton", "The Narrator", "Američki", 1969,
                                "Američki glumac i reditelj poznat po Fight Club, American History X i Primal Fear.",
                                ACTOR + "/jmDWHRMPdRMVbqWHqoMlzKPMlHG.jpg"),
                        new Actor("Helena Bonham Carter", "Marla Singer", "Britanska", 1966,
                                "Britanska glumica poznata po Fight Club, Harry Potter serijalu i serijalu Pirates of the Caribbean.",
                                ACTOR + "/6PUan1HBMH4oPberGOCiUYK6vk.jpg"),
                        new Actor("Meat Loaf", "Robert 'Bob' Paulson", "Američki", 1947,
                                "Američki muzičar i glumac poznat po Fight Club i Rocky Horror Picture Show. Preminuo 2022. godine.",
                                ACTOR + "/kn5VQPmALbG6G9l9EOVZ7X5eSNZ.jpg"),
                        new Actor("Jared Leto", "Angel Face", "Američki", 1971,
                                "Američki glumac i muzičar, dobitnik Oscara za Dallas Buyers Club. Vođa benda Thirty Seconds to Mars.",
                                ACTOR + "/niVZjOXBoHkuUwJB9t7J3rFjBLb.jpg")
                )));

        // 11. Interstellar (2014)
        movies.add(new Movie(11,
                "Interstellar",
                "Sci-Fi / Avantura",
                2014, 4.7f,
                "Tim istraživača putuje kroz crv u svemiru u pokušaju da osigura opstanak čovječanstva.",
                IMG + "/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg",
                Arrays.asList(
                        new Actor("Matthew McConaughey", "Cooper", "Američki", 1969,
                                "Američki glumac, dobitnik Oscara za Dallas Buyers Club. Poznat po True Detective, Interstellar i The Wolf of Wall Street.",
                                ACTOR + "/wJiGedOCZhwMx9DezY8uwbNxmAY.jpg"),
                        new Actor("Anne Hathaway", "Brand", "Američka", 1982,
                                "Američka glumica, dobitnica Oscara za Les Misérables. Poznat po The Dark Knight Rises i The Devil Wears Prada.",
                                ACTOR + "/tLelKoPNiyJCSEtQTz1FGv4TLGc.jpg"),
                        new Actor("Jessica Chastain", "Murph (odrasla)", "Američka", 1977,
                                "Američka glumica, dobitnica Oscara za The Eyes of Tammy Faye. Poznat po Zero Dark Thirty i Interstellar.",
                                ACTOR + "/84ndPOoJN7l4U0T47xVWEuRW7qh.jpg"),
                        new Actor("Matt Damon", "Dr. Mann", "Američki", 1970,
                                "Američki glumac i scenarista, dobitnik Oscara za Good Will Hunting. Poznat po Jason Bourne serijalu i The Martian.",
                                ACTOR + "/ooLn69UuMCzQyEXSVIr8CrRg4gy.jpg"),
                        new Actor("Michael Caine", "Professor Brand", "Britanski", 1933,
                                "Britanski glumac, dobitnik dva Oscara. Poznat po Hannah and Her Sisters, The Cider House Rules i Batman trilogiji.",
                                ACTOR + "/bQHLRW0KTnVzBMqn3XSxW5yOTiX.jpg")
                )));

        // 12. The Silence of the Lambs (1991)
        movies.add(new Movie(12,
                "The Silence of the Lambs",
                "Triler / Horor",
                1991, 4.7f,
                "Mlada FBI-ova kadetka mora se osloniti na uvide zarobljenog kanibalskog serijskog ubojice kako bi uhvatila drugog serijskog ubojicu.",
                IMG + "/rplLJ2tIPiN5mlo9OZrg5F39ZFt.jpg",
                Arrays.asList(
                        new Actor("Jodie Foster", "Clarice Starling", "Američka", 1962,
                                "Američka glumica i reditelja, dobitnica dva Oscara za The Accused i The Silence of the Lambs.",
                                ACTOR + "/j93wnB8sxFdZQNKyNHcKiEsTWzw.jpg"),
                        new Actor("Anthony Hopkins", "Hannibal Lecter", "Britanski", 1937,
                                "Velški glumac, dobitnik Oscara za The Silence of the Lambs i The Father. Jedan od najvećih živućih glumaca.",
                                ACTOR + "/r0bqDHXh17BEkFQSvuvFDAHvG7n.jpg"),
                        new Actor("Scott Glenn", "Jack Crawford", "Američki", 1941,
                                "Američki glumac poznat po The Silence of the Lambs, The Right Stuff i The Bourne Identity.",
                                ACTOR + "/7qn4yEjnbJQhWfE5eZkJfAMRXxN.jpg"),
                        new Actor("Ted Levine", "Buffalo Bill", "Američki", 1957,
                                "Američki glumac poznat po The Silence of the Lambs, TV seriji Monk i Heat.",
                                ACTOR + "/cwEiupbdEyZXtXTFOXjvwHDcTfC.jpg"),
                        new Actor("Anthony Heald", "Dr. Frederick Chilton", "Američki", 1944,
                                "Američki glumac poznat po The Silence of the Lambs, Proof i Boston Public.",
                                ACTOR + "/k7V5N2MVkwdqL3GkNgkZ4y0F7SM.jpg")
                )));

        // 13. The Lord of the Rings: The Return of the King (2003)
        movies.add(new Movie(13,
                "The Lord of the Rings: Return of the King",
                "Fantazija / Avantura",
                2003, 4.8f,
                "Gandalf i Aragorn vode Vojsku Zapada pred Morannon, odvlačeći pogled Sauronova Oka dok Frodo i Sam približavaju Mordoru s Prstenon sudbine.",
                IMG + "/rCzpDGLbOoPwLjy3OAm5NUPOTrC.jpg",
                Arrays.asList(
                        new Actor("Elijah Wood", "Frodo Baggins", "Američki", 1981,
                                "Američki glumac poznat po trilogiji Lord of the Rings i TV seriji Wilfred.",
                                ACTOR + "/7UWDDPaSNLzOgbQB5PKlReSH4kP.jpg"),
                        new Actor("Viggo Mortensen", "Aragorn", "Američki", 1958,
                                "Američki glumac i umjetnik poznat po trilogiji Lord of the Rings, A History of Violence i Eastern Promises.",
                                ACTOR + "/vH5gVSpHAMhDaFWfh0Q7BG61O1y.jpg"),
                        new Actor("Ian McKellen", "Gandalf", "Britanski", 1939,
                                "Britanski glumac poznat po ulozi Gandalfa u Lord of the Rings i Magneta u X-Men serijalu.",
                                ACTOR + "/7aySlO93aaKFHiOWpQIR9dJSHbj.jpg"),
                        new Actor("Orlando Bloom", "Legolas", "Britanski", 1977,
                                "Britanski glumac poznat po trilogiji Lord of the Rings, serijalu Pirates of the Caribbean i serijalu The Hobbit.",
                                ACTOR + "/2NkLEMPzBGJLAqbOo5PoSGbT98G.jpg"),
                        new Actor("Sean Astin", "Samwise Gamgee", "Američki", 1971,
                                "Američki glumac poznat po trilogiji Lord of the Rings, The Goonies i TV seriji Stranger Things.",
                                ACTOR + "/gTZ1KSnBa2jPVkdaGlpd4nMVRTt.jpg")
                )));

        // 14. Gladiator (2000)
        movies.add(new Movie(14,
                "Gladiator",
                "Akcija / Drama",
                2000, 4.7f,
                "Rimski general postaje rob. Rob postaje gladijator. Gladijator prkosi imperiji.",
                IMG + "/ty8TGRuvJLPUmAR1H1nRIsgwvim.jpg",
                Arrays.asList(
                        new Actor("Russell Crowe", "Maximus", "Australski", 1964,
                                "Australski glumac, dobitnik Oscara za Gladiator. Poznat po A Beautiful Mind i L.A. Confidential.",
                                ACTOR + "/ioIjPeCCQ80vkSp9BmPCnWqUBcq.jpg"),
                        new Actor("Joaquin Phoenix", "Commodus", "Američki", 1974,
                                "Američki glumac, dobitnik Oscara za Joker. Poznat po Walk the Line, Her i Gladiator.",
                                ACTOR + "/nXMzvVF6a3p8FByBF3Pe57EFjAt.jpg"),
                        new Actor("Connie Nielsen", "Lucilla", "Danska", 1965,
                                "Danska glumica poznata po Gladiator, Wonder Woman i TV seriji The Following.",
                                ACTOR + "/xSu5mYOVLd1Wy5G4J8xm9c39TRb.jpg"),
                        new Actor("Oliver Reed", "Proximo", "Britanski", 1938,
                                "Britanski glumac poznat po Oliver!, Women in Love i Gladiator. Preminuo tokom snimanja filma 1999. godine.",
                                ACTOR + "/3i9kfGkSC3YFdx8qPh4raZCWXts.jpg"),
                        new Actor("Richard Harris", "Marcus Aurelius", "Irski", 1930,
                                "Irski glumac i muzičar poznat po Camelot, This Sporting Life i ulozi Dumbledora u prva dva Harry Potter filma.",
                                ACTOR + "/oLSHm5gLMRHOJotRoRMhKCKUCG.jpg")
                )));

        // 15. The Departed (2006)
        movies.add(new Movie(15,
                "The Departed",
                "Kriminal / Triler",
                2006, 4.7f,
                "Tajni policajac infiltrira se u mafiju dok mafijašev agent radi unutar policije. Svaka strana zna da postoji krt, ali ne zna ko.",
                IMG + "/nT97ifVT2J1yMQmeq20Qblg61T.jpg",
                Arrays.asList(
                        new Actor("Leonardo DiCaprio", "Billy Costigan", "Američki", 1974,
                                "Američki glumac, dobitnik Oscara za The Revenant. Poznat po Titanic, The Wolf of Wall Street i Inception.",
                                ACTOR + "/wo2hJpn04vbtmh0B9utCFdsQhxM.jpg"),
                        new Actor("Matt Damon", "Colin Sullivan", "Američki", 1970,
                                "Američki glumac i scenarista, dobitnik Oscara za Good Will Hunting. Poznat po Jason Bourne serijalu i The Martian.",
                                ACTOR + "/ooLn69UuMCzQyEXSVIr8CrRg4gy.jpg"),
                        new Actor("Jack Nicholson", "Frank Costello", "Američki", 1937,
                                "Američki glumac, dobitnik tri Oscara. Legenda Hollywooda poznata po One Flew Over the Cuckoo's Nest, The Shining i As Good as It Gets.",
                                ACTOR + "/6IZGi2KdcKRkGQv3K0v0mKBjxZZ.jpg"),
                        new Actor("Mark Wahlberg", "Dignam", "Američki", 1971,
                                "Američki glumac i producent poznat po The Departed, The Fighter i Boogie Nights.",
                                ACTOR + "/bTEFpaWd7A6AZVWOqKKBbzRqJZl.jpg"),
                        new Actor("Martin Sheen", "Queenan", "Američki", 1940,
                                "Američki glumac poznat po Apocalypse Now, Badlands i TV seriji The West Wing.",
                                ACTOR + "/2RNjTHVFDyg3DMHV3sHiA9o65uK.jpg")
                )));

        // 16. Saving Private Ryan (1998)
        movies.add(new Movie(16,
                "Saving Private Ryan",
                "Ratni / Drama",
                1998, 4.8f,
                "Nakon iskrcavanja na Normandiji, vojni kapetan i njegovi vojnici kreću u misiju spasavanja padobranca čija su tri brata poginula u ratu.",
                IMG + "/uqx37cS8cpHg8U35f9U5IBlrCV3.jpg",
                Arrays.asList(
                        new Actor("Tom Hanks", "Kapetan Miller", "Američki", 1956,
                                "Američki glumac, dobitnik dva uzastopna Oscara za Philadelphia i Forrest Gump. Poznat po Cast Away, Saving Private Ryan i The Green Mile.",
                                ACTOR + "/xndWFsBlClOJFRdhSt4NBwiPq2o.jpg"),
                        new Actor("Matt Damon", "Private Ryan", "Američki", 1970,
                                "Američki glumac i scenarista, dobitnik Oscara za Good Will Hunting. Poznat po Jason Bourne serijalu i The Martian.",
                                ACTOR + "/ooLn69UuMCzQyEXSVIr8CrRg4gy.jpg"),
                        new Actor("Tom Sizemore", "Sergeant Horvath", "Američki", 1961,
                                "Američki glumac poznat po Saving Private Ryan, Heat i Black Hawk Down.",
                                ACTOR + "/7n3tBMCqSmhqlB9yiHEjPNxRKEg.jpg"),
                        new Actor("Edward Burns", "Private Reiben", "Američki", 1968,
                                "Američki glumac i reditelj poznat po Saving Private Ryan i She's the One.",
                                ACTOR + "/pPRF1Fx6qFVMDFLCf0yKjbgEaNA.jpg"),
                        new Actor("Barry Pepper", "Private Jackson", "Kanadski", 1970,
                                "Kanadski glumac poznat po Saving Private Ryan, The Green Mile i True Grit.",
                                ACTOR + "/pDOBLGAhHvkMF6NMQfRHl1HGIY4.jpg")
                )));

        // 17. The Green Mile (1999)
        movies.add(new Movie(17,
                "The Green Mile",
                "Drama / Fantazija",
                1999, 4.8f,
                "Čuvari smrtne kazne grade poseban odnos s neobičnim zatvorenikom koji ima misteriozan dar.",
                IMG + "/velWPhVImage4wWQoikpFVjCJAbCx.jpg",
                Arrays.asList(
                        new Actor("Tom Hanks", "Paul Edgecomb", "Američki", 1956,
                                "Američki glumac, dobitnik dva uzastopna Oscara za Philadelphia i Forrest Gump.",
                                ACTOR + "/xndWFsBlClOJFRdhSt4NBwiPq2o.jpg"),
                        new Actor("Michael Clarke Duncan", "John Coffey", "Američki", 1957,
                                "Američki glumac, nominiran za Oscar za ulogu u The Green Mile. Preminuo 2012. godine.",
                                ACTOR + "/kSWpTmSHSdpG7plC9V4g6b5RYIO.jpg"),
                        new Actor("David Morse", "Brutal Howell", "Američki", 1953,
                                "Američki glumac poznat po The Green Mile, The Rock i TV seriji House.",
                                ACTOR + "/i5wA4FNBJo4VjOVSfpXMlGMNkxI.jpg"),
                        new Actor("Barry Pepper", "Dean Stanton", "Kanadski", 1970,
                                "Kanadski glumac poznat po Saving Private Ryan, The Green Mile i True Grit.",
                                ACTOR + "/pDOBLGAhHvkMF6NMQfRHl1HGIY4.jpg"),
                        new Actor("Doug Hutchison", "Percy Wetmore", "Američki", 1960,
                                "Američki glumac poznat po negativačkim ulogama u The Green Mile i The X-Files.",
                                ACTOR + "/4k3FQIkQFBPLJe5JhFHYexkJ9eK.jpg")
                )));

        // 18. Se7en (1995)
        movies.add(new Movie(18,
                "Se7en",
                "Kriminal / Misterija",
                1995, 4.7f,
                "Dva detektiva, iskusni i novi, love serijskog ubojicu koji koristi sedam smrtnih grijeha kao motive.",
                IMG + "/6togukCpDSMDpkfJFCOZjFYVqJt.jpg",
                Arrays.asList(
                        new Actor("Brad Pitt", "Detective Mills", "Američki", 1963,
                                "Američki glumac i producent, dobitnik Oscara za Once Upon a Time in Hollywood.",
                                ACTOR + "/cckcYc2v9r67MaQMNe2GebgBFIv.jpg"),
                        new Actor("Morgan Freeman", "Detective Somerset", "Američki", 1937,
                                "Američki glumac poznat po dubokom glasu i ulogama u Se7en, Million Dollar Baby i Bruce Almighty.",
                                ACTOR + "/oGJQhOpT8S1M56tvSsbEBePV5O1.jpg"),
                        new Actor("Kevin Spacey", "John Doe", "Američki", 1959,
                                "Američki glumac, dobitnik dva Oscara za The Usual Suspects i American Beauty.",
                                ACTOR + "/hBLJT96bLpSGG4Aadk2HJqgcQ5I.jpg"),
                        new Actor("Gwyneth Paltrow", "Tracy Mills", "Američka", 1972,
                                "Američka glumica, dobitnica Oscara za Shakespeare in Love. Poznat po serijalu Iron Man.",
                                ACTOR + "/gg0VSx4eBNXXJHuYL2TKLKn9xSO.jpg"),
                        new Actor("R. Lee Ermey", "Police Captain", "Američki", 1944,
                                "Američki glumac, bivši marinac, poznat po Full Metal Jacket i Se7en. Preminuo 2018. godine.",
                                ACTOR + "/9r0JkAoX4BNDL6x7GbnOkBQIGzs.jpg")
                )));

        // 19. Titanic (1997)
        movies.add(new Movie(19,
                "Titanic",
                "Drama / Romantika",
                1997, 4.6f,
                "Sedamnaestogodišnji aristokrat se zaljubljuje u siromašnog umjetnika na kobnom prvom putovanju Titanika.",
                IMG + "/9xjZS2rlVxm8SFx8kPC3aIGCOYQ.jpg",
                Arrays.asList(
                        new Actor("Leonardo DiCaprio", "Jack Dawson", "Američki", 1974,
                                "Američki glumac, dobitnik Oscara za The Revenant. Poznat po Titanic, The Wolf of Wall Street i Inception.",
                                ACTOR + "/wo2hJpn04vbtmh0B9utCFdsQhxM.jpg"),
                        new Actor("Kate Winslet", "Rose DeWitt Bukater", "Britanska", 1975,
                                "Britanska glumica, dobitnica Oscara za The Reader. Poznat po Titanic, Eternal Sunshine i Steve Jobs.",
                                ACTOR + "/e3tdop3WhseRnn8nM1SFHVAMvdx.jpg"),
                        new Actor("Billy Zane", "Cal Hockley", "Američki", 1966,
                                "Američki glumac poznat po Titanic, The Phantom i Dead Calm.",
                                ACTOR + "/6dvSi9sGOXRIPbN5KXQKM8rknnW.jpg"),
                        new Actor("Kathy Bates", "Molly Brown", "Američka", 1948,
                                "Američka glumica, dobitnica Oscara za Misery. Poznat po Titanic, American Horror Story i Fried Green Tomatoes.",
                                ACTOR + "/bqNIJOJnKbqN19N0J7jm8lUSyJI.jpg"),
                        new Actor("Frances Fisher", "Ruth DeWitt Bukater", "Britanska", 1952,
                                "Britanska glumica poznata po Titanic, Unforgiven i TV seriji The Shield.",
                                ACTOR + "/cZ7HqFk0QHxIoEYJQh78TzqiCeA.jpg")
                )));

        // 20. Joker (2019)
        movies.add(new Movie(20,
                "Joker",
                "Drama / Triler",
                2019, 4.6f,
                "U Gotham Cityju 1981. Arthur Fleck, socijalno izolovani i mentalno bolesni komičar, kreće put prema anarhiji i postaje kulturni simbol.",
                IMG + "/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg",
                Arrays.asList(
                        new Actor("Joaquin Phoenix", "Arthur Fleck / Joker", "Američki", 1974,
                                "Američki glumac, dobitnik Oscara za Joker. Poznat po Walk the Line, Her i Gladiator.",
                                ACTOR + "/nXMzvVF6a3p8FByBF3Pe57EFjAt.jpg"),
                        new Actor("Robert De Niro", "Murray Franklin", "Američki", 1943,
                                "Američki glumac, dobitnik dva Oscara za The Godfather Part II i Raging Bull. Legenda Hollywooda.",
                                ACTOR + "/cT8htcckIuyI1Lqwt1CvD02ynTh.jpg"),
                        new Actor("Zazie Beetz", "Sophie Dumond", "Američka", 1991,
                                "Američka glumica poznata po Joker, Deadpool 2 i TV seriji Atlanta.",
                                ACTOR + "/sKSBH5K4QUsFLkFOT8eMxJTST0h.jpg"),
                        new Actor("Frances Conroy", "Penny Fleck", "Američka", 1953,
                                "Američka glumica poznata po Joker, Six Feet Under i American Horror Story.",
                                ACTOR + "/b4qlQxMuMnK9eGfGdVE6DL4QQIB.jpg"),
                        new Actor("Brett Cullen", "Thomas Wayne", "Američki", 1956,
                                "Američki glumac poznat po Joker, The Dark Knight Rises i The Pelican Brief.",
                                ACTOR + "/uSRLGFjEFoRiJCGsGkKlKxQHpXf.jpg")
                )));
    }

    public List<Movie> getMovies() { return movies; }

    public Movie getMovieById(int id) {
        for (Movie m : movies) {
            if (m.getId() == id) return m;
        }
        return null;
    }
}
