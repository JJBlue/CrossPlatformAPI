package crossplatformapi.main.keyboard;

public enum Modifier {
	ALT,
	CONTROL,
	SHIFT,
	WINDOWS,
	NoRepeat;
	
	public ModifierValue toModifierValue() {
		return new ModifierValue(this);
	}
}
