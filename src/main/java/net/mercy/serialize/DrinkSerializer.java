package net.mercy.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.apache.log4j.Logger;

public class DrinkSerializer {
	public static void main(String[] args) {
		final Logger LOG = Logger.getLogger(DrinkSerializer.class);
		Drink d = new Drink("beer", 2, true);

		ObjectOutputStream out = null;

		try {
			out = new ObjectOutputStream(new FileOutputStream("/drint.dat"));
			out.writeObject(d);
		} catch (FileNotFoundException e) {
			LOG.error(e);
			e.printStackTrace();
		} catch (IOException e) {
			LOG.error(e);
			e.printStackTrace();
		}finally{
			if(out!=null){
				try {
					out.close();
				} catch (IOException e) {
					LOG.error(e);
					e.printStackTrace();
				}
			}
		}

	}
}
