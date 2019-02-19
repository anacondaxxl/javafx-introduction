package properties;

import javafx.collections.*;

public class ObservableListDemo2 {

	public static void main(String[] args) {

		ObservableList<Integer> matchScore = FXCollections.observableArrayList(1, 2);
		System.out.println(String.format("Match score is: %d - %d", matchScore.get(0), matchScore.get(1)));

		matchScore.addListener(new ListChangeListener<Integer>() {

			@Override
			public void onChanged(ListChangeListener.Change<? extends Integer> c) {
				while (c.next()) {
					if (c.wasReplaced()) {
						System.out.println(c);
					}
				}
			}
		});

		matchScore.set(0, 3);

	}

}
