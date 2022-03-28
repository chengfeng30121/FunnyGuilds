package net.dzikoysk.funnyguilds.config.tablist;

import com.google.common.collect.ImmutableMap;
import eu.okaeri.configs.OkaeriConfig;
import eu.okaeri.configs.annotation.Comment;
import eu.okaeri.configs.annotation.CustomKey;
import eu.okaeri.configs.annotation.NameModifier;
import eu.okaeri.configs.annotation.NameStrategy;
import eu.okaeri.configs.annotation.Names;
import eu.okaeri.validator.annotation.Min;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Names(strategy = NameStrategy.HYPHEN_CASE, modifier = NameModifier.TO_LOWER_CASE)
public class TablistConfiguration extends OkaeriConfig {

    @Comment("Wyglad listy graczy, przedzial slotow - od 1 do 80")
    @Comment("Schemat wygladu listy: https://github.com/FunnyGuilds/FunnyGuilds/blob/master/assets/tab-scheme.png")
    @Comment("> Spis zmiennych gracza:")
    @Comment("{PLAYER} - nazwa gracza")
    @Comment("{WORLD} - swiat, w ktorym znajduje sie gracz")
    @Comment("{PING} - ping gracza")
    @Comment("{PING-FORMAT} - ping gracza z formatowaniem")
    @Comment("{POINTS} - punkty gracza")
    @Comment("{POINTS-FORMAT} - punkty gracza z formatowaniem")
    @Comment("{POSITION} - pozycja gracza w rankingu")
    @Comment("{KILLS} - liczba zabojstw gracza")
    @Comment("{DEATHS} - liczba smierci gracza")
    @Comment("{ASSISTS} - liczba asyst gracza")
    @Comment("{LOGOUTS} - liczba wylogowań gracza podczas walki")
    @Comment("{KDR} - stosunek zabojstw do smierci gracza")
    @Comment("{WG-REGION} - region WorldGuard'a, na ktorym znajduje sie gracz (pierwszy, jesli jest ich kilka)")
    @Comment("{WG-REGIONS} - regiony WorldGuard'a, na ktorych znajduje sie gracz (oddzielone przecinkami)")
    @Comment("{VAULT-MONEY} - balans konta gracza pobierany z pluginu Vault")
    @Comment("> Spis zmiennych gildyjnych:")
    @Comment("{G-NAME} - nazwa gildii do ktorej nalezy gracz")
    @Comment("{G-TAG} - tag gildii gracza")
    @Comment("{G-OWNER} - wlasciciel gildii")
    @Comment("{G-DEPUTIES} - zastepcy gildii")
    @Comment("{G-DEPUTY} - losowy z zastepcow gildii")
    @Comment("{G-LIVES} - liczba zyc gildii")
    @Comment("{G-LIVES-SYMBOL - liczba zyc gildii w postaci powtarzajacego sie symbolu (do ustawienia w lives-repeating-symbol.full w config.yml) z pustymi serduszkami jesli zyc brakuje (do ustawienia w lives-repeating-symbol.empty w config.yml)")
    @Comment("{G-LIVES-SYMBOL-ALL} - liczba wszystkich zyc gildii w postaci powtarzajacego sie symbolu (do ustawienia w lives-repeating-symbol.full w config.yml)")
    @Comment("{G-ALLIES} - liczba sojusznikow gildii")
    @Comment("{G-POINTS} - punkty gildii")
    @Comment("{G-POINTS-FORMAT} - punkty gildii z formatowaniem")
    @Comment("{G-POSITION} - pozycja gildii gracza w rankingu")
    @Comment("{G-KILLS} - suma zabojstw czlonkow gildii")
    @Comment("{G-DEATHS} - suma smierci czlonkow gildii")
    @Comment("{G-KDR} - stosunek zabojstw do smierci czlonkow gildii")
    @Comment("{G-MEMBERS-ONLINE} - liczba czlonkow gildii online")
    @Comment("{G-MEMBERS-ALL} - liczba wszystkich czlonkow gildii")
    @Comment("{G-VALIDITY} - data wygasniecia gildii")
    @Comment("{G-REGION-SIZE} - rozmiar gildii")
    @Comment("> Spis pozostalych zmiennych:")
    @Comment("{GUILDS} - liczba gildii na serwerze")
    @Comment("{USERS} - liczba uzytkownikow serwera")
    @Comment("{ONLINE} - liczba graczy online")
    @Comment("{TPS} - TPS serwera (wspierane tylko od wersji 1.8.8+ spigot/paperspigot)")
    @Comment("{SECOND} - Sekunda")
    @Comment("{MINUTE} - Minuta")
    @Comment("{HOUR} - Godzina")
    @Comment("{DAY_OF_WEEK} - Dzien tygodnia wyrazony w postaci nazwy dnia")
    @Comment("{DAY_OF_MONTH} - Dzien miesiaca wyrazony w postaci liczby")
    @Comment("{MONTH} - Miesiac wyrazony w postaci nazwy miesiaca")
    @Comment("{MONTH_NUMBER} - Miesiac wyrazony w postaci liczby")
    @Comment("{YEAR} - Rok")
    @Comment("{PTOP-<pozycja>} - Gracz na podanej pozycji w rankingu (np. {PTOP-1}, {PTOP-60})")
    @Comment("{GTOP-<pozycja>} - Gildia na podanej pozycji w rankingu (np. {GTOP-1}, {PTOP-50})")
    @CustomKey("player-list")
    public Map<Integer, String> playerList = ImmutableMap.<Integer, String>builder()
            .put(2, " &b&lSTATYSTYKI")
            .put(4, " &7Nick: &b{PLAYER}")
            .put(6, " &7Punkty: &b{POINTS}")
            .put(7, " &7Zabojstwa: &b{KILLS}")
            .put(8, " &7Smierci: &b{DEATHS}")
            .put(9, " &7Asysty: &b{ASSISTS}")
            .put(10, " &7KDR: &b{KDR}")
            .put(12, " &b&lINFORMACJE")
            .put(14, " &7Ping: &b{PING}")
            .put(15, " &7TPS: &b{TPS}")
            .put(17, " &7Online: &b{ONLINE}")
            .put(19, " &7Godzina: &b{HOUR}:{MINUTE}:{SECOND}")
            .put(22, " &b&lSTATYSTYKI GILDII")
            .put(24, " &7Gildia: &b{G-TAG}")
            .put(26, " &7Punkty: &b{G-POINTS}")
            .put(27, " &7Zabojstwa: &b{G-KILLS}")
            .put(28, " &7Smierci: &b{G-DEATHS}")
            .put(29, " &7KDR: &b{G-KDR}")
            .put(31, " &7Zycia: &b{G-LIVES}")
            .put(42, " &b&lTOP &8- &b&lGracze")
            .put(44, " &7Gracze: &b{USERS}")
            .put(46, " &b1. &7{PTOP-1}")
            .put(47, " &b2. &7{PTOP-2}")
            .put(48, " &b3. &7{PTOP-3}")
            .put(49, " &b4. &7{PTOP-4}")
            .put(50, " &b5. &7{PTOP-5}")
            .put(51, " &b6. &7{PTOP-6}")
            .put(52, " &b7. &7{PTOP-7}")
            .put(53, " &b8. &7{PTOP-8}")
            .put(54, " &b9. &7{PTOP-9}")
            .put(55, " &b10. &7{PTOP-10}")
            .put(57, " &7Twoja pozycja: &b{POSITION}")
            .put(62, " &b&lTOP &8- &b&lGildie")
            .put(64, " &7Gildie: &b{GUILDS}")
            .put(66, " &b1. &7{GTOP-1}")
            .put(67, " &b2. &7{GTOP-2}")
            .put(68, " &b3. &7{GTOP-3}")
            .put(69, " &b4. &7{GTOP-4}")
            .put(70, " &b5. &7{GTOP-5}")
            .put(71, " &b6. &7{GTOP-6}")
            .put(72, " &b7. &7{GTOP-7}")
            .put(73, " &b8. &7{GTOP-8}")
            .put(74, " &b9. &7{GTOP-9}")
            .put(75, " &b10. &7{GTOP-10}")
            .put(77, " &7Pozycja gildii: &b{G-POSITION}")
            .build();

    @Comment("Wyglad naglowka w liscie graczy.")
    @CustomKey("player-list-header")
    public String playerListHeader = "&7FunnyGuilds &b4.10.0 Snowdrop &8- &bgithub.com/funnyguilds";

    @Comment("Wyglad stopki w liscie graczy.")
    @CustomKey("player-list-footer")
    public String playerListFooter = "&c&lWiadomosci braku (pokazujace sie, gdy gracz nie ma gildii) mozna zmienic w pliku messages.yml!";

    @Comment("Czy animowana tablista ma byc wlaczona?")
    public boolean playerListAnimated = true;

    @Comment("Wartosc cycles to liczba cykli przez ktore widac dana strone na tabliscie. (1 cykl = 1 wyslanie tablisty, czestotliwosc wysylania tablisty mozna zmienic ustawiajac wartosc playerListUpdateInterval)")
    @Comment("Sekcje player-list konfiguruje sie w ten sam sposob co zwykla. Ustawia sie w niej wszystkie komorki, ktore maja sie zmieniac (nadpisujac zwykla konfiguracje).")
    @Comment("Sekcje player-list-header konfiguruje sie w ten sam sposob co zwykla.")
    @Comment("Sekcje player-list-footer konfiguruje sie w ten sam sposob co zwykla.")
    public List<TablistPage> pages = new LinkedList<>(
            Arrays.asList(
                    new TablistPage(10, ImmutableMap.<Integer, String>builder()
                                    .put(42, " &b&lTOP &8- &b&lPunkty")
                                    .put(46, " &b1. &7{PTOP-POINTS-1}")
                                    .put(47, " &b2. &7{PTOP-POINTS-2}")
                                    .put(48, " &b3. &7{PTOP-POINTS-3}")
                                    .put(49, " &b4. &7{PTOP-POINTS-4}")
                                    .put(50, " &b5. &7{PTOP-POINTS-5}")
                                    .put(51, " &b6. &7{PTOP-POINTS-6}")
                                    .put(52, " &b7. &7{PTOP-POINTS-7}")
                                    .put(53, " &b8. &7{PTOP-POINTS-8}")
                                    .put(54, " &b9. &7{PTOP-POINTS-9}")
                                    .put(55, " &b10. &7{PTOP-POINTS-10}")
                                    .put(57, " &7Twoja pozycja: &b{POSITION-POINTS}")
                                    .put(62, " &b&lTOP &8- &b&lPunkty")
                                    .put(66, " &b1. &7{GTOP-AVG_POINTS-1}")
                                    .put(67, " &b2. &7{GTOP-AVG_POINTS-2}")
                                    .put(68, " &b3. &7{GTOP-AVG_POINTS-3}")
                                    .put(69, " &b4. &7{GTOP-AVG_POINTS-4}")
                                    .put(70, " &b5. &7{GTOP-AVG_POINTS-5}")
                                    .put(71, " &b6. &7{GTOP-AVG_POINTS-6}")
                                    .put(72, " &b7. &7{GTOP-AVG_POINTS-7}")
                                    .put(73, " &b8. &7{GTOP-AVG_POINTS-8}")
                                    .put(74, " &b9. &7{GTOP-AVG_POINTS-9}")
                                    .put(75, " &b10. &7{GTOP-AVG_POINTS-10}")
                                    .put(77, " &7Pozycja gildii: &b{G-POSITION-AVG_POINTS}")
                                    .build(),
                            null, null),

                    new TablistPage(10, ImmutableMap.<Integer, String>builder()
                                    .put(42, " &b&lTOP &8- &b&lZabojstwa")
                                    .put(46, " &b1. &7{PTOP-KILLS-1}")
                                    .put(47, " &b2. &7{PTOP-KILLS-2}")
                                    .put(48, " &b3. &7{PTOP-KILLS-3}")
                                    .put(49, " &b4. &7{PTOP-KILLS-4}")
                                    .put(50, " &b5. &7{PTOP-KILLS-5}")
                                    .put(51, " &b6. &7{PTOP-KILLS-6}")
                                    .put(52, " &b7. &7{PTOP-KILLS-7}")
                                    .put(53, " &b8. &7{PTOP-KILLS-8}")
                                    .put(54, " &b9. &7{PTOP-KILLS-9}")
                                    .put(55, " &b10. &7{PTOP-KILLS-10}")
                                    .put(57, " &7Twoja pozycja: &b{POSITION-KILLS}")
                                    .put(62, " &b&lTOP &8- &b&lZabojstwa")
                                    .put(66, " &b1. &7{GTOP-KILLS-1}")
                                    .put(67, " &b2. &7{GTOP-KILLS-2}")
                                    .put(68, " &b3. &7{GTOP-KILLS-3}")
                                    .put(69, " &b4. &7{GTOP-KILLS-4}")
                                    .put(70, " &b5. &7{GTOP-KILLS-5}")
                                    .put(71, " &b6. &7{GTOP-KILLS-6}")
                                    .put(72, " &b7. &7{GTOP-KILLS-7}")
                                    .put(73, " &b8. &7{GTOP-KILLS-8}")
                                    .put(74, " &b9. &7{GTOP-KILLS-9}")
                                    .put(75, " &b10. &7{GTOP-KILLS-10}")
                                    .put(77, " &7Pozycja gildii: &b{G-POSITION-KILLS}")
                                    .build(),
                            "&7GitHub: &agithub.com/funnyguilds",
                            "&a&lWiadomosci braku (pokazujace sie, gdy gracz nie ma gildii) mozna zmienic w pliku messages.yml!"),

                    new TablistPage(10, ImmutableMap.<Integer, String>builder()
                                    .put(42, " &b&lTOP &8- &b&lSmierci")
                                    .put(46, " &b1. &7{PTOP-DEATHS-1}")
                                    .put(47, " &b2. &7{PTOP-DEATHS-2}")
                                    .put(48, " &b3. &7{PTOP-DEATHS-3}")
                                    .put(49, " &b4. &7{PTOP-DEATHS-4}")
                                    .put(50, " &b5. &7{PTOP-DEATHS-5}")
                                    .put(51, " &b6. &7{PTOP-DEATHS-6}")
                                    .put(52, " &b7. &7{PTOP-DEATHS-7}")
                                    .put(53, " &b8. &7{PTOP-DEATHS-8}")
                                    .put(54, " &b9. &7{PTOP-DEATHS-9}")
                                    .put(55, " &b10. &7{PTOP-DEATHS-10}")
                                    .put(57, " &7Twoja pozycja: &b{POSITION-DEATHS}")
                                    .put(62, " &b&lTOP &8- &b&lSmierci")
                                    .put(66, " &b1. &7{GTOP-DEATHS-1}")
                                    .put(67, " &b2. &7{GTOP-DEATHS-2}")
                                    .put(68, " &b3. &7{GTOP-DEATHS-3}")
                                    .put(69, " &b4. &7{GTOP-DEATHS-4}")
                                    .put(70, " &b5. &7{GTOP-DEATHS-5}")
                                    .put(71, " &b6. &7{GTOP-DEATHS-6}")
                                    .put(72, " &b7. &7{GTOP-DEATHS-7}")
                                    .put(73, " &b8. &7{GTOP-DEATHS-8}")
                                    .put(74, " &b9. &7{GTOP-DEATHS-9}")
                                    .put(75, " &b10. &7{GTOP-DEATHS-10}")
                                    .put(77, " &7Pozycja gildii: &b{G-POSITION-DEATHS}")
                                    .build(),
                            "&7Strona: &6funnyguilds.dzikoysk.net",
                            "&6&lWiadomosci braku (pokazujace sie, gdy gracz nie ma gildii) mozna zmienic w pliku messages.yml!")
            )
    );

    @Min(0)
    @Comment("Liczba pingu pokazana przy kazdej komorce.")
    @CustomKey("player-list-ping")
    public int playerListPing = 0;

    @Comment("Czy wszystkie mozliwe komorki maja zostac zapelnione, nie zwazywszy na liczbe graczy online")
    @CustomKey("player-list-fill-cells")
    public boolean playerListFillCells = true;

    @Comment("Czy tablista ma byc wlaczona")
    @CustomKey("player-list-enable")
    public boolean playerListEnable = true;

    @Min(1)
    @Comment("Co ile tickow lista graczy powinna zostac odswiezona")
    public int playerListUpdateInterval = 20;

    @Comment("Czy zmienne typu {PTOP-%} oraz {GTOP-%} powinny byc pokolorowane w zaleznosci od relacji gildyjnych")
    @CustomKey("player-list-use-relationship-colors")
    public boolean playerListUseRelationshipColors = false;

}
