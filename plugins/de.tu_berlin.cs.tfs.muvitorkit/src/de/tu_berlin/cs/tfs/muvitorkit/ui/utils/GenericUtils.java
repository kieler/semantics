package de.tu_berlin.cs.tfs.muvitorkit.ui.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public final class GenericUtils {

	static private final Random random = new Random();

	private GenericUtils() {
	}

	static public final <T> T getRandom(final List<T> list) {
		if (list.isEmpty()) {
			return null;
		}
		if (list.size() == 1) {
			return list.get(0);
		}
		int randomInt = random.nextInt();
		if (randomInt < 0) {
			randomInt = -randomInt;
		}
		final int pos = randomInt % list.size();
		return list.get(pos);
	}

	static public final <V, K> K inverseLookup(final HashMap<K, V> map,
			final V value) {
		for (final Entry<K, V> entry : map.entrySet()) {
			if (entry.getValue() == value) {
				return entry.getKey();
			}
		}
		return null;
	}

	static public final <K, V> List<K> deleteValueFromMap(final Map<K, V> map,
			final V value, final boolean once) {
		final ArrayList<K> deletedKeys = new ArrayList<K>();
		for (final Iterator<Entry<K, V>> i = map.entrySet().iterator(); i
				.hasNext();) {
			final Entry<K, V> entry = i.next();
			if (entry.getValue() == value) {
				deletedKeys.add(entry.getKey());
				i.remove();
				if (once) {
					return deletedKeys;
				}
			}
		}
		return deletedKeys;
	}

}
