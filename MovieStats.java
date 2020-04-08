import java.io.*; 
import java.util.*; 

public class MovieStats {
	public static void main(String[]args) throws IOException{
		FileReader file1 = new FileReader("ratings.csv"); 
		FileReader file2 = new FileReader("movies.csv"); 
		BufferedReader br1 = new BufferedReader(file1); 
		BufferedReader br2 = new BufferedReader(file2); 
		
		String line;
		
		ArrayList <String> genres = new ArrayList<String>(); 
		String k1 = "sci-fi";
		String k2 = "thriller"; 
		String k3 = "drama"; 
		String k4 = "adventure";
		String k5 = "comedy"; 
		String k6 = "children"; 
		String k7 = "crime"; 
		String k8 = "romance"; 
		String k9 = "action";
		String k10 = "horror";
		String k11 = "animation"; 
		String k12 = "fantasy"; 
		String k13 = "musical";
		String k14 = "war"; 
		
		ArrayList<String> scifi = new ArrayList<String>();
		ArrayList<String> thriller = new ArrayList<String>();
		ArrayList<String> drama = new ArrayList<String>();
		ArrayList<String> adventure = new ArrayList<String>();
		ArrayList<String> comedy = new ArrayList<String>(); 
		ArrayList<String> children = new ArrayList<String>();
		ArrayList<String> crime = new ArrayList<String>();
		ArrayList<String> romance = new ArrayList<String>();
		ArrayList<String> action = new ArrayList<String>();
		ArrayList<String> horror = new ArrayList<String>(); 
		ArrayList<String> animation = new ArrayList<String>();
		ArrayList<String> fantasy = new ArrayList<String>();
		ArrayList<String> musical = new ArrayList<String>();
		ArrayList<String> war = new ArrayList<String>();
		
		
		while ((line =br2.readLine()) != null) {
			String[]info = line.split(","); 
			if (line.equalsIgnoreCase(k1)){
				scifi.add(line); }
			else if (line.equalsIgnoreCase(k2)){
				thriller.add(line);}
			else if (line.equalsIgnoreCase(k3)){
				drama.add(line); }
			else if (line.equalsIgnoreCase(k4)){
				adventure.add(line);}
			else if (line.equalsIgnoreCase(k5)){
				comedy.add(line);}
			else if (line.equalsIgnoreCase(k6)){
				children.add(line);}
			else if (line.equalsIgnoreCase(k7)){
				crime.add(line);}
			else if (line.equalsIgnoreCase(k8)){
				romance.add(line);}
			else if (line.equalsIgnoreCase(k9)){
				action.add(line);}
			else if (line.equalsIgnoreCase(k10)){
				horror.add(line);}
			else if (line.equalsIgnoreCase(k11)){
				animation.add(line);}
			else if (line.equalsIgnoreCase(k12)){
				fantasy.add(line);}
			else if (line.equalsIgnoreCase(k13)){
				musical.add(line);}
			else if (line.equalsIgnoreCase(k13)){
				war.add(line);}
				
			}
			//return each counter so we get total per genre
	
		System.out.println("Total movies for genre: Sci-fi is " + scifi.size()); 
		System.out.println("Total movies for genre: Thriller is " + thriller.size()); 
		System.out.println("Total movies for genre: Drama is " + drama.size()); 
		System.out.println("Total movies for genre: Adventure is" + adventure.size()); 
		System.out.println("Total movies for genre: Comedy is "+ comedy.size()); 
		System.out.println("Total movies for genre: Children is " + children.size()); 
		System.out.println("Total movies for genre: Crime is " + crime.size()); 
		System.out.println("Total movies for genre: Romance is "+ romance.size()); 
		System.out.println("Total movies for genre: Action is "+ action.size()); 
		System.out.println("Total movies for genre: Horror is " + horror.size()); 
		System.out.println("Total movies for genre: Animation is " + animation.size()); 
		System.out.println("Total movies for genre: Fantasy is " + fantasy.size()); 
		System.out.println("Total movies for genre: Musical is " + musical.size()); 
		System.out.println("Total movies for genre: War is " + war.size()); 

		
		
		
		
		
		
	}
}
