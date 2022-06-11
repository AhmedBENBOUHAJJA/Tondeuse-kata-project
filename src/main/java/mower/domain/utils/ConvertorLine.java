package mower.domain.utils;

public abstract class ConvertorLine<T> {

    protected final String line;

    protected ConvertorLine(final String line) {
        this.line = line;
    }

    protected abstract boolean isValidLine();
    protected abstract T process();

    public T convert() {
        return null;
    }
}
