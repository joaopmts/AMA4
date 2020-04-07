package Ex51;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;


public class IOFacade {

	public void lerArquivoBinario() {
		File file = new File("iofacade.bin");

		byte[] bytesArray = new byte[(int) file.length()];
		try {
			FileInputStream is = new FileInputStream(file);
			is.read(bytesArray); 
			is.close();
			for (byte b : bytesArray) {
				System.out.println(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void lerArquivoTexto() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("iofacade.txt"));
			System.out.println(reader.readLine());
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
