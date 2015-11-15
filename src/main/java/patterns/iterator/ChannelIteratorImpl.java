package patterns.iterator;

import java.util.List;

/**
 * Created by Artyom on 11/15/2015.
 */
public class ChannelIteratorImpl implements ChannelIterator {

    private ChannelTypeEnum type;
    private List<Channel> channels;
    private int position;

    public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
        this.type = type;
        this.channels = channels;
    }

    @Override
    public boolean hasNext() {

        while(position < channels.size()) {

            Channel channel = channels.get(position);

            if (channel.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                return true;
            } else {
                position++;
            }
        }
        return false;
    }

    @Override
    public Channel next() {
        Channel channel = channels.get(position);
        position++;
        return channel;
    }
}
