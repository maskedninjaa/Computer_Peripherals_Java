package javaproject3;

public class OtherPeripherals {

    private String mouse;
    private String monitor;
    private String curvedOrFlat;
    private double maxFrames;

    OtherPeripherals(String mouse, String monitor, String curvedOrFlat, double maxFrames) {
        this.setMouse(mouse);
        this.setMonitor(monitor);
        this.setCurvedOrFlat(curvedOrFlat);
        this.setMaxFrames(maxFrames);
    }

    @Override
    public String toString() {
        if (curvedOrFlat.equals("c")) {
            return "Your mouse is a " + mouse + ", and the monitor is a(n) " +
                    monitor + " with a curved screen, and can run at a maximum fps of " + maxFrames + " hz!";
        } else {
            return "The mouse is a " + mouse + ", and the monitor is a(n) " +
                    monitor + " with a flat screen, and can run at maximum fps of " + maxFrames + " hz!";
        }
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getCurvedOrFlat() {
        return curvedOrFlat;
    }

    public void setCurvedOrFlat(String curvedOrFlat) {
        this.curvedOrFlat = curvedOrFlat;
    }

    public double getMaxFrames() {
        return maxFrames;
    }

    public void setMaxFrames(double maxFrames) {
        this.maxFrames = maxFrames;
    }

}
