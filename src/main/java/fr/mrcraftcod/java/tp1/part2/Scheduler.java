package fr.mrcraftcod.java.tp1.part2;

import fr.mrcraftcod.java.tp1.part2.shows.*;
import fr.mrcraftcod.java.utils.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The scheduler.
 * <p>
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public class Scheduler
{
	private final static boolean SHOW_OVERLAPS_0H = false;
	
	/**
	 * @param args Not used.
	 */
	public static void main(String[] args)
	{
		var schedule = new HashMap<Integer, Show>();
		schedule.put(0, new MangasShow("Manga 1", 2034, "Sensei", true));
		schedule.put(2, new CulturalDocumentaryShow("Cultural 1", 1, "Japon"));
		schedule.put(3, new WildlifeDocumentaryShow("Wildlife 1", 4, "Lions"));
		schedule.put(7, new MovieShow("Movie 1", 11, 2019, "Pico", true));
		schedule.put(17, new CulturalDocumentaryShow("Cultural 2", 1, "Java"));
		schedule.put(18, new MangasShow("Movie 2", 2017, "Tartuffe", true));
		schedule.put(20, new WildlifeDocumentaryShow("Wildlife 2", 1, "Cats"));
		schedule.put(21, new MovieShow("Movie 3", 1, 2039, "Plouf", false));
		schedule.put(22, new WildlifeDocumentaryShow("Wildlife 3", 2, "Oysters"));
		
		System.out.println("\n\n-----------------------------------------------------");
		displayShows(schedule);
		System.out.println("\n\n-----------------------------------------------------");
		displayOverlaps(schedule, overlaps(schedule));
		System.out.println("\n\n-----------------------------------------------------");
		displayFullShows(schedule);
	}
	
	/**
	 * Displays the simple schedule.
	 *
	 * @param schedule The schedule.
	 */
	private static void displayShows(HashMap<Integer, Show> schedule)
	{
		schedule.keySet().stream().sorted().forEach(k -> System.out.format("Scheduled at %02dh for %02dh: %-13s %s\n", k, schedule.get(k).getLength(), schedule.get(k).getName(), schedule.get(k).canBePlannedAt(k) ? "" : "(INVALID)"));
	}
	
	/**
	 * Display the overlaps.
	 *
	 * @param schedule The schedule.
	 * @param overlaps The overlaps map.
	 */
	private static void displayOverlaps(HashMap<Integer, Show> schedule, List<Pair<Integer, List<Integer>>> overlaps)
	{
		for(Pair<Integer, List<Integer>> overlap : overlaps)
			if(overlap.getValue().size() != 0 || SHOW_OVERLAPS_0H)
				System.out.println(schedule.get(overlap.getKey()) + " overlaps " + overlap.getValue().size() + " hours (" + overlap.getValue().toString() + ")");
	}
	
	/**
	 * List the overlaps.
	 *
	 * @param schedule The schedule.
	 *
	 * @return A list of pair. Each pair contain the index (beginning hour) of the show and a list of the hours overlapped.
	 */
	private static List<Pair<Integer, List<Integer>>> overlaps(HashMap<Integer, Show> schedule)
	{
		return schedule.keySet().stream().map(key -> {
			int endHour = schedule.get(key).getLength() + key - 1;
			List<Integer> overlappedHours = schedule.keySet().stream().filter(k -> !k.equals(key)).flatMap(k -> {
				List<Integer> hours = new LinkedList<>();
				for(int i = 0; i < schedule.get(k).getLength(); i++)
					hours.add(k + i);
				return hours.stream();
			}).filter(v -> v >= key && v <= endHour).collect(Collectors.toList());
			return new Pair<>(key, overlappedHours);
		}).collect(Collectors.toList());
	}
	
	/**
	 * List every hour with its show.
	 *
	 * @param schedule The schedule.
	 */
	private static void displayFullShows(HashMap<Integer, Show> schedule)
	{
		schedule.keySet().stream().flatMap(k -> {
			List<Pair<Integer, Integer>> shows = new LinkedList<>();
			for(int i = 0; i < schedule.get(k).getLength(); i++)
				shows.add(new Pair<>(k + i, k));
			return shows.stream();
		}).sorted(Comparator.comparing(Pair::getKey)).forEachOrdered(p -> System.out.println("Hour " + p.getKey() + ": " + schedule.get(p.getValue())));
	}
}
