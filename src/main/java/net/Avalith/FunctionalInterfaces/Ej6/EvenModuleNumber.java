package net.Avalith.FunctionalInterfaces.Ej6;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

@FunctionalInterface
public interface EvenModuleNumber {
     Boolean test(Integer number, Integer module);
}
