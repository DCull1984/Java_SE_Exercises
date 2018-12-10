package presidentsexample;


	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.HashMap;
	import java.util.Map;

	public class Presidents {
	    public static void main(String[] args) throws FileNotFoundException {
	        BufferedReader reader = new BufferedReader(new FileReader("presidents.txt"));
	        HashMap<String, Integer> years = new HashMap<>();
	        try {
	            String line;
	            reader.readLine();
	            while ((line = reader.readLine()) != null){
	                String[] words = line.split(",");
	                int birthYear = Integer.parseInt(words[1].trim().split(" ")[2]);
	                int deathYear = (words[3] != null) && (!words[3].trim().equals("")) ? Integer.parseInt(words[3].trim().split(" ")[2]) : 2016;
	                for (int currentYear = birthYear; currentYear <= deathYear; currentYear++) {
	                    if (years.containsKey(String.valueOf(currentYear))) {
	                        Integer oldValue = years.get(String.valueOf(currentYear));
	                        years.replace(String.valueOf(currentYear), oldValue, oldValue + 1);
	                    }
	                    else {
	                        years.put(String.valueOf(currentYear), 1);
	                    }
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        int highestValue = 0;
	        for (Map.Entry<String, Integer> value : years.entrySet()) {
	            if (value.getValue() > highestValue) {
	                highestValue = value.getValue();
	            }
	        }
	        int finalHighestValue = highestValue;
	        HashMap<String, Integer> hYears = new HashMap<>();
	        years.entrySet().stream().filter(entry -> entry.getValue() == finalHighestValue).forEach(entry -> hYears.put(entry.getKey(), entry.getValue()));
	        hYears.forEach((key, value)-> System.out.println(key + ", " + value));
	    }
	
	}
