import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

class Scores {
	public static void main(String[] args) {

		try {
			FileWriter file = new FileWriter("./java-kadai02/scores.csv");
			PrintWriter cover = new PrintWriter(new BufferedWriter(file));

			cover.println("score,id,name,date");
			cover.println("75,A105,James,2023/01/05");
			cover.println("80,A102,Linda,2023/01/04");
			cover.println("54,A201,Gregory,2023/01/10");
			cover.println("98,A110,Mike,2023/01/10");
			cover.println("80,A300,Aria,2023/01/06");
			cover.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try(BufferedReader reader= Files.newBufferedReader(
			Paths.get(".","java-kadai02","scores.csv"))){
				var line =" ";
				while((line = reader.readLine()) != null){
					System.out.println(line);
				}
				reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
