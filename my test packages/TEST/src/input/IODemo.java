package input;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;



public class IODemo {
	@SuppressWarnings("resource")
	public static void main(String arg[]) throws IOException {
		
		FileInputStream fin = new FileInputStream("C:\\Users\\Aakash Srivastava\\DESKTOP FILES\\questions.txt");
		FileChannel file=fin.getChannel();
		WritableByteChannel out =Channels.newChannel(System.out);
		file.transferTo(0, file.size(), out);
		Path path1=Paths.get("C:\\Users\\Aakash Srivastava\\DESKTOP FILES\\questions.txt");
		Path path2=Paths.get("C:\\Users\\Aakash Srivastava\\DESKTOP FILES\\questions eclipse copy.txt");
		System.out.println(path1.toAbsolutePath().getParent().toAbsolutePath());
		System.out.println(path2.toAbsolutePath().getParent().toAbsolutePath());
		System.out.println(path1.toFile().isDirectory());
		System.out.println(path1.toFile().isFile());
		Files.copy(Paths.get("C:\\Users\\Aakash Srivastava\\DESKTOP FILES\\questions.txt"),Paths.get("C:\\Users\\Aakash Srivastava\\DESKTOP FILES\\questions eclipse copy.txt"), StandardCopyOption.REPLACE_EXISTING);
	}

}
