package ua.com.vtkachenko.patterns.chainofresponsibility;

import java.util.Arrays;

public abstract class AbstractFilter {
    private AbstractFilter nextFilter;
    public AbstractFilter() {}
    public AbstractFilter(AbstractFilter nextFilter) { this.nextFilter = nextFilter;}

    private String getAsteriskString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) { sb.append("*"); }
        return sb.toString();
    }
    protected abstract String getWord();

    public String doFilter(String message) {
        StringBuilder filtered = new StringBuilder();
        Arrays.stream(message.split(" "))
                .map(String::toLowerCase)
                .map(currentWord -> currentWord.contains(getWord().toLowerCase()) ?
                        getAsteriskString(currentWord.length()) :
                        currentWord)
                .forEach(s -> {
                    filtered.append(s).append(" ");
                });
        if (nextFilter != null) {
            return nextFilter.doFilter(filtered.toString());
        }
        return filtered.toString();
    }
}
