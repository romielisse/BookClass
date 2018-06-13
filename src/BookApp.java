public class BookApp {
    public static void main(String[] args) {
        Book book = new Book("James and the Giant Peach",
                "Roald Dahl",
                "When poor James Henry Trotter loses his parents in a horrible\n rhinoceros accident, he is forced to live with his two wicked\n aunts, Aunt Sponge and Aunt Spiker. After three years he becomes\n \"the saddest and loneliest boy you could find.\" Then one day, a\n wizened old man in a dark-green suit gives James a bag of magic\n crystals that promise to reverse his misery forever.",
                6.39,
                true);

        // Print book info: author, title, book description
        book.getDisplayText();
    }
}
