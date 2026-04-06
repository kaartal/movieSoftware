package com.example.movieapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataProvider {

    public static List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("The Shawshank Redemption", "Drama", 9.3f,
                "Two imprisoned men bond over years, finding solace and redemption.",
                R.drawable.poster_placeholder,
                actors("Tim Robbins", "Morgan Freeman", "Bob Gunton", "William Sadler", "Clancy Brown")));

        movies.add(new Movie("The Godfather", "Crime", 9.2f,
                "The aging patriarch of an organized crime dynasty transfers control to his son.",
                R.drawable.poster_placeholder,
                actors("Marlon Brando", "Al Pacino", "James Caan", "Robert Duvall", "Diane Keaton")));

        movies.add(new Movie("The Dark Knight", "Action", 9.0f,
                "Batman faces the Joker, a criminal mastermind who plunges Gotham into chaos.",
                R.drawable.poster_placeholder,
                actors("Christian Bale", "Heath Ledger", "Aaron Eckhart", "Michael Caine", "Gary Oldman")));

        movies.add(new Movie("Pulp Fiction", "Crime", 8.9f,
                "The lives of two mob hitmen intertwine in four tales of violence and redemption.",
                R.drawable.poster_placeholder,
                actors("John Travolta", "Uma Thurman", "Samuel L. Jackson", "Bruce Willis", "Harvey Keitel")));

        movies.add(new Movie("Schindler's List", "History", 8.9f,
                "In German-occupied Poland, Oskar Schindler saves thousands of Jewish lives.",
                R.drawable.poster_placeholder,
                actors("Liam Neeson", "Ralph Fiennes", "Ben Kingsley", "Caroline Goodall", "Jonathan Sagall")));

        movies.add(new Movie("Forrest Gump", "Drama", 8.8f,
                "A slow-witted but kind-hearted man witnesses key events of 20th-century America.",
                R.drawable.poster_placeholder,
                actors("Tom Hanks", "Robin Wright", "Gary Sinise", "Sally Field", "Mykelti Williamson")));

        movies.add(new Movie("Inception", "Sci-Fi", 8.8f,
                "A thief who steals corporate secrets through dream-sharing technology.",
                R.drawable.poster_placeholder,
                actors("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Elliot Page", "Tom Hardy", "Ken Watanabe")));

        movies.add(new Movie("The Matrix", "Sci-Fi", 8.7f,
                "A computer hacker learns about the true nature of reality and his role in the war.",
                R.drawable.poster_placeholder,
                actors("Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss", "Hugo Weaving", "Joe Pantoliano")));

        movies.add(new Movie("Goodfellas", "Crime", 8.7f,
                "The story of Henry Hill and his life in the mob from 1955 to 1980.",
                R.drawable.poster_placeholder,
                actors("Ray Liotta", "Robert De Niro", "Joe Pesci", "Lorraine Bracco", "Paul Sorvino")));

        movies.add(new Movie("Interstellar", "Sci-Fi", 8.7f,
                "A team of explorers travel through a wormhole in space to save humanity.",
                R.drawable.poster_placeholder,
                actors("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain", "Michael Caine", "Matt Damon")));

        movies.add(new Movie("Fight Club", "Drama", 8.8f,
                "An insomniac office worker forms an underground fight club with a soap salesman.",
                R.drawable.poster_placeholder,
                actors("Brad Pitt", "Edward Norton", "Helena Bonham Carter", "Meat Loaf", "Jared Leto")));

        movies.add(new Movie("The Lord of the Rings", "Fantasy", 8.8f,
                "A hobbit embarks on a journey to destroy a powerful ring and save Middle-earth.",
                R.drawable.poster_placeholder,
                actors("Elijah Wood", "Ian McKellen", "Viggo Mortensen", "Sean Astin", "Orlando Bloom")));

        movies.add(new Movie("Se7en", "Thriller", 8.6f,
                "Two detectives hunt a serial killer who uses the seven deadly sins as motives.",
                R.drawable.poster_placeholder,
                actors("Brad Pitt", "Morgan Freeman", "Kevin Spacey", "Gwyneth Paltrow", "R. Lee Ermey")));

        movies.add(new Movie("The Silence of the Lambs", "Thriller", 8.6f,
                "A young FBI cadet seeks help from an imprisoned cannibal to catch a serial killer.",
                R.drawable.poster_placeholder,
                actors("Jodie Foster", "Anthony Hopkins", "Ted Levine", "Scott Glenn", "Anthony Heald")));

        movies.add(new Movie("Saving Private Ryan", "War", 8.6f,
                "U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers were killed.",
                R.drawable.poster_placeholder,
                actors("Tom Hanks", "Matt Damon", "Tom Sizemore", "Edward Burns", "Barry Pepper")));

        movies.add(new Movie("Gladiator", "Action", 8.5f,
                "A Roman general seeks revenge against the corrupt emperor who murdered his family.",
                R.drawable.poster_placeholder,
                actors("Russell Crowe", "Joaquin Phoenix", "Connie Nielsen", "Oliver Reed", "Richard Harris")));

        movies.add(new Movie("The Departed", "Crime", 8.5f,
                "An undercover cop and a mole in the police attempt to identify each other.",
                R.drawable.poster_placeholder,
                actors("Leonardo DiCaprio", "Matt Damon", "Jack Nicholson", "Mark Wahlberg", "Martin Sheen")));

        movies.add(new Movie("Whiplash", "Drama", 8.5f,
                "A promising young drummer enrolls at the best music conservatory in the country.",
                R.drawable.poster_placeholder,
                actors("Miles Teller", "J.K. Simmons", "Melissa Benoist", "Paul Reiser", "Austin Stowell")));

        movies.add(new Movie("Parasite", "Thriller", 8.5f,
                "Greed and class discrimination threaten the newly formed symbiotic relationship between families.",
                R.drawable.poster_placeholder,
                actors("Song Kang-ho", "Lee Sun-kyun", "Cho Yeo-jeong", "Choi Woo-shik", "Park So-dam")));

        movies.add(new Movie("Joker", "Drama", 8.4f,
                "A mentally troubled stand-up comedian embarks on a downward spiral in 1980s Gotham.",
                R.drawable.poster_placeholder,
                actors("Joaquin Phoenix", "Robert De Niro", "Zazie Beetz", "Frances Conroy", "Brett Cullen")));

        return movies;
    }

    private static List<Actor> actors(String... names) {
        List<Actor> list = new ArrayList<>();
        for (String name : names) {
            list.add(new Actor(name, R.drawable.actor_placeholder));
        }
        return list;
    }
}
