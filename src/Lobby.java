import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlRootElement
public class Lobby
{
	public String [] spieler={"Test1","Test2","Felix ist doof", "ich bin müde"};
	int id;
	public Lobby()
	{
		// TODO Auto-generated constructor stub
	}
	
	@XmlElement
	public void setSpieler(String[] spieler)
	{
		this.spieler=spieler;
	}
	
	public String[] getSpieler()
	{
		return spieler;
	}

	public int getId()
	{
		return id;
	}

	@XmlAttribute
	public void setId(int id)
	{
		this.id = id;
	}

}
