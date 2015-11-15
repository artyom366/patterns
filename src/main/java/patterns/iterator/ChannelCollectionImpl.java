package patterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artyom on 11/15/2015.
 */
public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channels;

    public ChannelCollectionImpl() {
        this.channels = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        this.channels.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        this.channels.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channels);

    }
}
