import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Objektsender
{

	String[] zuSenden = { "Test1", "Test2", "Felix ist doof", "ich bin müde" };

	public Objektsender()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		Lobby test = new Lobby();
		test.setId(171);
		String[] spieler = { "Test1", "Test2", "Felix ist doof", "ich bin müde" };
		test.setSpieler(spieler);

		try
		{

			File file = new File("C:\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Lobby.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(test, file);
			jaxbMarshaller.marshal(test, System.out);

		}
		catch (JAXBException e)
		{
			e.printStackTrace();
		}
	}

}
