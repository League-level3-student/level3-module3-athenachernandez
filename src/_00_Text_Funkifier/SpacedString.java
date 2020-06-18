package _00_Text_Funkifier;

public class SpacedString extends SpecialString {

	public SpacedString(String s) {
		super(s);
		
	}

	@Override
	public String funkifyText(String s) {
		String spacedText = "";
		for (int i = 0; i < s.length(); i++) {
			spacedText += (s.substring(i, i+1) + " ");
		}
		s = spacedText;
		return s;
	}

}
