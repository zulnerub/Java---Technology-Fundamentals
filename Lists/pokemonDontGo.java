import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class pokemonDontGo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> pokemons = Arrays
				.stream(sc.nextLine().split("\\s+"))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		int sum = 0;
		while (pokemons.size() > 0) {
			int index = Integer.parseInt(sc.nextLine());
			if (index > - 1 && index < pokemons.size()) {
				int captured = pokemons.get(index);
				pokemons.remove(index);
				sum += captured;
				for (int i = 0; i < pokemons.size(); i++) {
					if (pokemons.get(i) <= captured) {
						pokemons.set(i, pokemons.get(i) + captured);
					}else {
						pokemons.set(i, pokemons.get(i) - captured);
					}
				}
			}else if (index < 0) {
				int captured = pokemons.get(0);
				pokemons.set(0, pokemons.get(pokemons.size() - 1));
				sum += captured;
				for (int i = 0; i < pokemons.size(); i++) {
					if (pokemons.get(i) <= captured) {
						pokemons.set(i, pokemons.get(i) + captured);
					}else {
						pokemons.set(i, pokemons.get(i) - captured);
					}
				}
			}else if (index > pokemons.size() - 1) {
				int captured = pokemons.get(pokemons.size() - 1);
				pokemons.set(pokemons.size() - 1, pokemons.get(0));
				sum += captured;
				for (int i = 0; i < pokemons.size(); i++) {
					if (pokemons.get(i) <= captured) {
						pokemons.set(i, pokemons.get(i) + captured);
					}else {
						pokemons.set(i, pokemons.get(i) - captured);
					}
				}
			}
		}
		System.out.println(sum);
	}

}
