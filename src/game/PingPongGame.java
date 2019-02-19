package game;

import java.util.HashMap;
import java.util.Map;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class PingPongGame {
	private static final int MAX_POINTS = 21;

	public static void main(String[] args) throws InterruptedException {

		Map<String, Integer> playersPointsMap = new HashMap<>();
		playersPointsMap.put("Player1", 0);
		playersPointsMap.put("Player2", 0);
		playersPointsMap.put("Player3", 0);
		playersPointsMap.put("Player4", 0);

		String winnerMatch1 = playMatch("Player1", "Player2");
		System.out.println("Winner match 1 is " + winnerMatch1);
		playersPointsMap.put(winnerMatch1, playersPointsMap.get(winnerMatch1) + 1);

		String winnerMatch2 = playMatch("Player3", "Player4");
		System.out.println("Winner match 2 is " + winnerMatch2);
		playersPointsMap.put(winnerMatch2, playersPointsMap.get(winnerMatch2) + 1);
		
		String winnerMatch3 = playMatch("Player3", "Player1");
		System.out.println("Winner match 3 is " + winnerMatch3);
		playersPointsMap.put(winnerMatch3, playersPointsMap.get(winnerMatch3) + 1);

		String winnerMatch4 = playMatch("Player4", "Player2");
		System.out.println("Winner match 4 is " + winnerMatch4);
		playersPointsMap.put(winnerMatch4, playersPointsMap.get(winnerMatch4) + 1);
		
		for (String player : playersPointsMap.keySet()) {
			System.out.println("Player: " + player + " points: " + playersPointsMap.get(player));
		}

	}

	private static String playMatch(String player1, String player2) throws InterruptedException {
		int scor1 = 0, scor2 = 0;

		ObservableList<Integer> matchScore = FXCollections.observableArrayList(scor1, scor2);
		System.out.println(String.format("Match score is: %d - %d", matchScore.get(0), matchScore.get(1)));

		matchScore.addListener(new ListChangeListener<Integer>() {

			@Override
			public void onChanged(ListChangeListener.Change<? extends Integer> c) {
				System.out.println(
						String.format("Match score has been changed: %d - %d", c.getList().get(0), c.getList().get(1)));

			}
		});

		while (matchNotFinished(scor1, scor2)) {
			double random = Math.random();
			if (random < 0.5) {
				scor1++;
				matchScore.set(0, scor1);
			} else {
				scor2++;
				matchScore.set(1, scor2);
			}

			 Thread.sleep(150 + (long)(350 * Math.random()));
		}

		if (scor1 > scor2) {
			return player1;
		}
		return player2;
	}

	private static boolean matchNotFinished(int scor1, int scor2) {
		return ((scor1 < MAX_POINTS) && (scor2 < MAX_POINTS)) || Math.abs(scor1 - scor2) < 2;
	}

}
