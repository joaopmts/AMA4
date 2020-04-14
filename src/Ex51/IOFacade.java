package Ex51;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;


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
	
	public Object abrirObjeto(String arquivo) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo))) {;
			return in.readObject();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
