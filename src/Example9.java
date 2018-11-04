public class Example9 implements AutoCloseable {

    private final String tag;

    public Example9(String tag) {
        this.tag = tag;
        System.out.println("<" + tag + ">");
    }

    public void body(String text) {
        System.out.println(text);
    }

    @Override
    public void close() {
        System.out.println("</" + tag + ">");
    }

    public static void main(String[] args) {
        try (
                Example9 h1 = new Example9("h1");
                Example9 em = new Example9("em")
        ) {
            em.body("my text");
        }
    }
}

