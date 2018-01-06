import java.sql.SQLException;
import java.util.*;
import penyimpanan.Penyimpanan;
import config.Koneksi;

public class Main {

	private static Scanner input;
	
	public static void main(String[] args) throws SQLException {
		Koneksi conn = new Koneksi();
		input = new Scanner(System.in);
		
		Penyimpanan storage = new Penyimpanan(conn.sambungkan());
		
		
		storage.setIdPenyimpanan(input.nextInt());
		storage.getAllUser();
	}
}
