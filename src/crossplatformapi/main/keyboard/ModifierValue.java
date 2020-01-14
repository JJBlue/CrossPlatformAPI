package crossplatformapi.main.keyboard;

import java.util.HashSet;
import java.util.Set;

import crossplatformapi.interfaces.keyboard.IKeyboard;
import crossplatformapi.main.os.OS;

public class ModifierValue {
	Set<Modifier> modifiers = new HashSet<>();
	
	public ModifierValue() {}
	
	public ModifierValue(Modifier... modifiers) {
		for(Modifier modifier : modifiers)
			addModifier(modifier);
	}
	
	public ModifierValue(long modifiers) {
		IKeyboard keyboard = OS.getOperatingSystem().getKeyboard();
		
		for(Modifier modifier : Modifier.values()) {
			int value = keyboard.modifierToInt(modifier);
			
			if((value | modifiers) == modifiers) {
				addModifier(modifier);
			}
		}
	}
	
	public void addModifier(Modifier modifier) {
		modifiers.add(modifier);
	}
	
	public void removeModifier(Modifier modifier) {
		modifiers.remove(modifier);
	}
	
	public int getModifierAsNumber() {
		int value = 0;
		
		for(Modifier modifier : modifiers) {
			value = value | OS.getOperatingSystem().getKeyboard().modifierToInt(modifier);
		}
		
		return value;
	}
	
	public Set<Modifier> getModifiers() {
		return modifiers;
	}
}
