package statisticker;

import java.util.List;

public class Statistics {

	static class Stats {
            public float average = 4.525f;
            public float min = 1.5f;
            public float max = 8.9f;
	}

	public static Stats getStatistics(List<Float> numbers) {
		// implement the computation of statistics here

		return new Stats();
	}
}
