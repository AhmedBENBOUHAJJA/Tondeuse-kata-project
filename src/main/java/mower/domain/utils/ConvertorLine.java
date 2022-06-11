package mower.domain.utils;

import mower.domain.exceptions.FileFormatInvalidException;
import org.apache.log4j.Logger;

public abstract class ConvertorLine<T> {

    private static final Logger logger = Logger.getLogger(ConvertorLine.class);

    protected final String line;

    protected ConvertorLine(final String line) {
        this.line = line;
    }

    protected abstract boolean isValidLine();
    protected abstract T process();

    public T convert() throws FileFormatInvalidException {
        if (!isValidLine()) {
            logger.error("Invalid file Format, please try again !");
            throw new FileFormatInvalidException();
        }
        return process();
    }
}
