public class Range {
    private final String input;

    public Range(String input) {
        this.input = input;
    }

    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }
    public boolean isStartWithExclude() {
        return this.input.startsWith("(");
    }

    public int isStartNumWithInclude() {
        if(isStartWithInclude()) {
            return Integer.parseInt(String.valueOf(this.input.charAt(1)));
        }
        return -1; // TODO
    }
}
