package properties;

import javafx.collections.*;

public class ObservableListDemo {

	public static void main(String[] args) {

		ObservableList<Integer> matchScore = FXCollections.observableArrayList(1, 2);
		System.out.println(String.format("Match score is: %d - %d", matchScore.get(0), matchScore.get(1)));

		matchScore.addListener(new ListChangeListener<Integer>() {

			@Override
			public void onChanged(ListChangeListener.Change<? extends Integer> c) {
				System.out.println(
						String.format("Match score has been changed: %d - %d", c.getList().get(0), c.getList().get(1)));

			}
		});

		matchScore.set(0, 3);

	}

}
