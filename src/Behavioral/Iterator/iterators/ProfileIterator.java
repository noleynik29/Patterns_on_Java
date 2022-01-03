package Behavioral.Iterator.iterators;

import Behavioral.Iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
