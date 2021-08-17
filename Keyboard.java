package javaproject3;

public class Keyboard {

    private String keyboard; // The type of keyboard
    private String color; // The main color of the keyboard
    private String switches; // The type of switches the keyboard has ****
    private String hasLightingEffects; // Does the keyboard have a lighting effect?

    // main constructor
    Keyboard(String keyboard, String color, String switches, String hasLightingEffects) {
        this.setKeyboard(keyboard);
        this.setColor(color);
        this.setSwitches(switches);
        this.setLightingEffects(hasLightingEffects);
    }

    @Override
    public String toString() {
        if (hasLightingEffects.equals("y")) {
            return "Your keyboard is a " + color + " colored " + keyboard + " with " + switches + " switches" + ", with lighting effects!";
        } else {
            return "Your keyboard is a " + color + " colored " + keyboard + " with " + switches + " switches" + ", without lighting effects.";
        }
    }

    public String getSwitches() {
        return switches;
    }

    public void setSwitches(String switches) {
        switch (switches) {
            case "l":
                this.switches = "linear";
                break;
            case "t":
                this.switches = "tactile";
                break;
            case "c":
                this.switches = "clicky";
                break;
            default:
                this.switches = "unknown";
        }
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLightningEffects() {
        return hasLightingEffects;
    }

    public void setLightingEffects(String hasLightingEffects) {
        this.hasLightingEffects = hasLightingEffects;
    }
}
