public class LineCounter {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Specify filename");
            return;
        }
//podajemy parartry do tablicy, jak nie bedzie mial paraetrow wypisze specify filename
        FileUtils.countLines(args[0]).ifPresent(count -> System.out.printf("Lines: %d%n", count));
    }
}