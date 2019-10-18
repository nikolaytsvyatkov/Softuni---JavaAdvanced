package Generics.customlist;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Sorter<T extends Comparable<T>> {
    static<T extends Comparable<T>> void sort(CustomList<T> customList) {
        for (int i = 0; i < customList.getList().size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < customList.getList().size(); j++) {
              if (customList.getList().get(j).compareTo(customList.getList().get(minIndex)) < 0) {
                    minIndex = j;
               }
                T temp = customList.getList().get(minIndex);
                customList.getList().set(minIndex, customList.getList().get(i));
                customList.getList().set(i, temp);
             //matrix = matrix.stream().sorted(Comparator.comparing(a -> a.get(idexxx))).collect(Collectors.toList());

            }
        }
    }
}
