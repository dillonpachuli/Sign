public class Sign {
    private String message;
    private int width;
    public Sign (String m, int w) {
        message = m;
        width = w;
    }

    public int numberOfLines() {
        int lines = message.length() / width;
        if (message.length() % width == 0) return lines;
        return lines + 1;
    }

    public String getLines(){
        String result = "";
        for (int i = 0; i < message.length(); i++){
            result += message.substring(i, i+1);
            if ((i+1) % width == 0 && i+1 != message.length()) result += ";";
        }
        return result;
    }
}