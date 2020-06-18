package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String lowerCase = s.toLowerCase();
		String letter;
		String funkyText = "";
		for (int i = 0; i < lowerCase.length(); i++) {
			if (i%2 != 0) {
				letter = lowerCase.substring(i, i+1).toUpperCase();
			} else {
				letter = lowerCase.substring(i, i+1);
			}
			funkyText += letter;
		}
		return funkyText;
	}

}
