package patterns.iterator;

/**
 * Created by Artyom on 11/15/2015.
 */
public interface ChannelCollection {

    public void addChannel(Channel channel);
    public void removeChannel(Channel channel);

    public ChannelIterator iterator(ChannelTypeEnum type);
}
