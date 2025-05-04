package Classesutilitarias.dates.test;

import java.time.*;
import java.util.Map;

// aula 128 - ZonedDateTime, ZoneId, OffsetDateTime
public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        System.out.println("");

        Instant nowInstant = Instant.now();
        System.out.println("Instant = " + nowInstant);
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyoZone);
        System.out.println("Horario Toquio instant zoned = " + zonedDateTime1);

        System.out.println("-------------------");
        System.out.println("MIN/MAX ZoneOffset");
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00"); // apenas informa o Offset, mas não calcula
        OffsetDateTime offsetDateTime1 = now.atOffset(zoneOffsetManaus);

        ZonedDateTime nowManaus = ZonedDateTime.now(ZoneId.of("America/Manaus"));
        OffsetDateTime offsetDateTime2 = nowManaus.toOffsetDateTime();

        System.out.println("Data e hora Curitiba = " + now);
        System.out.println("Data e hora Manaus = " + offsetDateTime1); // saída no terminal: 2025-05-04T00:11:13.719153800-04:00
        System.out.println("Data e hora Manaus = " + nowManaus);
    }
}
