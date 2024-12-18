package com.maslonka.mda.system.springboot.monitoring.logging;

import ch.qos.logback.classic.spi.ILoggingEvent;
import org.springframework.boot.logging.structured.StructuredLogFormatter;

public class LoggingService implements StructuredLogFormatter<ILoggingEvent> {
    @Override
    public String format(ILoggingEvent event) {
        return " level=" + event.getLevel() + " logger=" + event.getLoggerName() + " message=" + event.getFormattedMessage();
    }
}
