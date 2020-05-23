import java.util.*;

public class andor{

	ArrayList<charakter> c= new ArrayList<charakter>();

	String[] s;

	public andor(String[] pSpieler){
		s = pSpieler;

		
		c.add(new charakter("Bait", "Zwergin aus den Tiefminen", 7, false));
		c.add(new charakter("Kram", "Zwerg aus den Tiefminen", 7, true));

		c.add(new charakter("Mairen", "Kriegerin aus dem Rietland", 14, false));
		c.add(new charakter("Thorn", "Krieger aus dem Rietland", 14, true));

		c.add(new charakter("Rhega", "Tare aus dem Sturmtal", 15, false));
		c.add(new charakter("Bragor", "Tarus aus dem Sturmtal", 15, true));

		c.add(new charakter("Fennah", "Fährtenleserin aus dem südlichen Wald", 22, false));
		c.add(new charakter("Fenn", "Fährtenleser aus dem südlichen Wald", 22, true));

		c.add(new charakter("Chada", "Bogenschützin aus dem Wachsamen Wald", 25, false));
		c.add(new charakter("Pasco", "Bogenschütze aus dem Wachsamen Wald", 25, true));

		c.add(new charakter("Kheela", "Hüterin der Flusslande", 29,false));
		c.add(new charakter("Kheelan", "Hüter der Flusslande", 29, true));

		c.add(new charakter("Eara", "Zauberin aus dem Norden", 34, false));
		c.add(new charakter("Liphardus", "Zauberer aus dem Norden", 34, true));

		c.add(new charakter("Talvora", "Bewahrerin aus den schwarzen Archiven", 50, false));
		c.add(new charakter("Arbon", "Bewahrer aus den schwarzen Archiven", 50, true));

		zufall();

	}

	public static void main(String[] args){
		new andor(args);
	}	

	public void zufall(){
		for(int i = 0; i < 3;i++){
			int zahl = (int) (Math.random()*c.size());

			if(s.length != 0){
				System.out.println(s[i] + " spielt " + c.get(zahl).getName() + " (" + c.get(zahl).getTag() + ", Rang: " + c.get(zahl).getLevel() +  ")" );
			}
			else{
				System.out.println("Der "+ (i+1) + ". Spieler" + " spielt " + c.get(zahl).getName() + " (" + c.get(zahl).getTag() + ", Rang: " + c.get(zahl).getLevel() +  ")" );
			}
			

			if(c.get(zahl).getGeschlecht()){
				c.remove(c.get(zahl));
				c.remove(c.get(zahl-1));
			}
			else{
				c.remove(c.get(zahl));
				c.remove(c.get(zahl));	
			}
		}
	}

	public class charakter{
		int level = 0;
		String name = "";
		String tag = "";
		boolean geschlecht;

		public charakter(String pName, String pTag, int pLevel, boolean pGeschlecht){
			level = pLevel;
			name = pName;
			tag = pTag;
			geschlecht = pGeschlecht;
		}

		public int getLevel(){
			return level;
		}

		public String getName(){
			return name;
		}

		public String getTag(){
			return tag;
		}

		public boolean getGeschlecht(){
			return geschlecht;
		}
	}

}

