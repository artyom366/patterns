package patterns.iterator;

/**
 * Created by Artyom on 11/15/2015.
 */
public class Channel {

    private double frequency;
    private ChannelTypeEnum TYPE;

    public Channel(double frequency, ChannelTypeEnum TYPE) {
        this.frequency = frequency;
        this.TYPE = TYPE;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public ChannelTypeEnum getTYPE() {
        return TYPE;
    }

    public void setTYPE(ChannelTypeEnum TYPE) {
        this.TYPE = TYPE;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", TYPE=" + TYPE +
                '}';
    }


}
