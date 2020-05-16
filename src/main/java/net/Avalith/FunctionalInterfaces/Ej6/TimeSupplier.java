package net.Avalith.FunctionalInterfaces.Ej6;

import java.time.LocalDateTime;

@FunctionalInterface
public interface TimeSupplier {
    LocalDateTime get();
}
