import java.sql.SQLException;
import java.util.*;
import kategori.*;
import config.Koneksi;
import gui.*;
public class Main {

	private static Scanner input;
	
	public static void main(String[] args) throws SQLException {
		Koneksi conn = new Koneksi();
		input = new Scanner(System.in);
		FrameInti frame = new FrameInti(conn.sambungkan());

		frame.setProgram();
	}
}
