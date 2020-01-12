import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class kaminoFactory {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =
				new BufferedReader (new InputStreamReader(
							System.in
						));
		
		int size = Integer.parseInt(reader.readLine());
		
		String input = "";
		
		int bestSeqIndex = Integer.MAX_VALUE;
		int bestSeqSum = 0;
		int bestSeqIndexRow = 0;
		int bestSeqIndexRowOutput = 0;
		String seqOutput = "";
		
		while (!"Clone them!".equals(input = reader.readLine())){
			++bestSeqIndexRow;				
			String[] data = Arrays.stream(input.split("!+"))
					.filter(e -> !e.equals(""))
					.toArray(String[]::new);
			
			int[] sDNA = new int[size];
			int index = 0;
			for (int i = 0; i < data.length; i++) {
				sDNA[index++] = Integer.parseInt(data[i]);
			}
			int maxCount = 0;
			int seqIndex = 0;
			for (int i = 0; i < sDNA.length; i++) {
				int currentCount = 0;
				for (int j = i; j < sDNA.length; j++) {
					if (sDNA[i] == sDNA[j]) {
						currentCount++;
						if(currentCount > maxCount) {
							maxCount = currentCount;
							seqIndex = i; 
						}
					}else {
						break;
					}
				}
			}
			
			int seqSum = 0;
			for (int i = 0; i < sDNA.length; i++) {
				if(sDNA[i] == 1) {
					seqSum += sDNA[i];
				}
			}
			
			
			if(seqIndex < bestSeqIndex || seqSum > bestSeqSum) {
				seqOutput = "";
				bestSeqIndex = seqIndex;
				bestSeqSum = seqSum;
				bestSeqIndexRowOutput = bestSeqIndexRow;
				for (int i = 0; i < sDNA.length; i++) {
					seqOutput += sDNA[i] + " ";
				}
			}
			
		}
		
		System.out.println(String.format("Best DNA sample %d with sum: %d.",
				bestSeqIndexRowOutput, bestSeqSum));
		System.out.println(seqOutput.trim());
			
	}

}
